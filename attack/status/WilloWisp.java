package attack.status;

import ru.ifmo.se.pokemon.*;

public final class WilloWisp extends StatusMove {

    public WilloWisp() {
        super(Type.FIRE, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect.burn(p);
    }

    @Override
    protected String describe() {
        return "накладывает на врага горение";
    }
}