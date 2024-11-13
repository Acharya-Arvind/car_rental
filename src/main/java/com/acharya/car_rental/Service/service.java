package com.acharya.car_rental.Service;


import com.acharya.car_rental.Model.Admin;
import com.acharya.car_rental.Model.Booking;
import com.acharya.car_rental.Model.Contact;
import com.acharya.car_rental.Model.User;
import com.acharya.car_rental.Repository.adminrepo;
import com.acharya.car_rental.Repository.repo;
import com.acharya.car_rental.Repository.repobook;
import com.acharya.car_rental.Repository.repocomplaint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Service
public class service {

    @Autowired
    private repo rep;
    @Autowired
    private repobook repo;
    @Autowired
    private adminrepo adrepo;
    @Autowired
    private repocomplaint complaint;

    private User us;

    public  String username;
    public String adminname;


    public void seed(@ModelAttribute User us){
   rep.save(us);
    }

    public String auth(@ModelAttribute User us){

        username= us.getUser_name();



        String pass= String.valueOf(rep.findByUsername(username));

        if(pass.equals(us.getUser_pass())){

            return "/index";

        }

        else{
            return "redirect:/";
        }

    }
    public void seed2(@ModelAttribute Booking bs){

        List<Booking> book=Arrays.asList(
                new Booking(bs.getLocation(),bs.getT_date(),bs.getF_date(),bs.getCar(),bs.getAddress(),bs.getEmail(),bs.getPhone(),bs.getDob(),bs.getName(),username)
        );
        repo.saveAll(book);
    }

    public List<Booking> getallBooking(){
        List<Booking> l=repo.getfiltereddata(username);
        return l;
    }

    public void seed_complaint(@ModelAttribute Contact ct){

        complaint.save(ct);
    }

    public String authadmin(@ModelAttribute Admin ad){

        adminname= ad.getAdminname();
        String pass= String.valueOf(adrepo.findByUsername(adminname));

        if(pass.equals(ad.getAdminpass())){




            return "/adminindex";

        }

        else{
            return "redirect:/";
        }

    }
    public List<Booking> getallBookingadmin(){
        return repo.findAll();
    }
    public List<Contact> getallquery(){
        return complaint.findAll();
    }
    public List<User> getalluser(){
        return rep.findAll();
    }

}
