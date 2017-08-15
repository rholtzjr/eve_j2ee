package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPjPrivilegeModulesDOA;
import org.holtz.eve.jpa.entity.TPjPrivilegeModules;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TPjPrivilegeModules;

public class TPjPrivilegeModulesDAOImpl implements TPjPrivilegeModulesDOA {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPjPrivilegeModulesDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPjPrivilegeModules getPrivilegeModulesById(int id) {
		String queryString = "from TPjPrivilegeModules privilegeModules where privilegeModules.pjPrivilegeModuleId = :id";
		TPjPrivilegeModules privilegeModules = new TPjPrivilegeModules();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		privilegeModules = (TPjPrivilegeModules) query.uniqueResult();
		return privilegeModules;
	}

	@Override
	public TPjPrivilegeModules getPrivilegeModulesByName(String name) {
		///NOOP
		return null;
//		String queryString = "from TPjPrivilegeModules privilegeModules where privilegeModules.pjPrivilegeModuleId like CONCAT('%',:name,'%')";
//		TPjPrivilegeModules privilegeModules = new TPjPrivilegeModules();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		privilegeModules = (TPjPrivilegeModules) query.uniqueResult();
//		return privilegeModules;
	}

	@Override
	public List<TPjPrivilegeModules> getPrivilegeModulesList() {
		String queryString = "from TPjPrivilegeModules";
		List<TPjPrivilegeModules> privilegeModulesList = new ArrayList<TPjPrivilegeModules>();
		query = session.createQuery(queryString);
		privilegeModulesList = (List<TPjPrivilegeModules>)query.list();
		return privilegeModulesList;
	}

	@Override
	public void save(TPjPrivilegeModules privilegeModules) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPjPrivilegeModules privilegeModules) {
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
