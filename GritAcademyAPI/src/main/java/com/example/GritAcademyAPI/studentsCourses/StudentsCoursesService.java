package com.example.GritAcademyAPI.studentsCourses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsCoursesService {

    @Autowired
    StudentsCoursesRepository studentsCoursesRepository;
    public void removeAssociationById(Long id) {
        studentsCoursesRepository.deleteById(id);
    }
}
