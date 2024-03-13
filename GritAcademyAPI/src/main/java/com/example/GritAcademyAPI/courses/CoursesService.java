package com.example.GritAcademyAPI.courses;

import com.example.GritAcademyAPI.students.Students;
import com.example.GritAcademyAPI.students.StudentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

// CoursesService.java
@Service
public class CoursesService {

    @Autowired
    CoursesRepository coursesRepository;


    //alla kurser
    public List<CoursesDTO> getAllCourses(){
        return coursesRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }


    //kurs sökning med namn
    public List<CoursesDTO> getCoursesName(String name) {
        List<Courses> courses = coursesRepository.findByName(name);
        return courses.stream().map(this::mapToDTO).collect(Collectors.toList());
    }


    //kurs sökning med namn och får studenter med till
    public List<CoursesDTO> getCoursesNameAndStudents(String name) {
        List<Courses> courses = coursesRepository.findByName(name);
        return courses.stream().map(this::mapToDTO).collect(Collectors.toList());
    }


    //visar kurser som innehåller samma namn/bokstäver tex java eller ja ger både java och avancerad java
    public List<CoursesDTO> getCoursesContainsName(String keyword) {
        List<Courses> courses = coursesRepository.findByNameContaining(keyword);
        return courses.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    //letar efter text i description och ger kurser som har den texten i sin description
    public List<CoursesDTO> getCoursesContainsDescriptions(String keyword) {
        List<Courses> courses = coursesRepository.findByDescriptionContaining(keyword);
        return courses.stream().map(this::mapToDTO).collect(Collectors.toList());
    }
/*
    private CoursesDTO mapToDTOWithStudents(Courses courses){
        CoursesDTO dto = new CoursesDTO();
        dto.setId(courses.getId());
        dto.setName(courses.getName());
        dto.setDescription(courses.getDescription());
        dto.setStudents(courses.getStudents().stream().map(this::mapStudentToDTO).collect(Collectors.toList())); //länkad till studentsDTO
        return dto;
    }

 */
    private CoursesDTO mapToDTO(Courses courses){
        CoursesDTO dto = new CoursesDTO();
        dto.setId(courses.getId());
        dto.setName(courses.getName());
        dto.setDescription(courses.getDescription());
        dto.setStudents(courses.getStudents().stream().map(this::mapStudentToDTO).collect(Collectors.toList())); //länkad till studentsDTO
        return dto;
    }

    //länkad till mapToDTOWithStudents
    private StudentsDTO mapStudentToDTO(Students student) {
        StudentsDTO dto = new StudentsDTO();
        dto.setId(student.getId());
        dto.setFname(student.getFname());
        dto.setLname(student.getLname());
        dto.setTown(student.getTown());
        return dto;
    }

}

