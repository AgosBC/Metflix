import java.util.ArrayList;
import java.util.List;

public class Temporada {

    public int numeroTemporada;
    public List<Episodio> episodios = new ArrayList<>();
    public String nombre; //nombre de la temporada de haberlo


    public Episodio bucarEpisodio(int numEpABuscar){

        for (Episodio episodio : episodios) {
            if (episodio.numeroEpisodio == numEpABuscar)
            return episodio;
        }
            
        return null;
        
    }



}
