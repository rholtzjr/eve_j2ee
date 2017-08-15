package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPopoDAO;
import org.holtz.eve.jpa.entity.TPopo;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TPopo;

public class TPopoDAOImpl implements TPopoDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPopoDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPopo getPoById(int id) {
		String queryString = "from TPopo po where po.poid = :id";
		TPopo po = new TPopo();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		po = (TPopo) query.uniqueResult();
		return po;
	}

	@Override
	public TPopo getPoByName(String name) {
		String queryString = "from TPopo po where po.ponotesTxN like CONCAT('%',:name,'%')";
		TPopo po = new TPopo();
		query = session.createQuery(queryString);
		query.setString("name", name);
		po = (TPopo) query.uniqueResult();
		return po;
	}

	@Override
	public List<TPopo> getPoList() {
		String queryString = "from TPopo";
		List<TPopo> poList = new ArrayList<TPopo>();
		query = session.createQuery(queryString);
		poList = (List<TPopo>)query.list();
		return poList;
	}

	@Override
	public void save(TPopo po) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPopo po) {
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
