package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TC9custMailingListDAO;
import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.eve.jpa.entity.TC9custMailingList;
import org.holtz.jpa.util.HibernateUtil;

public class TC9custMailingListDAOImpl implements TC9custMailingListDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TC9custMailingListDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TC9custMailingList getCustMailingListById(int id) {
		String queryString = "from TC9custMailingList cml where cml.id = :id";
		TC9custMailingList cml = new TC9custMailingList();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		cml = (TC9custMailingList) query.uniqueResult();
		return cml;
	}

	@Override
	public TC9custMailingList getCustMailingListByName(String name) {
		// NOOP
		return null;
//		String queryString = "from TC9custMailingList cml where cml.TMlmailingList like CONCAT('%',:name,'%')";
//		TC9custMailingList cml = new TC9custMailingList();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		cml = (TC9custMailingList) query.uniqueResult();
//		return cml;
	}

	@Override
	public List<TC9custMailingList> getCustMailingList() {
		String queryString = "from TC9custMailingList";
		List<TC9custMailingList> cmlList = new ArrayList<TC9custMailingList>();
		query = session.createQuery(queryString);
		cmlList = (List<TC9custMailingList>)query.list();
		return cmlList;
	}

	@Override
	public void save(TC9custMailingList account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TC9custMailingList account) {
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
