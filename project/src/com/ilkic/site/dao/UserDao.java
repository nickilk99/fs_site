package com.ilkic.site.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.ilkic.site.model.UserEntity;

public interface UserDao {

	public int insertUser(UserEntity usr); // Create

	public List<UserEntity> getUsers(); // Read

	public UserEntity getUserById(int usrId); // Read

	public boolean deleteUser(int userId);

	public boolean updateUser(UserEntity usr);

	boolean validate(UserEntity usr, HttpSession session);

}
