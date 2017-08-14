package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TP4piccardDAO;
import org.holtz.eve.jpa.entity.TP4piccard;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TP4piccard;

public class TP4piccardDAOImpl implements TP4piccardDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TP4piccardDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TP4piccard getPiccardById(int id) {
		String queryString = "from TP4piccard piccard where piccard.p4piccardId = :id";
		TP4piccard piccard = new TP4piccard();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		piccard = (TP4piccard) query.uniqueResult();
		return piccard;
	}

	@Override
	public TP4piccard getPiccardByName(String name) {
		String queryString = "from TP4piccard piccard where piccard.p4piccardNameTx like CONCAT('%',:name,'%')";
		TP4piccard piccard = new TP4piccard();
		query = session.createQuery(queryString);
		query.setString("name", name);
		piccard = (TP4piccard) query.uniqueResult();
		return piccard;
	}

	@Override
	public List<TP4piccard> getPiccardList() {
		String queryString = "from TP4piccard";
		List<TP4piccard> piccardList = new ArrayList<TP4piccard>();
		query = session.createQuery(queryString);
		piccardList = (List<TP4piccard>)query.list();
		return piccardList;
	}

	@Override
	public void save(TP4piccard piccard) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TP4piccard piccard) {
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
