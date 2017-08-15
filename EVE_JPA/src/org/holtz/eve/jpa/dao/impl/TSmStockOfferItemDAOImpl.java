package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSmStockOfferItemDAO;
import org.holtz.eve.jpa.entity.TSmStockOfferItem;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TSmStockOfferItem;

public class TSmStockOfferItemDAOImpl implements TSmStockOfferItemDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSmStockOfferItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSmStockOfferItem getStockOfferItemById(int id) {
		String queryString = "from TSmStockOfferItem stockOfferItem where stockOfferItem.id = :id";
		TSmStockOfferItem stockOfferItem = new TSmStockOfferItem();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		stockOfferItem = (TSmStockOfferItem) query.uniqueResult();
		return stockOfferItem;
	}

	@Override
	public TSmStockOfferItem getStockOfferItemByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TSmStockOfferItem stockOfferItem where stockOfferItem.id like CONCAT('%',:name,'%')";
//		TSmStockOfferItem stockOfferItem = new TSmStockOfferItem();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		stockOfferItem = (TSmStockOfferItem) query.uniqueResult();
//		return stockOfferItem;
	}

	@Override
	public List<TSmStockOfferItem> getStockOfferItemList() {
		String queryString = "from TSmStockOfferItem";
		List<TSmStockOfferItem> stockOfferItemList = new ArrayList<TSmStockOfferItem>();
		query = session.createQuery(queryString);
		stockOfferItemList = (List<TSmStockOfferItem>)query.list();
		return stockOfferItemList;
	}

	@Override
	public void save(TSmStockOfferItem stockOfferItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSmStockOfferItem stockOfferItem) {
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
