package pl.coderslab.game_objects;

public class Hero extends Enemy{

    private ItemsList equipment;

    public Hero(String name, String description, int hp, int attackPower, ItemsList equipment) {
        super(name, description, hp, attackPower);
        this.equipment = equipment;
    }

    public ItemsList getEquipment() {
        return equipment;
    }

    public void setEquipment(ItemsList equipment) {
        this.equipment = equipment;
    }
}
