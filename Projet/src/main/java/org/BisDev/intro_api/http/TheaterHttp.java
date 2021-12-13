package org.BisDev.intro_api.http;


import javax.servlet.annotation.HttpConstraint;
import java.util.Date;

public class TheaterHttp {

    private String name;
    private float price;
    private String resume;
    private  String image;
    private Date datePresentation;
    private String autor;
    private  String category;
    private String identifyCode;
    private float tva;

    public TheaterHttp(String name, float price, String resume, String image, Date datePresentation, String autor,String category, String identifyCode,float tva) {
        this.name = name;
        this.price = price;
        this.resume = resume;
        this.image = image;
        this.datePresentation = datePresentation;
        this.autor = autor;
        this.category =category;
        this.identifyCode = identifyCode;
        this.tva = tva;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getIdentifyCode() {
        return identifyCode;
    }

    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getTva() {

        return tva;
    }

    public void setTva(float tva) {
        this.tva = tva;
    }
}
