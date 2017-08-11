package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TEtempTripDAO;
import org.holtz.eve.jpa.entity.TEtempTrip;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TEtempTrip;

public class TEtempTripDAOImpl implements TEtempTripDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TEtempTripDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TEtempTrip getEmpTripById(int id) {
		String queryString = "from TEtempTrip empTrip where empTrip.etempTripId = :id";
		TEtempTrip empTrip = new TEtempTrip();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		empTrip = (TEtempTrip) query.uniqueResult();
		return empTrip;
	}

	@Override
	public TEtempTrip getEmpTripByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TEtempTrip empTrip where empTrip.etempTripId like CONCAT('%',:name,'%')";
//		TEtempTrip empTrip = new TEtempTrip();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		empTrip = (TEtempTrip) query.uniqueResult();
//		return empTrip;
	}

	@Override
	public List<TEtempTrip> getEmpTripList() {
		String queryString = "from TEtempTrip";
		List<TEtempTrip> empTripList = new ArrayList<TEtempTrip>();
		query = session.createQuery(queryString);
		empTripList = (List<TEtempTrip>)query.list();
		return empTripList;
	}

	@Override
	public void save(TEtempTrip empTrip) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TEtempTrip empTrip) {
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
