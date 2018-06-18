package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TFvFavoriteDAO;
import org.holtz.eve.jpa.entity.TFvFavorite;
import org.holtz.jpa.util.HibernateUtil;

public class TFvFavoriteDAOImpl implements TFvFavoriteDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TFvFavoriteDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TFvFavorite getFavoriteById(int id) {
		String queryString = "from TFvFavorite favorite where favorite.fvFavoriteId = :id";
		TFvFavorite favorite = new TFvFavorite();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		favorite = (TFvFavorite) query.uniqueResult();
		return favorite;
	}

	@Override
	public TFvFavorite getFavoriteByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TFvFavorite favorite where favorite.fvFavoriteId like CONCAT('%',:name,'%')";
//		TFvFavorite favorite = new TFvFavorite();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		favorite = (TFvFavorite) query.uniqueResult();
//		return favorite;
	}

	@Override
	public List<TFvFavorite> getFavoriteList() {
		String queryString = "from TFvFavorite";
		List<TFvFavorite> favoriteList = new ArrayList<TFvFavorite>();
		query = session.createQuery(queryString);
		favoriteList = (List<TFvFavorite>)query.list();
		return favoriteList;
	}

	@Override
	public void save(TFvFavorite favorite) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TFvFavorite favorite) {
		// TODO Auto-generated method stub

	}

	public SessionFactory getSessionFactory() {
		sessionFactory = HibernateUtil.getSessionFactory();
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
