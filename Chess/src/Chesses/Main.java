package Chesses;

import Chesses.AllCheses.*;
import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant(Elephant.ELEPHANT,Elephant.WOOD_OF_ELEPHANT,Elephant.COLOR_OF_ELEPHANT,Elephant.QUANTITY_OF_ELEPHANT);
        Rook rooks = new Rook(Rook.ROOK,Rook.COLOR_OF_ROOK,Rook.WOOD_OF_ROOK,Rook.QUANTITY_OF_ROOK);
        Queen queen = new Queen(Queen.QUEEN,Queen.WOOD_OF_QUEEN,Queen.COLOR_OF_QUEEN,Queen.QUANTITY_OF_QUEEN);
        Pawn pawns = new Pawn(Pawn.PAWN, Pawn.WOOD_OF_PAWNS, Pawn.COLOR_OF_PAWNS, Pawn.QUANTITY_OF_PAWNS);
        Horses horses = new Horses(Horses.HORSES,Horses.WOOD_OF_HORSES,Horses.COLOR_OF_HORSES,Horses.QUANTITY_OF_HORSES);
        King king = new King(King.KING, King.WOOD_OF_KING, King.COLOR_OF_KING, King.QUANTITY_OF_KING);
        System.out.print(king);
        System.out.println();
        System.out.println(queen);
        System.out.println(elephant);
        System.out.println(horses);
        System.out.println(rooks);
        System.out.println(pawns);
    }
}