package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TDcDocumentDAO;
import org.holtz.eve.jpa.entity.TDcDocument;
import org.holtz.eve.jpa.entity.TDcDocument;
import org.holtz.jpa.util.HibernateUtil;

public class TDcDocumentDAOImpl implements TDcDocumentDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TDcDocumentDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TDcDocument getDocumentById(int id) {
		String queryString = "from TDcDocument document where document.dcDocumentId = :id";
		TDcDocument document = new TDcDocument();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		document = (TDcDocument) query.uniqueResult();
		return document;
	}

	@Override
	public TDcDocument getDocumentByName(String name) {
		String queryString = "from TDcDocument document where document.dcDescriptionTx like CONCAT('%',:name,'%')";
		TDcDocument document = new TDcDocument();
		query = session.createQuery(queryString);
		query.setString("name", name);
		document = (TDcDocument) query.uniqueResult();
		return document;
	}

	@Override
	public List<TDcDocument> getDocumentList() {
		String queryString = "from TDcDocument";
		List<TDcDocument> documentList = new ArrayList<TDcDocument>();
		query = session.createQuery(queryString);
		documentList = (List<TDcDocument>)query.list();
		return documentList;
	}

	@Override
	public void save(TDcDocument document) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TDcDocument document) {
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
