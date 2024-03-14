package com.example.GritAcademyAPI.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

// CoursesController.java
@RestController
public class CoursesController {

    @Autowired
    CoursesService coursesService;


    //Listar alla kurserna
    @GetMapping(value = "/courses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CoursesDTO>> courses() {
        List<CoursesDTO> allCourses = coursesService.getAllCourses();
        return new ResponseEntity<>(allCourses, HttpStatus.OK);
    }
    //Söker  efter kurser med givet namn
    @GetMapping(value = "/courses/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CoursesDTO>> coursesByName(@PathVariable(value = "name") String name) {
        List<CoursesDTO> courses = coursesService.getCoursesName(name);

        return new ResponseEntity<>(courses, HttpStatus.OK);
    }


    //Listar alla studenter i en kurs när sökningen är efter: kursnamnn
    @GetMapping(value = "/courses/{name}/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CoursesDTO>> coursesStudents(@PathVariable(value = "name") String name) {
        List<CoursesDTO> courses = coursesService.getCoursesNameAndStudents(name);
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }
    // Listar en kurs med specifikt id med dess studenter
    @GetMapping(value = "/course/{id}/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CoursesDTO>> coursesStudents(@PathVariable(value = "id") Long id) {
        List<CoursesDTO> courses = coursesService.getCoursesNameAndStudentsById(id);
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }


    //Söker efter kurser som innehåller givet ord från namnet, tex java som också ger avancerad java
    @GetMapping(value = "/courses/contains/{keyword}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CoursesDTO>> coursesByNameContains(@PathVariable(value = "keyword") String keyword) {
        List<CoursesDTO> courses = coursesService.getCoursesContainsName(keyword);

        return new ResponseEntity<>(courses, HttpStatus.OK);
    }


    //Söker efter kurser som inneäller givet ord från descriptions
    @GetMapping(value = "/courses/description-contains/{keyword}", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<List<CoursesDTO>> coursesByDescriptionContains(@PathVariable(value = "keyword") String keyword) {
        List<CoursesDTO> courses = coursesService.getCoursesContainsDescriptions(keyword);
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    //lägger till en kurs genom jsp
    @PostMapping(value = "/createCourseForm")
    public ResponseEntity<Courses> createCourseForm(Courses course) {
        course = coursesService.saveCourse(course);
        return new ResponseEntity<>(course, HttpStatus.CREATED);
    }


    //tar bort en kurs genom jsp
    @PostMapping(value = "/removeCourseForm")
    public ResponseEntity<List<CoursesDTO>> removeCourseForm(
            @RequestParam(value = "id") Long id
    ) {
        coursesService.removeCourseById(id);
        return new ResponseEntity<>(coursesService.getAllCourses(), HttpStatus.OK);
    }

}
