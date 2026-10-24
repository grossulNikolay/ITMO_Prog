package pokemon;

import ru.ifmo.se.pokemon.*;
import attack.physical.StoneEdge;
import attack.special.SludgeBomb;
import attack.status.Flatter;
import attack.status.TailWhip;

public final class Nidoqueen extends Nidorina {

    public Nidoqueen(String name, int level) {
        super(name, level);
        setStats(90, 92, 87, 75, 85, 76);
        setType(Type.POISON, Type.GROUND);
        setMove(new SludgeBomb(), new TailWhip(), new Flatter(), new StoneEdge());
    }
}
