package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TExExpenseDAO;
import org.holtz.eve.jpa.entity.TExExpense;
import org.holtz.jpa.util.HibernateUtil;

public class TExExpenseDAOImpl implements TExExpenseDAO {

	
	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TExExpenseDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TExExpense getExpenseById(int id) {
		String queryString = "from TExExpense expense where expense.acAccountId = :id";
		TExExpense expense = new TExExpense();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		expense = (TExExpense) query.uniqueResult();
		return expense;
	}

	@Override
	public TExExpense getExpenseByName(String name) {
		String queryString = "from TExExpense expense where expense.acAccountNameTx like CONCAT('%',:name,'%')";
		TExExpense expense = new TExExpense();
		query = session.createQuery(queryString);
		query.setString("name", name);
		expense = (TExExpense) query.uniqueResult();
		return expense;
	}

	@Override
	public List<TExExpense> getExpenseList() {
		String queryString = "from TExExpense";
		List<TExExpense> expenseList = new ArrayList<TExExpense>();
		query = session.createQuery(queryString);
		expenseList = (List<TExExpense>)query.list();
		return expenseList;
	}

	@Override
	public void save(TExExpense expense) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TExExpense expense) {
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
