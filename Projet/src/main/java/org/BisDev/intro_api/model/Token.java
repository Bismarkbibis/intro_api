package org.BisDev.intro_api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "token")
public class Token implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    @Column(nullable = false,unique = true)
    private String token;
    @Column(nullable = false)
    private LocalDate dateExp;

    @ManyToOne()
    private Member member;

    public Token() {
    }

    public Token(String token, LocalDate dateExp, Member member) {
        this.token = token;
        this.dateExp = dateExp;
        this.member = member;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDate getDateExp() {
        return dateExp;
    }

    public void setDateExp(LocalDate dateExp) {
        this.dateExp = dateExp;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Token{" +
                "id=" + id +
                ", token='" + token + '\'' +
                ", dateExp=" + dateExp +
                ", member=" + member +
                '}';
    }
}
