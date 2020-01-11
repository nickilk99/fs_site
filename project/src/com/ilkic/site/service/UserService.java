package com.ilkic.site.service;

import java.util.List;

import com.ilkic.site.model.UserEntity;

public interface UserService {
	
	public boolean addUser(UserEntity usr);
	
	public List<UserEntity> getUsers(); // Read
	
	public UserEntity getUserById(int userId); // Read
	
	public boolean deleteUser(int userId); //DELETE
	
	public boolean updateUser(UserEntity usr); // UPDATE

	public boolean validate(String userName, String password);
}
