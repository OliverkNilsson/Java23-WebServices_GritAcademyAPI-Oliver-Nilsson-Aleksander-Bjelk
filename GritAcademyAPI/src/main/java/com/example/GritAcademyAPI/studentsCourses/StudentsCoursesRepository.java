package com.example.GritAcademyAPI.studentsCourses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsCoursesRepository extends JpaRepository <StudentsCourses, Long> {

}
