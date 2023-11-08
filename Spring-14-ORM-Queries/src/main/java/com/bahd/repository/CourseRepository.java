package com.bahd.repository;

import com.bahd.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {

    //find all courses by catgory
    List<Course> findByCategory(String category);

    //FIND all courses by catggory and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //check if a course with provided name exists, return true if exists
    boolean existsByName(String name);

    //returns the count of courses fro the provided category
    int countByCategory(String category);

    //find all courses that start with the provided course name
    List<Course> findByNameStartingWith(String pattern);

    //find all courses by category and returns a stream
    Stream<Course> streamByCategory(String category);

    @Query("SELECT c FROM Course c WHERE c.category = :category AND c.rating > :rating")
    List<Course> findAllByCategoryAndRatingGreaterThan(@Param("category") String category, @Param("rating") int rating);
}
