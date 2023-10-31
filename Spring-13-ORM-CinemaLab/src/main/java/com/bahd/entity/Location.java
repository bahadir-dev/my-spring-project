package com.bahd.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Location extends BaseEntity{

    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private String latitude;
    private String longitude;

//    @OneToMany(mappedBy = "location")
//    private List<Cinema> cinemaList;

}
