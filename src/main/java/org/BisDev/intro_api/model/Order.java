package org.BisDev.intro_api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "order")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private LocalDate dateOrder;

    @ManyToOne()
    @JoinColumn(name = "adress_id")
    private Adress adress;

    @ManyToOne()
    private Member member;

    @OneToMany(mappedBy = "order")
    private Collection<OrderLin> orderLins;


    public Order(LocalDate dateOrder, Adress adress, Member member) {
        this.dateOrder = dateOrder;
        this.adress = adress;
        this.member = member;
    }

    public Order() {
        orderLins= new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(LocalDate dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateOrder=" + dateOrder +
                ", adress=" + adress +
                ", member=" + member +
                '}';
    }
}
