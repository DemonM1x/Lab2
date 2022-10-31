package Attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class LusterPurge extends SpecialMove {
    public LusterPurge(){
        super(Type.PSYCHIC, 70, 1);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect effect = new Effect().chance(0.5);
        if (effect.success()){
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);

        }
    }
    @Override
    protected String describe(){
        return "использует атаку Luster Purge";
    }
}
