import java.util.Scanner;

public class JogoDoGenio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = Math.random();
        int n = (int) (1 + x * (6-1)), a;
        String resp;

        System.out.println("Estou pensando em um número entre 1 e 5. \nTente adivinhar!");
        a = input.nextInt();
            
        do {
            if (a == n) {
                resp = "Parabéns, você acertou";
            } else {
                resp = "Não foi dessa vez. Tente novamente";
                System.out.println(resp);
                a = input.nextInt();
            }
        } while (a != n); 
            
        System.out.println(resp);
        System.out.println(n);

        input.close();
    }
}
