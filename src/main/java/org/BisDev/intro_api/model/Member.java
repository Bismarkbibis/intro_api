package org.BisDev.intro_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "member")
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private LocalDate dateBirth;
    @Column(nullable = false)
    private  LocalDate dateCreate;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false,unique = true)
    private String pwd;
    @Column(nullable = false,unique = true)
    private String numTel;
    @Column(nullable = false)
    private String adress;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String ptd;
    @Column(nullable = false)
    private double point;

    // jointure

    @ManyToOne()
    @JoinColumn(name = "role_id")
    private Role role;

    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private Collection<Token> tokens;

    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private Collection<Adress> adresses;

    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private Collection<Reservation> reservations;

    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private Collection<Opinion> opinions;

    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private Collection<Rent> rents;

    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private Collection<Order> orders;

    public Member() {
        tokens = new ArrayList<>();
        adresses = new ArrayList<>();
        reservations = new ArrayList<>();
        opinions = new ArrayList<>();
        rents = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public Member(String name, String firstname, LocalDate dateBirth, LocalDate dateCreate, String email, String pwd, String numTel, String adress, String city, String ptd, double point, Role role) {
        this.name = name;
        this.firstname = firstname;
        this.dateBirth = dateBirth;
        this.dateCreate = dateCreate;
        this.email = email;
        this.pwd = pwd;
        this.numTel = numTel;
        this.adress = adress;
        this.city = city;
        this.ptd = ptd;
        this.point = point;
        this.role = role;
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

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
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

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Collection<Token> getTokens() {
        return tokens;
    }

    public void setTokens(Collection<Token> tokens) {
        this.tokens = tokens;
    }

    public Collection<Adress> getAdresses() {
        return adresses;
    }

    public void setAdresses(Collection<Adress> adresses) {
        this.adresses = adresses;
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
        return "Member{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", dateBirth=" + dateBirth +
                ", dateCreate=" + dateCreate +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", numTel='" + numTel + '\'' +
                ", adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", ptd='" + ptd + '\'' +
                ", point=" + point +
                ", role=" + role +
                '}';
    }
}
