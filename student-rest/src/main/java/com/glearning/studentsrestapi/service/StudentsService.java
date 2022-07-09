package com.glearning.studentsrestapi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glearning.studentsrestapi.model.Student;
import com.glearning.studentsrestapi.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentsService {
	
	
	private final StudentRepository studentRepository;
	

	
	 @Transactional
	public Student saveStudent(Student student) {
		 return studentRepository.save(student);
		
	}
	
	 @Transactional
	public List<Student> getAllStudents() {
		return studentRepository.findAll();		
			
	}
	
	 @Transactional
	public void deleteStudent(long id) {
		 studentRepository.deleteById(id); 
			
	}
	
	public Student getStudent(long id) {
		
		return studentRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Student ID"));	
		
	}
	
	
	

}
