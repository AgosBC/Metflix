package app.contenidos;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

    private List<Temporada> temporadas = new ArrayList<>();

    public Temporada buscarTemporada(int numTempBuscar) {
        for (Temporada temporada : this.temporadas) { // la ultima parte es donde quiero buscarlo this(hace referencia a
                                                      // donde esto (serie) y la lisa temporadas
            if (temporada.getNumeroTemporada() == numTempBuscar) {
                return temporada;
            }

        }
        return null;
    }

    public List<Temporada> getTemporadas() {
        return this.temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }
}
