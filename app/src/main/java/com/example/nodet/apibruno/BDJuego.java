package com.example.nodet.apibruno;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by nodet on 20/11/17.
 */
public class BDJuego {

    HashMap<String, Jugador> mapaJugadores;
    HashMap<String, Personaje> mapaPersonajes;
    HashMap<String, Objeto> mapaObjetos;

    static BDJuego intanceBDJuego;

    private BDJuego()
    {
        mapaJugadores = new HashMap<String, Jugador>();
        mapaPersonajes = new HashMap<String, Personaje>();
        mapaObjetos = new HashMap<String, Objeto>();
        Jugador juan = new Jugador("juan", "juan@msn.com", "123", new ArrayList<Personaje>());
        Jugador bruno = new Jugador("bruno", "bruno@msn.com", "123", new ArrayList<Personaje>());
        Personaje vidente = new Personaje("vidente", "123", 1,1,1,1, new ArrayList<Objeto>());
        Personaje nodet = new Personaje("nodet", "123", 2,2,2,2, new ArrayList<Objeto>());
        Objeto objeto1 = new Objeto("pico", "herramienta", "epico", 100);
        Objeto objeto2 = new Objeto("revolver", "pistola", "raro", 99);
        nodet.getObjetos().add(objeto1);
        vidente.getObjetos().add(objeto2);
        bruno.getPersonajes().add(nodet);
        juan.getPersonajes().add(vidente);

        mapaJugadores.put(bruno.getNombre(), bruno);
        mapaJugadores.put(juan.getNombre(), juan);

        Jugador jugadorEmpty = new Jugador();
        mapaJugadores.put("empty", jugadorEmpty);

        Personaje personajeEmpty = new Personaje();
        mapaPersonajes.put("empty", personajeEmpty);

        Objeto objetoEmpty = new Objeto();
        mapaObjetos.put("empty", objetoEmpty);


    }

    static BDJuego getDbInstancia()
    {
        if(intanceBDJuego == null)
        {
            intanceBDJuego = new BDJuego();
        }
        return intanceBDJuego;
    }


    public HashMap<String, Jugador> getMapaJugadores() {
        return mapaJugadores;
    }

    public void setMapaJugadores(HashMap<String, Jugador> mapaJugadores) {
        this.mapaJugadores = mapaJugadores;
    }

    public static BDJuego getIntanceBDJuego() {
        return intanceBDJuego;
    }

    public static void setIntanceBDJuego(BDJuego intanceBDJuego) {
        BDJuego.intanceBDJuego = intanceBDJuego;
    }

    public HashMap<String, Personaje> getMapaPersonajes() {
        return mapaPersonajes;
    }

    public void setMapaPersonajes(HashMap<String, Personaje> mapaPersonajes) {
        this.mapaPersonajes = mapaPersonajes;
    }

    public HashMap<String, Objeto> getMapaObjetos() {
        return mapaObjetos;
    }

    public void setMapaObjetos(HashMap<String, Objeto> mapaObjetos) {
        this.mapaObjetos = mapaObjetos;
    }
}

