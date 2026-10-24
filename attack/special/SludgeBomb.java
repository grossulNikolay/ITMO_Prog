package attack.special;

import ru.ifmo.se.pokemon.*;

public final class SludgeBomb extends SpecialMove {

    public SludgeBomb() {
        super(Type.POISON, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Math.random() <= 0.30) {
            Effect.poison(p);
        }
    }

    @Override
    protected String describe() {
        return "использует спец-приём SludgeBomb";
    }
}