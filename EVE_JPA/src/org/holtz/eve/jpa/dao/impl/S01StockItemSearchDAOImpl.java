package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.S01StockItemSearchDAO;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.jpa.util.HibernateUtil;

public class S01StockItemSearchDAOImpl implements S01StockItemSearchDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public S01StockItemSearchDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public S01StockItemSearch getStockItemSearchById(int id) {
		String queryString = "from S01StockItemSearch stockItemSearch where stockItemSearch.SIStockItemID = :id";
		S01StockItemSearch stockItemSearch = new S01StockItemSearch();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		stockItemSearch = (S01StockItemSearch) query.uniqueResult();
		return stockItemSearch;
	}

	@Override
	public S01StockItemSearch getStockItemSearchByName(String name) {
		String queryString = "from S01StockItemSearch stockItemSearch where stockItemSearch.SIStockItemTx like CONCAT('%',:name,'%')";
		S01StockItemSearch stockItemSearch = new S01StockItemSearch();
		query = session.createQuery(queryString);
		query.setString("name", name);
		stockItemSearch = (S01StockItemSearch) query.uniqueResult();
		return stockItemSearch;
	}

	@Override
	public List<S01StockItemSearch> getStockItemSearchList() {
		String queryString = "from S01StockItemSearch";
		List<S01StockItemSearch> stockItemSearchList = new ArrayList<S01StockItemSearch>();
		query = session.createQuery(queryString);
		stockItemSearchList = (List<S01StockItemSearch>)query.list();
		return stockItemSearchList;
	}

	@Override
	public void save(S01StockItemSearch stockItemSearch) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(S01StockItemSearch stockItemSearch) {
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
