package poo.conta_banc;

import poo.caneta.Caneta2;

public class MainCaneta {
    public static void main(String[] args) {
        Caneta2 c1 = new Caneta2();

        c1.setModelo("BIC");
        c1.setPonta(0.5);

        c1.status();

        c1.tampar();
        c1.status();

    }
}
