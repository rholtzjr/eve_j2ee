package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPsPaymentProviderSettingsDAO;
import org.holtz.eve.jpa.entity.TPsPaymentProviderSettings;
import org.holtz.jpa.util.HibernateUtil;

public class TPsPaymentProviderSettingsDAOImpl implements TPsPaymentProviderSettingsDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPsPaymentProviderSettingsDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPsPaymentProviderSettings getPaymentProviderSettingsById(int id) {
		String queryString = "from TPsPaymentProviderSettings paymentProviderSettings where paymentProviderSettings.psPaymentProviderSettingId = :id";
		TPsPaymentProviderSettings paymentProviderSettings = new TPsPaymentProviderSettings();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		paymentProviderSettings = (TPsPaymentProviderSettings) query.uniqueResult();
		return paymentProviderSettings;
	}

	@Override
	public TPsPaymentProviderSettings getPaymentProviderSettingsByName(String name) {
		String queryString = "from TPsPaymentProviderSettings paymentProviderSettings where paymentProviderSettings.psSettingName like CONCAT('%',:name,'%')";
		TPsPaymentProviderSettings paymentProviderSettings = new TPsPaymentProviderSettings();
		query = session.createQuery(queryString);
		query.setString("name", name);
		paymentProviderSettings = (TPsPaymentProviderSettings) query.uniqueResult();
		return paymentProviderSettings;
	}

	@Override
	public List<TPsPaymentProviderSettings> getPaymentProviderSettingsList() {
		String queryString = "from TPsPaymentProviderSettings";
		List<TPsPaymentProviderSettings> paymentProviderSettingsList = new ArrayList<TPsPaymentProviderSettings>();
		query = session.createQuery(queryString);
		paymentProviderSettingsList = (List<TPsPaymentProviderSettings>)query.list();
		return paymentProviderSettingsList;
	}

	@Override
	public void save(TPsPaymentProviderSettings paymentProviderSettings) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPsPaymentProviderSettings paymentProviderSettings) {
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
