package com.example.GritAcademyAPI.courses;

import com.example.GritAcademyAPI.students.StudentsDTO;

import java.util.List;

public class CoursesDTO {
    private Integer id;
    private String name;

    private String description;
    List<StudentsDTO> students;
}
