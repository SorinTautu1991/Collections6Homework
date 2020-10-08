package com.tse;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    private List<Adress> adressList = new ArrayList<>();
    private List<Country> countries = new ArrayList<>();

    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public void addAdressForHobby(String adress){
        adressList.add(new Adress(adress));
    }

    public void addCountryForHobby(String country){
        countries.add(new Country(country));
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Adress> getAdressList() {
        return adressList;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
