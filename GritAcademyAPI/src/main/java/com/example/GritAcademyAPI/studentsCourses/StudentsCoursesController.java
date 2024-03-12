package com.example.GritAcademyAPI.studentsCourses;


import com.example.GritAcademyAPI.courses.CoursesDTO;
import com.example.GritAcademyAPI.students.StudentsController;
import com.example.GritAcademyAPI.students.StudentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsCoursesController {
    /*
    @Autowired
    StudentsCoursesService studentsCoursesService;

    @GetMapping(value = "/studentscourses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsCoursesDTO>> studentsCourses() {
        List<StudentsCoursesDTO> allStudentsCourses = studentsCoursesService.getAllStudentsCourses();
        return new ResponseEntity<>(allStudentsCourses, HttpStatus.OK);
    }

    @GetMapping(value = "/students/{students_id}/courses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CoursesDTO>> getCoursesForStudent(
            @PathVariable(value = "students_id") Long students_id
    ){
        List<CoursesDTO> coursesDTOs = studentsCoursesService.getCoursesForStudent(students_id);
        return new ResponseEntity<>(coursesDTOs, HttpStatus.OK);
    }

     */
}
