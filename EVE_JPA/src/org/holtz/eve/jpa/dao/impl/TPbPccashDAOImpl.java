package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPbPccashDAO;
import org.holtz.eve.jpa.entity.TPbPccash;
import org.holtz.jpa.util.HibernateUtil;

public class TPbPccashDAOImpl implements TPbPccashDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPbPccashDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPbPccash getPccashById(int id) {
		String queryString = "from TPbPccash pccash where pccash.pbPccashId = :id";
		TPbPccash pccash = new TPbPccash();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		pccash = (TPbPccash) query.uniqueResult();
		return pccash;
	}

	@Override
	public TPbPccash getPccashByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TPbPccash pccash where pccash.pbPccashId like CONCAT('%',:name,'%')";
//		TPbPccash pccash = new TPbPccash();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		pccash = (TPbPccash) query.uniqueResult();
//		return pccash;
	}

	@Override
	public List<TPbPccash> getPccashList() {
		String queryString = "from TPbPccash";
		List<TPbPccash> pccashList = new ArrayList<TPbPccash>();
		query = session.createQuery(queryString);
		pccashList = (List<TPbPccash>)query.list();
		return pccashList;
	}

	@Override
	public void save(TPbPccash pccash) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPbPccash pccash) {
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
