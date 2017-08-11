package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCacertAgencyDAO;
import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.eve.jpa.entity.TCacertAgency;
import org.holtz.jpa.util.HibernateUtil;

public class TCacertAgencyDAOImpl implements TCacertAgencyDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCacertAgencyDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCacertAgency getCertAgencyById(int id) {
		String queryString = "from TCacertAgency certagency where certagency.cacertAgencyId = :id";
		TCacertAgency certAgency = new TCacertAgency();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		certAgency = (TCacertAgency) query.uniqueResult();
		return certAgency;
	}

	@Override
	public TCacertAgency getCertAgencyByName(String name) {
		String queryString = "from TCacertAgency certagency where certagency.cacertAgencyTx like CONCAT('%',:name,'%')";
		TCacertAgency certAgency = new TCacertAgency();
		query = session.createQuery(queryString);
		query.setString("name", name);
		certAgency = (TCacertAgency) query.uniqueResult();
		return certAgency;
	}

	@Override
	public List<TCacertAgency> getCertAgencyList() {
		String queryString = "from TCacertAgency";
		List<TCacertAgency> certAgencyList = new ArrayList<TCacertAgency>();
		query = session.createQuery(queryString);
		certAgencyList = (List<TCacertAgency>)query.list();
		return certAgencyList;
	}

	@Override
	public void save(TCacertAgency account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCacertAgency account) {
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
