package com.example.GritAcademyAPI.studentsCourses;

import com.example.GritAcademyAPI.students.StudentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsCoursesController {

    @Autowired
    StudentsCoursesService studentsCoursesService;
    @PostMapping(value = "/removeAssociateStudentCourse")
    public ResponseEntity<List<StudentsCoursesDTO>> removeAssociateStudentCourse(
            @RequestParam(value = "id") Long id
    ) {
        studentsCoursesService.removeAssociationById(id);
        return new ResponseEntity<>(studentsCoursesService.getAllAssociations(), HttpStatus.OK);
    }

}
