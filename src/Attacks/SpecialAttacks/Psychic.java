package Attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;


public class Psychic extends SpecialMove {
    public Psychic(){
        super(Type.PSYCHIC, 90, 1);
    }
    protected void applyOppEffects(Pokemon pokemon){
        Effect effect = new Effect().chance(0.1);
        if (effect.success()){
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe(){
        return "использует атаку Psyhic";
    }
}
