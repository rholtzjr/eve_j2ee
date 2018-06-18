package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TClColorDAO;
import org.holtz.eve.jpa.entity.TClColor;
import org.holtz.jpa.util.HibernateUtil;

public class TClColorDAOImpl implements TClColorDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TClColorDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TClColor getColorById(int id) {
		String queryString = "from TClColor color where color.clColorId = :id";
		TClColor color = new TClColor();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		color = (TClColor) query.uniqueResult();
		return color;
	}

	@Override
	public TClColor getColorByName(String name) {
		String queryString = "from TClColor color where color.clColorTx like CONCAT('%',:name,'%')";
		TClColor color = new TClColor();
		query = session.createQuery(queryString);
		query.setString("name", name);
		color = (TClColor) query.uniqueResult();
		return color;
	}

	@Override
	public List<TClColor> getColorList() {
		String queryString = "from TAcAccount";
		List<TClColor> colorList = new ArrayList<TClColor>();
		query = session.createQuery(queryString);
		colorList = (List<TClColor>)query.list();
		return colorList;
	}

	@Override
	public void save(TClColor color) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TClColor color) {
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
