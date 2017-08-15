package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TQuQuoteDAO;
import org.holtz.eve.jpa.entity.TQuQuote;
import org.holtz.jpa.util.HibernateUtil;

public class TQuQuoteDAOImpl implements TQuQuoteDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TQuQuoteDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TQuQuote getQuoteById(int id) {
		String queryString = "from TQuQuote quote where quote.quQuoteId = :id";
		TQuQuote quote = new TQuQuote();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		quote = (TQuQuote) query.uniqueResult();
		return quote;
	}

	@Override
	public TQuQuote getQuoteByName(String name) {
		String queryString = "from TQuQuote quote where quote.quNotesTxN like CONCAT('%',:name,'%')";
		TQuQuote quote = new TQuQuote();
		query = session.createQuery(queryString);
		query.setString("name", name);
		quote = (TQuQuote) query.uniqueResult();
		return quote;
	}

	@Override
	public List<TQuQuote> getQuoteList() {
		String queryString = "from TQuQuote";
		List<TQuQuote> quoteList = new ArrayList<TQuQuote>();
		query = session.createQuery(queryString);
		quoteList = (List<TQuQuote>)query.list();
		return quoteList;
	}

	@Override
	public void save(TQuQuote quote) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TQuQuote quote) {
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
