package com.example.GritAcademyAPI.courses;

import org.springframework.beans.factory.annotation.Autowired;

public class CoursesService {
    @Autowired
    CoursesRepository coursesRepository;

    public Iterable<Courses> getCourses(){
        return coursesRepository.findAll();
    }
}
