package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TFpformPropertyDAO;
import org.holtz.eve.jpa.entity.TFpformProperty;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TFpformProperty;

public class TFpformPropertyDAOImpl implements TFpformPropertyDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TFpformPropertyDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TFpformProperty getFormPropertyById(int id) {
		String queryString = "from TFpformProperty formProperty where formProperty.id = :id";
		TFpformProperty formProperty = new TFpformProperty();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		formProperty = (TFpformProperty) query.uniqueResult();
		return formProperty;
	}

	@Override
	public TFpformProperty getFormPropertyByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TFpformProperty formProperty where formProperty.id like CONCAT('%',:name,'%')";
//		TFpformProperty formProperty = new TFpformProperty();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		formProperty = (TFpformProperty) query.uniqueResult();
//		return formProperty;
	}

	@Override
	public List<TFpformProperty> getFormPropertyList() {
		String queryString = "from TFpformProperty";
		List<TFpformProperty> formPropertyList = new ArrayList<TFpformProperty>();
		query = session.createQuery(queryString);
		formPropertyList = (List<TFpformProperty>)query.list();
		return formPropertyList;
	}

	@Override
	public void save(TFpformProperty formProperty) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TFpformProperty formProperty) {
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
