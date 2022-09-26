package poo.jornal_desportivo;

public class Campeonato {
    
    private String name;
    private Equipe visitor;
    private Equipe fromHome;
    
    public Campeonato(String name) {
        this.name = name;
        this.visitor = null;
        this.fromHome = null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Equipe getVisitor() {
        return visitor;
    }

    public void setVisitor(Equipe visitor) {
        this.visitor = visitor;
    }

    public Equipe getFromHome() {
        return fromHome;
    }

    public void setFromHome(Equipe fromHome) {
        this.fromHome = fromHome;
    }

    
    public void round(){
        
    }
}
