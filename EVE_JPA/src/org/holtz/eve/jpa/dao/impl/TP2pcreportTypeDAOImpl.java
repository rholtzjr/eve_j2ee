package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TP2pcreportTypeDAO;
import org.holtz.eve.jpa.entity.TP2pcreportType;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TP2pcreportType;

public class TP2pcreportTypeDAOImpl implements TP2pcreportTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TP2pcreportTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TP2pcreportType getPcreportTypeById(int id) {
		String queryString = "from TP2pcreportType pcreportType where pcreportType.id = :id";
		TP2pcreportType pcreportType = new TP2pcreportType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		pcreportType = (TP2pcreportType) query.uniqueResult();
		return pcreportType;
	}

	@Override
	public TP2pcreportType getPcreportTypeByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TP2pcreportType pcreportType where pcreportType.id like CONCAT('%',:name,'%')";
//		TP2pcreportType pcreportType = new TP2pcreportType();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		pcreportType = (TP2pcreportType) query.uniqueResult();
//		return pcreportType;
	}

	@Override
	public List<TP2pcreportType> getPcreportTypeList() {
		String queryString = "from TP2pcreportType";
		List<TP2pcreportType> pcreportTypeList = new ArrayList<TP2pcreportType>();
		query = session.createQuery(queryString);
		pcreportTypeList = (List<TP2pcreportType>)query.list();
		return pcreportTypeList;
	}

	@Override
	public void save(TP2pcreportType pcreportType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TP2pcreportType pcreportType) {
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
