package com.bahd.entity;

import com.bahd.enums.State;
import com.bahd.enums.Type;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Movie extends BaseEntity {

    private String name;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private State state;
    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;
    private Integer duration;
    @Column(columnDefinition = "text")
    private String summary;

    @ManyToMany
    @JoinTable(name = "movie_genre_rel",
    joinColumns = @JoinColumn(name="movie_id"),
    inverseJoinColumns = @JoinColumn(name="genre_id"))
    private List<Genre> genreList;
    @OneToMany(mappedBy = "movie")
    private List<MovieCinema> movieCinemas;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", state=" + state +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration +
                ", summary='" + summary + '\'' +
                '}';
    }
}
