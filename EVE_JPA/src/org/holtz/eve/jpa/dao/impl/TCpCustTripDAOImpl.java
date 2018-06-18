package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCpCustTripDAO;
import org.holtz.eve.jpa.entity.TCpCustTrip;
import org.holtz.jpa.util.HibernateUtil;

public class TCpCustTripDAOImpl implements TCpCustTripDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCpCustTripDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCpCustTrip getCustTripById(int id) {
		String queryString = "from TCpCustTrip custtrip where custtrip.cpCustTripId = :id";
		TCpCustTrip custTrip = new TCpCustTrip();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		custTrip = (TCpCustTrip) query.uniqueResult();
		return custTrip;
	}

	@Override
	public TCpCustTrip getCustTripByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TCpCustTrip custtrip where custtrip. like CONCAT('%',:name,'%')";
//		TCpCustTrip custTrip = new TCpCustTrip();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		custTrip = (TCpCustTrip) query.uniqueResult();
//		return custTrip;
	}

	@Override
	public List<TCpCustTrip> getCustTripList() {
		String queryString = "from TCpCustTrip";
		List<TCpCustTrip> custTripList = new ArrayList<TCpCustTrip>();
		query = session.createQuery(queryString);
		custTripList = (List<TCpCustTrip>)query.list();
		return custTripList;
	}

	@Override
	public void save(TCpCustTrip custTrip) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCpCustTrip custTrip) {
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
