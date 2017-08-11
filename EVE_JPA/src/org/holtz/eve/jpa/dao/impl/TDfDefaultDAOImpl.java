package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TDfDefaultDAO;
import org.holtz.eve.jpa.entity.TDfDefault;
import org.holtz.eve.jpa.entity.TDfDefault;
import org.holtz.jpa.util.HibernateUtil;

public class TDfDefaultDAOImpl implements TDfDefaultDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TDfDefaultDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TDfDefault getDefaultById(int id) {
		String queryString = "from TDfDefault dft where dft.dfDefaultId = :id";
		TDfDefault dft = new TDfDefault();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		dft = (TDfDefault) query.uniqueResult();
		return dft;
	}

	@Override
	public TDfDefault getDefaultByName(String name) {
		String queryString = "from TDfDefault dft where dft.dfDefaultName like CONCAT('%',:name,'%')";
		TDfDefault dft = new TDfDefault();
		query = session.createQuery(queryString);
		query.setString("name", name);
		dft = (TDfDefault) query.uniqueResult();
		return dft;
	}

	@Override
	public List<TDfDefault> getDefaultList() {
		String queryString = "from TDfDefault";
		List<TDfDefault> dftList = new ArrayList<TDfDefault>();
		query = session.createQuery(queryString);
		dftList = (List<TDfDefault>)query.list();
		return dftList;
	}

	@Override
	public void save(TDfDefault dft) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TDfDefault dft) {
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
