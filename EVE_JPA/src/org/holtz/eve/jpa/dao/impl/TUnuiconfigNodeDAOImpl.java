package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TUnuiconfigNodeDAO;
import org.holtz.eve.jpa.entity.TUnuiconfigNode;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TUnuiconfigNode;

public class TUnuiconfigNodeDAOImpl implements TUnuiconfigNodeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TUnuiconfigNodeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TUnuiconfigNode getUiconfigNodeById(int id) {
		String queryString = "from TUnuiconfigNode uiconfigNode where uiconfigNode.id = :id";
		TUnuiconfigNode uiconfigNode = new TUnuiconfigNode();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		uiconfigNode = (TUnuiconfigNode) query.uniqueResult();
		return uiconfigNode;
	}

	@Override
	public TUnuiconfigNode getUiconfigNodeByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TUnuiconfigNode uiconfigNode where uiconfigNode.id like CONCAT('%',:name,'%')";
//		TUnuiconfigNode uiconfigNode = new TUnuiconfigNode();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		uiconfigNode = (TUnuiconfigNode) query.uniqueResult();
//		return uiconfigNode;
	}

	@Override
	public List<TUnuiconfigNode> getUiconfigNodeList() {
		String queryString = "from TUnuiconfigNode";
		List<TUnuiconfigNode> uiconfigNodeList = new ArrayList<TUnuiconfigNode>();
		query = session.createQuery(queryString);
		uiconfigNodeList = (List<TUnuiconfigNode>)query.list();
		return uiconfigNodeList;
	}

	@Override
	public void save(TUnuiconfigNode uiconfigNode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TUnuiconfigNode uiconfigNode) {
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
