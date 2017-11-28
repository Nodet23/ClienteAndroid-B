package com.example.nodet.apibruno;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by nodet on 28/11/17.
 */

public interface JuegoApi {

    @GET("/myapp/json/getJugador")
    Call<Jugador> get();


}



/*
*
    @GET("/myapp/json/get")
    Call<Track> getTrack();

    @GET("/myapp/json/got/{id}")
    Call<Track> getTrackById(@Path("id") int trackid);

    @GET("/myapp/json/getAll")
    Call<List<Track>> getTrackAll();

    @POST("myapp/json/new")
    Call<String> newTrack(@Body Track track);

    @DELETE("/myapp/json/del/{id}")
    Call<String> delTrackById(@Path("id") int trackid);


-------------------------------

Jugadores jugadores;

    public JugadoresRest()
    {
        jugadores = Jugadores.getDbInstancia();
    }

    @GET
    @Path("/Jugador/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Jugador buscarJugador(@PathParam("nombre") String nombre) {
        return jugadores.getMapaJugadores().get(nombre);
    }

    @GET
    @Path("/Personaje/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Personaje buscarPersonaje(@PathParam("nombre") String nombre) {
        return jugadores.getMapaPersonajes().get(nombre);
    }

    @GET
    @Path("/Objeto/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Objeto buscarObjeto(@PathParam("nombre") String nombre) {
        return jugadores.getMapaObjetos().get(nombre);
    }


    @POST
    @Path("/nuevoJugador/{jugadorNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response nuevoJugador(Jugador jugador, @PathParam("jugadorNombre") String nombre) {
        jugador.setNombre(nombre);
        jugadores.getMapaJugadores().put(nombre, jugador);
        return Response.status(201).entity("Añadido jugador con nombre:" +nombre).build();
    }

    @POST
    @Path("/eliminarJugador/{jugadorNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response eliminarJugador(@PathParam("jugadorNombre") String nombre) {
        jugadores.getMapaJugadores().remove(nombre);
        return Response.status(201).entity("Eliminado jugador con nombre:" +nombre).build();
    }

    @POST
    @Path("/nuevoPersonaje/{personajeNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response nuevoPersonaje(Personaje personaje, @PathParam("personajeNombre") String nombre) {
        personaje.setNombre(nombre);
        jugadores.getMapaPersonajes().put(nombre, personaje);
        return Response.status(201).entity("Añadido personaje con nombre:" +nombre).build();
    }

    @POST
    @Path("/eliminarPersonaje/{personajeNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response eliminarPersonaje(@PathParam("personajeNombre") String nombre) {
        jugadores.getMapaPersonajes().remove(nombre);
        return Response.status(201).entity("Eliminado personaje con nombre:" +nombre).build();
    }

    @POST
    @Path("/nuevoObjeto/{objetoNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response nuevoObjeto(Objeto objeto, @PathParam("objetoNombre") String nombre) {
        objeto.setNombre(nombre);
        jugadores.getMapaObjetos().put(nombre, objeto);
        return Response.status(201).entity("Añadido objeto con nombre:" +nombre).build();
    }

    @POST
    @Path("/eliminarObjeto/{objetoNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response eliminarObjeto(@PathParam("objetoNombre") String nombre) {
        jugadores.getMapaObjetos().remove(nombre);
        return Response.status(201).entity("Eliminado objeto con nombre:" +nombre).build();
    }

    @POST
    @Path("/nuevoObjetoPersonaje/{personajeNombre}/{objetoNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response nuevoObjetoPersonaje(@PathParam("personajeNombre") String nombrePersonaje,
                                         @PathParam("objetoNombre") String nombreObjeto) {

        //Añadir comprobaciones de errores y tal
        jugadores.getMapaPersonajes().get(nombrePersonaje).getObjetos().add(jugadores.getMapaObjetos().get(nombreObjeto));

        return Response.status(201).entity("Añadido objeto con nombre:" +nombreObjeto +"a personaje" +nombrePersonaje).build();
    }

    @POST
    @Path("/nuevoPersonajeJugador/{jugadorNombre}/{personajeNombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response nuevoPersonajeJugador(@PathParam("jugadorNombre") String jugadorNombre,
                                         @PathParam("personajeNombre") String personajeNombre) {

        //Añadir comprobaciones de errores y tal
        jugadores.getMapaJugadores().get(jugadorNombre).getPersonajes().add(jugadores.getMapaPersonajes().get(personajeNombre));

        return Response.status(201).entity("Añadido personaje con nombre:" +personajeNombre +"a jugador" +jugadorNombre).build();
    }



*/