package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TAcAccount generated by hbm2java
 */
@Entity
@Table(name = "T_AcAccount")
public class TAcAccount implements java.io.Serializable {

	private int acAccountId;
	private TCccostCenter TCccostCenter;
	private TCuCust TCuCust;
	private TSoStore TSoStore;
	private TAtaccountType TAtaccountType;
	private String acAccountNameTx;
	private Date acCreationDate;
	private BigDecimal acCreditLimitMn;
	private Date acClosedDateN;
	private Date acLastUpdatedDate;
	private short acCurrencyId;
	private float acExchangeRateFl;
	private BigDecimal acBalanceMn;
	private Set<TInInvoice> TInInvoices = new HashSet<TInInvoice>(0);
	private Set<TPyPayment> TPyPayments = new HashSet<TPyPayment>(0);
	private Set<TCuCust> TCuCusts = new HashSet<TCuCust>(0);

	public TAcAccount() {
	}

	public TAcAccount(int acAccountId, TCccostCenter TCccostCenter, TCuCust TCuCust, TSoStore TSoStore,
			TAtaccountType TAtaccountType, String acAccountNameTx, Date acCreationDate,
			BigDecimal acCreditLimitMn, Date acLastUpdatedDate, short acCurrencyId, float acExchangeRateFl,
			BigDecimal acBalanceMn) {
		this.acAccountId = acAccountId;
		this.TCccostCenter = TCccostCenter;
		this.TCuCust = TCuCust;
		this.TSoStore = TSoStore;
		this.TAtaccountType = TAtaccountType;
		this.acAccountNameTx = acAccountNameTx;
		this.acCreationDate = acCreationDate;
		this.acCreditLimitMn = acCreditLimitMn;
		this.acLastUpdatedDate = acLastUpdatedDate;
		this.acCurrencyId = acCurrencyId;
		this.acExchangeRateFl = acExchangeRateFl;
		this.acBalanceMn = acBalanceMn;
	}

	public TAcAccount(int acAccountId, TCccostCenter TCccostCenter, TCuCust TCuCust, TSoStore TSoStore,
			TAtaccountType TAtaccountType, String acAccountNameTx, Date acCreationDate,
			BigDecimal acCreditLimitMn, Date acClosedDateN, Date acLastUpdatedDate, short acCurrencyId,
			float acExchangeRateFl, BigDecimal acBalanceMn, Set<TInInvoice> TInInvoices, Set<TPyPayment> TPyPayments,
			Set<TCuCust> TCuCusts) {
		this.acAccountId = acAccountId;
		this.TCccostCenter = TCccostCenter;
		this.TCuCust = TCuCust;
		this.TSoStore = TSoStore;
		this.TAtaccountType = TAtaccountType;
		this.acAccountNameTx = acAccountNameTx;
		this.acCreationDate = acCreationDate;
		this.acCreditLimitMn = acCreditLimitMn;
		this.acClosedDateN = acClosedDateN;
		this.acLastUpdatedDate = acLastUpdatedDate;
		this.acCurrencyId = acCurrencyId;
		this.acExchangeRateFl = acExchangeRateFl;
		this.acBalanceMn = acBalanceMn;
		this.TInInvoices = TInInvoices;
		this.TPyPayments = TPyPayments;
		this.TCuCusts = TCuCusts;
	}

	@Id

	@Column(name = "AcAccountID", unique = true, nullable = false)
	public int getAcAccountId() {
		return this.acAccountId;
	}

	public void setAcAccountId(int acAccountId) {
		this.acAccountId = acAccountId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AcCostCenterID", nullable = false)
	public TCccostCenter getTCccostCenter() {
		return this.TCccostCenter;
	}

	public void setTCccostCenter(TCccostCenter TCccostCenter) {
		this.TCccostCenter = TCccostCenter;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AcCustID", nullable = false)
	public TCuCust getTCuCust() {
		return this.TCuCust;
	}

	public void setTCuCust(TCuCust TCuCust) {
		this.TCuCust = TCuCust;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AcStoreID", nullable = false)
	public TSoStore getTSoStore() {
		return this.TSoStore;
	}

	public void setTSoStore(TSoStore TSoStore) {
		this.TSoStore = TSoStore;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AcAccountTypeID", nullable = false)
	public TAtaccountType getTAtaccountType() {
		return this.TAtaccountType;
	}

	public void setTAtaccountType(TAtaccountType TAtaccountType) {
		this.TAtaccountType = TAtaccountType;
	}

	@Column(name = "AcAccountNameTx", nullable = false)
	public String getAcAccountNameTx() {
		return this.acAccountNameTx;
	}

	public void setAcAccountNameTx(String acAccountNameTx) {
		this.acAccountNameTx = acAccountNameTx;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "AcCreationDate", nullable = false, length = 23)
	public Date getAcCreationDate() {
		return this.acCreationDate;
	}

	public void setAcCreationDate(Date acCreationDate) {
		this.acCreationDate = acCreationDate;
	}

	@Column(name = "AcCreditLimitMn", nullable = false, scale = 4)
	public BigDecimal getAcCreditLimitMn() {
		return this.acCreditLimitMn;
	}

	public void setAcCreditLimitMn(BigDecimal acCreditLimitMn) {
		this.acCreditLimitMn = acCreditLimitMn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "AcClosedDate_N", length = 23)
	public Date getAcClosedDateN() {
		return this.acClosedDateN;
	}

	public void setAcClosedDateN(Date acClosedDateN) {
		this.acClosedDateN = acClosedDateN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "AcLastUpdatedDate", nullable = false, length = 23)
	public Date getAcLastUpdatedDate() {
		return this.acLastUpdatedDate;
	}

	public void setAcLastUpdatedDate(Date acLastUpdatedDate) {
		this.acLastUpdatedDate = acLastUpdatedDate;
	}

	@Column(name = "AcCurrencyID", nullable = false)
	public short getAcCurrencyId() {
		return this.acCurrencyId;
	}

	public void setAcCurrencyId(short acCurrencyId) {
		this.acCurrencyId = acCurrencyId;
	}

	@Column(name = "AcExchangeRateFl", nullable = false, precision = 24, scale = 0)
	public float getAcExchangeRateFl() {
		return this.acExchangeRateFl;
	}

	public void setAcExchangeRateFl(float acExchangeRateFl) {
		this.acExchangeRateFl = acExchangeRateFl;
	}

	@Column(name = "AcBalanceMn", nullable = false, scale = 4)
	public BigDecimal getAcBalanceMn() {
		return this.acBalanceMn;
	}

	public void setAcBalanceMn(BigDecimal acBalanceMn) {
		this.acBalanceMn = acBalanceMn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TAcAccount")
	public Set<TInInvoice> getTInInvoices() {
		return this.TInInvoices;
	}

	public void setTInInvoices(Set<TInInvoice> TInInvoices) {
		this.TInInvoices = TInInvoices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TAcAccount")
	public Set<TPyPayment> getTPyPayments() {
		return this.TPyPayments;
	}

	public void setTPyPayments(Set<TPyPayment> TPyPayments) {
		this.TPyPayments = TPyPayments;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_C2CustAccount", joinColumns = {
			@JoinColumn(name = "C2AccountID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "C2CustID", nullable = false, updatable = false) })
	public Set<TCuCust> getTCuCusts() {
		return this.TCuCusts;
	}

	public void setTCuCusts(Set<TCuCust> TCuCusts) {
		this.TCuCusts = TCuCusts;
	}

}
