package com.hibernate.services;

import java.util.List;
 
import com.hibernate.Entitys.Student; 

public interface StudentService {
	public boolean addStudentDetails(Student std);
	public List<Student> getAllDetails();
	public Student getstdDetails(long id);
	
	public boolean updateDtails(long id, float marks);
	public boolean deleteDetails(long id);

}
