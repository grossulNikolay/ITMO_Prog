package attack.status;

import ru.ifmo.se.pokemon.*;

public final class ThunderWave extends StatusMove {

    public ThunderWave() {
        super(Type.ELECTRIC, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect.paralyze(p);
    }

    @Override
    protected String describe() {
        return "накладывает на врага паралич";
    }
}
