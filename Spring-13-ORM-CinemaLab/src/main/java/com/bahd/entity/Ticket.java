package com.bahd.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Ticket extends BaseEntity{

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;
    private Integer seatNumber;
    private Integer rowNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserAccount userAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    private MovieCinema movieCinema;

}
