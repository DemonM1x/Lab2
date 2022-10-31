package Pokemons;

import Attacks.PhysicalAttacks.Facade;
import Attacks.PhysicalAttacks.WildCharge;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pichu extends Pokemon {
    public Pichu(String name, int lvl){
        super(name, lvl);
        this.setType(Type.ELECTRIC);
        this.setStats(20, 40, 15, 35, 35, 60);
        this.addMove(new Facade());
        this.addMove(new WildCharge());
    }
}
