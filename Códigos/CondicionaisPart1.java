import java.util.Scanner;

public class CondicionaisPart1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Insira uum valor inteiro: ");
            int n = input.nextInt();

            if (n % 2 == 0){
                System.out.println("Este número é par !!");
            } else {
                System.out.println("Este número é ímpar !!");
            }
        } 
    }
}
