package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTxTaxDAO;
import org.holtz.eve.jpa.entity.TTxTax;
import org.holtz.jpa.util.HibernateUtil;

public class TTxTaxDAOImpl implements TTxTaxDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTxTaxDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTxTax getTaxById(int id) {
		String queryString = "from TTxTax tax where tax.txTaxId = :id";
		TTxTax tax = new TTxTax();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		tax = (TTxTax) query.uniqueResult();
		return tax;
	}

	@Override
	public TTxTax getTaxByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TTxTax tax where tax.txTaxId like CONCAT('%',:name,'%')";
//		TTxTax tax = new TTxTax();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		tax = (TTxTax) query.uniqueResult();
//		return tax;
	}

	@Override
	public List<TTxTax> getTaxList() {
		String queryString = "from TTxTax";
		List<TTxTax> taxList = new ArrayList<TTxTax>();
		query = session.createQuery(queryString);
		taxList = (List<TTxTax>)query.list();
		return taxList;
	}

	@Override
	public void save(TTxTax tax) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TTxTax tax) {
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
