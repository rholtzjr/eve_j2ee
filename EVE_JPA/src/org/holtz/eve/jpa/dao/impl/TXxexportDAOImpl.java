package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TXxexportDAO;
import org.holtz.eve.jpa.entity.TXxexport;
import org.holtz.jpa.util.HibernateUtil;

public class TXxexportDAOImpl implements TXxexportDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TXxexportDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TXxexport getExportById(int id) {
		String queryString = "from TXxexport export where export.xxexportId = :id";
		TXxexport export = new TXxexport();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		export = (TXxexport) query.uniqueResult();
		return export;
	}

	@Override
	public TXxexport getExportByName(String name) {
		String queryString = "from TXxexport export where export.xxexportTypeTx like CONCAT('%',:name,'%')";
		TXxexport export = new TXxexport();
		query = session.createQuery(queryString);
		query.setString("name", name);
		export = (TXxexport) query.uniqueResult();
		return export;
	}

	@Override
	public List<TXxexport> getExportList() {
		String queryString = "from TXxexport";
		List<TXxexport> exportList = new ArrayList<TXxexport>();
		query = session.createQuery(queryString);
		exportList = (List<TXxexport>)query.list();
		return exportList;
	}

	@Override
	public void save(TXxexport export) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TXxexport export) {
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
