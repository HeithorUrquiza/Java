package poo.jornal_desportivo;

public class Jogo {

    private String date;
    private String hour;
    private String locale;
    private String result;
    private String judge;
    private Equipe visitor;
    private Equipe fromHome;

    
    public Jogo(String date, String hour, String locale, String judge, Equipe visitor, Equipe fromHome) {
        this.date = date;
        this.hour = hour;
        this.locale = locale;
        this.result = null;
        this.judge = judge;
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
        /*if(){

        }*/
    }
    
    
}
