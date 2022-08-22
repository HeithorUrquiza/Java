import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        float a, b, c, delta;
        
        System.out.println("Para o cálculo de Bhaskara, informe: ");
        System.out.print("O valor de a: ");
        a = input.nextFloat();
        System.out.print("O valor de b: ");
        b = input.nextFloat();
        System.out.print("o valor de c: ");
        c = input.nextFloat();

        delta = (float) Math.pow(b, 2) - 4 * a * c;

        if (delta >= 0) {
            Double x1, x2;
            x1 = ((b * -1)+ Math.sqrt(delta)) / (2 * a);
            x2 = ((b * -1) - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A(s) raiz(es) é(são) %.2f, %.2f", x1, x2);
        } else {
            System.out.println("A equação não possui raiz real");
        }

        input.close();
    }
}
