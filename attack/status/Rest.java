package attack.status;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {

    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect.sleep(p);
    }

    @Override
    protected String describe() {
        return "накладывает на себя сон";
    }
}