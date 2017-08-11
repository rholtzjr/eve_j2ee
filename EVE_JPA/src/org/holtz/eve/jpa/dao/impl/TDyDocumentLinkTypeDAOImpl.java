package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TDyDocumentLinkTypeDAO;
import org.holtz.eve.jpa.entity.TDyDocumentLinkType;
import org.holtz.eve.jpa.entity.TDyDocumentLinkType;
import org.holtz.jpa.util.HibernateUtil;

public class TDyDocumentLinkTypeDAOImpl implements TDyDocumentLinkTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TDyDocumentLinkTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TDyDocumentLinkType getDocumentLinkTypeById(int id) {
		String queryString = "from TDyDocumentLinkType documentLinkType where documentLinkType.dyDocumenLinkTypeId = :id";
		TDyDocumentLinkType documentLinkType = new TDyDocumentLinkType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		documentLinkType = (TDyDocumentLinkType) query.uniqueResult();
		return documentLinkType;
	}

	@Override
	public TDyDocumentLinkType getDocumentLinkTypeByName(String name) {
		String queryString = "from TDyDocumentLinkType documentLinkType where documentLinkType.dyDocumentLinkTypeTx like CONCAT('%',:name,'%')";
		TDyDocumentLinkType documentLinkType = new TDyDocumentLinkType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		documentLinkType = (TDyDocumentLinkType) query.uniqueResult();
		return documentLinkType;
	}

	@Override
	public List<TDyDocumentLinkType> getDocumentLinkTypeList() {
		String queryString = "from TDyDocumentLinkType";
		List<TDyDocumentLinkType> documentLinkTypeList = new ArrayList<TDyDocumentLinkType>();
		query = session.createQuery(queryString);
		documentLinkTypeList = (List<TDyDocumentLinkType>)query.list();
		return documentLinkTypeList;
	}

	@Override
	public void save(TDyDocumentLinkType documentLinkType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TDyDocumentLinkType documentLinkType) {
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
