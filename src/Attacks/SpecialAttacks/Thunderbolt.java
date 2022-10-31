package Attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC, 90, 1);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        int flag = 0;
        for(int i = 0; i < pokemon.getTypes().length;i++) {
            if (pokemon.getTypes()[i] == Type.ELECTRIC) {
                flag = 1;
            }
        }
        if (flag == 0){
            Effect effect = new Effect().chance(0.1);
            if (effect.success()){
                pokemon.confuse();
            }
        }
    }
    @Override
    protected String describe(){
        return "использует атаку Thunderbolt";
    }
}
