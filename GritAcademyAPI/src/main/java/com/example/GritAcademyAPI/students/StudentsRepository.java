package com.example.GritAcademyAPI.students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {

    List<Students> findByFname(String fname);
    List<Students> findByLname(String lname);
}