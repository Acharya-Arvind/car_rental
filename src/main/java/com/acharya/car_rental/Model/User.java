package com.acharya.car_rental.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_data")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String user_name;
    private String user_email;
    private String user_pass;


    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String email) {
        this.user_email = email;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public User(String user_name, String user_pass, String user_email) {

        this.user_name = user_name;
        this.user_pass = user_pass;
        this.user_email = user_email;
    }

    public User() {
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public User(String user_name,String user_pass) {
        this.user_name = user_name;
        this.user_pass=user_pass;
    }
}
