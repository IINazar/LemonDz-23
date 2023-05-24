package Chesses.AllCheses;

import Chesses.MainChess;

public class Horses extends MainChess {
    public static final String HORSES = "Horse";
    public static final String COLOR_OF_HORSES = "Black";
    public static final String WOOD_OF_HORSES = "Oak";
    public static final int QUANTITY_OF_HORSES = 2;
    public Horses(String wood, String color, String name, int quantity) {
        super(wood, color, name, quantity);
    }

    public String toString() {
        return "Chess " +
                "Name='" + HORSES + '\'' +
                ", Kind of wood='" + WOOD_OF_HORSES + '\'' +
                ", Pawn's color='" + COLOR_OF_HORSES + '\'' +
                ", Quantity of pawns='" + QUANTITY_OF_HORSES + '\'';
    }
}
