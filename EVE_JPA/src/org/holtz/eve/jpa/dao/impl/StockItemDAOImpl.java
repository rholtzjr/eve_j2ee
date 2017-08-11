package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.StockItemDAO;
import org.holtz.eve.jpa.entity.S01SistockItem;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.jpa.entity.TSistockItem;
import org.holtz.jpa.util.HibernateUtil;



public class StockItemDAOImpl implements StockItemDAO {


	
	
	private List<S01SistockItem> siStockItem;
	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	private List<S01StockItemSearch> stockItemList;

	
	
	public StockItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}


	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public SessionFactory getSessionFactory() {
		sessionFactory = HibernateUtil.getSessionFactory();
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	@Override
	public void saveStockItem(TSistockItem stockItem) {
		// TODO Auto-generated method stub
		session.saveOrUpdate(stockItem);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<S01StockItemSearch> getStockItemList() {
		stockItemList = new ArrayList<S01StockItemSearch>();
		String queryString = "from S01StocKItemSearch";		
		query = session.createQuery(queryString);
		stockItemList = (List<S01StockItemSearch>) query.list();
		return stockItemList;
	}

	@Override
	public List<S01SistockItem> getStockItemById(int stockItemId) {
		S01SistockItem returnItem = new S01SistockItem();
//		Criteria crit = session.createCriteria(S01SistockItem.class);
//		crit.createAlias("S01SistockItem.id", "stockItemId");
//		crit.add(Restrictions.eq("id", stockItemId));
//		S01SistockItem returnItem = new S01SistockItem();
//		returnItem = (S01SistockItem) crit.uniqueResult();
//		siStockItem.add( (S01SistockItem) crit.uniqueResult());
//		siStockItem = new ArrayList<S01SistockItem>();
		String sqlQueryString = "select * from S01SIStockItem sis where sis.sistockItemId = :id";
//		String sqlQueryString = "SELECT dbo.T_SIStockItem.* "
//				+ "FROM dbo.T_SIStockItem INNER JOIN "
//				+ "dbo.T_ZlStoreStockItem ON dbo.T_SIStockItem.SIStockItemID = dbo.T_ZlStoreStockItem.ZlStockItemID "
//				+ "WHERE  (ZlStoreID = 1) and dbo.T_SIStockItem.SIStockItemID = :id";
//		Query<?> sqlQuery = session.createSQLQuery(sqlQueryString);
//		sqlQuery.setInteger("id", stockItemId);
//		returnItem = (S01SistockItem)sqlQuery.uniqueResult();
		String queryString = "from S01SistockItem as sis where id = :id";
		query = session.createQuery(queryString);
		query.setInteger("id", stockItemId);		
		returnItem = (S01SistockItem)query.uniqueResult();
		siStockItem.add(returnItem);
		
		return siStockItem;
		
	}

	public List<S01SistockItem> getSiStockItem() {
		return siStockItem;
	}

	public void setSiStockItem(List<S01SistockItem> siStockItem) {
		this.siStockItem = siStockItem;
	}

	public Query getQuery() {
		return query;
	}

	public void setQuery(Query query) {
		this.query = query;
	}

	public void setStockItemList(List<S01StockItemSearch> stockItemList) {
		this.stockItemList = stockItemList;
	}
	
}
