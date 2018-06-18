package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TMoModuleDAO;
import org.holtz.eve.jpa.entity.TMoModule;
import org.holtz.jpa.util.HibernateUtil;

public class TMoModuleDAOImpl implements TMoModuleDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TMoModuleDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TMoModule getModuleById(int id) {
		String queryString = "from TMoModule module where module.moModuleId = :id";
		TMoModule module = new TMoModule();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		module = (TMoModule) query.uniqueResult();
		return module;
	}

	@Override
	public TMoModule getModuleByName(String name) {
		String queryString = "from TMoModule module where module.moNotesTxN like CONCAT('%',:name,'%')";
		TMoModule module = new TMoModule();
		query = session.createQuery(queryString);
		query.setString("name", name);
		module = (TMoModule) query.uniqueResult();
		return module;
	}

	@Override
	public List<TMoModule> getModuleList() {
		String queryString = "from TMoModule";
		List<TMoModule> moduleList = new ArrayList<TMoModule>();
		query = session.createQuery(queryString);
		moduleList = (List<TMoModule>)query.list();
		return moduleList;
	}

	@Override
	public void save(TMoModule module) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TMoModule module) {
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
