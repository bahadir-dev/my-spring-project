package com.bahd.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class MovieCinema extends BaseEntity{

    @Column(columnDefinition = "DATETIME")
    private LocalDateTime dateTime;

    @ManyToOne
    private Movie movie;

    @OneToMany(mappedBy = "movieCinema")
    private List<Ticket> ticketList;

    @ManyToOne
    private Cinema cinema;
}
