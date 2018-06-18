package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TFoformOptDAO;
import org.holtz.eve.jpa.entity.TFoformOpt;
import org.holtz.jpa.util.HibernateUtil;

public class TFoformOptDAOImpl implements TFoformOptDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TFoformOptDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TFoformOpt getFormOptById(int id) {
		String queryString = "from TFoformOpt formOpt where formOpt.foformOptId = :id";
		TFoformOpt formOpt = new TFoformOpt();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		formOpt = (TFoformOpt) query.uniqueResult();
		return formOpt;
	}

	@Override
	public TFoformOpt getFormOptByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TFoformOpt formOpt where formOpt.foformTypeId like CONCAT('%',:name,'%')";
//		TFoformOpt formOpt = new TFoformOpt();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		formOpt = (TFoformOpt) query.uniqueResult();
//		return formOpt;
	}

	@Override
	public List<TFoformOpt> getFormOptList() {
		String queryString = "from TFoformOpt";
		List<TFoformOpt> formOptList = new ArrayList<TFoformOpt>();
		query = session.createQuery(queryString);
		formOptList = (List<TFoformOpt>)query.list();
		return formOptList;
	}

	@Override
	public void save(TFoformOpt formOpt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TFoformOpt formOpt) {
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
