package com.example.task.Student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
     private final StudentRepository studentRepository;
	//public StudentService() {}
     @Autowired
 	public StudentService(StudentRepository studentRepository) {
 		super();
 		this.studentRepository = studentRepository;
 	}
	public List<Student>getStudents(){
		return studentRepository.findAll();
	}
	

}
 