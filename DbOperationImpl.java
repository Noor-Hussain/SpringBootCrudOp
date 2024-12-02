package com.hibernate.repositry;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import com.Entity.User;
import com.hibernate.config.hibernateconfig;
@Repository
public class DbOperationImpl implements DbOperation {

	@Override
	public User getUserDetails(Long id) {
		User user = null;
		try(
				Session session = hibernateconfig.getsessionfactory().openSession();
			)
		{
			user = session.get(User.class, id);
			
		}catch(Exception e){
			
		}
		
		return user;
	}

}
