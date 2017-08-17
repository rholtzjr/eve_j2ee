package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TVnVanDAO;
import org.holtz.eve.jpa.entity.TVnVan;
import org.holtz.jpa.util.HibernateUtil;

public class TVnVanDAOImpl implements TVnVanDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TVnVanDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TVnVan getVanById(int id) {
		String queryString = "from TVnVan van where van.vnVanId = :id";
		TVnVan van = new TVnVan();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		van = (TVnVan) query.uniqueResult();
		return van;
	}

	@Override
	public TVnVan getVanByName(String name) {
		String queryString = "from TVnVan van where van.vnVanNameTx like CONCAT('%',:name,'%')";
		TVnVan van = new TVnVan();
		query = session.createQuery(queryString);
		query.setString("name", name);
		van = (TVnVan) query.uniqueResult();
		return van;
	}

	@Override
	public List<TVnVan> getVanList() {
		String queryString = "from TVnVan";
		List<TVnVan> vanList = new ArrayList<TVnVan>();
		query = session.createQuery(queryString);
		vanList = (List<TVnVan>)query.list();
		return vanList;
	}

	@Override
	public void save(TVnVan van) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TVnVan van) {
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
