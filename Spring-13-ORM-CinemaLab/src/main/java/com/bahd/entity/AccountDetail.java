package com.bahd.entity;

import com.bahd.enums.UserRole;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
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
    private UserRole role = UserRole.USER;

    @OneToOne(mappedBy = "accountDetail")
    private UserAccount userAccount;

    @Override
    public String toString() {
        return "AccountDetail{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", age=" + age +
                '}';
    }
}
