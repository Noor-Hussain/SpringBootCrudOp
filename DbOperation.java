package com.hibernate.repositry;

import com.Entity.User;

public interface DbOperation {
	public User getUserDetails(Long id);
}
