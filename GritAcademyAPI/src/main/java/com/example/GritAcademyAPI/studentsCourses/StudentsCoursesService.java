package com.example.GritAcademyAPI.studentsCourses;

import com.example.GritAcademyAPI.students.Students;
import com.example.GritAcademyAPI.students.StudentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentsCoursesService {

    @Autowired
    StudentsCoursesRepository studentsCoursesRepository;


    //Hämtar alla associationer
    public List<StudentsCoursesDTO> getAllAssociations(){
        return studentsCoursesRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }


    //Tar bort association genom id
    public void removeAssociationById(Long id) {
        studentsCoursesRepository.deleteById(id);
    }


    //Sparar associationen
    public StudentsCourses saveStudentsCourses(StudentsCourses studentsCourses) {
        return studentsCoursesRepository.save(studentsCourses);
    }


    private StudentsCoursesDTO mapToDTO(StudentsCourses studentsCourses){
        StudentsCoursesDTO dto = new StudentsCoursesDTO();
        dto.setId(studentsCourses.getId());
        dto.setStudents_id(studentsCourses.getStudents_id());
        dto.setCourses_id(studentsCourses.getCourses_id());
        return dto;
    }
}
