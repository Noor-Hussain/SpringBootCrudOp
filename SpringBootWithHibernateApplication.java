package com.hibernate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Entity.User;
import com.hibernate.repositry.DbOperation;

@SpringBootApplication
public class SpringBootWithHibernateApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(SpringBootWithHibernateApplication.class, args);
	
		DbOperation dbop = context.getBean(DbOperation.class);
		User user = dbop.getUserDetails(1l);
		if(user != null) {
			System.out.println(user.getName());
			System.out.println(user.getEmail());
		}else {
			System.out.println("user not found");
		}

	}
}
