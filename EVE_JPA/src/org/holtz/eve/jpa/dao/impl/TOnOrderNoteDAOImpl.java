package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TOnOrderNoteDAO;
import org.holtz.eve.jpa.entity.TOnOrderNote;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TOnOrderNote;

public class TOnOrderNoteDAOImpl implements TOnOrderNoteDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TOnOrderNoteDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TOnOrderNote getOrderNoteById(int id) {
		String queryString = "from TOnOrderNote orderNote where orderNote.acAccountId = :id";
		TOnOrderNote orderNote = new TOnOrderNote();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		orderNote = (TOnOrderNote) query.uniqueResult();
		return orderNote;
	}

	@Override
	public TOnOrderNote getOrderNoteByName(String name) {
		String queryString = "from TOnOrderNote orderNote where orderNote.acAccountNameTx like CONCAT('%',:name,'%')";
		TOnOrderNote orderNote = new TOnOrderNote();
		query = session.createQuery(queryString);
		query.setString("name", name);
		orderNote = (TOnOrderNote) query.uniqueResult();
		return orderNote;
	}

	@Override
	public List<TOnOrderNote> getOrderNoteList() {
		String queryString = "from TOnOrderNote";
		List<TOnOrderNote> orderNoteList = new ArrayList<TOnOrderNote>();
		query = session.createQuery(queryString);
		orderNoteList = (List<TOnOrderNote>)query.list();
		return orderNoteList;
	}

	@Override
	public void save(TOnOrderNote orderNote) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TOnOrderNote orderNote) {
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
