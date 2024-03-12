package com.example.GritAcademyAPI.studentsCourses;

import com.example.GritAcademyAPI.courses.Courses;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "students_courses")
@Table(name = "students_courses")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentsCourses {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "students_id")
    private Long students_id;

    @Column(name = "courses_id")
    private Long courses_id;
}
