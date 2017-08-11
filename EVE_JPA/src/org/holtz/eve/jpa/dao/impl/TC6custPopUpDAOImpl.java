package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TC6custPopUpDAO;
import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.eve.jpa.entity.TC6custPopup;
import org.holtz.jpa.util.HibernateUtil;

public class TC6custPopUpDAOImpl implements TC6custPopUpDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TC6custPopUpDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TC6custPopup getCustPopUpById(int id) {
		String queryString = "from TC6custPopup custpopup where custpopup.c6custPopupId = :id";
		TC6custPopup custPopUp = new TC6custPopup();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		custPopUp = (TC6custPopup) query.uniqueResult();
		return custPopUp;
	}

	@Override
	public TC6custPopup getCustPopUpByName(String name) {
		// NOOP
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TC6custPopup> getCustPopUpList() {
		String queryString = "from TC6custPopup";
		List<TC6custPopup> custPopUpList = new ArrayList<TC6custPopup>();
		query = session.createQuery(queryString);
		custPopUpList = (List<TC6custPopup>)query.list();
		return custPopUpList;
	}

	@Override
	public void save(TC6custPopup account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TC6custPopup account) {
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
