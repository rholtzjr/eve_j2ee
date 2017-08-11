package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.AddressDAO;
import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.eve.jpa.entity.TAdAddress;
import org.holtz.eve.jpa.entity.TCuCust;
import org.holtz.jpa.util.HibernateUtil;

public class AddressDAOImpl implements AddressDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public AddressDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	
	}

	@Override
	public TAdAddress getAddressById(int id) {
		String queryString = "from TAdAddress address where address.adAddressId = :id";
		TAdAddress address = new TAdAddress();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		address = (TAdAddress) query.uniqueResult();
		return address;
	}

	@Override
	public TAdAddress getAddressByName(String name) {
		String queryString = "from TAdAddress address where address.adAddressId like CONCAT('%',:name,'%')";
		TAdAddress address = new TAdAddress();
		query = session.createQuery(queryString);
		query.setString("name", name);
		address = (TAdAddress) query.uniqueResult();
		return address;
	}

	@Override
	public List<TAdAddress> getAddressList() {
		String queryString = "from TAdAddress";
		List<TAdAddress> addressList = new ArrayList<TAdAddress>();
		query = session.createQuery(queryString);
		addressList = (List<TAdAddress>)query.list();
		return addressList;
	}

	@Override
	public void save(TAdAddress account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TAdAddress account) {
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
