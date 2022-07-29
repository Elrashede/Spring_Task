package com.example.task.Student;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

//import antlr.collections.List;

@Configuration
public class StudentConfig {
   CommandLineRunner commandLineRunner(StudentRepository repository) {
	   return args -> {
		   Student Ahmed=new Student(
			  "Ahmed",
			   "Ahmed@gmail.com",
			   LocalDate.of(1998,7,13),
			   24
		   );
		 	
		   repository.save(Ahmed);
				   
	   };
   }
}
