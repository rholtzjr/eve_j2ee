package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TZlStoreStockItemDAO;
import org.holtz.eve.jpa.entity.TZlStoreStockItem;
import org.holtz.jpa.util.HibernateUtil;

public class TZlStoreStockItemDAOImpl implements TZlStoreStockItemDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TZlStoreStockItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TZlStoreStockItem getStoreStockItemById(int id) {
		String queryString = "from TZlStoreStockItem storeStockItem where storeStockItem.zlStoreStockItemId = :id";
		TZlStoreStockItem storeStockItem = new TZlStoreStockItem();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		storeStockItem = (TZlStoreStockItem) query.uniqueResult();
		return storeStockItem;
	}

	@Override
	public TZlStoreStockItem getStoreStockItemByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TZlStoreStockItem storeStockItem where storeStockItem.zlStoreStockItemId like CONCAT('%',:name,'%')";
//		TZlStoreStockItem storeStockItem = new TZlStoreStockItem();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		storeStockItem = (TZlStoreStockItem) query.uniqueResult();
//		return storeStockItem;
	}

	@Override
	public List<TZlStoreStockItem> getStoreStockItemList() {
		String queryString = "from TZlStoreStockItem";
		List<TZlStoreStockItem> storeStockItemList = new ArrayList<TZlStoreStockItem>();
		query = session.createQuery(queryString);
		storeStockItemList = (List<TZlStoreStockItem>)query.list();
		return storeStockItemList;
	}

	public TZlStoreStockItem getStockItemById(int id) {
		TZlStoreStockItem returnItem = new TZlStoreStockItem();

		String queryString = "from TZlStoreStockItem as ssi where ssi.TSistockItem.sistockItemId = :id";
		query = session.createQuery(queryString);
		query.setInteger("id", id);		
		returnItem = (TZlStoreStockItem)query.uniqueResult();
//		siStockItem.add(returnItem);
		
		return returnItem;
	}
	@Override
	public void save(TZlStoreStockItem storeStockItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TZlStoreStockItem storeStockItem) {
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
