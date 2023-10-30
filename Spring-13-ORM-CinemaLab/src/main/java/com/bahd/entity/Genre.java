package com.bahd.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Genre extends BaseEntity{
    private String name;

    @ManyToMany
    private List<Movie> movies;
}
