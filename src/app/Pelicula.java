package app;
import app.personas.*;
public class Pelicula extends Contenido {

    private int duracion;
    private Actor actor;
    private Director director;
    private boolean filmadaEnImax;

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Actor getActor() {
        return this.actor;
    }

    public void setaActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return this.director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public boolean getFilmadaEnImax() {
        return this.filmadaEnImax;
    }

    public void setFilmadaEnImax(boolean filmadaEnImax) {
        this.filmadaEnImax = filmadaEnImax;
    }

}
