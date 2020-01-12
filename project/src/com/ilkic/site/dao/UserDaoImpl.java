package com.ilkic.site.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ilkic.site.model.UserEntity;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int insertUser(UserEntity usr) {
		sessionFactory.getCurrentSession().save(usr);
		return 0;
	}

	@Override
	public List<UserEntity> getUsers() {
		return getSession().createQuery("from UserEntity", UserEntity.class).list();
	}

	@Override
	public UserEntity getUserById(int usrId) {
		return (UserEntity) getSession().get(UserEntity.class, usrId);
	}
	
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public boolean deleteUser(int userId) {
		UserEntity fetchedUser = getUserById(userId);
		getSession().delete(fetchedUser);
		return true;
	}

	@Override
	public boolean updateUser(UserEntity usr) {
		getSession().update(usr);
		return true;
	}
	
	@Override
	public boolean validate(UserEntity usr, HttpSession session) {

        UserEntity userEntity = null;
        String userName = usr.getUsername();
        String password = usr.getPassword();
      
        userEntity = (UserEntity) getSession().createQuery("FROM UserEntity U WHERE U.username = :username").setParameter("username", userName).uniqueResult();

            if (userEntity != null && userEntity.getPassword().equals(password)) {
            	System.out.println("true");
            	session.setAttribute("UserEntity" , userEntity);
            	
            	
            	
            	
            	
                return true;
            }
        System.out.println("fail");    
        return false;
    }


}
