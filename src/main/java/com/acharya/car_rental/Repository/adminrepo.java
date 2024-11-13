package com.acharya.car_rental.Repository;

import com.acharya.car_rental.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface adminrepo extends JpaRepository<Admin,Long> {

    @Query(value = "SELECT adminpass FROM admin WHERE adminname = ?1", nativeQuery = true)
    String findByUsername(String adminname);
}
