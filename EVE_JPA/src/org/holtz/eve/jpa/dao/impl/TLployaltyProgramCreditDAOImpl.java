package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TLployaltyProgramCreditDAO;
import org.holtz.eve.jpa.entity.TLployaltyProgramCredit;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TLployaltyProgramCredit;

public class TLployaltyProgramCreditDAOImpl implements TLployaltyProgramCreditDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TLployaltyProgramCreditDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TLployaltyProgramCredit getLoyaltyProgramCreditById(int id) {
		String queryString = "from TLployaltyProgramCredit loyaltyProgramCredit where loyaltyProgramCredit.lployaltyProgramCreditId = :id";
		TLployaltyProgramCredit loyaltyProgramCredit = new TLployaltyProgramCredit();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		loyaltyProgramCredit = (TLployaltyProgramCredit) query.uniqueResult();
		return loyaltyProgramCredit;
	}

	@Override
	public TLployaltyProgramCredit getLoyaltyProgramCreditByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TLployaltyProgramCredit loyaltyProgramCredit where loyaltyProgramCredit.lployaltyProgramCreditId like CONCAT('%',:name,'%')";
//		TLployaltyProgramCredit loyaltyProgramCredit = new TLployaltyProgramCredit();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		loyaltyProgramCredit = (TLployaltyProgramCredit) query.uniqueResult();
//		return loyaltyProgramCredit;
	}

	@Override
	public List<TLployaltyProgramCredit> getLoyaltyProgramCreditList() {
		String queryString = "from TLployaltyProgramCredit";
		List<TLployaltyProgramCredit> loyaltyProgramCreditList = new ArrayList<TLployaltyProgramCredit>();
		query = session.createQuery(queryString);
		loyaltyProgramCreditList = (List<TLployaltyProgramCredit>)query.list();
		return loyaltyProgramCreditList;
	}

	@Override
	public void save(TLployaltyProgramCredit loyaltyProgramCredit) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TLployaltyProgramCredit loyaltyProgramCredit) {
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
