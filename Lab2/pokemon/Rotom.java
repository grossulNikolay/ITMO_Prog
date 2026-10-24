package pokemon;

import ru.ifmo.se.pokemon.*;
import attack.special.DarkPulse;
import attack.special.ThunderShock;
import attack.status.ThunderWave;
import attack.status.WilloWisp;


public final class Rotom extends Pokemon {

    public Rotom(String name, int level) {
        super(name, level);
        setStats(50, 50, 77, 95, 77, 91);
        setType(Type.ELECTRIC, Type.GHOST);
        setMove(new WilloWisp(), new ThunderShock(), new DarkPulse(), new ThunderWave());
    }
}
