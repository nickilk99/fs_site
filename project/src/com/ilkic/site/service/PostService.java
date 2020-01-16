package com.ilkic.site.service;

import java.util.List;

import com.ilkic.site.model.PostEntity;

public interface PostService {

	public boolean addPost(PostEntity post);

	public List<PostEntity> getPosts();

	public PostEntity getPostById(int postId);

	public boolean deletePost(int postId);

	public boolean updatePost(PostEntity post);

	public List<PostEntity> limitCharsInPosts(List<PostEntity> posts);
	
}
