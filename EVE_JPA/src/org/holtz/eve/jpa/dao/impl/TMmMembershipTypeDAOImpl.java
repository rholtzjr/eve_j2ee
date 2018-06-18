package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TMmMembershipTypeDAO;
import org.holtz.eve.jpa.entity.TMmMembershipType;
import org.holtz.jpa.util.HibernateUtil;

public class TMmMembershipTypeDAOImpl implements TMmMembershipTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TMmMembershipTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TMmMembershipType getMembershipTypeById(int id) {
		String queryString = "from TMmMembershipType membershipType where membershipType.mmMembershipTypeId = :id";
		TMmMembershipType membershipType = new TMmMembershipType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		membershipType = (TMmMembershipType) query.uniqueResult();
		return membershipType;
	}

	@Override
	public TMmMembershipType getMembershipTypeByName(String name) {
		String queryString = "from TMmMembershipType membershipType where membershipType.mmMembershipTypeTx like CONCAT('%',:name,'%')";
		TMmMembershipType membershipType = new TMmMembershipType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		membershipType = (TMmMembershipType) query.uniqueResult();
		return membershipType;
	}

	@Override
	public List<TMmMembershipType> getMembershipTypeList() {
		String queryString = "from TMmMembershipType";
		List<TMmMembershipType> membershipTypeList = new ArrayList<TMmMembershipType>();
		query = session.createQuery(queryString);
		membershipTypeList = (List<TMmMembershipType>)query.list();
		return membershipTypeList;
	}

	@Override
	public void save(TMmMembershipType membershipType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TMmMembershipType membershipType) {
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
