package pl.coderslab.game_objects;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = Item.TABLE_NAME)
public class Item{

    final static String TABLE_NAME = "items";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 2)
    private String name;

    @Size(max = 200)
    private String description;

    @Range(min = 1, max = 2)
    private int type; //Typ przedmiotu: 1 - przedmiot dodający siłę ataku, 2 - przedmiot zwiększający hp

    @Min(10)
    private int power;


}
