
package Attacks.PhysicalAttacks;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;


public class Facade extends PhysicalMove{

    public Facade(){
        super(Type.NORMAL, 70, 1);
    }

    @Override
    protected String describe(){
        return "использует атаку Facade";
    }
}
