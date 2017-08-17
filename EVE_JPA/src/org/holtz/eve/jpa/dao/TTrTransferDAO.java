package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTrTransfer;

public interface TTrTransferDAO {

	public TTrTransfer getTransferById(int id);
	public TTrTransfer getTransferByName(String name);
	public List<TTrTransfer> getTransferList();
	public void save(TTrTransfer transfer);
	public void delete(TTrTransfer transfer);
}
