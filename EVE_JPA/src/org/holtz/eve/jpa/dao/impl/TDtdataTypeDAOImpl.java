package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TDtdataTypeDAO;
import org.holtz.eve.jpa.entity.TDtdataType;
import org.holtz.jpa.util.HibernateUtil;

public class TDtdataTypeDAOImpl implements TDtdataTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TDtdataTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TDtdataType getDataTypeById(int id) {
		String queryString = "from TDtdataType dataType where dataType.dtdataTypeId = :id";
		TDtdataType dataType = new TDtdataType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		dataType = (TDtdataType) query.uniqueResult();
		return dataType;
	}

	@Override
	public TDtdataType getDataTypeByName(String name) {
		String queryString = "from TDtdataType dataType where dataType.dtdataTypeTx like CONCAT('%',:name,'%')";
		TDtdataType dataType = new TDtdataType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		dataType = (TDtdataType) query.uniqueResult();
		return dataType;
	}

	@Override
	public List<TDtdataType> getDataTypeList() {
		String queryString = "from TDtdataType";
		List<TDtdataType> dataTypeList = new ArrayList<TDtdataType>();
		query = session.createQuery(queryString);
		dataTypeList = (List<TDtdataType>)query.list();
		return dataTypeList;
	}

	@Override
	public void save(TDtdataType dataType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TDtdataType dataType) {
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
