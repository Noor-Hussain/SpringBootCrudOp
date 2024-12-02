package com.hibernate;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hibernate.Entitys.Student;
import com.hibernate.services.StudentService;
import com.hibernate.services.StudentServiceImp;

@SpringBootApplication
public class SpringBootWithDataJpa1Application {

	public static void main(String[] args)
	{
	ApplicationContext context = SpringApplication.run(SpringBootWithDataJpa1Application.class, args);
	StudentService stdservice =	context.getBean(StudentServiceImp.class);
//-----Insert OPeration -----//	
//	Student std = new Student();
//	std.setName("hussain");
//	std.setRollno(4);
//	std.setMarks(4.44f);
//	
//boolean status = stdservice.addStudentDetails(std);
//	if(status) {
//		System.out.println("Student Inserted Succesfully");
//	}else {System.out.println("Student not  Inserted Succesfully");}
//	}

	//------Select All OPeration ----//
//List<Student> stdlis=	stdservice.getAllDetails();
//for(Student std:stdlis) {
//	System.out.println("Student ID: "+std.getId());
//	System.out.println("Student NAme: "+std.getName());
//	System.out.println("Student Roll NUm: "+std.getRollno());
//	System.out.println("Student Marks: "+std.getMarks()); 
//	System.out.println("__________________");
//	
//}
	
	//---------Select by id operation-----//
//Student std = 	stdservice.getstdDetails(1l);
//	if(std != null) {
//		System.out.println(std.getName());
//		System.out.println(std.getRollno());
//	}else {System.out.println("STudent Not found");}
	
//-----------Update OPeration----------//
//boolean status	= stdservice.updateDtails(1l, 99.9f);
//	if(status) {
//		System.out.println("Student Udated");
//	}else {System.out.println("Student is not updated");}

	//------ Delete Operation----------//
	
	boolean status	= stdservice.deleteDetails(1l);
	if(status) {
		System.out.println("Student Dleted");
	}else {System.out.println("Student is not Deleted");}
}
}