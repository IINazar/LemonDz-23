package Chesses.AllCheses;

import Chesses.MainChess;

public class Rook extends MainChess {
    public static final String ROOK = "Rook";
    public static final String WOOD_OF_ROOK = "Oak";
    public static final String COLOR_OF_ROOK = "Black";
    public static final int QUANTITY_OF_ROOK = 2;
    public Rook(String wood, String color, String name, int quantity) {
        super(wood, color, name, quantity);
    }
    public String toString() {
        return "Chess " +
                "Name='" + ROOK + '\'' +
                ", Kind of wood='" + WOOD_OF_ROOK + '\'' +
                ", Pawn's color='" + COLOR_OF_ROOK + '\'' +
                ", Quantity of pawns='" + QUANTITY_OF_ROOK + '\'';
    }
}
