package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPdPaditerritoryDAO;
import org.holtz.eve.jpa.entity.TPdPaditerritory;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TPdPaditerritory;

public class TPdPaditerritoryDAOImpl implements TPdPaditerritoryDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPdPaditerritoryDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPdPaditerritory getPaditerritoryById(int id) {
		String queryString = "from TPdPaditerritory paditerritory where paditerritory.pdPaditerritoryId = :id";
		TPdPaditerritory paditerritory = new TPdPaditerritory();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		paditerritory = (TPdPaditerritory) query.uniqueResult();
		return paditerritory;
	}

	@Override
	public TPdPaditerritory getPaditerritoryByName(String name) {
		String queryString = "from TPdPaditerritory paditerritory where paditerritory.pdPaditerritoryTx like CONCAT('%',:name,'%')";
		TPdPaditerritory paditerritory = new TPdPaditerritory();
		query = session.createQuery(queryString);
		query.setString("name", name);
		paditerritory = (TPdPaditerritory) query.uniqueResult();
		return paditerritory;
	}

	@Override
	public List<TPdPaditerritory> getPaditerritoryList() {
		String queryString = "from TPdPaditerritory";
		List<TPdPaditerritory> paditerritoryList = new ArrayList<TPdPaditerritory>();
		query = session.createQuery(queryString);
		paditerritoryList = (List<TPdPaditerritory>)query.list();
		return paditerritoryList;
	}

	@Override
	public void save(TPdPaditerritory paditerritory) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPdPaditerritory paditerritory) {
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
