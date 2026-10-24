package attack.physical;

import ru.ifmo.se.pokemon.*;

public final class ShadowClaw extends PhysicalMove {

    public ShadowClaw() {
        super(Type.GHOST, 70, 100);
    }

    @Override
    protected String describe() {
        return "царапает врага и наносит ему физический урон";
    }
}
