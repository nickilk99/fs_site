package com.ilkic.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilkic.site.dao.UserDao;
import com.ilkic.site.model.UserEntity;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public boolean addUser(UserEntity usr) {
		return userDao.insertUser(usr) > 0 ;
	}

	@Override
	public List<UserEntity> getUsers() {
		return userDao.getUsers();
	}

	@Override
	public UserEntity getUserById(int userId) {
		return userDao.getUserById(userId);
	}

	@Override
	public boolean deleteUser(int userId) {
		return userDao.deleteUser(userId);
	}

	@Override
	public boolean updateUser(UserEntity usr) {
		return userDao.updateUser(usr);
	}

}
