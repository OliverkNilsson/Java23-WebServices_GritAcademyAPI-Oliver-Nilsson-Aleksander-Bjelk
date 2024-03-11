package com.example.GritAcademyAPI.students;

import lombok.Data;

import java.util.List;

@Data
public class StudentsDTO {
    private Long id;
    private String fname;
    private String lname;
    private String town;
    List<StudentsDTO> courses;
}
