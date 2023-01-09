package com.example.restheaderstatus;

public class Country {
    private String name;
    private int population;


    public static Country of(String country, int population){
        Country c = new Country();
        c.setName(country);
        c.setPopulation(population);
        return c;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
