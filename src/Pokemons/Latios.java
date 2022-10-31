package Pokemons;

import Attacks.SpecialAttacks.DragonPulse;
import Attacks.SpecialAttacks.LusterPurge;
import Attacks.SpecialAttacks.Thunderbolt;
import Attacks.StatusAttacks.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Latios extends Pokemon {
    public Latios(String name, int lvl){
        super(name,lvl);
        this.setType(Type.DRAGON, Type.PSYCHIC);
        this.setStats(80, 90, 80, 130, 110, 110);
        this.addMove(new DragonPulse());
        this.addMove(new Swagger());
        this.addMove(new LusterPurge());
        this.addMove(new Thunderbolt());

    }
}
