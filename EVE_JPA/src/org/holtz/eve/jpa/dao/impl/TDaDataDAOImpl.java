package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TDaDataDOA;
import org.holtz.eve.jpa.entity.TDaData;
import org.holtz.eve.jpa.entity.TDaData;

public class TDaDataDAOImpl implements TDaDataDOA {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TDaDataDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TDaData getDataById(int id) {
		String queryString = "from TDaData data where data.daDataId = :id";
		TDaData data = new TDaData();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		data = (TDaData) query.uniqueResult();
		return data;
	}

	@Override
	public TDaData getDataByName(String name) {
		String queryString = "from TDaData data where data.daDescriptionTx like CONCAT('%',:name,'%')";
		TDaData data = new TDaData();
		query = session.createQuery(queryString);
		query.setString("name", name);
		data = (TDaData) query.uniqueResult();
		return data;
	}

	@Override
	public List<TDaData> getDataList() {
		String queryString = "from TDaData";
		List<TDaData> dataList = new ArrayList<TDaData>();
		query = session.createQuery(queryString);
		dataList = (List<TDaData>)query.list();
		return dataList;
	}

	@Override
	public void save(TDaData data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TDaData data) {
		// TODO Auto-generated method stub

	}

	public SessionFactory getSessionFactory() {
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
