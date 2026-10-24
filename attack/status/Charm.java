package attack.status;

import ru.ifmo.se.pokemon.*;

public final class Charm extends StatusMove {

    public Charm() {
        super(Type.FAIRY, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        p.setMod(Stat.ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "накладывает на врага очарование (атака снижена на 2)";
    }
}