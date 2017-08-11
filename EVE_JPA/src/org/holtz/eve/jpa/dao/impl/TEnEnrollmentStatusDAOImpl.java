package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TEnEnrollmentStatusDAO;
import org.holtz.eve.jpa.entity.TEnEnrollmentStatus;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TEnEnrollmentStatus;

public class TEnEnrollmentStatusDAOImpl implements TEnEnrollmentStatusDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TEnEnrollmentStatusDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TEnEnrollmentStatus getEnrollmentStatusById(int id) {
		String queryString = "from TEnEnrollmentStatus enrollmentStatus where enrollmentStatus.enEnrollmentStatusId = :id";
		TEnEnrollmentStatus enrollmentStatus = new TEnEnrollmentStatus();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		enrollmentStatus = (TEnEnrollmentStatus) query.uniqueResult();
		return enrollmentStatus;
	}

	@Override
	public TEnEnrollmentStatus getEnrollmentStatusByName(String name) {
		String queryString = "from TEnEnrollmentStatus enrollmentStatus where enrollmentStatus.enEnrollmentStatusTx like CONCAT('%',:name,'%')";
		TEnEnrollmentStatus enrollmentStatus = new TEnEnrollmentStatus();
		query = session.createQuery(queryString);
		query.setString("name", name);
		enrollmentStatus = (TEnEnrollmentStatus) query.uniqueResult();
		return enrollmentStatus;
	}

	@Override
	public List<TEnEnrollmentStatus> getEnrollmentStatusList() {
		String queryString = "from TEnEnrollmentStatus";
		List<TEnEnrollmentStatus> enrollmentStatusList = new ArrayList<TEnEnrollmentStatus>();
		query = session.createQuery(queryString);
		enrollmentStatusList = (List<TEnEnrollmentStatus>)query.list();
		return enrollmentStatusList;
	}

	@Override
	public void save(TEnEnrollmentStatus enrollmentStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TEnEnrollmentStatus enrollmentStatus) {
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
