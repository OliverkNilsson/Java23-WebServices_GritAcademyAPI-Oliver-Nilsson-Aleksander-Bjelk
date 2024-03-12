package com.example.GritAcademyAPI.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    StudentsService studentsService;

    @GetMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>> getAllStudents(){
        List<StudentsDTO> studentsDTO = studentsService.getAllStudents();
        return new ResponseEntity<>(studentsDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/students/{identifier}/courses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>> getStudentCourses(
            @PathVariable(value = "identifier") String identifier
    ){
        List<StudentsDTO> studentsDTO;
        if (identifier.matches("\\d+")) {
            Long id = Long.parseLong(identifier);
            studentsDTO = studentsService.getCoursesForStudent(id);
        } else {
            studentsDTO = studentsService.getCoursesForStudentByFnameOrLnameOrTown(identifier);
        }
        return new ResponseEntity<>(studentsDTO, HttpStatus.OK);
    }
}

/*
* @GetMapping(value = "/students/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>> students(){
        List<StudentsDTO> allStudents = studentsService.getAllStudents();
        return new ResponseEntity<>(allStudents, HttpStatus.OK);
    }

    @GetMapping(value = "/students/{id}/courses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>> students(
            @PathVariable(value = "id") Long id
    ){
        List<StudentsDTO> studentsDTO = studentsService.getCoursesForStudent(id);
        return new ResponseEntity<>(studentsDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/students/{fname}/courses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>> studentsF(
            @PathVariable(name = "fname") String fname
    ){
        List<StudentsDTO> studentsDTO = studentsService.getCoursesForStudentByFname("fname");
        return new ResponseEntity<>(studentsDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/student/{lname}/course", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>> studentsL(
            @PathVariable(value = "lname") String lname
    ){
        List<StudentsDTO> studentsDTO = studentsService.getCoursesForStudentByLname(lname);
        return new ResponseEntity<>(studentsDTO, HttpStatus.OK);
    }
}*/
