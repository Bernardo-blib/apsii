package apresentação;

import patos.Duck;
import patos.MallardDuck;

public class MainPatinhoNaLagoa {

    public static void main(String[] args) {

        Duck pato = new MallardDuck();

        pato.display();
        pato.performQuack();
        pato.performFly();
        pato.swim();

    }
}