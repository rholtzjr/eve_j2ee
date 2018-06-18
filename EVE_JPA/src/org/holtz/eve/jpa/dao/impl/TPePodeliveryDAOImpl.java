package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPePodeliveryDAO;
import org.holtz.eve.jpa.entity.TPePodelivery;
import org.holtz.jpa.util.HibernateUtil;

public class TPePodeliveryDAOImpl implements TPePodeliveryDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPePodeliveryDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPePodelivery getPodeliveryById(int id) {
		String queryString = "from TPePodelivery podelivery where podelivery.pePodeliveryId = :id";
		TPePodelivery podelivery = new TPePodelivery();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		podelivery = (TPePodelivery) query.uniqueResult();
		return podelivery;
	}

	@Override
	public TPePodelivery getPodeliveryByName(String name) {
		String queryString = "from TPePodelivery podelivery where podelivery.peNotesTxN like CONCAT('%',:name,'%')";
		TPePodelivery podelivery = new TPePodelivery();
		query = session.createQuery(queryString);
		query.setString("name", name);
		podelivery = (TPePodelivery) query.uniqueResult();
		return podelivery;
	}

	@Override
	public List<TPePodelivery> getPodeliveryList() {
		String queryString = "from TPePodelivery";
		List<TPePodelivery> podeliveryList = new ArrayList<TPePodelivery>();
		query = session.createQuery(queryString);
		podeliveryList = (List<TPePodelivery>)query.list();
		return podeliveryList;
	}

	@Override
	public void save(TPePodelivery podelivery) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPePodelivery podelivery) {
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
