package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TC4custCustTypeDAO;
import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.eve.jpa.entity.TC4custCustType;
import org.holtz.jpa.util.HibernateUtil;

public class TC4custCustTypeDAOImpl implements TC4custCustTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TC4custCustTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TC4custCustType getCustCustTypeById(int id) {
		String queryString = "from TC4custCustType custcusttype where custcusttype.id = :id";
		TC4custCustType custCustType = new TC4custCustType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		custCustType = (TC4custCustType) query.uniqueResult();
		return custCustType;
	}

	@Override
	public TC4custCustType getCustCustTypeByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TC4custCustType custcusttype where custcusttype.id like CONCAT('%',:name,'%')";
//		TC4custCustType custCustType = new TC4custCustType();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		custCustType = (TC4custCustType) query.uniqueResult();
//		return custCustType;
	}

	@Override
	public List<TC4custCustType> getCustCustTypeList() {
		String queryString = "from TC4custCustType";
		List<TC4custCustType> custCustTypeList = new ArrayList<TC4custCustType>();
		query = session.createQuery(queryString);
		custCustTypeList = (List<TC4custCustType>)query.list();
		return custCustTypeList;
	}

	@Override
	public void save(TC4custCustType account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TC4custCustType account) {
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
