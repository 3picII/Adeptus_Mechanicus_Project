package pl.coderslab.game;

import pl.coderslab.game_objects.Item;
import pl.coderslab.game_objects.ItemsList;
import pl.coderslab.game_objects.Room;

public class Main {
    public static void main(String[] args) {
        //Klasa testowa, aby zobaczyć czy cokolwiek działa

        Item miecz = new Item("Miecz","Masny miecz",1,10);
        Item tarcza = new Item("Tarcza","Tarcza tarczownika", 2, 15);
        //Nie wiem dlaczego ale nie nie tworzy się tabela w bazie danych dla itemów, a chyba powinna ponieważ dałem @Table

        String miemcz = miecz.toString();
        String tarca = tarcza.toString();
        System.out.println(miemcz);
        System.out.println(tarca);

        Room necronTomb = new Room("Necron Tomb","Just a regular old necron tomb, just like every other"
        ,1,0,0,0, new ItemsList("lootList") );

        String tomb = necronTomb.toString();
        System.out.println(tomb);
    }
}
