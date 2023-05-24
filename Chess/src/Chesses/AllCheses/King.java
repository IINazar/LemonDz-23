package Chesses.AllCheses;

import Chesses.MainChess;

public class King extends MainChess {
    public static final String KING = "King";
    public static final String WOOD_OF_KING = "Oak";
    public static final String COLOR_OF_KING = "Black";
    public static final int QUANTITY_OF_KING = 1;
    public King(String wood, String color, String name, int quantity) {
        super(wood, color, name, quantity);
    }
    public String toString() {
        return "Chess " +
                "Name='" + KING + '\'' +
                ", Kind of wood='" + WOOD_OF_KING + '\'' +
                ", Pawn's color='" + COLOR_OF_KING + '\'' +
                ", Quantity of pawns='" + QUANTITY_OF_KING + '\'';
    }
}
