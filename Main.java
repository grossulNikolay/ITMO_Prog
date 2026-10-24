import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        Pokemon rotom = new Rotom("Мотор", 98);
        Pokemon glameow = new Glameow("Гламур", 33);
        Pokemon purugly = new Purugly("Мурка", 67);
        Pokemon nidoranF = new NidoranF("Иглорог", 15);
        Pokemon nidorina = new Nidorina("Иглорожка", 42);
        Pokemon nidoqueen = new Nidoqueen("Королева Игл", 77);

        battle.addAlly(rotom);
        battle.addAlly(glameow);
        battle.addAlly(purugly);

        battle.addFoe(nidoranF);
        battle.addFoe(nidorina);
        battle.addFoe(nidoqueen);

        battle.go();
    }
}
