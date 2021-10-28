package io.codekaffee.clients;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.codekaffee.models.SwPlanet;


@Path("/planets")
@RegisterRestClient(baseUri = "https://swapi.dev/api")
public interface SwPlanetsRestClient {
    
    @GET
    Result<SwPlanet> getAllPlanets();

    @GET
    @Path("{id}")
    SwPlanet getPlanetById(@PathParam("id") Long id);
    
}
