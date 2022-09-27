package poo.jornal_desportivo;

public class App {
    public static void main(String[] args) {
        
        Jogador j1[] = new Jogador[3];
        j1[0] = new Jogador("Marcelo", "Brasileira", "Zagueiro", false);
        j1[1] = new Jogador("Coltinho", "Alemanha", "Meio", true);
        j1[2] = new Jogador("Menino ney", "Brasil", "Atacante", false);

        Jogador j2[] = new Jogador[3];
        j2[0] = new Jogador("Marcos", "Brasileira", "Zagueiro", false);
        j2[1] = new Jogador("Harmin", "Alemanha", "Meio", true);
        j2[2] = new Jogador("Nene", "Brasil", "Atacante", false);

        Equipe e1 = new Equipe("Primeira divisão", "Jogador Caro", j1, "Almofadinha");
        Equipe e2 = new Equipe("Segunda divisão", "Indomaveis", j2, "Frajola");

        e1.demoteTeam();
        e2.promotTeam();

        System.out.println(e1.toString());
        System.out.println(e2.toString());

        /*Jogo pl1[] = new Jogo[1];
        pl1[0] = new Jogo("20/04/2023", "18:00", "Serrinha", "Pavão", e2, e1);

        pl1[0].scheduleGame();

        Campeonato c1 = new Campeonato("Copinha", pl1);
        System.out.println(c1.rounds());

        System.out.println(pl1[0].showTeams());
        System.out.println(pl1[0].showScore(e2, 2, e1, 0));*/
        
       
    }
}
