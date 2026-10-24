package attack.physical;

import ru.ifmo.se.pokemon.*;

public final class StoneEdge extends PhysicalMove {

    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }

    @Override
    protected String describe() {
        return "кидает камень во врага и наносит ему физический урон";
    }
}