package attack.special;

import ru.ifmo.se.pokemon.*;

public final class DarkPulse extends SpecialMove {

    public DarkPulse() {
        super(Type.DARK, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Math.random() <= 0.20) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "использует спец-приём DarkPulse";
    }
}
