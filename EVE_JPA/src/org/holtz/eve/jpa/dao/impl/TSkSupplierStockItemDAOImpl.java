package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSkSupplierStockItemDAO;
import org.holtz.eve.jpa.entity.TSkSupplierStockItem;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TSkSupplierStockItem;

public class TSkSupplierStockItemDAOImpl implements TSkSupplierStockItemDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSkSupplierStockItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSkSupplierStockItem getSupplierStockItemById(int id) {
		String queryString = "from TSkSupplierStockItem supplierStockItem where supplierStockItem.id = :id";
		TSkSupplierStockItem supplierStockItem = new TSkSupplierStockItem();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		supplierStockItem = (TSkSupplierStockItem) query.uniqueResult();
		return supplierStockItem;
	}

	@Override
	public TSkSupplierStockItem getSupplierStockItemByName(String name) {
		String queryString = "from TSkSupplierStockItem supplierStockItem where supplierStockItem.skStockItemTx like CONCAT('%',:name,'%')";
		TSkSupplierStockItem supplierStockItem = new TSkSupplierStockItem();
		query = session.createQuery(queryString);
		query.setString("name", name);
		supplierStockItem = (TSkSupplierStockItem) query.uniqueResult();
		return supplierStockItem;
	}

	@Override
	public List<TSkSupplierStockItem> getSupplierStockItemList() {
		String queryString = "from TSkSupplierStockItem";
		List<TSkSupplierStockItem> supplierStockItemList = new ArrayList<TSkSupplierStockItem>();
		query = session.createQuery(queryString);
		supplierStockItemList = (List<TSkSupplierStockItem>)query.list();
		return supplierStockItemList;
	}

	@Override
	public void save(TSkSupplierStockItem supplierStockItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSkSupplierStockItem supplierStockItem) {
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
