package com.ilkic.site.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ilkic.site.model.CommentEntity;

@Repository
public class CommentDaoImpl implements CommentDao{
	
	@Autowired
	CommentDao commentDao;
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int addComment(CommentEntity comment) {
		sessionFactory.getCurrentSession().save(comment);
		return 1;
	}

	@Override
	public List<CommentEntity> getComments() {
		return getSession().createQuery("from CommentEntity", CommentEntity.class).list();

	}

	@Override
	public CommentEntity getCommentById(int commentId) {
		return (CommentEntity) getSession().get(CommentEntity.class, commentId);

	}

	@Override
	public boolean deleteComment(int commentId) {
		CommentEntity fetchedComment = getCommentById(commentId);
		getSession().delete(fetchedComment);
		return true;

	}

	@Override
	public boolean updateComment(CommentEntity comment) {
		getSession().update(comment);
		return true;
	}
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	
	@Override
	public List<CommentEntity> getCommentsByPostId(int postId) {
		String hql = "from CommentEntity where post.id= :postId";
		Query query = getSession().createQuery(hql);
		query.setParameter("postId",postId);
		if (query.list().size() > 0) {
			return (List<CommentEntity>)query.list();
		}
		else {
			return null;
		}
			
		
	}

}
