package com.bahd.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserAccount extends BaseEntity{

    private String email;
    private String password;
    private String username;



    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="account_details_id")
    private AccountDetail accountDetail;

//    @OneToMany(mappedBy = "userAccount")
//    private List<Ticket> ticketList;

    @Override
    public String toString() {
        return "UserAccount{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
