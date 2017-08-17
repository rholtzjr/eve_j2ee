package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTrTransferDAO;
import org.holtz.eve.jpa.entity.TTrTransfer;
import org.holtz.jpa.util.HibernateUtil;

public class TTrTransferDAOImpl implements TTrTransferDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTrTransferDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTrTransfer getTransferById(int id) {
		String queryString = "from TTrTransfer transfer where transfer.trTransferId = :id";
		TTrTransfer transfer = new TTrTransfer();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		transfer = (TTrTransfer) query.uniqueResult();
		return transfer;
	}

	@Override
	public TTrTransfer getTransferByName(String name) {
		String queryString = "from TTrTransfer transfer where transfer.trNotesTxN like CONCAT('%',:name,'%')";
		TTrTransfer transfer = new TTrTransfer();
		query = session.createQuery(queryString);
		query.setString("name", name);
		transfer = (TTrTransfer) query.uniqueResult();
		return transfer;
	}

	@Override
	public List<TTrTransfer> getTransferList() {
		String queryString = "from TTrTransfer";
		List<TTrTransfer> transferList = new ArrayList<TTrTransfer>();
		query = session.createQuery(queryString);
		transferList = (List<TTrTransfer>)query.list();
		return transferList;
	}

	@Override
	public void save(TTrTransfer transfer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TTrTransfer transfer) {
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
