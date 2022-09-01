import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, p; String n; int l;

        FormasBidimensionais quadrado;
        quadrado = new FormasBidimensionais("Círculo", 5.0, 0.0, 3.14);

        System.out.print("Informe a quantidado de lados: ");
        l = input.nextInt();
        a = quadrado.calcArea(l);
        n = quadrado.getName();
        p = quadrado.calcPerim(n);

        System.out.println("Area da figura: " + a);
        System.out.printf("Perimetro da figura: %.2f", p);

        input.close();
    }
}
