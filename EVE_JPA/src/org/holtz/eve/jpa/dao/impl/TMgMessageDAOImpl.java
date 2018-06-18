package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TMgMessageDAO;
import org.holtz.eve.jpa.entity.TMgMessage;

public class TMgMessageDAOImpl implements TMgMessageDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TMgMessageDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TMgMessage getMessageById(int id) {
		String queryString = "from TMgMessage message where message.mgMessageId = :id";
		TMgMessage message = new TMgMessage();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		message = (TMgMessage) query.uniqueResult();
		return message;
	}

	@Override
	public TMgMessage getMessageByName(String name) {
		String queryString = "from TMgMessage message where message.mgMessageTx like CONCAT('%',:name,'%')";
		TMgMessage message = new TMgMessage();
		query = session.createQuery(queryString);
		query.setString("name", name);
		message = (TMgMessage) query.uniqueResult();
		return message;
	}

	@Override
	public List<TMgMessage> getMessageList() {
		String queryString = "from TMgMessage";
		List<TMgMessage> messageList = new ArrayList<TMgMessage>();
		query = session.createQuery(queryString);
		messageList = (List<TMgMessage>)query.list();
		return messageList;
	}

	@Override
	public void save(TMgMessage message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TMgMessage message) {
		// TODO Auto-generated method stub

	}

	public SessionFactory getSessionFactory() {
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
