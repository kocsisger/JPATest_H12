package org.example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Zoo {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    /*@OneToMany
    @JoinColumn(name = "zoo_id")
    private List<Animal> animals = new ArrayList<>();*/

    public Zoo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
