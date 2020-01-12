package com.ilkic.site.dao;

import java.util.List;

import com.ilkic.site.model.PostEntity;

public interface PostDao {

	public int addPost(PostEntity post);
	
	public List<PostEntity> getPosts();
	
	public PostEntity getPostById(int postId);
	
}
