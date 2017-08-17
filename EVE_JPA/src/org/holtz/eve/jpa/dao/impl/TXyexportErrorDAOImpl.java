package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TXyexportErrorDAO;
import org.holtz.eve.jpa.entity.TXyexportError;
import org.holtz.jpa.util.HibernateUtil;

public class TXyexportErrorDAOImpl implements TXyexportErrorDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TXyexportErrorDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TXyexportError getExportErrorById(int id) {
		String queryString = "from TXyexportError exportError where exportError.id = :id";
		TXyexportError exportError = new TXyexportError();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		exportError = (TXyexportError) query.uniqueResult();
		return exportError;
	}

	@Override
	public TXyexportError getExportErrorByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TXyexportError exportError where exportError.id like CONCAT('%',:name,'%')";
//		TXyexportError exportError = new TXyexportError();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		exportError = (TXyexportError) query.uniqueResult();
//		return exportError;
	}

	@Override
	public List<TXyexportError> getExportErrorList() {
		String queryString = "from TXyexportError";
		List<TXyexportError> exportErrorList = new ArrayList<TXyexportError>();
		query = session.createQuery(queryString);
		exportErrorList = (List<TXyexportError>)query.list();
		return exportErrorList;
	}

	@Override
	public void save(TXyexportError exportError) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TXyexportError exportError) {
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
