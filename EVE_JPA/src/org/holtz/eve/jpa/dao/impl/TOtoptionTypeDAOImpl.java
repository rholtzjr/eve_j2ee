package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TOtoptionTypeDAO;
import org.holtz.eve.jpa.entity.TOtoptionType;
import org.holtz.jpa.util.HibernateUtil;

public class TOtoptionTypeDAOImpl implements TOtoptionTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TOtoptionTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TOtoptionType getOptionTypeById(int id) {
		String queryString = "from TOtoptionType optionType where optionType.ottypeId = :id";
		TOtoptionType optionType = new TOtoptionType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		optionType = (TOtoptionType) query.uniqueResult();
		return optionType;
	}

	@Override
	public TOtoptionType getOptionTypeByName(String name) {
		String queryString = "from TOtoptionType optionType where optionType.ottypeTx like CONCAT('%',:name,'%')";
		TOtoptionType optionType = new TOtoptionType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		optionType = (TOtoptionType) query.uniqueResult();
		return optionType;
	}

	@Override
	public List<TOtoptionType> getOptionTypeList() {
		String queryString = "from TOtoptionType";
		List<TOtoptionType> optionTypeList = new ArrayList<TOtoptionType>();
		query = session.createQuery(queryString);
		optionTypeList = (List<TOtoptionType>)query.list();
		return optionTypeList;
	}

	@Override
	public void save(TOtoptionType optionType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TOtoptionType optionType) {
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
