package Chesses.AllCheses;

import Chesses.MainChess;

public class Queen extends MainChess {
    public static final String QUEEN = "Queen";
    public static final String WOOD_OF_QUEEN = "Oak";
    public static final String COLOR_OF_QUEEN = "Black";
    public static final int QUANTITY_OF_QUEEN = 1;

    public Queen(String wood, String color, String name, int quantity) {
        super(wood, color, name, quantity);
    }

    public String toString() {
        return "Chess " +
                "Name='" + QUEEN + '\'' +
                ", Kind of wood='" + WOOD_OF_QUEEN + '\'' +
                ", Pawn's color='" + COLOR_OF_QUEEN + '\'' +
                ", Quantity of pawns='" + QUANTITY_OF_QUEEN + '\'';
    }
}