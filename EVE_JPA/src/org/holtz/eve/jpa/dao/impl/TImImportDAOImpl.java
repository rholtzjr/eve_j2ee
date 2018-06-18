package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TImImportDAO;
import org.holtz.eve.jpa.entity.TImImport;
import org.holtz.jpa.util.HibernateUtil;

public class TImImportDAOImpl implements TImImportDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TImImportDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TImImport getImportById(int id) {
		String queryString = "from TImImport timimport where timimport.id = :id";
		TImImport timimport = new TImImport();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		timimport = (TImImport) query.uniqueResult();
		return timimport;
	}

	@Override
	public TImImport getImportByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TImImport timimport where timimport.id like CONCAT('%',:name,'%')";
//		TImImport timimport = new TImImport();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		timimport = (TImImport) query.uniqueResult();
//		return timimport;
	}

	@Override
	public List<TImImport> getImportList() {
		String queryString = "from TImImport";
		List<TImImport> timimportList = new ArrayList<TImImport>();
		query = session.createQuery(queryString);
		timimportList = (List<TImImport>)query.list();
		return timimportList;
	}

	@Override
	public void save(TImImport timimport) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TImImport timimport) {
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
