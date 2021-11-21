package org.BisDev.intro_api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "opinion")
public class Opinion implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String describ;
    @Column(nullable = false)
    private Date dateReservation;
    @Column(nullable = false)
    private Date modify;

    private int point ; // a revoir

    @ManyToOne()
    private Member member;

    @ManyToOne()
    private Theater theater;

    public Opinion() {
    }

    public Opinion(String describ, Date dateReservation, Date modify, int point, Member member, Theater theater) {
        this.describ = describ;
        this.dateReservation = dateReservation;
        this.modify = modify;
        this.point = point;
        this.member = member;
        this.theater = theater;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrib() {
        return describ;
    }

    public void setDescrib(String describ) {
        this.describ = describ;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Date getModify() {
        return modify;
    }

    public void setModify(Date modify) {
        this.modify = modify;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
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
        return "Opinion{" +
                "id=" + id +
                ", describ='" + describ + '\'' +
                ", dateReservation=" + dateReservation +
                ", modify=" + modify +
                ", point=" + point +
                ", member=" + member +
                ", theater=" + theater +
                '}';
    }
}
