package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTcTicketDAO;
import org.holtz.eve.jpa.entity.TTcTicket;
import org.holtz.jpa.util.HibernateUtil;

public class TTcTicketDAOImpl implements TTcTicketDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTcTicketDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTcTicket getTicketById(int id) {
		String queryString = "from TTcTicket ticket where ticket.tcTicketId = :id";
		TTcTicket ticket = new TTcTicket();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		ticket = (TTcTicket) query.uniqueResult();
		return ticket;
	}

	@Override
	public TTcTicket getTicketByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TTcTicket ticket where ticket.tcTicketId like CONCAT('%',:name,'%')";
//		TTcTicket ticket = new TTcTicket();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		ticket = (TTcTicket) query.uniqueResult();
//		return ticket;
	}

	@Override
	public List<TTcTicket> getTicketList() {
		String queryString = "from TTcTicket";
		List<TTcTicket> ticketList = new ArrayList<TTcTicket>();
		query = session.createQuery(queryString);
		ticketList = (List<TTcTicket>)query.list();
		return ticketList;
	}

	@Override
	public void save(TTcTicket ticket) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TTcTicket ticket) {
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
