package pl.coderslab.game_objects;

public class Enemy extends Entity{

    //Model przeciwnika

    private int hp;
    private int attackPower;

    public Enemy(String name, String description) {
        super(name, description);
    }

    public Enemy(String name, String description, int hp, int attackPower) {
        super(name, description);
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
