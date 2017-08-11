package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TGigiftTypeAllowedItemDAO;
import org.holtz.eve.jpa.entity.TGigiftTypeAllowedItem;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TGigiftTypeAllowedItem;

public class TGigiftTypeAllowedItemDAOImpl implements TGigiftTypeAllowedItemDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TGigiftTypeAllowedItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TGigiftTypeAllowedItem getGiftTypeAllowedItemById(int id) {
		String queryString = "from TGigiftTypeAllowedItem giftTypeAllowedItem where giftTypeAllowedItem.id = :id";
		TGigiftTypeAllowedItem giftTypeAllowedItem = new TGigiftTypeAllowedItem();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		giftTypeAllowedItem = (TGigiftTypeAllowedItem) query.uniqueResult();
		return giftTypeAllowedItem;
	}

	@Override
	public TGigiftTypeAllowedItem getGiftTypeAllowedItemByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TGigiftTypeAllowedItem giftTypeAllowedItem where giftTypeAllowedItem.id like CONCAT('%',:name,'%')";
//		TGigiftTypeAllowedItem giftTypeAllowedItem = new TGigiftTypeAllowedItem();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		giftTypeAllowedItem = (TGigiftTypeAllowedItem) query.uniqueResult();
//		return giftTypeAllowedItem;
	}

	@Override
	public List<TGigiftTypeAllowedItem> getGiftTypeAllowedItemList() {
		String queryString = "from TGigiftTypeAllowedItem";
		List<TGigiftTypeAllowedItem> giftTypeAllowedItemList = new ArrayList<TGigiftTypeAllowedItem>();
		query = session.createQuery(queryString);
		giftTypeAllowedItemList = (List<TGigiftTypeAllowedItem>)query.list();
		return giftTypeAllowedItemList;
	}

	@Override
	public void save(TGigiftTypeAllowedItem giftTypeAllowedItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TGigiftTypeAllowedItem giftTypeAllowedItem) {
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
