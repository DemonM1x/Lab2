
import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Start {
    public static void main(String[] args){


        Battle b = new Battle();
        // team 1
        Larvesta larvesta = new Larvesta("Zuk", 10);
        Pikachu pikachu = new Pikachu("pika", 10);
        Volcarona volcarona = new Volcarona("Bug", 15);
        // team 2
        Latios latios = new Latios("Torpeda", 10);
        Raichu raichu = new Raichu("evolve pika", 10);
        Pichu pichu = new Pichu("devolve pika", 15);
        b.addAlly(larvesta); b.addAlly(pikachu); b.addAlly(volcarona);
        b.addFoe(latios); b.addFoe(raichu); b.addFoe(pichu);
        b.go();
    }
}