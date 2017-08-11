package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TDnDenominationDAO;
import org.holtz.eve.jpa.entity.TDnDenomination;
import org.holtz.eve.jpa.entity.TDnDenomination;

public class TDnDenominationDAOImpl implements TDnDenominationDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TDnDenominationDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TDnDenomination getDenominationById(int id) {
		String queryString = "from TDnDenomination denomination where denomination.dnDenominationId = :id";
		TDnDenomination denomination = new TDnDenomination();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		denomination = (TDnDenomination) query.uniqueResult();
		return denomination;
	}

	@Override
	public TDnDenomination getDenominationByName(String name) {
		String queryString = "from TDnDenomination denomination where denomination.dnDescriptionTx like CONCAT('%',:name,'%')";
		TDnDenomination denomination = new TDnDenomination();
		query = session.createQuery(queryString);
		query.setString("name", name);
		denomination = (TDnDenomination) query.uniqueResult();
		return denomination;
	}

	@Override
	public List<TDnDenomination> getDenominationList() {
		String queryString = "from TDnDenomination";
		List<TDnDenomination> denominationList = new ArrayList<TDnDenomination>();
		query = session.createQuery(queryString);
		denominationList = (List<TDnDenomination>)query.list();
		return denominationList;
	}

	@Override
	public void save(TDnDenomination denomination) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TDnDenomination denomination) {
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
