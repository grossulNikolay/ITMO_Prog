package pokemon;

import ru.ifmo.se.pokemon.*;
import attack.special.SludgeBomb;
import attack.status.Flatter;
import attack.status.TailWhip;

public class Nidorina extends NidoranF {

    public Nidorina(String name, int level) {
        super(name, level);
        setStats(70, 62, 67, 55, 55, 56);
        setType(Type.POISON);
        setMove(new SludgeBomb(), new TailWhip(), new Flatter());
    }
}
