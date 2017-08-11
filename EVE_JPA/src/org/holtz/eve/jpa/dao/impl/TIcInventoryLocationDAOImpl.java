package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TIcInventoryLocationDAO;
import org.holtz.eve.jpa.entity.TIcInventoryLocation;
import org.holtz.jpa.util.HibernateUtil;

public class TIcInventoryLocationDAOImpl implements TIcInventoryLocationDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TIcInventoryLocationDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TIcInventoryLocation getInventoryLocationById(int id) {
		String queryString = "from TIcInventoryLocation inventoryLocation where inventoryLocation.icInventoryLocationId = :id";
		TIcInventoryLocation inventoryLocation = new TIcInventoryLocation();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		inventoryLocation = (TIcInventoryLocation) query.uniqueResult();
		return inventoryLocation;
	}

	@Override
	public TIcInventoryLocation getInventoryLocationByName(String name) {
		String queryString = "from TIcInventoryLocation inventoryLocation where inventoryLocation.icInventoryLocationTx like CONCAT('%',:name,'%')";
		TIcInventoryLocation inventoryLocation = new TIcInventoryLocation();
		query = session.createQuery(queryString);
		query.setString("name", name);
		inventoryLocation = (TIcInventoryLocation) query.uniqueResult();
		return inventoryLocation;
	}

	@Override
	public List<TIcInventoryLocation> getInventoryLocationList() {
		String queryString = "from TIcInventoryLocation";
		List<TIcInventoryLocation> inventoryLocationList = new ArrayList<TIcInventoryLocation>();
		query = session.createQuery(queryString);
		inventoryLocationList = (List<TIcInventoryLocation>)query.list();
		return inventoryLocationList;
	}

	@Override
	public void save(TIcInventoryLocation inventoryLocation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TIcInventoryLocation inventoryLocation) {
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
