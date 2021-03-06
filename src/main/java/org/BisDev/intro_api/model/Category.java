package org.BisDev.intro_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "category")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String type;

    @JsonIgnore
    @OneToMany(mappedBy ="category")
    private Collection<Theater> theaters;

    public Category() {
        theaters = new ArrayList<>();
    }

    public Category(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Collection<Theater> getTheaters() {
        return theaters;
    }

    public void setTheaters(Collection<Theater> theaters) {
        this.theaters = theaters;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", theaters=" + theaters +
                '}';
    }
}
