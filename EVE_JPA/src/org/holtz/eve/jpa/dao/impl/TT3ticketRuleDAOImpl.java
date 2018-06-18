package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TT3ticketRuleDAO;
import org.holtz.eve.jpa.entity.TT3ticketRule;
import org.holtz.jpa.util.HibernateUtil;

public class TT3ticketRuleDAOImpl implements TT3ticketRuleDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TT3ticketRuleDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
		
	}

	@Override
	public TT3ticketRule getTicketRuleById(int id) {
		String queryString = "from TT3ticketRule ticketRule where ticketRule.t3ticketRuleId = :id";
		TT3ticketRule ticketRule = new TT3ticketRule();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		ticketRule = (TT3ticketRule) query.uniqueResult();
		return ticketRule;
	}

	@Override
	public TT3ticketRule getTicketRuleByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TT3ticketRule ticketRule where ticketRule.t3ticketRuleId like CONCAT('%',:name,'%')";
//		TT3ticketRule ticketRule = new TT3ticketRule();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		ticketRule = (TT3ticketRule) query.uniqueResult();
//		return ticketRule;
	}

	@Override
	public List<TT3ticketRule> getTicketRuleList() {
		String queryString = "from TT3ticketRule";
		List<TT3ticketRule> ticketRuleList = new ArrayList<TT3ticketRule>();
		query = session.createQuery(queryString);
		ticketRuleList = (List<TT3ticketRule>)query.list();
		return ticketRuleList;
	}

	@Override
	public void save(TT3ticketRule ticketRule) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TT3ticketRule ticketRule) {
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
