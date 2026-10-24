package attack.physical;

import ru.ifmo.se.pokemon.*;

public final class Bulldoze extends PhysicalMove {

    public Bulldoze() {
        super(Type.GROUND, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        p.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "сносит врага и наносит ему физический урон (скорость врага снижена на 1)";
    }
}
