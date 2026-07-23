package com.dec.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dec.student.entity.Student;
import com.dec.student.repo.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public void saveStudent(Student student) {
        repository.save(student);
    }
    
    public List<Student> bulkSaveStudent(List<Student> studentList) {
    	List<Student> stlist=repository.saveAll(studentList);
    	return stlist;
    }

    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    public List<Student> findAllStudentsBySchool(Integer schoolId) {
        return repository.findAllBySchoolId(schoolId);
    }
}
