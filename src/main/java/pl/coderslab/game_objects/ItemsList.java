package pl.coderslab.game_objects;

import java.util.ArrayList;

public class ItemsList extends ArrayList<Item> {

    private String name;

    public ItemsList(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
