package com.ilkic.site.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilkic.site.dao.PostDao;
import com.ilkic.site.model.PostEntity;

@Service
@Transactional
public class PostServiceImpl implements PostService{

	@Autowired
	PostDao postDao;
	
	@Override
	public boolean addPost(PostEntity post) {
		Date date = new Date();
		post.setCreateDate(date);
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

	@Override
	public boolean deletePost(int postId) {
		return postDao.deletePost(postId);
	}

	@Override
	public boolean updatePost(PostEntity post) {
		return postDao.updatePost(post);
	}

}
