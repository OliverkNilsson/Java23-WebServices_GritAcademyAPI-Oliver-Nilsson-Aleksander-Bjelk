package com.example.GritAcademyAPI.students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {

    //till för att hantera om det är förnamn, efternamn eller stad som söks
    List<Students> findByFnameOrLnameOrTown(String fname, String lname, String town);
}