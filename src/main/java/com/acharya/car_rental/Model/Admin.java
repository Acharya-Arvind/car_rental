package com.acharya.car_rental.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String adminname;
    private String adminpass;

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminpass() {
        return adminpass;
    }

    public Admin() {
    }

    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass;
    }

    public Admin(String adminname, String adminpass) {
        this.adminname = adminname;
        this.adminpass = adminpass;
    }
}
