package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TMdEveModuleDAO;
import org.holtz.eve.jpa.entity.TMdEveModule;
import org.holtz.jpa.util.HibernateUtil;

public class TMdEveModuleDAOImpl implements TMdEveModuleDAO {
	
	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TMdEveModuleDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TMdEveModule getEveModuleById(int id) {
		String queryString = "from TMdEveModule eveModule where eveModule.mdEvemoduleId = :id";
		TMdEveModule eveModule = new TMdEveModule();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		eveModule = (TMdEveModule) query.uniqueResult();
		return eveModule;
	}

	@Override
	public TMdEveModule getEveModuleByName(String name) {
		String queryString = "from TMdEveModule eveModule where eveModule.mdEveModuleTx like CONCAT('%',:name,'%')";
		TMdEveModule eveModule = new TMdEveModule();
		query = session.createQuery(queryString);
		query.setString("name", name);
		eveModule = (TMdEveModule) query.uniqueResult();
		return eveModule;
	}

	@Override
	public List<TMdEveModule> getEveModuleList() {
		String queryString = "from TMdEveModule";
		List<TMdEveModule> eveModuleList = new ArrayList<TMdEveModule>();
		query = session.createQuery(queryString);
		eveModuleList = (List<TMdEveModule>)query.list();
		return eveModuleList;
	}

	@Override
	public void save(TMdEveModule eveModule) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TMdEveModule eveModule) {
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
