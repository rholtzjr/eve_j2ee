package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TMaMessagingMailerDAO;
import org.holtz.eve.jpa.entity.TMaMessagingMailer;
import org.holtz.jpa.util.HibernateUtil;

public class TMaMessagingMailerDAOImpl implements TMaMessagingMailerDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TMaMessagingMailerDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TMaMessagingMailer getMessagingMailerById(int id) {
		String queryString = "from TMaMessagingMailer messagingMailer where messagingMailer.maMailerId = :id";
		TMaMessagingMailer messagingMailer = new TMaMessagingMailer();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		messagingMailer = (TMaMessagingMailer) query.uniqueResult();
		return messagingMailer;
	}

	@Override
	public TMaMessagingMailer getMessagingMailerByName(String name) {
		String queryString = "from TMaMessagingMailer messagingMailer where messagingMailer.maMailerNameTx like CONCAT('%',:name,'%')";
		TMaMessagingMailer messagingMailer = new TMaMessagingMailer();
		query = session.createQuery(queryString);
		query.setString("name", name);
		messagingMailer = (TMaMessagingMailer) query.uniqueResult();
		return messagingMailer;
	}

	@Override
	public List<TMaMessagingMailer> getMessagingMailerList() {
		String queryString = "from TMaMessagingMailer";
		List<TMaMessagingMailer> messagingMailerList = new ArrayList<TMaMessagingMailer>();
		query = session.createQuery(queryString);
		messagingMailerList = (List<TMaMessagingMailer>)query.list();
		return messagingMailerList;
	}

	@Override
	public void save(TMaMessagingMailer messagingMailer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TMaMessagingMailer messagingMailer) {
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
