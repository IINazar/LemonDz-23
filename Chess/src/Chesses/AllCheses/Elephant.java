package Chesses.AllCheses;

import Chesses.MainChess;

public class Elephant extends MainChess {
    public static final String ELEPHANT = "Elephant";
    public static final String WOOD_OF_ELEPHANT = "Elephant";
    public static final String COLOR_OF_ELEPHANT = "Black";
    public static final int QUANTITY_OF_ELEPHANT = 2;
    public Elephant(String wood, String color, String name, int quantity) {
        super(wood, color, name, quantity);
    }
    public String toString() {
        return "Chess " +
                "Name='" + ELEPHANT + '\'' +
                ", Kind of wood='" + WOOD_OF_ELEPHANT + '\'' +
                ", Pawn's color='" + COLOR_OF_ELEPHANT + '\'' +
                ", Quantity of pawns='" + QUANTITY_OF_ELEPHANT + '\'';
    }
}
