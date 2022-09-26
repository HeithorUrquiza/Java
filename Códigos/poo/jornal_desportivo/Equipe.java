package poo.jornal_desportivo;

public class Equipe extends Divisao{
    
    private String name;
    private Jogador player;
    private int wins;
    private int loses;
    private String technician;

    
    public Equipe(String division, String name, Jogador player, int wins, int loses, String technician) {
        super(division);
        this.name = name;
        this.player = player;
        this.wins = wins;
        this.loses = loses;
        this.technician = technician;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jogador getPlayer() {
        return player;
    }

    public void setPlayer(Jogador player) {
        this.player = player;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }
    

    @Override
    public void demoteTeam() { 
    }

    @Override
    public void promotTeam() {   
    }
}
