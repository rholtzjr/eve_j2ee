package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TPpPaymentProvider generated by hbm2java
 */
@Entity
@Table(name = "T_PpPaymentProvider")
public class TPpPaymentProvider implements java.io.Serializable {

	private int ppPaymentProviderId;
	private TPmpaymentMethod TPmpaymentMethod;
	private TSoStore TSoStore;
	private String ppNameTx;
	private String ppTypeNameTx;
	private boolean ppIsActiveBl;
	private int ppOnlineProcessorId;
	private String ppCheckoutHeaderText;
	private String ppCheckoutMessage;
	private Set<TPsPaymentProviderSettings> TPsPaymentProviderSettingses = new HashSet<TPsPaymentProviderSettings>(0);
	private Set<TPyPayment> TPyPayments = new HashSet<TPyPayment>(0);

	public TPpPaymentProvider() {
	}

	public TPpPaymentProvider(int ppPaymentProviderId, String ppNameTx, String ppTypeNameTx, boolean ppIsActiveBl,
			int ppOnlineProcessorId) {
		this.ppPaymentProviderId = ppPaymentProviderId;
		this.ppNameTx = ppNameTx;
		this.ppTypeNameTx = ppTypeNameTx;
		this.ppIsActiveBl = ppIsActiveBl;
		this.ppOnlineProcessorId = ppOnlineProcessorId;
	}

	public TPpPaymentProvider(int ppPaymentProviderId, TPmpaymentMethod TPmpaymentMethod, TSoStore TSoStore,
			String ppNameTx, String ppTypeNameTx, boolean ppIsActiveBl, int ppOnlineProcessorId,
			String ppCheckoutHeaderText, String ppCheckoutMessage,
			Set<TPsPaymentProviderSettings> TPsPaymentProviderSettingses, Set<TPyPayment> TPyPayments) {
		this.ppPaymentProviderId = ppPaymentProviderId;
		this.TPmpaymentMethod = TPmpaymentMethod;
		this.TSoStore = TSoStore;
		this.ppNameTx = ppNameTx;
		this.ppTypeNameTx = ppTypeNameTx;
		this.ppIsActiveBl = ppIsActiveBl;
		this.ppOnlineProcessorId = ppOnlineProcessorId;
		this.ppCheckoutHeaderText = ppCheckoutHeaderText;
		this.ppCheckoutMessage = ppCheckoutMessage;
		this.TPsPaymentProviderSettingses = TPsPaymentProviderSettingses;
		this.TPyPayments = TPyPayments;
	}

	@Id

	@Column(name = "PpPaymentProviderId", unique = true, nullable = false)
	public int getPpPaymentProviderId() {
		return this.ppPaymentProviderId;
	}

	public void setPpPaymentProviderId(int ppPaymentProviderId) {
		this.ppPaymentProviderId = ppPaymentProviderId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PpPaymentMethodId_N")
	public TPmpaymentMethod getTPmpaymentMethod() {
		return this.TPmpaymentMethod;
	}

	public void setTPmpaymentMethod(TPmpaymentMethod TPmpaymentMethod) {
		this.TPmpaymentMethod = TPmpaymentMethod;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PpStoreId")
	public TSoStore getTSoStore() {
		return this.TSoStore;
	}

	public void setTSoStore(TSoStore TSoStore) {
		this.TSoStore = TSoStore;
	}

	@Column(name = "PpNameTx", nullable = false, length = 100)
	public String getPpNameTx() {
		return this.ppNameTx;
	}

	public void setPpNameTx(String ppNameTx) {
		this.ppNameTx = ppNameTx;
	}

	@Column(name = "PpTypeNameTx", nullable = false, length = 300)
	public String getPpTypeNameTx() {
		return this.ppTypeNameTx;
	}

	public void setPpTypeNameTx(String ppTypeNameTx) {
		this.ppTypeNameTx = ppTypeNameTx;
	}

	@Column(name = "PpIsActiveBl", nullable = false)
	public boolean isPpIsActiveBl() {
		return this.ppIsActiveBl;
	}

	public void setPpIsActiveBl(boolean ppIsActiveBl) {
		this.ppIsActiveBl = ppIsActiveBl;
	}

	@Column(name = "PpOnlineProcessorId", nullable = false)
	public int getPpOnlineProcessorId() {
		return this.ppOnlineProcessorId;
	}

	public void setPpOnlineProcessorId(int ppOnlineProcessorId) {
		this.ppOnlineProcessorId = ppOnlineProcessorId;
	}

	@Column(name = "PpCheckoutHeaderText")
	public String getPpCheckoutHeaderText() {
		return this.ppCheckoutHeaderText;
	}

	public void setPpCheckoutHeaderText(String ppCheckoutHeaderText) {
		this.ppCheckoutHeaderText = ppCheckoutHeaderText;
	}

	@Column(name = "PpCheckoutMessage")
	public String getPpCheckoutMessage() {
		return this.ppCheckoutMessage;
	}

	public void setPpCheckoutMessage(String ppCheckoutMessage) {
		this.ppCheckoutMessage = ppCheckoutMessage;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TPpPaymentProvider")
	public Set<TPsPaymentProviderSettings> getTPsPaymentProviderSettingses() {
		return this.TPsPaymentProviderSettingses;
	}

	public void setTPsPaymentProviderSettingses(Set<TPsPaymentProviderSettings> TPsPaymentProviderSettingses) {
		this.TPsPaymentProviderSettingses = TPsPaymentProviderSettingses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TPpPaymentProvider")
	public Set<TPyPayment> getTPyPayments() {
		return this.TPyPayments;
	}

	public void setTPyPayments(Set<TPyPayment> TPyPayments) {
		this.TPyPayments = TPyPayments;
	}

}
