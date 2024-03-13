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


    //Listar alla studenter
    @GetMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>> getAllStudents(){
        List<StudentsDTO> studentsDTO = studentsService.getAllStudents();
        return new ResponseEntity<>(studentsDTO, HttpStatus.OK);
    }


    //if-sats som kollar om det är en Long (genom regex), är det inte så identifierar den det som en String
    @GetMapping(value = "/students/{identifier}/courses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>> getStudentCourses(
            @PathVariable(value = "identifier") String identifier
    ){
        List<StudentsDTO> studentsDTO;
        if (identifier.matches("\\d+")) { //regexen står för om en matchar en eller flera siffror
            Long id = Long.parseLong(identifier);
            studentsDTO = studentsService.getCoursesForStudent(id);
        } else {
            studentsDTO = studentsService.getCoursesForStudentByFnameOrLnameOrTown(identifier);
        }
        return new ResponseEntity<>(studentsDTO, HttpStatus.OK);
    }
}
