package app;
import app.contenidos.*;
public class App {
    public static void main(String[] args) throws Exception {
       
        // a partir de Metlix buscar la tmporada 5 episodio 1 de la serie how i met your mother
        // y reproducir la serie

        //el metodo reproducir episodio estara en el episodio

        //dice a partir de metfliz: hay que crear un objeto metflix. primero se busca la serie luego la temporada
        //y finalmente el episodio. cada uno es responsable de sus partes

        Metflix miMetflix = new Metflix(); //este objeto, recien creado no tiene ninguna serie todavia. (llame a metflix y cree un objeto de esa clase)
                                            //hay que llamar inicializar el catalogo


        System.out.println("Inicializando catalogo de miMetflix");                                            
        miMetflix.inicializarCatalogo(); // aqui entonces llamo al metodo que inicializa peliculas y series.

        //1) buscar la serie el encargado de esto es metflix (ir a clase metflix y crear un metodo buscar serie)
        // vuelvo y busco

        //miMetflix.buscarSerie("How I met your mother"); si pongo esto solo (la funcion) no se esta guardando en ningun lado
        // el resultado. necesito declarar una variable

        Serie serieBuscada = miMetflix.buscarSerie("Supernatural");
        if (serieBuscada == null){
            System.out.println("Serie no encontrada");
            return;
        }

        //2) ahora tengo que buscar la temporada, la encargada de esto es la serie (ir a clase serie)

        Temporada tempBuscada = serieBuscada.buscarTemporada(3); //la responsabilidad de buscar es de serie (para esta serieBuscada encontrar tal temporada)
        //si usaramos miMetflix tiraria la temporada 5 de la primera serie que encuentre

        //3) buscar el capitulo. el encargado es temporada

        Episodio episodioBuscado = tempBuscada.bucarEpisodio(3);

        //llamar al metodo reproducir

        episodioBuscado.reproducir(); //es void no devuelve nada entonces no necesita variable

        
        // como hago para imprimer el nombre de los actores 
        // de la serie que elegi para reproducir System.out.println("protagonistas: " + howImetYM.actores); un IF?

        

     





    }
}
