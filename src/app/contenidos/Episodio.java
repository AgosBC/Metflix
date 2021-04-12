package app.contenidos;
import app.personas.*;

import java.util.ArrayList;
import java.util.List;

public class Episodio {

    // constructor, generalmente se escribe primero el construcor, luego las
    // variables (privadas?) (orden de importancia)
    // luego get y set
    // CONSTRUCTORES:

    public Episodio(int numeroEpisodio, String nombre) {
        this.numeroEpisodio = numeroEpisodio;
        this.nombre = nombre;
    }

    // podria hacer otro constructor que llama a ese ya hecho y agrega otro
    // atributo. los constructores suelen tener 2/3 atributos
    // y solo los mas importantes (en este caso numero y nombre de episodio y hago
    // otro que contenga duracion)

    public Episodio(int numeroEpisodio, String nombre, int duracion) {
        this(numeroEpisodio, nombre); // llamo constructor anterior
        this.duracion = duracion;
    }

    private String nombre;
    private int numeroEpisodio;
    private int duracion; // en minutos
    private Director director;
    private List<Actor> actores = new ArrayList<>();
    private String sinopsis;

    public void reproducir() { // ojo que no sea reproducirEpisodio, ya estoy en episodio es muy repetitivo
        System.out.println("reproduciendo episodio " + nombre);

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEpisodio() {
        return this.numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Director getDirector() {
        return this.director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActores() {
        return this.actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }

    public String getSinopsis() {
        return this.sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

}
