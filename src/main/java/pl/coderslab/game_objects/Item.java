package pl.coderslab.game_objects;

public class Item extends Entity{
    private int power;

    public Item(String name, String description, int power) {
        super(name, description);
        this.power = power;
    }
}
