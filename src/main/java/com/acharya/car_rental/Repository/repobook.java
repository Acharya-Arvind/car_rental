package com.acharya.car_rental.Repository;

import com.acharya.car_rental.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface repobook extends JpaRepository<Booking,Long> {


    String rawquery="Select * from booking where owner=?1";
    @Query(nativeQuery = true,value = rawquery)
    List<Booking> getfiltereddata(String name);


}
