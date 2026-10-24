package pokemon;

import ru.ifmo.se.pokemon.*;
import attack.physical.ShadowClaw;
import attack.status.Charm;
import attack.status.Rest;


public class Glameow extends Pokemon {

    public Glameow(String name, int level) {
        super(name, level);
        setStats(49, 55, 42, 42, 37, 85);
        setType(Type.NORMAL);
        setMove(new Rest(), new ShadowClaw(), new Charm());
    }
}
