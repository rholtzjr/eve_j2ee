package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TQtqualificationTypeDAO;
import org.holtz.eve.jpa.entity.TQtqualificationType;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TQtqualificationType;

public class TQtqualificationTypeDAOImpl implements TQtqualificationTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TQtqualificationTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TQtqualificationType getQualificationTypeById(int id) {
		String queryString = "from TQtqualificationType qualificationType where qualificationType.qtqualificationTypeId = :id";
		TQtqualificationType qualificationType = new TQtqualificationType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		qualificationType = (TQtqualificationType) query.uniqueResult();
		return qualificationType;
	}

	@Override
	public TQtqualificationType getQualificationTypeByName(String name) {
		String queryString = "from TQtqualificationType qualificationType where qualificationType.qtqualificationTypeTx like CONCAT('%',:name,'%')";
		TQtqualificationType qualificationType = new TQtqualificationType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		qualificationType = (TQtqualificationType) query.uniqueResult();
		return qualificationType;
	}

	@Override
	public List<TQtqualificationType> getQualificationTypeList() {
		String queryString = "from TQtqualificationType";
		List<TQtqualificationType> qualificationTypeList = new ArrayList<TQtqualificationType>();
		query = session.createQuery(queryString);
		qualificationTypeList = (List<TQtqualificationType>)query.list();
		return qualificationTypeList;
	}

	@Override
	public void save(TQtqualificationType qualificationType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TQtqualificationType qualificationType) {
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
