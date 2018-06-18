package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTbtaxBandDAO;
import org.holtz.eve.jpa.entity.TTbtaxBand;
import org.holtz.jpa.util.HibernateUtil;

public class TTbtaxBandDAOImpl implements TTbtaxBandDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTbtaxBandDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTbtaxBand getTaxBandById(int id) {
		String queryString = "from TTbtaxBand taxBand where taxBand.tbtaxBandId = :id";
		TTbtaxBand taxBand = new TTbtaxBand();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		taxBand = (TTbtaxBand) query.uniqueResult();
		return taxBand;
	}

	@Override
	public TTbtaxBand getTaxBandByName(String name) {
		String queryString = "from TTbtaxBand taxBand where taxBand.tbtaxBandTx like CONCAT('%',:name,'%')";
		TTbtaxBand taxBand = new TTbtaxBand();
		query = session.createQuery(queryString);
		query.setString("name", name);
		taxBand = (TTbtaxBand) query.uniqueResult();
		return taxBand;
	}

	@Override
	public List<TTbtaxBand> getTaxBandList() {
		String queryString = "from TTbtaxBand";
		List<TTbtaxBand> taxBandList = new ArrayList<TTbtaxBand>();
		query = session.createQuery(queryString);
		taxBandList = (List<TTbtaxBand>)query.list();
		return taxBandList;
	}

	@Override
	public void save(TTbtaxBand taxBand) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TTbtaxBand taxBand) {
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
