package com.bahd.repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {


    // ------------ DERIVED QUERIES ---------------

    //write a drived query to read a user with an email
    Optional<User> findByEmail(String email);

}
