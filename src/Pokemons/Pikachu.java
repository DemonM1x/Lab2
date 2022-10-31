package Pokemons;

import Attacks.StatusAttacks.Agility;

public class Pikachu extends Pichu{
    public Pikachu(String name, int lvl){
        super(name, lvl);
        this.setStats(35, 55, 40, 50, 50, 90);
        this.addMove(new Agility());
    }
}
