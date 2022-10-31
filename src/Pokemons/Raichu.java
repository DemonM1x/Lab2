package Pokemons;

import Attacks.PhysicalAttacks.WildCharge;

public class Raichu extends Pikachu{
    public Raichu(String name, int lvl) {
        super(name, lvl);
        this.setStats(60, 90, 55, 90, 80, 110);
        this.addMove(new WildCharge());
    }
}
