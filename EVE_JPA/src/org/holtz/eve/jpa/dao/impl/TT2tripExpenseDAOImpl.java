package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TT2tripExpenseDAO;
import org.holtz.eve.jpa.entity.TT2tripExpense;
import org.holtz.jpa.util.HibernateUtil;

public class TT2tripExpenseDAOImpl implements TT2tripExpenseDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TT2tripExpenseDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TT2tripExpense getTripExpenseById(int id) {
		String queryString = "from TT2tripExpense tripExpense where tripExpense.t2tripExpenseId = :id";
		TT2tripExpense tripExpense = new TT2tripExpense();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		tripExpense = (TT2tripExpense) query.uniqueResult();
		return tripExpense;
	}

	@Override
	public TT2tripExpense getTripExpenseByName(String name) {
		String queryString = "from TT2tripExpense tripExpense where tripExpense.t2notesTxN like CONCAT('%',:name,'%')";
		TT2tripExpense tripExpense = new TT2tripExpense();
		query = session.createQuery(queryString);
		query.setString("name", name);
		tripExpense = (TT2tripExpense) query.uniqueResult();
		return tripExpense;
	}

	@Override
	public List<TT2tripExpense> getTripExpenseList() {
		String queryString = "from TT2tripExpense";
		List<TT2tripExpense> tripExpenseList = new ArrayList<TT2tripExpense>();
		query = session.createQuery(queryString);
		tripExpenseList = (List<TT2tripExpense>)query.list();
		return tripExpenseList;
	}

	@Override
	public void save(TT2tripExpense tripExpense) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TT2tripExpense tripExpense) {
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
