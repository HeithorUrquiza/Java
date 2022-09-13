package poo.formas;

import java.util.Locale;

public class TesteFormas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        FormasBidimensionais forma1;
        forma1 = new FormasBidimensionais("Quadrado", 15.0, 15.0);
        FormasTridimensionais forma2;
        forma2 = new FormasTridimensionais("Cubo", 5.0, 5.0, 5.0);

        System.out.println(forma2.calcArea(forma2.getName()));
        System.out.println(forma2.toString());

    }
}
