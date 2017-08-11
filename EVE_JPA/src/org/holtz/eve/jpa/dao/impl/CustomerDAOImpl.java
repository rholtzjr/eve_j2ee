package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.CustomerDAO;
import org.holtz.eve.jpa.entity.TCuCust;
import org.holtz.eve.jpa.entity.TEmEmp;
import org.holtz.jpa.util.HibernateUtil;

public class CustomerDAOImpl implements CustomerDAO {

	private SessionFactory sessionFactory;
	private Session session;
	
	private Query query;
	
	public CustomerDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCuCust getCustDataByUserName(String userName) {
		//userName is a contruct of first and last name  This will be mapped
		String queryString = "from TCuCust cust where cust.cuUserNameTxN like CONCAT('%',:userName,'%')";
		TCuCust customer = new TCuCust();
		query = session.createQuery(queryString);
		query.setString("userName", userName);
		customer = (TCuCust) query.uniqueResult();
		return customer;
	}

	@Override
	public TEmEmp getEmployeeDataByUserId(int id) {
		
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public TCuCust getCustDataByUserId(int id) {
		String queryString = "from TCuCust cust where cust.cuCustId = :id";
		TCuCust customer = new TCuCust();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		customer = (TCuCust) query.uniqueResult();
		return customer;

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TCuCust> getCustList() {
		String queryString = "from TCuCust";
		List<TCuCust> custList = new ArrayList<TCuCust>();
		query = session.createQuery(queryString);
		custList = (List<TCuCust>)query.list();
		return custList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TEmEmp> getEmpList() {
		String queryString = "from TEmEmp";
		List<TEmEmp> empList = new ArrayList<TEmEmp>();
		query = session.createQuery(queryString);
		empList = (List<TEmEmp>)query.list();
		return empList;
	}

	@Override
	public TEmEmp getEmployeeDataByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(TCuCust customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(TEmEmp employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TCuCust customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TEmEmp employee) {
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

	public Query getQuery() {
		return query;
	}

	public void setQuery(Query query) {
		this.query = query;
	}
}
