package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPiPrivilegeDAO;
import org.holtz.eve.jpa.entity.TPiPrivilege;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TPiPrivilege;

public class TPiPrivilegeDAOImpl implements TPiPrivilegeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPiPrivilegeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPiPrivilege getPrivilegeById(int id) {
		String queryString = "from TPiPrivilege privilege where privilege.piPrivilegeIdacAccountId = :id";
		TPiPrivilege privilege = new TPiPrivilege();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		privilege = (TPiPrivilege) query.uniqueResult();
		return privilege;
	}

	@Override
	public TPiPrivilege getPrivilegeByName(String name) {
		String queryString = "from TPiPrivilege privilege where privilege.piPrivilegeTx like CONCAT('%',:name,'%')";
		TPiPrivilege privilege = new TPiPrivilege();
		query = session.createQuery(queryString);
		query.setString("name", name);
		privilege = (TPiPrivilege) query.uniqueResult();
		return privilege;
	}

	@Override
	public List<TPiPrivilege> getPrivilegeList() {
		String queryString = "from TPiPrivilege";
		List<TPiPrivilege> privilegeList = new ArrayList<TPiPrivilege>();
		query = session.createQuery(queryString);
		privilegeList = (List<TPiPrivilege>)query.list();
		return privilegeList;
	}

	@Override
	public void save(TPiPrivilege privilege) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPiPrivilege privilege) {
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
