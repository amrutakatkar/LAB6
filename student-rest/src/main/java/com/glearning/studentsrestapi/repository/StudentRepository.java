package com.glearning.studentsrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.glearning.studentsrestapi.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
	
	
	

}
