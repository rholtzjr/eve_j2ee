package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TMlmailingListDAO;
import org.holtz.eve.jpa.entity.TMlmailingList;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TMlmailingList;

public class TMlmailingListDAOImpl implements TMlmailingListDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TMlmailingListDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TMlmailingList getMailingListById(int id) {
		String queryString = "from TMlmailingList mailingList where mailingList.mlmailingListId = :id";
		TMlmailingList mailingList = new TMlmailingList();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		mailingList = (TMlmailingList) query.uniqueResult();
		return mailingList;
	}

	@Override
	public TMlmailingList getMailingListByName(String name) {
		String queryString = "from TMlmailingList mailingList where mailingList.mlmailingListTx like CONCAT('%',:name,'%')";
		TMlmailingList mailingList = new TMlmailingList();
		query = session.createQuery(queryString);
		query.setString("name", name);
		mailingList = (TMlmailingList) query.uniqueResult();
		return mailingList;
	}

	@Override
	public List<TMlmailingList> getMailingListList() {
		String queryString = "from TMlmailingList";
		List<TMlmailingList> mailingListList = new ArrayList<TMlmailingList>();
		query = session.createQuery(queryString);
		mailingListList = (List<TMlmailingList>)query.list();
		return mailingListList;
	}

	@Override
	public void save(TMlmailingList mailingList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TMlmailingList mailingList) {
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
