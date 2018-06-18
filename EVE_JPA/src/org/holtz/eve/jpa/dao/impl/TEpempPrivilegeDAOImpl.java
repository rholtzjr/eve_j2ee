package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TEpempPrivilegeDAO;
import org.holtz.eve.jpa.entity.TEpempPrivilege;
import org.holtz.jpa.util.HibernateUtil;

public class TEpempPrivilegeDAOImpl implements TEpempPrivilegeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TEpempPrivilegeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TEpempPrivilege getEmpPrivilegeById(int id) {
		String queryString = "from TEpempPrivilege empPrivilege where empPrivilege.id = :id";
		TEpempPrivilege empPrivilege = new TEpempPrivilege();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		empPrivilege = (TEpempPrivilege) query.uniqueResult();
		return empPrivilege;
	}

	@Override
	public TEpempPrivilege getEmpPrivilegeByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TEpempPrivilege empPrivilege where empPrivilege.id like CONCAT('%',:name,'%')";
//		TEpempPrivilege empPrivilege = new TEpempPrivilege();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		empPrivilege = (TEpempPrivilege) query.uniqueResult();
//		return empPrivilege;
	}

	@Override
	public List<TEpempPrivilege> getEmpPrivilegeList() {
		String queryString = "from TEpempPrivilege";
		List<TEpempPrivilege> empPrivilegeList = new ArrayList<TEpempPrivilege>();
		query = session.createQuery(queryString);
		empPrivilegeList = (List<TEpempPrivilege>)query.list();
		return empPrivilegeList;
	}

	@Override
	public void save(TEpempPrivilege empPrivilege) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TEpempPrivilege empPrivilege) {
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
