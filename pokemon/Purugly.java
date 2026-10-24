package pokemon;

import ru.ifmo.se.pokemon.*;
import attack.physical.Bulldoze;
import attack.physical.ShadowClaw;
import attack.status.Charm;
import attack.status.Rest;

public final class Purugly extends Glameow {

    public Purugly(String name, int level) {
        super(name, level);
        setStats(71, 82, 64, 64, 59, 112);
        setType(Type.NORMAL);
        setMove(new Rest(), new ShadowClaw(), new Charm(), new Bulldoze());
    }
}
