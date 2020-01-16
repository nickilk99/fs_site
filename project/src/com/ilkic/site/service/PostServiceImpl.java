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
public class PostServiceImpl implements PostService {

	@Autowired
	PostDao postDao;

	@Override
	public boolean addPost(PostEntity post) {
		Date date = new Date();
		post.setCreateDate(date);
		return postDao.addPost(post) > 0;
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

	@Override
	public List<PostEntity> limitCharsInPosts(List<PostEntity> posts) {

		for (int i = 0; i < posts.size(); i++) {
			String postbody = posts.get(i).getPostBody();
			if (postbody.length() > 100) {
				posts.get(i).setPostBody(postbody.substring(0, 200));
				System.out.println(posts.get(1).getPostBody());
				posts.get(i).setPostBody(posts.get(i).getPostBody() + " . . . ");
				System.out.println(posts.get(1).getPostBody());
			}
		}
		return posts;
	}

}
