package attack.special;

import ru.ifmo.se.pokemon.*;

public final class ThunderShock extends SpecialMove {

    public ThunderShock() {
        super(Type.ELECTRIC, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Math.random() <= 0.10) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        return "использует спец-приём ThunderShock";
    }
}
