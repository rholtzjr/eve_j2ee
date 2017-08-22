package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTdTicketPcDAO;
import org.holtz.eve.jpa.entity.TTdTicketPc;
import org.holtz.jpa.util.HibernateUtil;

public class TTdTicketPcDAOImpl implements TTdTicketPcDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTdTicketPcDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTdTicketPc getTicketPcById(int id) {
		String queryString = "from TTdTicketPc ticketPc where ticketPc.id = :id";
		TTdTicketPc ticketPc = new TTdTicketPc();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		ticketPc = (TTdTicketPc) query.uniqueResult();
		return ticketPc;
	}

	@Override
	public TTdTicketPc getTicketPcByName(String name) {
		String queryString = "from TTdTicketPc ticketPc where ticketPc.id like CONCAT('%',:name,'%')";
		TTdTicketPc ticketPc = new TTdTicketPc();
		query = session.createQuery(queryString);
		query.setString("name", name);
		ticketPc = (TTdTicketPc) query.uniqueResult();
		return ticketPc;
	}

	@Override
	public List<TTdTicketPc> getTicketPcList() {
		String queryString = "from TTdTicketPc";
		List<TTdTicketPc> ticketPcList = new ArrayList<TTdTicketPc>();
		query = session.createQuery(queryString);
		ticketPcList = (List<TTdTicketPc>)query.list();
		return ticketPcList;
	}

	@Override
	public void save(TTdTicketPc ticketPc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TTdTicketPc ticketPc) {
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
