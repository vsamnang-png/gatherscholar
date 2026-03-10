package org.example.gatherscholar.entity;

import jakarta.persistence.*;

@Entity
public class Scholarship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String country;
    private String level;
    private String deadline;
    private String provider;

    public Scholarship() {}

    public Scholarship(String name, String country, String level, String deadline) {
        this.name = name;
        this.country = country;
        this.level = level;
        this.deadline = deadline;
    }

    public Long getId() {

        return id;
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {

        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getLevel() {

        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    public String getDeadline() {

        return deadline;
    }
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

}
