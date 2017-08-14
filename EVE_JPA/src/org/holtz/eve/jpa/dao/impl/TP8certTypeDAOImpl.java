package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TP8certTypeDAO;
import org.holtz.eve.jpa.entity.TP8certType;
import org.holtz.jpa.util.HibernateUtil;

public class TP8certTypeDAOImpl implements TP8certTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TP8certTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TP8certType getCertTypeById(int id) {
		String queryString = "from TP8certType certType where certType.p8certTypeId = :id";
		TP8certType certType = new TP8certType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		certType = (TP8certType) query.uniqueResult();
		return certType;
	}

	@Override
	public TP8certType getCertTypeByName(String name) {
		String queryString = "from TP8certType certType where certType.p8certTypeTx like CONCAT('%',:name,'%')";
		TP8certType certType = new TP8certType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		certType = (TP8certType) query.uniqueResult();
		return certType;
	}

	@Override
	public List<TP8certType> getCertTypeList() {
		String queryString = "from TP8certType";
		List<TP8certType> certTypeList = new ArrayList<TP8certType>();
		query = session.createQuery(queryString);
		certTypeList = (List<TP8certType>)query.list();
		return certTypeList;
	}

	@Override
	public void save(TP8certType certType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TP8certType certType) {
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
