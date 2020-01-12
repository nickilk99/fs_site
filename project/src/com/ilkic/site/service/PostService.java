package com.ilkic.site.service;

import java.util.List;

import com.ilkic.site.model.PostEntity;
import com.ilkic.site.model.UserEntity;

public interface PostService {

	
	public boolean addPost(PostEntity post);
	
	public List<PostEntity> getPosts();
	
	public PostEntity getPostById(int postId);
	
}
