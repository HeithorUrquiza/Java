package poo.jornal_desportivo;

public class Jogo {

    private String date;
    private String hour;
    private String locale;
    private String result;
    private String judge;
    private boolean marked;
    private Equipe visitor;
    private Equipe fromHome;
    private Equipe winner;
    private Equipe loser;

    
    public Jogo(String date, String hour, String locale, String judge, Equipe visitor, Equipe fromHome) {
        this.date = date;
        this.hour = hour;
        this.locale = locale;
        this.result = null;
        this.judge = judge;
        this.marked = false;
        this.visitor = visitor;
        this.fromHome = fromHome;
        this.winner = null;
        this.loser = null;
    }
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getJudge() {
        return judge;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public boolean getMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
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


    public void scheduleGame(){
        if(this.fromHome.getDivision().equals(this.visitor.getDivision())){
            this.setMarked(true);
        }
    }   

    public String showTeams() {
        return "\n ** Time da Casa ** \n" + fromHome.toString() + "\n ** Time Visitante ** \n" + visitor.toString();
    }
    
    public String showScore(Equipe winner, int golsW, Equipe loser, int golsL){
        this.winner.setWins(this.winner.getWins() + 1);
        this.loser.setLoses(this.loser.getLoses() + 1);
        return String.format("\n ** Resultado da partida ** \n%s %d x %d %s", winner.getName(), golsW, loser.getName(), golsL);
    }

    @Override
    public String toString() {
        String text = null;
        if(marked){
            text = "Data: " + date + " | Hora: " +hour+ " | Local: " +locale+ " | Árbitro: " +judge+ "\nTime de Casa: " +
            fromHome + " x Time Visitante: " + visitor;
        }
        return text;
    }    
}
