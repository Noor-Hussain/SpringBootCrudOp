package com.hibernate.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateconfig {
	public static SessionFactory getsessionfactory() {
		
		Configuration cfg = new Configuration();
		cfg.configure("/com/hibernate/recources/hibernate.cfg.xml");
		
		return cfg.buildSessionFactory();
		
	}
}
