package com.example.GritAcademyAPI.studentsCourses;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsCoursesRepository extends CrudRepository<StudentsCourses, Integer> {

}