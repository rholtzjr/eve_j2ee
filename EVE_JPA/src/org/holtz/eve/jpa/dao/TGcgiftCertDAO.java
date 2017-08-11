package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TGcgiftCert;

public interface TGcgiftCertDAO {
	public TGcgiftCert getGiftCertById(int id);
	public TGcgiftCert getGiftCertByName(String name);
	public List<TGcgiftCert> getGiftCertList();
	public void save(TGcgiftCert giftCert);
	public void delete(TGcgiftCert giftCert);
}
