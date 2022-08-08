package pl.coderslab.game_objects;

public class Entity {
    //Entity ma być wyjściowym modelem do wszystkiego, posiada nazwę oraz opis, później dodam do niej pewnie
    //jeszcze jakieś metody

    private String name;
    private String description;

    public Entity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
