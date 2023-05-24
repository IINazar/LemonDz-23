package Chesses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;

public class Queue3Test {

    private Queue3<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new Queue3<>();
    }

    @Test
    void testEnqueueAndDequeue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        Assertions.assertEquals(1, queue.dequeue());
        Assertions.assertEquals(2, queue.dequeue());
        Assertions.assertEquals(3, queue.dequeue());
    }

    @Test
    void testPeek() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        Assertions.assertEquals(1, queue.peek());
        queue.dequeue();
        Assertions.assertEquals(2, queue.peek());
        queue.dequeue();
        Assertions.assertEquals(3, queue.peek());
    }

    @Test
    void testIsEmpty() {
        Assertions.assertTrue(queue.isEmpty());

        queue.enqueue(1);
        Assertions.assertFalse(queue.isEmpty());

        queue.dequeue();
        Assertions.assertTrue(queue.isEmpty());
    }

    @Test
    void testIterator() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        Iterator<Integer> iterator = queue.iterator();
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(1, iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(2, iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(3, iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    void testSortByAscending() {
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(2);

        queue.sortByAscending(Comparator.naturalOrder());

        Iterator<Integer> iterator = queue.iterator();
        Assertions.assertEquals(1, iterator.next());
        Assertions.assertEquals(2, iterator.next());
        Assertions.assertEquals(3, iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    void testSortByDescending() {
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(2);

        queue.sortByDescending(Comparator.naturalOrder());

        Iterator<Integer> iterator = queue.iterator();
        Assertions.assertEquals(3, iterator.next());
        Assertions.assertEquals(2, iterator.next());
        Assertions.assertEquals(1, iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    void testSortByTemplate() {
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(2);

        queue.sortByTemplate(Comparator.naturalOrder(), 2);

        Iterator<Integer> iterator = queue.iterator();
        Assertions.assertEquals(2, iterator.next());
        Assertions.assertEquals(1, iterator.next());
        Assertions.assertEquals(3, iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    void testSort() {
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(2);

        queue.sort(Comparator.naturalOrder());

        Iterator<Integer> iterator = queue.iterator();
        Assertions.assertEquals(1, iterator.next());
        Assertions.assertEquals(2, iterator.next());
        Assertions.assertEquals(3, iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }
}
