import java.util.ArrayList;
import java.util.List;

public class Metflix {
    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    //darle funcionalidad al netflix. ejemplo que se pueda buscar peliculas o series
    //primero hay que inicializar catalogo:

    public void inicializarCatalogo(){

        //informacion hardcodiada es info que no es ingresada por teclada si no codiada

        //how i met your mother howImetYM en series y Titanic y batman el caballero de la noche como peliculas

        // para crear y vincular trilogias por ejemplo puedo crear una lista peliculas en peliculas con el atributo sagas

        Pelicula titanic = new Pelicula();
        /*titanic.nombre = "Titanic";
        titanic.añoLanzamiento = 2007;
        titanic.duracion = 210; -- dejo anotacion de cuando los atributos eran publicos*/

       titanic.setNombre("Titanic");
       titanic.setAñoLanzamiento(2007);
       titanic.setDuracion(210);
       
       
        Pelicula inception = new Pelicula();
        inception.setNombre("Inception");
        inception.setAñoLanzamiento(2010);
        inception.setDuracion(1480);

        Director director = new Director();

        director.setNombre("Christopher Nolan");

       
        


        // tengo que instanciar actor para poder agregarlo a la pelicula

        Actor actor = new Actor();
        actor.setNombre("Leo Dicaprio"); 

        // ahora si puedo agregarlo a la lista de actores con el metodo add

        titanic.getActores().add(actor);
        
        inception.getActores().add(actor);
        this.peliculas.add(inception);
        

    
        //hasta aca todavia no tengo agregago titanic a la lista de peliculas, la lista se encuentra en esta clase por ello
        //utilizo this y como antes el metodo add.

        this.peliculas.add(titanic); //aca queda agregado titanic al catalogo


        //agrego la pelicula de batman

        Pelicula batman = new Pelicula();

        batman.setNombre("Batman: El caballero de la noche");
        batman.setAñoLanzamiento(2008);
        batman.setDuracion(152);

        // no vuelvo a declarar la variable actor es decir, Actor actor = new Actor(), voy a reusar
        // pero primero voy a re instanciar asi:
       
        actor= new Actor(); 

        actor.setNombre("Christian Bale");  // a dicaprio lo esta referenciando titanic en(titanic.actores.add(actor)) si faltara esto entonces cristian bale "pisaria"
                                            // a dicaprio, o sea este ultimo se borra y Bale pasaria a ser el unico actor listadp
        batman.getActores().add(actor);

        this.peliculas.add(batman); //agregada a catalogo

        // en la practica real los datos y peliculas se introducen por teclado con un ciclo for y no hardcodiando
        // de todas maneras, la logica de esta contruccion, los metodos/llamadas/instancas son las mismas

        //practica

       


        // series How I met your mother howIMetYM

        Serie howIMetYM =new Serie();
        howIMetYM.setNombre("How I met your mother");
        howIMetYM.setAñoLanzamiento(2004);

        actor = new Actor();
        actor.setNombre("Neil Patric Harris");
        howIMetYM.getActores().add(actor);

        actor = new Actor();
        actor.setNombre("Cobie Smulders"); 
        howIMetYM.getActores().add(actor);

        //la serie tiene temporadas t5 e11
        
        //1) creo la temporada

        Temporada temporada = new Temporada();
        temporada.setNumeroTemporada(5);        
        //howIMetYM.temporadas.add(temporada); aca se podria agregar la temporada enseguida y continuar con los episodios pero es mas claro si
        // primero instancio la temporada, creo todos los objetos (temporada y episodios) y despoues la agrego al catalogo*
         
        //2) creo los episodios 

       /* Episodio episodio = new Episodio();
        episodio.setNombre("the last cigarrette"); 
        episodio.setNumeroEpisodio(11); 
        temporada.episodios.add(episodio); // agrego episodio a la lista de episodios de la temporada

        episodio = new Episodio();
        episodio.setNombre("Definitions");
        episodio.setNumeroEpisodio(1);
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.setNombre("Robin 101");
        episodio.setNumeroEpisodio(3);
        temporada.episodios.add(episodio);
        ASI QUEDA SIN CONSTRUCTORES, LO MiSMO CON ES:*/ 

        Episodio episodio = new Episodio(11, "Thelast Cigarrette");//constructor de 2 parametros 
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio (1, "Definitions");
        episodio.setDuracion(42); //puedo agregarle otros atributos aparte del constructor
        temporada.getEpisodios().add(episodio);


            
        //3) *agrego al catalogo la temporada ahora que ya estan ingresados los capitulos

        howIMetYM.getTemporadas().add(temporada); //*aca esta agregada al catalogo


        temporada = new Temporada();
        temporada.setNumeroTemporada(1);

        episodio = new Episodio(1, "Pilot", 42); //uso constructor 3 parametros 
        temporada.getEpisodios().add(episodio);

        episodio =new Episodio(3, "The Sweet taste of liberty", 42);
        
        episodio = new Episodio(6, "The Slutty pumpking", 45);
       
        howIMetYM.getTemporadas().add(temporada);


        temporada = new Temporada();
        temporada.setNumeroTemporada(3); 

        episodio = new Episodio(1, "Wait for it");
        temporada.getEpisodios().add(episodio);

        episodio =new Episodio(4, "Little boys");
        
        howIMetYM.getTemporadas().add(temporada);

        // aca termino de agregar las temporadas y los capitulos a las temporadas solo falta:
        //4) agregar la serie al catalogo

        this.series.add(howIMetYM);

        //creo otra serie con dos temporadas y dos episodios cada. big bang theory

        Serie bbt = new Serie(); //cree una nueva instancia en vez de resutilizar (serie= new Serie())
        bbt.setNombre("Big Bang Theory");
        bbt.setAñoLanzamiento(2007);

        actor = new Actor();
        actor.setNombre("Kaley Cuoco");
        bbt.getActores().add(actor);

        temporada = new Temporada();
        temporada.setNumeroTemporada(1);

        episodio = new Episodio(1, "Pilot");
        temporada.getEpisodios().add(episodio);

        
        episodio = new Episodio(9, "The Copper-Hofstadter Polarization");
        temporada.getEpisodios().add(episodio);

        bbt.getTemporadas().add(temporada);

        this.series.add(bbt);


        // tarea agrego capitulos de Supernatural aca utilizo constructores para los episodios

        Serie supernatural = new Serie();
        supernatural.setNombre("Supernatural"); //creo serie supernatural
        supernatural.setAñoLanzamiento(2005);

        actor = new Actor();
        actor.setNombre("Jensen Ackles");
        supernatural.getActores().add(actor);

        actor = new Actor();
        actor.setNombre("Jared Padalecki");
        supernatural.getActores().add(actor); //agrego actor

                
        temporada = new Temporada();
        temporada.setNumeroTemporada(3); // creo temporada
        

        episodio = new Episodio(3, "Bad Day at Black Rock");
        temporada.getEpisodios().add(episodio); // agrego cada episodio individualmete en la lista temporada

        
        episodio = new Episodio(8, "Very Supernatural Christmas", 53 );
        temporada.getEpisodios().add(episodio);


        supernatural.getTemporadas().add(temporada); // agrego cada temporada una vez terminados de cargar los episodios

        temporada = new Temporada();
        temporada.setNumeroTemporada(4);

        episodio = new Episodio(1, "Lazarus Rising", 53);
        //episodio.nombre ="Lazarus Rising";
        //episodio.numeroEpisodio = 1;
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(11, "Family Remains");
        //episodio.nombre = "Family Remains";
        //episodio.numeroEpisodio = 11;
        temporada.getEpisodios().add(episodio);

        
        supernatural.getTemporadas().add(temporada);

        this.series.add(supernatural); //agrego supernatural a la lista series que se encuentra en esta (this) clase       

    }//ojo con la llave. esta cierra public void inicializarCatalogo
     //buscar serie
     public Serie buscarSerie(String nombreABuscar){
        // en memoria se encuentran una lista con series= serie1 - serie2 - serie25 - seri40
        // se usa Foreach: que sirve para recorrer listas
        //este ciclo tiene una variable que apunta en cada vuelta a cada elemento de la lista
        //o sea la primera vez va a apuntar a serie1 luego serie2 despues serie25...hasta que termina

        // primero declaro la variable que quiero iterar (y la clase?) y despues
        // donde la queremos buscar, quedando: Serie serie : this.series

        for (Serie serie : this.series) {

            //quiero buscar la serie por nombre nombreABuscar para ello tengo que preguntar con if

            if (serie.getNombre().equals(nombreABuscar)) //solo busco serie no reproduce
                return serie;
                                     
        }
        return null;




    }
    



}
