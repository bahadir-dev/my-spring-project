package com.bahd.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
public class Region extends BaseEntity{

    private String region;
    private String country;


    @OneToOne(mappedBy = "region")
    private Employee employee;


    public Region(String region, String country) {
        this.region = region;
        this.country = country;
    }

}
