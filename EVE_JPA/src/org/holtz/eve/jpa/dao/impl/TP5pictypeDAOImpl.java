package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TP5pictypeDAO;
import org.holtz.eve.jpa.entity.TP5pictype;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TP5pictype;

public class TP5pictypeDAOImpl implements TP5pictypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TP5pictypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TP5pictype getPictypeById(int id) {
		String queryString = "from TP5pictype pictype where pictype.p5pictypeId = :id";
		TP5pictype pictype = new TP5pictype();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		pictype = (TP5pictype) query.uniqueResult();
		return pictype;
	}

	@Override
	public TP5pictype getPictypeByName(String name) {
		String queryString = "from TP5pictype pictype where pictype.p5pictypeTx like CONCAT('%',:name,'%')";
		TP5pictype pictype = new TP5pictype();
		query = session.createQuery(queryString);
		query.setString("name", name);
		pictype = (TP5pictype) query.uniqueResult();
		return pictype;
	}

	@Override
	public List<TP5pictype> getPictypeList() {
		String queryString = "from TP5pictype";
		List<TP5pictype> pictypeList = new ArrayList<TP5pictype>();
		query = session.createQuery(queryString);
		pictypeList = (List<TP5pictype>)query.list();
		return pictypeList;
	}

	@Override
	public void save(TP5pictype pictype) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TP5pictype pictype) {
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
