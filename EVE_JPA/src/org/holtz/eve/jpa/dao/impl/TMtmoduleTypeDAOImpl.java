package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TMtmoduleTypeDAO;
import org.holtz.eve.jpa.entity.TMtmoduleType;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TMtmoduleType;

public class TMtmoduleTypeDAOImpl implements TMtmoduleTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TMtmoduleTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TMtmoduleType getModuleTypeById(int id) {
		String queryString = "from TMtmoduleType moduleType where moduleType.mtmoduleTypeId = :id";
		TMtmoduleType moduleType = new TMtmoduleType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		moduleType = (TMtmoduleType) query.uniqueResult();
		return moduleType;
	}

	@Override
	public TMtmoduleType getModuleTypeByName(String name) {
		String queryString = "from TMtmoduleType moduleType where moduleType.mtmoduleTypeTx like CONCAT('%',:name,'%')";
		TMtmoduleType moduleType = new TMtmoduleType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		moduleType = (TMtmoduleType) query.uniqueResult();
		return moduleType;
	}

	@Override
	public List<TMtmoduleType> getModuleTypeList() {
		String queryString = "from TMtmoduleType";
		List<TMtmoduleType> moduleTypeList = new ArrayList<TMtmoduleType>();
		query = session.createQuery(queryString);
		moduleTypeList = (List<TMtmoduleType>)query.list();
		return moduleTypeList;
	}

	@Override
	public void save(TMtmoduleType moduleType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TMtmoduleType moduleType) {
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
