package poo.jornal_desportivo;

public class Jogo extends Campeonato {

    private String date;
    private String hour;
    private String locale;
    private String result;
    private String judge;
    
    public Jogo(String name, String date, String hour, String locale, String judge) {
        super(name);
        this.date = date;
        this.hour = hour;
        this.locale = locale;
        this.result = null;
        this.judge = judge;
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

    
    
}
