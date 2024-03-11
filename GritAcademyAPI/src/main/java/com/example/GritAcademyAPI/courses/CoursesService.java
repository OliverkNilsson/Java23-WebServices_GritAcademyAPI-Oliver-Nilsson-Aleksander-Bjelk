package com.example.GritAcademyAPI.courses;

import com.example.GritAcademyAPI.students.Students;
import com.example.GritAcademyAPI.students.StudentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CoursesService {
    @Autowired
    CoursesRepository coursesRepository;
    public List<CoursesDTO> getAllCourses(){
        return coursesRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    private CoursesDTO mapToDTO(Courses courses){
        CoursesDTO dto = new CoursesDTO();
        dto.setId(courses.getId());
        dto.setName(courses.getName());
        dto.setDescription(courses.getDescritpion());
        return dto;
    }
}
