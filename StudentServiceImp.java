package com.hibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.Entitys.Student;
import com.hibernate.repositry.StudentRepositry;

@Service
public class StudentServiceImp implements StudentService{
	
	@Autowired
	private StudentRepositry studentRepositry;
	
	@Override
	public boolean addStudentDetails(Student std) {
		boolean status = false;
		try {
			
		studentRepositry.save(std);
		status = true;
		
		}catch(Exception e) {
			
			e.printStackTrace();
			status = false;
		}
		
		return status;
	}

	@Override
	public List<Student> getAllDetails() {
	
		return studentRepositry.findAll();
	}

	@Override
	public Student getstdDetails(long id) {
	Optional<Student> optional =studentRepositry.findById(id);
	if(optional.isPresent()) {return optional.get();
	}else{return null;}
	
		
		
	}

	@Override
	public boolean updateDtails(long id, float marks) {
	Student std = getstdDetails(id);
		if(std!=null) {
			std.setMarks(marks);
			studentRepositry.save(std);
			return true;  
		}
		return false;
	}

	@Override
	public boolean deleteDetails(long id) {
		boolean status = false;
		try 
		{
			studentRepositry.deleteById(id);
			status = true;
			
		}catch(Exception e) {
			
			e.printStackTrace();
			status = false;			
		}
		return status;
	}

	

}
