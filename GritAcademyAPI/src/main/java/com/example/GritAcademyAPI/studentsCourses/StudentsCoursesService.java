package com.example.GritAcademyAPI.studentsCourses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentsCoursesService {
    @Autowired
    StudentsCoursesRepository studentsCoursesRepository;

    public List<StudentsCoursesDTO> getAllStudentsCourses(){
        return studentsCoursesRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    private StudentsCoursesDTO mapToDTO(StudentsCourses studentsCourses){
        StudentsCoursesDTO dto = new StudentsCoursesDTO();
        dto.setId(studentsCourses.getId());
        dto.setCourses_id(studentsCourses.getCourses_id());
        dto.setStudents_id(studentsCourses.getStudents_id());
        return dto;
    }
}
