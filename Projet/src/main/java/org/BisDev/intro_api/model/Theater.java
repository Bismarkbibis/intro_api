package org.BisDev.intro_api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "theater")
public class Theater implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private float price;
    @Column(nullable = false,unique = true)
    private String resume;
    @Column(nullable = false)
    private  String image;
    @Column(nullable = false)
    private Date datePresentation;
    @Column(nullable = false)
    private String autor;
    @Column(unique = true,nullable = false)
    private String identifyCode;

    @ManyToOne()
    private Category category;

    @ManyToOne()
    private TVA tva;

    @OneToMany(mappedBy = "theater")
    private Collection<OrderLin> orderLins;

    @OneToMany(mappedBy = "theater")
    private Collection<Reservation> reservations;

    @OneToMany(mappedBy = "theater")
    private Collection<Opinion> opinions;

    @OneToMany(mappedBy = "theater")
    private Collection<Rent> rents;

    public Theater() {
        orderLins = new ArrayList<>();
        reservations = new ArrayList<>();
        opinions = new ArrayList<>();
        rents = new ArrayList<>();
    }


    public Theater(String name, float price, String resume, String image, Date datePresentation, String autor, String identifyCode, Category category, TVA tva) {
        super();
        this.name = name;
        this.price = price;
        this.resume = resume;
        this.image = image;
        this.datePresentation = datePresentation;
        this.autor = autor;
        this.identifyCode = identifyCode;
        this.category = category;
        this.tva = tva;
    }

    public String getIdentifyCode() {
        return identifyCode;
    }

    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String nom) {
        this.name = nom;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDatePresentation() {
        return datePresentation;
    }

    public void setDatePresentation(Date datePresentation) {
        this.datePresentation = datePresentation;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public TVA getTva() {
        return tva;
    }

    public void setTva(TVA tva) {
        this.tva = tva;
    }

    public Collection<OrderLin> getOrderLins() {
        return orderLins;
    }

    public void setOrderLins(Collection<OrderLin> orderLins) {
        this.orderLins = orderLins;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Collection<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Collection<Opinion> getOpinions() {
        return opinions;
    }

    public void setOpinions(Collection<Opinion> opinions) {
        this.opinions = opinions;
    }

    public Collection<Rent> getRents() {
        return rents;
    }

    public void setRents(Collection<Rent> rents) {
        this.rents = rents;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "id=" + id +
                ", nom='" + name + '\'' +
                ", price=" + price +
                ", resume='" + resume + '\'' +
                ", image='" + image + '\'' +
                ", datePresentation=" + datePresentation +
                ", autor='" + autor + '\'' +
                ", category=" + category +
                ", tva=" + tva +
                ", orderLins=" + orderLins +
                ", reservations=" + reservations +
                ", opinions=" + opinions +
                ", rents=" + rents +
                '}';
    }
}
