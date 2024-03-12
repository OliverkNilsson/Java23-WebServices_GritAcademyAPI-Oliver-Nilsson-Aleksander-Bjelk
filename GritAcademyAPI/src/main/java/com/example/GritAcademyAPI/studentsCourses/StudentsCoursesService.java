package com.example.GritAcademyAPI.studentsCourses;


import com.example.GritAcademyAPI.courses.Courses;
import com.example.GritAcademyAPI.courses.CoursesDTO;
import com.example.GritAcademyAPI.courses.CoursesRepository;
import com.example.GritAcademyAPI.students.Students;
import com.example.GritAcademyAPI.students.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.GritAcademyAPI.studentsCourses.StudentsCourses;
import com.example.GritAcademyAPI.studentsCourses.StudentsCoursesDTO;



import java.util.*;
import java.util.stream.Collectors;

@Service
public class StudentsCoursesService {
    /*
    @Autowired
    StudentsCoursesRepository studentsCoursesRepository;

    @Autowired
    CoursesRepository coursesRepository;

    @Autowired
    StudentsRepository studentsRepository;

    public List<StudentsCoursesDTO> getAllStudentsCourses() {
        return studentsCoursesRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    private StudentsCoursesDTO mapToDTO(StudentsCourses studentsCourses) {
        StudentsCoursesDTO dto = new StudentsCoursesDTO();
        dto.setId(studentsCourses.getId());
        dto.setCourses_id(studentsCourses.getCourses_id());
        dto.setStudents_id(studentsCourses.getStudents_id());
        return dto;
    }


    public List<CoursesDTO> getCoursesForStudent(Long students_id) {
        Optional<Students> student = studentsRepository.findById(students_id.intValue());
        if (student.isPresent()) {
            Students studentEntity = student.get();
            List<StudentsCourses> studentCourses = studentEntity.getStudentCourses();
            List<CoursesDTO> coursesDTOs = new ArrayList<>();
            for (StudentsCourses sc : studentCourses) {
                Courses course = sc.getCourse();
                CoursesDTO courseDTO = new CoursesDTO();
                courseDTO.setId(course.getId());
                courseDTO.setName(course.getName());
                courseDTO.setDescription(course.getDescription());
                coursesDTOs.add(courseDTO);
            }
            return coursesDTOs;
        } else {
            return Collections.emptyList();
        }


    }

 */
}