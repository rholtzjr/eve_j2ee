package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRySectionTypeDAO;
import org.holtz.eve.jpa.entity.TRySectionType;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TRySectionType;

public class TRySectionTypeDAOImpl implements TRySectionTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRySectionTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRySectionType getSectionTypeById(int id) {
		String queryString = "from TRySectionType sectionType where sectionType.rySectionTypeId = :id";
		TRySectionType sectionType = new TRySectionType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		sectionType = (TRySectionType) query.uniqueResult();
		return sectionType;
	}

	@Override
	public TRySectionType getSectionTypeByName(String name) {
		String queryString = "from TRySectionType sectionType where sectionType.rySectionTypeTx like CONCAT('%',:name,'%')";
		TRySectionType sectionType = new TRySectionType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		sectionType = (TRySectionType) query.uniqueResult();
		return sectionType;
	}

	@Override
	public List<TRySectionType> getSectionTypeList() {
		String queryString = "from TRySectionType";
		List<TRySectionType> sectionTypeList = new ArrayList<TRySectionType>();
		query = session.createQuery(queryString);
		sectionTypeList = (List<TRySectionType>)query.list();
		return sectionTypeList;
	}

	@Override
	public void save(TRySectionType sectionType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRySectionType sectionType) {
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
