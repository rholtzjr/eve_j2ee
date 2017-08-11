package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TLgLanguageDAO;
import org.holtz.eve.jpa.entity.TLgLanguage;
import org.holtz.jpa.util.HibernateUtil;

public class TLgLanguageDAOImpl implements TLgLanguageDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TLgLanguageDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TLgLanguage getLanguageById(int id) {
		String queryString = "from TLgLanguage language where language.lgLanguageId = :id";
		TLgLanguage language = new TLgLanguage();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		language = (TLgLanguage) query.uniqueResult();
		return language;
	}

	@Override
	public TLgLanguage getLanguageByName(String name) {
		String queryString = "from TLgLanguage language where language.lgLanguageTx like CONCAT('%',:name,'%')";
		TLgLanguage language = new TLgLanguage();
		query = session.createQuery(queryString);
		query.setString("name", name);
		language = (TLgLanguage) query.uniqueResult();
		return language;
	}

	@Override
	public List<TLgLanguage> getLanguageList() {
		String queryString = "from TLgLanguage";
		List<TLgLanguage> languageList = new ArrayList<TLgLanguage>();
		query = session.createQuery(queryString);
		languageList = (List<TLgLanguage>)query.list();
		return languageList;
	}

	@Override
	public void save(TLgLanguage language) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TLgLanguage language) {
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
