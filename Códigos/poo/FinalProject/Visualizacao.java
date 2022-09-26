package poo.FinalProject;

public class Visualizacao {
    
    private Gafanhoto viewer;
    private Video film;
    
    
    public Visualizacao(Gafanhoto viewer, Video film) {
        this.viewer = viewer;
        this.film = film;
        this.viewer.setTotWatched(this.viewer.getTotWatched() + 1);
        this.film.setViews(this.film.getViews() + 1);
    }


    public Gafanhoto getViewer() {
        return viewer;
    }

    public void setViewer(Gafanhoto viewer) {
        this.viewer = viewer;
    }

    public Video getFilm() {
        return film;
    }

    public void setFilm(Video film) {
        this.film = film;
    }


    public void evaluate(){
        this.film.setEvaluation(5);
    }

    public void evaluate(int nota){
        this.film.setEvaluation(nota);
    }

    public void evaluate(double porc){
        int tot = 0;
        if(porc <= 20){
            tot = 3;
        } else if(porc <= 50){
            tot = 5;
        } else if(porc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.film.setEvaluation(tot);
    }


    @Override
    public String toString() {
        return "\nEspectdor: " +viewer+ "\nFilme/Vídeo: " + film;
    }

    
}
