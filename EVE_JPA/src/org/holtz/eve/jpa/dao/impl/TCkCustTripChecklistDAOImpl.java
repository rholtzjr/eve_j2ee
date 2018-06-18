package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCkCustTripChecklistDAO;
import org.holtz.eve.jpa.entity.TCkCustTripChecklist;
import org.holtz.jpa.util.HibernateUtil;

public class TCkCustTripChecklistDAOImpl implements TCkCustTripChecklistDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCkCustTripChecklistDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCkCustTripChecklist getChecklistById(int id) {
		String queryString = "from TCkCustTripChecklist checklist where checklist.id = :id";
		TCkCustTripChecklist checklist = new TCkCustTripChecklist();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		checklist = (TCkCustTripChecklist) query.uniqueResult();
		return checklist;
	}

	@Override
	public TCkCustTripChecklist getChecklistByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TCkCustTripChecklist checklist where checklist.id like CONCAT('%',:name,'%')";
//		TCkCustTripChecklist checklist = new TCkCustTripChecklist();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		checklist = (TCkCustTripChecklist) query.uniqueResult();
//		return checklist;
	}

	@Override
	public List<TCkCustTripChecklist> getChecklistList() {
		String queryString = "from TAcAccount";
		List<TCkCustTripChecklist> checklistList = new ArrayList<TCkCustTripChecklist>();
		query = session.createQuery(queryString);
		checklistList = (List<TCkCustTripChecklist>)query.list();
		return checklistList;
	}

	@Override
	public void save(TCkCustTripChecklist checklist) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCkCustTripChecklist checklist) {
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
