package com.dec.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dec.student.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllBySchoolId(Integer schoolId);
}