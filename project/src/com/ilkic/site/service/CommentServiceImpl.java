package com.ilkic.site.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ilkic.site.dao.CommentDao;
import com.ilkic.site.model.CommentEntity;

@Service
@Transactional
public class CommentServiceImpl implements CommentService{

	@Autowired
	CommentDao commentDao;
	
	@Override
	public boolean addComment(CommentEntity comment) {
		Date date = new Date();
		comment.setCreateDate(date);
		return commentDao.addComment(comment) > 0 ;
	}

	@Override
	public List<CommentEntity> getComments() {
		return commentDao.getComments();

	}

	@Override
	public CommentEntity getCommenttById(int commentId) {
		return commentDao.getCommentById(commentId);
	}

	@Override
	public boolean deleteComment(int commentId) {
		return commentDao.deleteComment(commentId);
	}

	@Override
	public boolean updateComment(CommentEntity comment) {
		return commentDao.updateComment(comment);
	}

	@Override
	public List<CommentEntity> getCommentsByPostId(int postId) {
		return commentDao.getCommentsByPostId(postId);
	}
	

}
