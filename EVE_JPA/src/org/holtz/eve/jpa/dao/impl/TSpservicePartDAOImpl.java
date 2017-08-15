package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSpservicePartDAO;
import org.holtz.eve.jpa.entity.TSpservicePart;
import org.holtz.jpa.util.HibernateUtil;

public class TSpservicePartDAOImpl implements TSpservicePartDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSpservicePartDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSpservicePart getServicePartById(int id) {
		String queryString = "from TSpservicePart servicePart where servicePart.spservicePartId = :id";
		TSpservicePart servicePart = new TSpservicePart();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		servicePart = (TSpservicePart) query.uniqueResult();
		return servicePart;
	}

	@Override
	public TSpservicePart getServicePartByName(String name) {
		String queryString = "from TSpservicePart servicePart where servicePart.spserialNoTxN like CONCAT('%',:name,'%')";
		TSpservicePart servicePart = new TSpservicePart();
		query = session.createQuery(queryString);
		query.setString("name", name);
		servicePart = (TSpservicePart) query.uniqueResult();
		return servicePart;
	}

	@Override
	public List<TSpservicePart> getServicePartList() {
		String queryString = "from TSpservicePart";
		List<TSpservicePart> servicePartList = new ArrayList<TSpservicePart>();
		query = session.createQuery(queryString);
		servicePartList = (List<TSpservicePart>)query.list();
		return servicePartList;
	}

	@Override
	public void save(TSpservicePart servicePart) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSpservicePart servicePart) {
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
