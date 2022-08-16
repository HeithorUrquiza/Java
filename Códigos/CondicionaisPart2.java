import java.time.LocalDate;
import java.util.Scanner;

public class CondicionaisPart2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Scanner input = new Scanner(System.in);
        int ano, data, idade;
        data = date.getYear();

        System.out.println("*** Posso votar? ***");
        System.out.print("Informe seu ano de nascimento: ");
        ano = input.nextInt();
        idade = data - ano;
        System.out.println("Idade: " +idade);

        if (idade < 16){
            System.out.println("Não pode votar");
        } else if ((idade >= 16 && idade < 18) || idade > 70){
            System.out.println("Voto opcional");
        } else if (idade >= 18){
            System.out.println("Voto obrigatório");
        }

        input.close();
    }
}
