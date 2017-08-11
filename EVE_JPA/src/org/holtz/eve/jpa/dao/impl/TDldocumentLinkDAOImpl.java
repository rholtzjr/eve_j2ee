package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TDldocumentLinkDAO;
import org.holtz.eve.jpa.entity.TDldocumentLink;
import org.holtz.eve.jpa.entity.TDldocumentLink;

public class TDldocumentLinkDAOImpl implements TDldocumentLinkDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TDldocumentLinkDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TDldocumentLink getDocumentLinkById(int id) {
		String queryString = "from TDldocumentLink documentLink where documentLink.dldocumenLinkId = :id";
		TDldocumentLink documentLink = new TDldocumentLink();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		documentLink = (TDldocumentLink) query.uniqueResult();
		return documentLink;
	}

	@Override
	public TDldocumentLink getDocumentLinkByName(String name) {
		//NOOP
		return null;
		//		String queryString = "from TDldocumentLink documentLink where documentLink. like CONCAT('%',:name,'%')";
//		TDldocumentLink documentLink = new TDldocumentLink();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		documentLink = (TDldocumentLink) query.uniqueResult();
//		return documentLink;
	}

	@Override
	public List<TDldocumentLink> getDocumentLinkList() {
		String queryString = "from TDldocumentLink";
		List<TDldocumentLink> documentLinkList = new ArrayList<TDldocumentLink>();
		query = session.createQuery(queryString);
		documentLinkList = (List<TDldocumentLink>)query.list();
		return documentLinkList;
	}

	@Override
	public void save(TDldocumentLink documentLink) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TDldocumentLink documentLink) {
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
