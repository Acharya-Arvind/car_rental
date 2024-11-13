package com.acharya.car_rental.Repository;

import com.acharya.car_rental.Model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repocomplaint extends JpaRepository<Contact,Long> {
}
