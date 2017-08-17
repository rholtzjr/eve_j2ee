package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TZoStoreDataTypeDAO;
import org.holtz.eve.jpa.entity.TZoStoreDataType;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TZoStoreDataType;

public class TZoStoreDataTypeDAOImpl implements TZoStoreDataTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TZoStoreDataTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TZoStoreDataType getStoreDataTypeById(int id) {
		String queryString = "from TZoStoreDataType storeDataType where storeDataType.id = :id";
		TZoStoreDataType storeDataType = new TZoStoreDataType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		storeDataType = (TZoStoreDataType) query.uniqueResult();
		return storeDataType;
	}

	@Override
	public TZoStoreDataType getStoreDataTypeByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TZoStoreDataType storeDataType where storeDataType.id like CONCAT('%',:name,'%')";
//		TZoStoreDataType storeDataType = new TZoStoreDataType();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		storeDataType = (TZoStoreDataType) query.uniqueResult();
//		return storeDataType;
	}

	@Override
	public List<TZoStoreDataType> getStoreDataTypeList() {
		String queryString = "from TZoStoreDataType";
		List<TZoStoreDataType> storeDataTypeList = new ArrayList<TZoStoreDataType>();
		query = session.createQuery(queryString);
		storeDataTypeList = (List<TZoStoreDataType>)query.list();
		return storeDataTypeList;
	}

	@Override
	public void save(TZoStoreDataType storeDataType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TZoStoreDataType storeDataType) {
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
