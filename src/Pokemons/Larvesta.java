package Pokemons;

import Attacks.PhysicalAttacks.FlameCharge;
import Attacks.SpecialAttacks.Overheat;
import Attacks.SpecialAttacks.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Larvesta extends Pokemon {
    public Larvesta(String name, int lvl){
        super(name, lvl);
        this.setType(Type.BUG,Type.FIRE);
        this.setStats(55, 85, 55, 50, 55, 60);
        this.addMove(new Overheat());
        this.addMove(new FlameCharge());
        this.addMove(new Psychic());
    }
}
