package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTnTranslationDAO;
import org.holtz.eve.jpa.entity.TTnTranslation;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TTnTranslation;

public class TTnTranslationDAOImpl implements TTnTranslationDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTnTranslationDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTnTranslation getTranslationById(int id) {
		String queryString = "from TTnTranslation translation where translation.tnTranslationId = :id";
		TTnTranslation translation = new TTnTranslation();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		translation = (TTnTranslation) query.uniqueResult();
		return translation;
	}

	@Override
	public TTnTranslation getTranslationByName(String name) {
		String queryString = "from TTnTranslation translation where translation.tnTextTx like CONCAT('%',:name,'%')";
		TTnTranslation translation = new TTnTranslation();
		query = session.createQuery(queryString);
		query.setString("name", name);
		translation = (TTnTranslation) query.uniqueResult();
		return translation;
	}

	@Override
	public List<TTnTranslation> getTranslationList() {
		String queryString = "from TTnTranslation";
		List<TTnTranslation> translationList = new ArrayList<TTnTranslation>();
		query = session.createQuery(queryString);
		translationList = (List<TTnTranslation>)query.list();
		return translationList;
	}

	@Override
	public void save(TTnTranslation translation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TTnTranslation translation) {
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
