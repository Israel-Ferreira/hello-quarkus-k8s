package io.codekaffee.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SwPlanet {
    
    @JsonProperty("name")
    private String name;

    @JsonProperty("rotation_period")
    private String rotationPeriod;

    @JsonProperty("climate")
    private String climate;


    @JsonProperty("terrain")
    private String terrain;




    public SwPlanet() {
    }


    public SwPlanet(String name, String rotationPeriod, String climate, String terrain) {
        this.name = name;
        this.rotationPeriod = rotationPeriod;
        this.climate = climate;
        this.terrain = terrain;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getRotationPeriod() {
        return rotationPeriod;
    }


    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }


    public String getClimate() {
        return climate;
    }


    public void setClimate(String climate) {
        this.climate = climate;
    }


    public String getTerrain() {
        return terrain;
    }


    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }



}
