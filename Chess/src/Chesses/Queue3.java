package Chesses;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Queue3<T> implements Iterable<T> {

    private static final Logger LOGGER = Logger.getLogger(Queue3.class.getName());

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        private T value;
        private Node<T> next;
        private int size;

        public Node(T value) {
            this.value = value;
        }
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public T dequeue() {
        if (head == null) {
            return null;
        }
        T value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
            size--;
        }
        return value;
    }

    public T peek() {
        if (head == null) {
            return null;
        }
        return head.value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Iterator<T> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<T> {
        private Node<T> current = head;

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            T value = current.value;
            current = current.next;
            return value;
        }
    }

    public void sortByAscending(Comparator<T> comparator) {
        try {
            T[] array = toArray();
            sortArray(array, comparator, true);
            fillQueueFromArray(array);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Failed to sort the queue in ascending order.", e);
        }
    }

    public void sortByDescending(Comparator<T> comparator) {
        try {
            T[] array = toArray();
            sortArray(array, comparator, false);
            fillQueueFromArray(array);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Failed to sort the queue in descending order.", e);
        }
    }

    public void sortByTemplate(Comparator<T> comparator, T template) {
        try {
            T[] array = toArray();
            sortArray(array, comparator, true, template);
            fillQueueFromArray(array);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Failed to sort the queue based on the template.", e);
        }
    }

    public void sort(Comparator<T> comparator) {
        try {
            T[] array = toArray();
            Stream<T> stream = Arrays.stream(array);
            T[] sortedArray = stream.sorted(comparator).toArray(size -> (T[]) new Object[size]);
            fillQueueFromArray(sortedArray);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Failed to sort the queue.", e);
        }
    }

    private T[] toArray() {
        try {
            return StreamSupport.stream(spliterator(), false).toArray(size -> (T[]) new Object[size]);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Failed to convert the queue to an array.", e);
            return (T[]) new Object[0];
        }
    }

    private void fillQueueFromArray(T[] array) {
        head = null;
        tail = null;
        size = 0;
        for (T value : array) {
            enqueue(value);
        }
    }

    private void sortArray(T[] array, Comparator<T> comparator, boolean ascending) {
        if (ascending) {
            Arrays.sort(array, comparator);
        } else {
            Arrays.sort(array, comparator.reversed());
        }
    }

    private void sortArray(T[] array, Comparator<T> comparator, boolean ascending, T template) {
        Arrays.sort(array, (a, b) -> {
            int compareResult = comparator.compare(a, b);
            if (a.equals(template)) {
                return -1;
            } else if (b.equals(template)) {
                return 1;
            } else if (ascending) {
                return compareResult;
            } else {
                return -compareResult;
            }
        });
    }
}