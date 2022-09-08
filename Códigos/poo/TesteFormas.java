package poo;

import java.util.Locale;

public class TesteFormas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        FormasBidimensionais forma1;
        FormasTridimensionais forma2;
        forma1 = new FormasBidimensionais("Quadrado", 15.0, 15.0);
        forma2 = new FormasTridimensionais("Tetraedro", 6.0, 0.0, 9.0);

        System.out.println(forma1.toString());
        System.out.println("\n");
        System.out.println(forma2.toString());

    }
}
