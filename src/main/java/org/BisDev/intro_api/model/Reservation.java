package org.BisDev.intro_api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private Date dateReservation;
    @Column(nullable = false)
    private Date dateSpectacle;
    @Column(nullable = false,name = "space")
    private int  palce;
    @Column(nullable = false)
    private float  priceHT;

    @ManyToOne()
    private Member member;

    @ManyToOne()
    @JoinColumn(name = "theatre_id")
    private Theater theater;

    public Reservation() {
    }

    public Reservation(Date dateReservation, Date dateSpectacle, int palce, float priceHT, Member member, Theater theater) {
        this.dateReservation = dateReservation;
        this.dateSpectacle = dateSpectacle;
        this.palce = palce;
        this.priceHT = priceHT;
        this.member = member;
        this.theater = theater;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Date getDateSpectacle() {
        return dateSpectacle;
    }

    public void setDateSpectacle(Date dateSpectacle) {
        this.dateSpectacle = dateSpectacle;
    }

    public int getPalce() {
        return palce;
    }

    public void setPalce(int palce) {
        this.palce = palce;
    }

    public float getPriceHT() {
        return priceHT;
    }

    public void setPriceHT(float priceHT) {
        this.priceHT = priceHT;
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
        return "Reservation{" +
                "id=" + id +
                ", dateReservation=" + dateReservation +
                ", dateSpectacle=" + dateSpectacle +
                ", palce=" + palce +
                ", priceHT=" + priceHT +
                ", member=" + member +
                ", theater=" + theater +
                '}';
    }
}
