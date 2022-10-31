package Pokemons;

import Attacks.StatusAttacks.QuiverDance;

public class Volcarona extends Larvesta{
    public Volcarona(String name, int lvl){
        super(name, lvl);
        this.setStats(85, 60, 65, 135, 105, 100);
        this.addMove(new QuiverDance());
    }
}
