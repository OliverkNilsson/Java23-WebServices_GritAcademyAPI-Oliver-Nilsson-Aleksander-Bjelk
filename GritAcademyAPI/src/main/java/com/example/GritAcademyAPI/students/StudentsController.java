package com.example.GritAcademyAPI.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    StudentsService studentsService;

    @GetMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>> students(){
        List<StudentsDTO> allStudents = studentsService.getAllStudents();
        return new ResponseEntity<>(allStudents, HttpStatus.OK);
    }
}
