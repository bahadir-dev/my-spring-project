package com.bahd.repository;

import com.bahd.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {

    //display all regions in Canada
    List<Region> findByCountry(String country);

    //display all regions in Canad without duplicates
    List<Region> findDistinctByCountry(String country);

    //display all regions with country name includes 'United'
    List<Region> findByCountryContainsIgnoreCase(String country);

    //display all regions with country name includes 'United' in order
    List<Region> findByCountryContainingOrderByCountry(String country);

    //display top two regions in Canada
    List<Region> findTop2ByCountry(String country);

}
