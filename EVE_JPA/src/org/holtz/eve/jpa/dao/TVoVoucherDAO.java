package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TVoVoucher;

public interface TVoVoucherDAO {
	public TVoVoucher getVoucherById(int id);
	public TVoVoucher getVoucherByName(String name);
	public List<TVoVoucher> getVoucherList();
	public void save(TVoVoucher voucher);
	public void delete(TVoVoucher voucher);
}
