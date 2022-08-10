package pl.coderslab.game_objects;

public class Chest extends Entity{
    private ItemsList treasure;


    public Chest(String name, String description, ItemsList treasure) {
        super(name, description);
        this.treasure = treasure;
    }

    public ItemsList getTreasure() {
        return treasure;
    }

    public void setTreasure(ItemsList treasure) {
        this.treasure = treasure;
    }
}
