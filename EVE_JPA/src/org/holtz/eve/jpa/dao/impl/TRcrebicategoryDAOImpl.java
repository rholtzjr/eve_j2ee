package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRcrebicategoryDAO;
import org.holtz.eve.jpa.entity.TRcrebicategory;
import org.holtz.jpa.util.HibernateUtil;

public class TRcrebicategoryDAOImpl implements TRcrebicategoryDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRcrebicategoryDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRcrebicategory getRebicategoryById(int id) {
		String queryString = "from TRcrebicategory rebicategory where rebicategory.rcrebicategoryId = :id";
		TRcrebicategory rebicategory = new TRcrebicategory();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		rebicategory = (TRcrebicategory) query.uniqueResult();
		return rebicategory;
	}

	@Override
	public TRcrebicategory getRebicategoryByName(String name) {
		String queryString = "from TRcrebicategory rebicategory where rebicategory.rcrebicategoryTx like CONCAT('%',:name,'%')";
		TRcrebicategory rebicategory = new TRcrebicategory();
		query = session.createQuery(queryString);
		query.setString("name", name);
		rebicategory = (TRcrebicategory) query.uniqueResult();
		return rebicategory;
	}

	@Override
	public List<TRcrebicategory> getRebicategoryList() {
		String queryString = "from TRcrebicategory";
		List<TRcrebicategory> rebicategoryList = new ArrayList<TRcrebicategory>();
		query = session.createQuery(queryString);
		rebicategoryList = (List<TRcrebicategory>)query.list();
		return rebicategoryList;
	}

	@Override
	public void save(TRcrebicategory rebicategory) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRcrebicategory rebicategory) {
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
