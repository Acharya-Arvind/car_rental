package com.acharya.car_rental.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "contact_us")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    private String name;
    private String email;

    public Contact(String name, String email, String description) {
        this.name = name;
        this.email = email;
        this.description = description;
    }

    public Contact() {
    }

    private String description;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
