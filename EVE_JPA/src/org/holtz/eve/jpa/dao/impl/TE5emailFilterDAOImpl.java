package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TE5emailFilterDAO;
import org.holtz.eve.jpa.entity.TE5emailFilter;
import org.holtz.jpa.util.HibernateUtil;

public class TE5emailFilterDAOImpl implements TE5emailFilterDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TE5emailFilterDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TE5emailFilter getEmailFilterById(int id) {
		String queryString = "from TE5emailFilter emailFilter where emailFilter.e5emailFilterId = :id";
		TE5emailFilter emailFilter = new TE5emailFilter();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		emailFilter = (TE5emailFilter) query.uniqueResult();
		return emailFilter;
	}

	@Override
	public TE5emailFilter getEmailFilterByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TE5emailFilter emailFilter where emailFilter. like CONCAT('%',:name,'%')";
//		TE5emailFilter emailFilter = new TE5emailFilter();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		emailFilter = (TE5emailFilter) query.uniqueResult();
//		return emailFilter;
	}

	@Override
	public List<TE5emailFilter> getEmailFilterList() {
		String queryString = "from TE5emailFilter";
		List<TE5emailFilter> emailFilterList = new ArrayList<TE5emailFilter>();
		query = session.createQuery(queryString);
		emailFilterList = (List<TE5emailFilter>)query.list();
		return emailFilterList;
	}

	@Override
	public void save(TE5emailFilter emailFilter) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TE5emailFilter emailFilter) {
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
