package com.example.GritAcademyAPI.students;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsController {

    @GetMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>> students(){
        List<StudentsDTO> allStudents = StudentsService.getAllStudents();
        return new ResponseEntity<>(allStudents, HttpStatus.OK);
    }
}
