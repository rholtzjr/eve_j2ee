package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPfProfitCenterDAO;
import org.holtz.eve.jpa.entity.TPfProfitCenter;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TPfProfitCenter;

public class TPfProfitCenterDAOImpl implements TPfProfitCenterDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPfProfitCenterDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPfProfitCenter getProfitCenterById(int id) {
		String queryString = "from TPfProfitCenter profitCenter where profitCenter.pfProfitCenterId = :id";
		TPfProfitCenter profitCenter = new TPfProfitCenter();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		profitCenter = (TPfProfitCenter) query.uniqueResult();
		return profitCenter;
	}

	@Override
	public TPfProfitCenter getProfitCenterByName(String name) {
		String queryString = "from TPfProfitCenter profitCenter where profitCenter.pfProfitCenterTx like CONCAT('%',:name,'%')";
		TPfProfitCenter profitCenter = new TPfProfitCenter();
		query = session.createQuery(queryString);
		query.setString("name", name);
		profitCenter = (TPfProfitCenter) query.uniqueResult();
		return profitCenter;
	}

	@Override
	public List<TPfProfitCenter> getProfitCenterList() {
		String queryString = "from TPfProfitCenter";
		List<TPfProfitCenter> profitCenterList = new ArrayList<TPfProfitCenter>();
		query = session.createQuery(queryString);
		profitCenterList = (List<TPfProfitCenter>)query.list();
		return profitCenterList;
	}

	@Override
	public void save(TPfProfitCenter profitCenter) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPfProfitCenter profitCenter) {
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
