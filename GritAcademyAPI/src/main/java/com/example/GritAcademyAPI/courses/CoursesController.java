package com.example.GritAcademyAPI.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursesController {

    @Autowired
    CoursesService coursesService;

    @GetMapping(value = "/courses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CoursesDTO>> courses() {
        List<CoursesDTO> allCourses = coursesService.getAllCourses();
        return new ResponseEntity<>(allCourses, HttpStatus.OK);
    }
}
