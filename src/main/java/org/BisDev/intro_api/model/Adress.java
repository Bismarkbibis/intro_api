package org.BisDev.intro_api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "adress")
public class Adress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String adress;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String ptd;

    @ManyToOne()
    private Member member;

    @OneToMany(mappedBy = "adress")
    private Collection<Order> orders;

    public Adress() {
        orders = new ArrayList<>();
    }

    public Adress(String name, String firstname, String adress, String city, String ptd, Member member) {
        this.name = name;
        this.firstname = firstname;
        this.adress = adress;
        this.city = city;
        this.ptd = ptd;
        this.member = member;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPtd() {
        return ptd;
    }

    public void setPtd(String ptd) {
        this.ptd = ptd;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", ptd='" + ptd + '\'' +
                ", member=" + member +
                ", orders=" + orders +
                '}';
    }
}
