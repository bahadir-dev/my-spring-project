package com.bahd.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
public class AccountDetail extends BaseEntity {

    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private Integer age;

    @OneToOne
    private UserAccount userAccount;

}
