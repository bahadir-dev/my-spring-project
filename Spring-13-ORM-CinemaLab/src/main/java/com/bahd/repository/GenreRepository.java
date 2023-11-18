package com.bahd.repository;

import com.bahd.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre,Long> {

    //--------JPQL QUERIES -------------///

    //Write a Jpql query that return all genres
    @Query("select g from Genre g")
    List<Genre> fetchAll();

    //---------NATIVE QUERIES-------//



}
