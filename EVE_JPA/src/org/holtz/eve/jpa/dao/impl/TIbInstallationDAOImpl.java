package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TIbInstallationDAO;
import org.holtz.eve.jpa.entity.TIbInstallation;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TIbInstallation;

public class TIbInstallationDAOImpl implements TIbInstallationDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TIbInstallationDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TIbInstallation getInstallationById(int id) {
		String queryString = "from TIbInstallation installation where installation.ibInstallationId = :id";
		TIbInstallation installation = new TIbInstallation();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		installation = (TIbInstallation) query.uniqueResult();
		return installation;
	}

	@Override
	public TIbInstallation getInstallationByName(String name) {
		String queryString = "from TIbInstallation installation where installation.ibInstallationTx like CONCAT('%',:name,'%')";
		TIbInstallation installation = new TIbInstallation();
		query = session.createQuery(queryString);
		query.setString("name", name);
		installation = (TIbInstallation) query.uniqueResult();
		return installation;
	}

	@Override
	public List<TIbInstallation> getInstallationList() {
		String queryString = "from TIbInstallation";
		List<TIbInstallation> installationList = new ArrayList<TIbInstallation>();
		query = session.createQuery(queryString);
		installationList = (List<TIbInstallation>)query.list();
		return installationList;
	}

	@Override
	public void save(TIbInstallation installation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TIbInstallation installation) {
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
