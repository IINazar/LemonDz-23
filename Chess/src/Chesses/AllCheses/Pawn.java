package Chesses.AllCheses;

import Chesses.MainChess;

public class Pawn extends MainChess {
    public static final String PAWN = "Pawn";
    public static final String WOOD_OF_PAWNS = "Oak";
    public static final String COLOR_OF_PAWNS = "Black";
    public static final int QUANTITY_OF_PAWNS = 8;
    public Pawn(String wood, String color, String name, int quantity) {
        super(wood, color, name, quantity);
    }

    public String toString() {
        return "Chess " +
                "Name='" + PAWN + '\'' +
                ", Kind of wood='" + WOOD_OF_PAWNS + '\'' +
                ", Pawn's color='" + COLOR_OF_PAWNS + '\'' +
                ", Quantity of pawns='" + QUANTITY_OF_PAWNS + '\'';
    }
}
