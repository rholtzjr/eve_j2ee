package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TEdEmpModuleDAO;
import org.holtz.eve.jpa.entity.TEdEmpModule;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TEdEmpModule;

public class TEdEmpModuleDAOImpl implements TEdEmpModuleDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TEdEmpModuleDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TEdEmpModule getEmpModuleById(int id) {
		String queryString = "from TEdEmpModule empModule where empModule.edEmpModuleId = :id";
		TEdEmpModule empModule = new TEdEmpModule();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		empModule = (TEdEmpModule) query.uniqueResult();
		return empModule;
	}

	@Override
	public TEdEmpModule getEmpModuleByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TEdEmpModule empModule where empModule.edNotesTxN like CONCAT('%',:name,'%')";
//		TEdEmpModule empModule = new TEdEmpModule();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		empModule = (TEdEmpModule) query.uniqueResult();
//		return empModule;
	}

	@Override
	public List<TEdEmpModule> getEmpModuleList() {
			String queryString = "from TEdEmpModule";
			List<TEdEmpModule> empModuleList = new ArrayList<TEdEmpModule>();
			query = session.createQuery(queryString);
			empModuleList = (List<TEdEmpModule>)query.list();
			return empModuleList;
	}

	@Override
	public void save(TEdEmpModule empModule) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TEdEmpModule empModule) {
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
