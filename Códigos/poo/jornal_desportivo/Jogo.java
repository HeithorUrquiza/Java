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

    public Equipe getWinner() {
        return winner;
    }

    public void setWinner(Equipe winner) {
        this.winner = winner;
    }

    public Equipe getLoser() {
        return loser;
    }

    public void setLoser(Equipe loser) {
        this.loser = loser;
    }    


    public void scheduleGame(){
        if(this.fromHome.getDivision().equals(this.visitor.getDivision())){
            this.setMarked(true);
        }
    }   

    public String showTeams() {
        return "\n ** Time da Casa **" + fromHome.toString() + "\n\n** Time Visitante **" + visitor.toString();
    }
    
    public String showScore(Equipe winner, int golsW, Equipe loser, int golsL){
        String text = null;
        if(marked){
            this.setWinner(winner);
            this.setLoser(loser);
            this.winner.setWins(this.winner.getWins() + 1);
            this.loser.setLoses(this.loser.getLoses() + 1);
            text = "\n-----------------------------" + "\n ** Resultado da partida **\n" + this.winner.getName() + " " + golsW 
            + " x " + golsL + " " + this.loser.getName() + "\n-----------------------------";
        }
        return text;
    }

    @Override
    public String toString() {
        String text = null;
        if(marked){
            text = "Data: " + date + " | Hora: " +hour+ " | Local: " +locale+ " | Árbitro: " +judge+ 
            " | Time de Casa: " + fromHome.getName() + " | Time Visitante: " + visitor.getName() + "\n";
        }
        return text;
    }   
}
