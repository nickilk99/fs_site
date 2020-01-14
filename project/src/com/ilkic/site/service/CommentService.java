package com.ilkic.site.service;

import java.util.List;

import com.ilkic.site.model.CommentEntity;

public interface CommentService {
	
	public boolean addComment(CommentEntity comment);
	
	public List<CommentEntity> getComments();
	
	
	public CommentEntity getCommenttById(int commentId);
	
	public boolean deleteComment(int commentId);

	public boolean updateComment(CommentEntity comment);

	public List<CommentEntity> getCommentsByPostId(int postId);

}
