package com.studentmanagement.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.studentmanagement.entity.Student;
import com.studentmanagement.repositories.StudentRepository;

@Component
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepo;

	@Override
	public List<Student> listStudents() {
		List<Student> std = new ArrayList<>();
		studentRepo.findAll().forEach(std::add);
		return std;
	}


	
	
	
	
/*
	@Override
	public List<Student> listStudents() {
		List<Student> std = new ArrayList<>();
		studentRepo.findAll().forEach(std::add);
		return std;
	}

*/
}
