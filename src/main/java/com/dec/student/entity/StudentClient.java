package com.dec.student.entity;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {
	
	@GetMapping("schools/{school-id}")
	List<Student> findAllStudentBySchool(@PathVariable("school-id") Integer schoolId);
}

