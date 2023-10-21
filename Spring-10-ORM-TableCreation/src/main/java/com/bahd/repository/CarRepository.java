package com.bahd.repository;

import com.bahd.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

    //custom methods
    //sql
}
