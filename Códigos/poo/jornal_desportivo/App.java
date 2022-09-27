package poo.jornal_desportivo;

public class App {
    public static void main(String[] args) {
        
        Jogador j[] = new Jogador[3];
        j[0] = new Jogador("Marcelo", "Brasileira", "Zagueiro", false);
        j[1] = new Jogador("Coltinho", "Alemanha", "Meio", true);
        j[2] = new Jogador("Menino ney", "Brasil", "Atacante", false);

        Equipe e1 = new Equipe("Primeira", "Os marrecos", j, "Josuá");
        System.out.println(e1.toString());
    }
}
