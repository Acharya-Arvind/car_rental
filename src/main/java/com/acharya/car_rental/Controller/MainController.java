package com.acharya.car_rental.Controller;

import com.acharya.car_rental.Model.Admin;
import com.acharya.car_rental.Model.Booking;
import com.acharya.car_rental.Model.Contact;
import com.acharya.car_rental.Model.User;
import com.acharya.car_rental.Service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    service ser;


    @GetMapping("/")
    public String login() {

        return "login";

    }

    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @GetMapping("/rent")
    public String rent() {
        return "rent";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User us){

        return ser.auth(us);

    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute User us){
        ser.seed(us);
        return "login";
    }
    @GetMapping("/logout")
    public String logout(){
        return "redirect:/";
    }
    @GetMapping("/book")
    public String booking(){
        return "book";
    }
    @PostMapping("/submit-booking")
    public String subbook(@ModelAttribute Booking us){
        ser.seed2(us);
        return "index";
    }
    @GetMapping("/result")
    public String result(Model model){
        List<Booking> book = ser.getallBooking();
        model.addAttribute("book", book); // Add products to the model
        return "result";
    }
    @PostMapping("/contact-us")
    public String contact_us(@ModelAttribute Contact ct){
        ser.seed_complaint(ct);
        return "redirect:/home";
    }

    @GetMapping("/adminlogin")
    public  String adminlogin(){
        return "adminlogin";
    }

    @PostMapping("/admin-check")
    public String admincheck(@ModelAttribute Admin ad,Model model){

        List<Booking> book = ser.getallBookingadmin();
        List<Contact> query = ser.getallquery();
        List<User> user = ser.getalluser();
        model.addAttribute("book", book);
        model.addAttribute("query",query);
        model.addAttribute("user",user);
        return ser.authadmin(ad);

    }


}