package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TS4salesSearchStockItemDAO;
import org.holtz.eve.jpa.entity.TS4salesSearchStockItem;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TS4salesSearchStockItem;

public class TS4salesSearchStockItemDAOImpl implements TS4salesSearchStockItemDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TS4salesSearchStockItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TS4salesSearchStockItem getSalesSearchStockItemById(int id) {
		String queryString = "from TS4salesSearchStockItem salesSearchStockItem where salesSearchStockItem.id = :id";
		TS4salesSearchStockItem salesSearchStockItem = new TS4salesSearchStockItem();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		salesSearchStockItem = (TS4salesSearchStockItem) query.uniqueResult();
		return salesSearchStockItem;
	}

	@Override
	public TS4salesSearchStockItem getSalesSearchStockItemByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TS4salesSearchStockItem salesSearchStockItem where salesSearchStockItem.id like CONCAT('%',:name,'%')";
//		TS4salesSearchStockItem salesSearchStockItem = new TS4salesSearchStockItem();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		salesSearchStockItem = (TS4salesSearchStockItem) query.uniqueResult();
//		return salesSearchStockItem;
	}

	@Override
	public List<TS4salesSearchStockItem> getSalesSearchStockItemList() {
		String queryString = "from TS4salesSearchStockItem";
		List<TS4salesSearchStockItem> salesSearchStockItemList = new ArrayList<TS4salesSearchStockItem>();
		query = session.createQuery(queryString);
		salesSearchStockItemList = (List<TS4salesSearchStockItem>)query.list();
		return salesSearchStockItemList;
	}

	@Override
	public void save(TS4salesSearchStockItem salesSearchStockItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TS4salesSearchStockItem salesSearchStockItem) {
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
