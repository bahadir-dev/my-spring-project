package com.bahd.controller;

import com.bahd.dto.CourseDTO;
import com.bahd.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController2 {

    private final CourseService courseService;

    public CourseController2(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDTO> getAllCourses(){
        List<CourseDTO> list = courseService.getCourses();
        return list;

    }

    @GetMapping("{id}")
    public CourseDTO getCourseById(@PathVariable("id") Long courseId ){
        return courseService.getCourseById(courseId);
    }

    @GetMapping("category/{name}")
    public List<CourseDTO> getCourseByCatgory(@PathVariable("name") String category){
        return courseService.getCoursesByCategory(category);
    }

    @PostMapping
    public CourseDTO createCourse(@RequestBody CourseDTO course){
        return courseService.createCourse(course);
    }

}
