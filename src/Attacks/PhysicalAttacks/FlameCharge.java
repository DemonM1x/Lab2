package Attacks.PhysicalAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FlameCharge extends PhysicalMove {
    public FlameCharge(){
        super(Type.FIRE, 50, 1);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.SPEED, 1);
    }
    @Override
    protected String describe(){
        return "использует атаку Flame Charge";
    }
}
