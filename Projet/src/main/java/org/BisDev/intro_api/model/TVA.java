package org.BisDev.intro_api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "tva")
public class TVA implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private float rate; //taux

    @OneToMany(mappedBy = "tva")
    private Collection<Theater> theaters;

    public TVA() {
        theaters = new ArrayList<>();
    }

    public TVA(String name, float rate) {
        super();
        this.name = name;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public Collection<Theater> getTheaters() {
        return theaters;
    }

    public void setTheaters(Collection<Theater> theaters) {
        this.theaters = theaters;
    }
}

