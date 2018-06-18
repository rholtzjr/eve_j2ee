package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TErempRoleDAO;
import org.holtz.eve.jpa.entity.TErempRole;
import org.holtz.jpa.util.HibernateUtil;

public class TErempRoleDAOImpl implements TErempRoleDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TErempRoleDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TErempRole getEmpRoleById(int id) {
		String queryString = "from TErempRole empRole where empRole.id = :id";
		TErempRole empRole = new TErempRole();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		empRole = (TErempRole) query.uniqueResult();
		return empRole;
	}

	@Override
	public TErempRole getEmpRoleByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TErempRole empRole where empRole.id like CONCAT('%',:name,'%')";
//		TErempRole empRole = new TErempRole();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		empRole = (TErempRole) query.uniqueResult();
//		return empRole;
	}

	@Override
	public List<TErempRole> getEmpRoleList() {
		String queryString = "from TErempRole";
		List<TErempRole> empRoleList = new ArrayList<TErempRole>();
		query = session.createQuery(queryString);
		empRoleList = (List<TErempRole>)query.list();
		return empRoleList;
	}

	@Override
	public void save(TErempRole empRole) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TErempRole empRole) {
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
