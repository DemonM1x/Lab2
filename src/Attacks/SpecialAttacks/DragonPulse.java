package Attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DragonPulse extends SpecialMove {
    public DragonPulse(){
        super(Type.DRAGON, 85, 1);
    }
    @Override
    protected String describe(){
        return "использует атаку Dragon Pulse";
    }
}
