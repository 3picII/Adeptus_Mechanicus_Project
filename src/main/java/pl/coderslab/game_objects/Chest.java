package pl.coderslab.game_objects;

import lombok.Getter;
import lombok.Setter;

public class Chest extends Entity{

    @Getter
    @Setter
    private Item treasure;

    public Chest(String name, String description, Item treasure) {
        super(name, description);
        this.treasure = treasure;
    }
}
