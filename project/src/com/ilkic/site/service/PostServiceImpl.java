package com.ilkic.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilkic.site.dao.PostDao;
import com.ilkic.site.dao.UserDao;
import com.ilkic.site.model.PostEntity;

@Service
@Transactional
public class PostServiceImpl implements PostService{

	@Autowired
	PostDao postDao;
	
	@Override
	public boolean addPost(PostEntity post) {
		return postDao.addPost(post) > 0 ;
	}

	@Override
	public List<PostEntity> getPosts() {
		return postDao.getPosts();
	}

	@Override
	public PostEntity getPostById(int postId) {
		return postDao.getPostById(postId);
	}

}
