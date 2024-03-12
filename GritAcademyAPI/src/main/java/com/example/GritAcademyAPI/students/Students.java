package com.example.GritAcademyAPI.students;

import com.example.GritAcademyAPI.courses.Courses;
import com.example.GritAcademyAPI.studentsCourses.StudentsCourses;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "students")
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Students {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "town")
    private String town;

    @OneToMany(mappedBy = "student")
    private List<StudentsCourses> studentCourses;
}
