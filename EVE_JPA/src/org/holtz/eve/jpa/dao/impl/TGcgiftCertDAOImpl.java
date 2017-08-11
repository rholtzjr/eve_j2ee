package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TGcgiftCertDAO;
import org.holtz.eve.jpa.entity.TGcgiftCert;
import org.holtz.eve.jpa.entity.TGcgiftCert;

public class TGcgiftCertDAOImpl implements TGcgiftCertDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TGcgiftCertDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TGcgiftCert getGiftCertById(int id) {
		String queryString = "from TGcgiftCert giftCert where giftCert.gcgiftCertId = :id";
		TGcgiftCert giftCert = new TGcgiftCert();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		giftCert = (TGcgiftCert) query.uniqueResult();
		return giftCert;
	}

	@Override
	public TGcgiftCert getGiftCertByName(String name) {
		String queryString = "from TGcgiftCert giftCert where giftCert.gcgiftCertNoTx like CONCAT('%',:name,'%')";
		TGcgiftCert giftCert = new TGcgiftCert();
		query = session.createQuery(queryString);
		query.setString("name", name);
		giftCert = (TGcgiftCert) query.uniqueResult();
		return giftCert;
	}

	@Override
	public List<TGcgiftCert> getGiftCertList() {
		String queryString = "from TGcgiftCert";
		List<TGcgiftCert> giftCertList = new ArrayList<TGcgiftCert>();
		query = session.createQuery(queryString);
		giftCertList = (List<TGcgiftCert>)query.list();
		return giftCertList;
	}

	@Override
	public void save(TGcgiftCert giftCert) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TGcgiftCert giftCert) {
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
