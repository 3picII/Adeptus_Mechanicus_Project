package pl.coderslab.game_objects;

public class Hero extends Enemy{

    //Hero dziedziczy po enemy, jedyną różnicą jest ekwipunek oraz
    //numer lokacji aby umożliwić zapis poprzez checkpointy

    private ItemsList equipment;
    private int locationNumber;

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

    public int getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(int locationNumber) {
        this.locationNumber = locationNumber;
    }
}
