package org.BisDev.intro_api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "rent")
public class Rent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private Date dateRent;
    @Column(nullable = false)
    private Date dateDuration;
    @Column(nullable = false)
    private float price;

    @ManyToOne()
    private Member member;

    @ManyToOne()
    private Theater theater;

    public Rent() {
    }

    public Rent(Date dateRent, Date dateDuration, float price, Member member, Theater theater) {
        this.dateRent = dateRent;
        this.dateDuration = dateDuration;
        this.price = price;
        this.member = member;
        this.theater = theater;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateRent() {
        return dateRent;
    }

    public void setDateRent(Date dateRent) {
        this.dateRent = dateRent;
    }

    public Date getDateDuration() {
        return dateDuration;
    }

    public void setDateDuration(Date dateDuration) {
        this.dateDuration = dateDuration;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", dateRent=" + dateRent +
                ", dateDuration=" + dateDuration +
                ", price=" + price +
                ", member=" + member +
                ", theater=" + theater +
                '}';
    }
}
