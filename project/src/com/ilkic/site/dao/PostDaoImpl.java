package com.ilkic.site.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ilkic.site.model.PostEntity;

@Repository
public class PostDaoImpl implements PostDao{
	
	@Autowired
	PostDao postDao;

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int addPost(PostEntity post) {
		sessionFactory.getCurrentSession().save(post);
		return 1;
	}

	@Override
	public List<PostEntity> getPosts() {
		return getSession().createQuery("from PostEntity", PostEntity.class).list();
	}

	@Override
	public PostEntity getPostById(int postId) {
		return (PostEntity) getSession().get(PostEntity.class, postId);
	}
	
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public boolean deletePost(int postId) {
		PostEntity fetchedPost = getPostById(postId);
		getSession().delete(fetchedPost);
		return true;

	}

	@Override
	public boolean updatePost(PostEntity post) {
		getSession().update(post);
		return true;
	}
	
	

}
