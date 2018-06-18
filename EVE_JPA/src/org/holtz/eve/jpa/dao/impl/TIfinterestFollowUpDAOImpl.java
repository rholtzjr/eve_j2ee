package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TIfinterestFollowUpDAO;
import org.holtz.eve.jpa.entity.TIfinterestFollowUp;
import org.holtz.jpa.util.HibernateUtil;

public class TIfinterestFollowUpDAOImpl implements TIfinterestFollowUpDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TIfinterestFollowUpDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TIfinterestFollowUp getInterestFollowUpById(int id) {
		String queryString = "from TIfinterestFollowUp interestFollowUp where interestFollowUp.ifinterestFollowUpId = :id";
		TIfinterestFollowUp interestFollowUp = new TIfinterestFollowUp();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		interestFollowUp = (TIfinterestFollowUp) query.uniqueResult();
		return interestFollowUp;
	}

	@Override
	public TIfinterestFollowUp getInterestFollowUpByName(String name) {
		String queryString = "from TIfinterestFollowUp interestFollowUp where interestFollowUp.ifnotesTxN like CONCAT('%',:name,'%')";
		TIfinterestFollowUp interestFollowUp = new TIfinterestFollowUp();
		query = session.createQuery(queryString);
		query.setString("name", name);
		interestFollowUp = (TIfinterestFollowUp) query.uniqueResult();
		return interestFollowUp;
	}

	@Override
	public List<TIfinterestFollowUp> getInterestFollowUpList() {
		String queryString = "from TIfinterestFollowUp";
		List<TIfinterestFollowUp> interestFollowUpList = new ArrayList<TIfinterestFollowUp>();
		query = session.createQuery(queryString);
		interestFollowUpList = (List<TIfinterestFollowUp>)query.list();
		return interestFollowUpList;
	}

	@Override
	public void save(TIfinterestFollowUp interestFollowUp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TIfinterestFollowUp interestFollowUp) {
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
