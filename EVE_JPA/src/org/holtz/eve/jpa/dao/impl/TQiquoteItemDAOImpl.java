package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TQiquoteItemDAO;
import org.holtz.eve.jpa.entity.TQiquoteItem;
import org.holtz.jpa.util.HibernateUtil;

public class TQiquoteItemDAOImpl implements TQiquoteItemDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TQiquoteItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TQiquoteItem getQuoteItemById(int id) {
		String queryString = "from TQiquoteItem quoteItem where quoteItem.qiquoteItemId = :id";
		TQiquoteItem quoteItem = new TQiquoteItem();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		quoteItem = (TQiquoteItem) query.uniqueResult();
		return quoteItem;
	}

	@Override
	public TQiquoteItem getQuoteItemByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TQiquoteItem quoteItem where quoteItem.qiquoteItemId like CONCAT('%',:name,'%')";
//		TQiquoteItem quoteItem = new TQiquoteItem();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		quoteItem = (TQiquoteItem) query.uniqueResult();
//		return quoteItem;
	}

	@Override
	public List<TQiquoteItem> getQuoteItemList() {
		String queryString = "from TQiquoteItem";
		List<TQiquoteItem> quoteItemList = new ArrayList<TQiquoteItem>();
		query = session.createQuery(queryString);
		quoteItemList = (List<TQiquoteItem>)query.list();
		return quoteItemList;
	}

	@Override
	public void save(TQiquoteItem quoteItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TQiquoteItem quoteItem) {
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
