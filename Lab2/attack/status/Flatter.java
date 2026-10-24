package attack.status;

import ru.ifmo.se.pokemon.*;

public final class Flatter extends StatusMove {

    public Flatter() {
        super(Type.DARK, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        Effect.confuse(p);
    }

    @Override
    protected String describe() {
        return "смущает врага <3 (специальная атака повышена на 1)";
    }
}
