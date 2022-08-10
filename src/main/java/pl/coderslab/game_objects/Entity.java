package pl.coderslab.game_objects;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class Entity {
    //Entity ma być wyjściowym modelem do wszystkiego, posiada nazwę oraz opis, później dodam do niej pewnie
    //jeszcze jakieś metody

    @Size(min = 2)
    private String name;

    @Size(max = 200)
    private String description;


    public Entity(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
