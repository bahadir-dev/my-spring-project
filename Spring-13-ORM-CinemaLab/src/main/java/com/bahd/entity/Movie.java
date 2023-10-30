package com.bahd.entity;

import com.bahd.enums.State;
import com.bahd.enums.Type;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Movie extends BaseEntity {

    private String name;
    private BigDecimal price;
    private Type type;
    private State state;
    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;
    private String duration;
    private String summary;

    @ManyToMany
    private List<Genre> genres;
    @OneToMany(mappedBy = "movie")
    private List<MovieCinema> movieCinemas;





}
