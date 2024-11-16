package com.example.student_management.repositories;

import com.example.student_management.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findById(int id);
    @Query("SELECT YEAR(s.dateNaissance),COUNT(s) FROM Student s GROUP BY YEAR(s.dateNaissance)")
    Collection<Object> findNbrStudentByYear();
}
