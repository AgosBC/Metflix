import java.util.ArrayList;
import java.util.List;

public class Temporada {

    private int numeroTemporada;
    private List<Episodio> episodios = new ArrayList<>();
    private String nombre; // nombre de la temporada de haberlo

    public Episodio bucarEpisodio(int numEpABuscar) {

        for (Episodio episodio : this.episodios) {
            if (episodio.getNumeroEpisodio() == numEpABuscar)
                return episodio;
        }

        return null;

    }

    public int getNumeroTemporada() {
        return this.numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public List<Episodio> getEpisodios() {
        return this.episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
