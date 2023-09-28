package com.hieunv.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name="books")
@Table(name="books")
public class Book implements Serializable {
    @Id
    private int id;
    private String title;
    private String category;
    private   Long price;

    public Book() {
    }

    public Book(String title, String category, Long price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public Book(int id, String title, String category, Long price) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
