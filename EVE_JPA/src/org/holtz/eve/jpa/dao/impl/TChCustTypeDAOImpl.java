package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TChCustTypeDAO;
import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.eve.jpa.entity.TChCustType;
import org.holtz.jpa.util.HibernateUtil;

public class TChCustTypeDAOImpl implements TChCustTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TChCustTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TChCustType getCustTypeById(int id) {
		String queryString = "from TChCustType custtype where custtype.chCustTypeId = :id";
		TChCustType custType = new TChCustType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		custType = (TChCustType) query.uniqueResult();
		return custType;
	}

	@Override
	public TChCustType getCustTypeByName(String name) {
		String queryString = "from TAcAccount account where account.acAccountNameTx like CONCAT('%',:name,'%')";
		TChCustType custType = new TChCustType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		custType = (TChCustType) query.uniqueResult();
		return custType;
	}

	@Override
	public List<TChCustType> getCustTypeList() {
		String queryString = "from TAcAccount";
		List<TChCustType> custTypeList = new ArrayList<TChCustType>();
		query = session.createQuery(queryString);
		custTypeList = (List<TChCustType>)query.list();
		return custTypeList;
	}

	@Override
	public void save(TChCustType custType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TChCustType custType) {
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
