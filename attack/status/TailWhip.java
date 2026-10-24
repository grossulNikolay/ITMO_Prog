package attack.status;

import ru.ifmo.se.pokemon.*;

public final class TailWhip extends StatusMove {

    public TailWhip() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        p.setMod(Stat.DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "бьёт врага хвостом (защита снижена на 1)";
    }
}