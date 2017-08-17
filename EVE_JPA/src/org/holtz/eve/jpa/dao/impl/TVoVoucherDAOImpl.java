package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TVoVoucherDAO;
import org.holtz.eve.jpa.entity.TVoVoucher;
import org.holtz.jpa.util.HibernateUtil;

public class TVoVoucherDAOImpl implements TVoVoucherDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TVoVoucherDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TVoVoucher getVoucherById(int id) {
		String queryString = "from TVoVoucher voucher where voucher.voVoucherId = :id";
		TVoVoucher voucher = new TVoVoucher();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		voucher = (TVoVoucher) query.uniqueResult();
		return voucher;
	}

	@Override
	public TVoVoucher getVoucherByName(String name) {
		String queryString = "from TVoVoucher voucher where voucher.voNotesTxN like CONCAT('%',:name,'%')";
		TVoVoucher voucher = new TVoVoucher();
		query = session.createQuery(queryString);
		query.setString("name", name);
		voucher = (TVoVoucher) query.uniqueResult();
		return voucher;
	}

	@Override
	public List<TVoVoucher> getVoucherList() {
		String queryString = "from TVoVoucher";
		List<TVoVoucher> voucherList = new ArrayList<TVoVoucher>();
		query = session.createQuery(queryString);
		voucherList = (List<TVoVoucher>)query.list();
		return voucherList;
	}

	@Override
	public void save(TVoVoucher voucher) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TVoVoucher voucher) {
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
