package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int id;
    private String name;
    private List<Animal> animals = new ArrayList<>();

    public Zoo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
