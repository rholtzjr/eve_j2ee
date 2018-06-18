package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TNdNodeDAO;
import org.holtz.eve.jpa.entity.TNdNode;
import org.holtz.jpa.util.HibernateUtil;

public class TNdNodeDAOImpl implements TNdNodeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TNdNodeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TNdNode getNodeById(int id) {
		String queryString = "from TNdNode node where node.ndNodeId = :id";
		TNdNode node = new TNdNode();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		node = (TNdNode) query.uniqueResult();
		return node;
	}

	@Override
	public TNdNode getNodeByName(String name) {
		String queryString = "from TNdNode node where node.ndNodeTx like CONCAT('%',:name,'%')";
		TNdNode node = new TNdNode();
		query = session.createQuery(queryString);
		query.setString("name", name);
		node = (TNdNode) query.uniqueResult();
		return node;
	}

	@Override
	public List<TNdNode> getNodeList() {
		String queryString = "from TNdNode";
		List<TNdNode> nodeList = new ArrayList<TNdNode>();
		query = session.createQuery(queryString);
		nodeList = (List<TNdNode>)query.list();
		return nodeList;		// TODO Auto-generated method stub
	}

	@Override
	public void save(TNdNode node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TNdNode node) {
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
