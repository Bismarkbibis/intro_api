package org.BisDev.intro_api.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orderLine")
public class OrderLin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private float priceHT;
    @Column(nullable = false)
    private float tva; //taux

    @ManyToOne()
    private Theater theater;

    @ManyToOne()
    private Order order;

    public OrderLin(int quantity, float priceHT, float tva, Theater theater, Order order) {
        this.quantity = quantity;
        this.priceHT = priceHT;
        this.tva = tva;
        this.theater = theater;
        this.order = order;
    }

    public OrderLin() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPriceHT() {
        return priceHT;
    }

    public void setPriceHT(float priceHT) {
        this.priceHT = priceHT;
    }

    public float getTva() {
        return tva;
    }

    public void setTva(float tva) {
        this.tva = tva;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
