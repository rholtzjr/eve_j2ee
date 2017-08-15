package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPsPaymentProviderSettings;

public interface TPsPaymentProviderSettingsDAO {
	public TPsPaymentProviderSettings getPaymentProviderSettingsById(int id);
	public TPsPaymentProviderSettings getPaymentProviderSettingsByName(String name);
	public List<TPsPaymentProviderSettings> getPaymentProviderSettingsList();
	public void save(TPsPaymentProviderSettings paymentProviderSettings);
	public void delete(TPsPaymentProviderSettings paymentProviderSettings);
}
