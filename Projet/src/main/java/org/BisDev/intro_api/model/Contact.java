package org.BisDev.intro_api.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contact")
public class Contact implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String describ;

    public Contact() {
    }

    public Contact(String describ) {
        this.describ = describ;
    }

    public String getDescrib() {
        return describ;
    }

    public void setDescrib(String describ) {
        this.describ = describ;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", describ='" + describ + '\'' +
                '}';
    }
}
