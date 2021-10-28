package io.codekaffee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.codekaffee.clients.SwPlanetsRestClient;
import io.codekaffee.models.SwPlanet;

@Path("/planets")
public class SWPlanetResource {

    @Inject
    @RestClient
    private SwPlanetsRestClient restClient;
    
    @GET
    public List<SwPlanet> getPlanets(){
        List<SwPlanet> planets = restClient.getAllPlanets().getResults();
        return planets;
    }


    @GET
    @Path("{id}")
    @Retry(maxRetries = 2)
    @Fallback(fallbackMethod = "planetFallback")
    public SwPlanet getPlanetById(@PathParam("id") Long id){
        SwPlanet planet = restClient.getPlanetById(id);
        return planet;
    }


    public SwPlanet planetFallback(@PathParam("id") Long id){
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("Erro", "Planeta não encontrado");

        return new SwPlanet();
    }

}
