package com.example.GritAcademyAPI.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesService {
    @Autowired
    CoursesRepository coursesRepository;

    public Iterable<Courses> getCourses(){
        return coursesRepository.findAll();
    }
}
