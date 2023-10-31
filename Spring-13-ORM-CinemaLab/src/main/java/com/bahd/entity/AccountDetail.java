package com.bahd.entity;

import com.bahd.enums.UserRole;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "account_details")
public class AccountDetail extends BaseEntity {

    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private Integer age;

    @Enumerated(EnumType.STRING)
    private UserRole userRole = UserRole.USER;

    @OneToOne(mappedBy = "accountDetail")
    private UserAccount userAccount;

}
