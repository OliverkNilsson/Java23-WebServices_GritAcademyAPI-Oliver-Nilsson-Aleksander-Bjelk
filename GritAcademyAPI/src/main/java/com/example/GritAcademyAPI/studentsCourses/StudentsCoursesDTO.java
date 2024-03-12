package com.example.GritAcademyAPI.studentsCourses;

import com.example.GritAcademyAPI.courses.CoursesDTO;
import lombok.Data;

import java.util.List;

@Data
public class StudentsCoursesDTO {
    private Long id;
    private Long students_id;
    private Long courses_id;
    List<StudentsCoursesDTO> studentsCourses;
}
