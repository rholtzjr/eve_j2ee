package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCnContactDAO;
import org.holtz.eve.jpa.entity.TCnContact;
import org.holtz.jpa.util.HibernateUtil;

public class TCnContactDAOImpl implements TCnContactDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;

	public TCnContactDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCnContact getContactById(int id) {
		String queryString = "from TCnContact contact where contact.cnContactId = :id";
		TCnContact contact = new TCnContact();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		contact = (TCnContact) query.uniqueResult();
		return contact;
	}

	@Override
	public TCnContact getContactByName(String name) {
		String queryString = "from TCnContact contact where contact.cnNotesTxN like CONCAT('%',:name,'%')";
		TCnContact contact = new TCnContact();
		query = session.createQuery(queryString);
		query.setString("name", name);
		contact = (TCnContact) query.uniqueResult();
		return contact;
	}

	@Override
	public List<TCnContact> getContactList() {
		String queryString = "from TCnContact";
		List<TCnContact> contactList = new ArrayList<TCnContact>();
		query = session.createQuery(queryString);
		contactList = (List<TCnContact>)query.list();
		return contactList;
	}

	@Override
	public void save(TCnContact contact) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCnContact contact) {
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
