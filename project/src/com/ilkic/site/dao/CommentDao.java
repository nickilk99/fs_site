package com.ilkic.site.dao;

import java.util.List;

import com.ilkic.site.model.CommentEntity;

public interface CommentDao {

	public int addComment(CommentEntity entity);
	
	public List<CommentEntity> getComments();
	
	public CommentEntity getCommentById(int commentId);

	public boolean deleteComment(int commentId);

	boolean updateComment(CommentEntity comment);
	
}
