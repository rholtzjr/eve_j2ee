package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTitransferItemDAO;
import org.holtz.eve.jpa.entity.TTitransferItem;
import org.holtz.jpa.util.HibernateUtil;

public class TTitransferItemDAOImpl implements TTitransferItemDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTitransferItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTitransferItem getTransferItemById(int id) {
		String queryString = "from TTitransferItem transferItem where transferItem.titransferItemId = :id";
		TTitransferItem transferItem = new TTitransferItem();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		transferItem = (TTitransferItem) query.uniqueResult();
		return transferItem;
	}

	@Override
	public TTitransferItem getTransferItemByName(String name) {
		String queryString = "from TTitransferItem transferItem where transferItem.tiserialNoTxN like CONCAT('%',:name,'%')";
		TTitransferItem transferItem = new TTitransferItem();
		query = session.createQuery(queryString);
		query.setString("name", name);
		transferItem = (TTitransferItem) query.uniqueResult();
		return transferItem;
	}

	@Override
	public List<TTitransferItem> getTransferItemList() {
		String queryString = "from TTitransferItem";
		List<TTitransferItem> transferItemList = new ArrayList<TTitransferItem>();
		query = session.createQuery(queryString);
		transferItemList = (List<TTitransferItem>)query.list();
		return transferItemList;
	}

	@Override
	public void save(TTitransferItem transferItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TTitransferItem transferItem) {
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
