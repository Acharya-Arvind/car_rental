package com.acharya.car_rental.Repository;


import com.acharya.car_rental.Model.Booking;
import com.acharya.car_rental.Model.User;
import com.acharya.car_rental.Service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<User,Long> {


    @Query(value = "SELECT user_pass FROM user_data WHERE user_name = :username", nativeQuery = true)
    String findByUsername(@Param("username") String username);
}
