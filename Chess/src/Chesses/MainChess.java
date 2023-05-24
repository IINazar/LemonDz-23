package Chesses;

public abstract class MainChess {
    protected String Wood;
    protected String Color;
    protected String Name;
    protected int quantity;

    public MainChess(String wood, String color, String name, int quantity) {
        this.Wood = wood;
        this.Color = color;
        this.Name = name;
        this.quantity = quantity;
    }
}
