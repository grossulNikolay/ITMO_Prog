package pokemon;

import ru.ifmo.se.pokemon.*;
import attack.special.SludgeBomb;
import attack.status.TailWhip;

public class NidoranF extends Pokemon {

    public NidoranF(String name, int level) {
        super(name, level);
        setStats(55, 47, 52, 40, 40, 41);
        setType(Type.POISON);
        setMove(new SludgeBomb(), new TailWhip());
    }
}
