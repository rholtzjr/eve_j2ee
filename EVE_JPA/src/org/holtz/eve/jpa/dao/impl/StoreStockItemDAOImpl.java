package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.Type;
import org.holtz.eve.jpa.dao.StoreStockItemDAO;
import org.holtz.eve.jpa.dao.TZlStoreStockItemDAO;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.jpa.entity.TSistockItem;
import org.holtz.eve.jpa.entity.TZlStoreStockItem;
import org.holtz.jpa.util.HibernateUtil;

//import org.springframework.orm.hibernate3.HibernateTemplate;;

public class StoreStockItemDAOImpl implements StoreStockItemDAO {

	private TZlStoreStockItem tzlStoreStockItem;
	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	


	public StoreStockItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
		
		
	}



	@Override
	public void saveStoreStockItem(TZlStoreStockItem storeStockItem) {		
//		session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(storeStockItem);
		
	}



	@SuppressWarnings("unchecked")
	@Override
	public List<S01StockItemSearch> listAllStoreStockItem() {
//		session = sessionFactory.getCurrentSession();	
		List <S01StockItemSearch> storeStockItemList = new ArrayList <S01StockItemSearch>();
		String queryString = "from S01StockItemSearch";
		query = session.createQuery(queryString);
//		session.createCriteria(S01StockItemSearch.class).add(Restrictions.isNotNull("id"));
//		Type [] retType = query.getReturnTypes();
		storeStockItemList = query.list();
//		session.close();
		return storeStockItemList;
	}

//	//Need to get the individual records to populate the list.
//	
//
//	public TZlStoreStockItem getTZlStoreStockItem() {
//		return tzlStoreStockItem;
//	}
//	public TZlStoreStockItem getTZlStoreStockItemByName(String StockItemName) {
//		return tzlStoreStockItem;
//	}
//	public TZlStoreStockItem getStoreStockItemById(int id) {
//
//		TZlStoreStockItemDAO tzlstoreStockItemDAO = new TZlStoreStockItemDAOImpl();
//		Criteria crit = session.createCriteria(TZlStoreStockItem.class);
//		crit.createAlias("TSistockItem", "TSistockItem");
//		crit.add(Restrictions.eq("TSistockItem.sistockItemId", id));
//		tzlStoreStockItem = (TZlStoreStockItem) crit.uniqueResult();
//
//		return tzlStoreStockItem;
//	}
//	
//	public void setTZlStoreStockItem(TZlStoreStockItem tZlStoreStockItem) {
//		tzlStoreStockItem = tZlStoreStockItem;
//	}
	@SuppressWarnings("unchecked")
	@Override
	public List<S01StockItemSearch> listStoreStockItemByName(String value) {
		List <S01StockItemSearch> storeStockItemList = new ArrayList <>();
//		session = sessionFactory.getCurrentSession();
		String queryString = "select sis from S01StockItemSearch as sis where sis.name like '%" + value + "%'";
		
		query = session.createQuery(queryString);
		storeStockItemList = 	query.list();
		return storeStockItemList;
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
