package com.studentmanagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.studentmanagement.entity.Student;

@Service
public interface StudentService {
 
	List<Student> listStudents();

	
}