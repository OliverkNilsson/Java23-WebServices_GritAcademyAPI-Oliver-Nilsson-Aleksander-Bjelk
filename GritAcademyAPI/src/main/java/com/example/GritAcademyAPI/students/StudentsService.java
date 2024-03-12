package com.example.GritAcademyAPI.students;

import com.example.GritAcademyAPI.courses.Courses;
import com.example.GritAcademyAPI.courses.CoursesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

    public List<StudentsDTO> getCoursesForStudentByFname(String fname) {
        List<Students> studentsF = studentsRepository.findByFname(fname);
        return studentsF.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public List<StudentsDTO> getCoursesForStudentByLname(String lname) {
        List<Students> studentsL = studentsRepository.findByLname(lname);
        return studentsL.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    private StudentsDTO mapToDTO(Students students){
        StudentsDTO dto = new StudentsDTO();
        dto.setId(students.getId());
        dto.setFname(students.getFname());
        dto.setLname(students.getLname());
        dto.setTown(students.getTown());
        dto.setCourses(students.getCourses().stream().map(this::mapToDTO).collect(Collectors.toList()));
        return dto;
    }

    private CoursesDTO mapToDTO(Courses courses){
        CoursesDTO dto = new CoursesDTO();
        dto.setId(courses.getId());
        dto.setName(courses.getName());
        dto.setDescription(courses.getDescription());
        return dto;
    }
}
