package com.example.GritAcademyAPI.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentsService {

    @Autowired
    StudentsRepository studentsRepository;

    public List<StudentsDTO> getAllStudents(){
       return studentsRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public List<StudentsDTO> getCoursesForStudent(Long id) {
        Optional<Students> students = studentsRepository.findById(Math.toIntExact(id)).map(student ->{
            student.getCourses().size();
            return student;
        } );

        return students.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    private StudentsDTO mapToDTO(Students students){
        StudentsDTO dto = new StudentsDTO();
        dto.setId(students.getId());
        dto.setFname(students.getFname());
        dto.setLname(students.getLname());
        dto.setTown(students.getTown());
        return dto;
    }
}
