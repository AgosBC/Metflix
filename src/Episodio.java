import java.util.ArrayList;
import java.util.List;

public class Episodio {
    public int duracion; // en minutos
    public Director director;
    public List<Actor> actores = new ArrayList<>();
    public int numeroEpisodio;
    public String nombre;
    public String sinopsis; 

    public void reproducir(){ //ojo que no sea reproducirEpisodio, ya estoy en episodio es muy repetitivo
        System.out.println("reproduciendo episodio " + nombre);

    }


}
