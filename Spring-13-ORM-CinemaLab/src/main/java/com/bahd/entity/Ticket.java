package com.bahd.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Ticket extends BaseEntity{

    private LocalDateTime dateTime;
    private Integer seatNumber;
    private Integer rowNumber;

    @ManyToOne
    private UserAccount userAccount;

    @ManyToOne
    private MovieCinema movieCinema;

}
