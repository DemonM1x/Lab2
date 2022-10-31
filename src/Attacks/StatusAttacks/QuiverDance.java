package Attacks.StatusAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class QuiverDance extends StatusMove {
    public QuiverDance(){
        super(Type.BUG, 0, 1);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
        pokemon.setMod(Stat.SPEED, 1);
    }
    @Override
    protected String describe(){
        return "использует атаку Quiver Dance";
    }
}
