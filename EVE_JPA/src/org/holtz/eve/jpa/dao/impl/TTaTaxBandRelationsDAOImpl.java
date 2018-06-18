package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTaTaxBandRelationsDAO;
import org.holtz.eve.jpa.entity.TTaTaxBandRelations;
import org.holtz.jpa.util.HibernateUtil;

public class TTaTaxBandRelationsDAOImpl implements TTaTaxBandRelationsDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTaTaxBandRelationsDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTaTaxBandRelations getTaxBandRelationsById(int id) {
		String queryString = "from TTaTaxBandRelations taxBandRelations where taxBandRelations.id = :id";
		TTaTaxBandRelations taxBandRelations = new TTaTaxBandRelations();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		taxBandRelations = (TTaTaxBandRelations) query.uniqueResult();
		return taxBandRelations;
	}

	@Override
	public TTaTaxBandRelations getTaxBandRelationsByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TTaTaxBandRelations taxBandRelations where taxBandRelations.id like CONCAT('%',:name,'%')";
//		TTaTaxBandRelations taxBandRelations = new TTaTaxBandRelations();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		taxBandRelations = (TTaTaxBandRelations) query.uniqueResult();
//		return taxBandRelations;
	}

	@Override
	public List<TTaTaxBandRelations> getTaxBandRelationsList() {
		String queryString = "from TTaTaxBandRelations";
		List<TTaTaxBandRelations> taxBandRelationsList = new ArrayList<TTaTaxBandRelations>();
		query = session.createQuery(queryString);
		taxBandRelationsList = (List<TTaTaxBandRelations>)query.list();
		return taxBandRelationsList;
	}

	@Override
	public void save(TTaTaxBandRelations taxBandRelations) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TTaTaxBandRelations taxBandRelations) {
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
