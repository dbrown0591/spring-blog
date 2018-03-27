package com.codeup.springblock.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ad {
    @ManyToOne
    private User user;
    @Id @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = true) //nullable = true is a default value
    private String description;

    @ManyToMany
    private List<AdCatagory>categories;

    public Ad(String title, String description, User user) {
        this.title = title;
        this.description = description;
        this.user=user;
    }

    public Ad() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
