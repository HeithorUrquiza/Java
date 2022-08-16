import java.util.Scanner;
import java.time.LocalDate;

public class OperadoresLogicos {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            LocalDate data = LocalDate.now();
            int a, b, ano; String r;
            ano = data.getYear();

            System.out.print("Informe seu ano de nascimento: ");
            a = ler.nextInt();
            b = ano - a;
            r = (b >= 18)?"Maior de idade":"Menor de idade";
            System.out.printf("%s\n", r);
        }
    }
}
