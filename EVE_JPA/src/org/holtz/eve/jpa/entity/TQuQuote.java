package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TQuQuote generated by hbm2java
 */
@Entity
@Table(name = "T_QuQuote")
public class TQuQuote implements java.io.Serializable {

	private int quQuoteId;
	private TTstransStatus TTstransStatus;
	private TPcpc TPcpc;
	private TCuCust TCuCust;
	private TEmEmp TEmEmp;
	private TSoStore TSoStore;
	private TCccostCenter TCccostCenter;
	private Date quCreationDate;
	private Date quExpiryDate;
	private Date quActualExpiryDateN;
	private double quSubTotalMn;
	private double quTaxMn;
	private short quCurrencyId;
	private float quExchangeRateFl;
	private Date quLastUpdatedDate;
	private String quNotesTxN;
	private Date quVoidDateN;
	private String quVoidReasonTxN;
	private Set<TQiquoteItem> TQiquoteItems = new HashSet<TQiquoteItem>(0);

	public TQuQuote() {
	}

	public TQuQuote(int quQuoteId, TTstransStatus TTstransStatus, TPcpc TPcpc, TCuCust TCuCust, TEmEmp TEmEmp,
			TSoStore TSoStore, TCccostCenter TCccostCenter, Date quCreationDate, Date quExpiryDate, double quSubTotalMn,
			double quTaxMn, short quCurrencyId, float quExchangeRateFl, Date quLastUpdatedDate) {
		this.quQuoteId = quQuoteId;
		this.TTstransStatus = TTstransStatus;
		this.TPcpc = TPcpc;
		this.TCuCust = TCuCust;
		this.TEmEmp = TEmEmp;
		this.TSoStore = TSoStore;
		this.TCccostCenter = TCccostCenter;
		this.quCreationDate = quCreationDate;
		this.quExpiryDate = quExpiryDate;
		this.quSubTotalMn = quSubTotalMn;
		this.quTaxMn = quTaxMn;
		this.quCurrencyId = quCurrencyId;
		this.quExchangeRateFl = quExchangeRateFl;
		this.quLastUpdatedDate = quLastUpdatedDate;
	}

	public TQuQuote(int quQuoteId, TTstransStatus TTstransStatus, TPcpc TPcpc, TCuCust TCuCust, TEmEmp TEmEmp,
			TSoStore TSoStore, TCccostCenter TCccostCenter, Date quCreationDate, Date quExpiryDate,
			Date quActualExpiryDateN, double quSubTotalMn, double quTaxMn, short quCurrencyId, float quExchangeRateFl,
			Date quLastUpdatedDate, String quNotesTxN, Date quVoidDateN, String quVoidReasonTxN,
			Set<TQiquoteItem> TQiquoteItems) {
		this.quQuoteId = quQuoteId;
		this.TTstransStatus = TTstransStatus;
		this.TPcpc = TPcpc;
		this.TCuCust = TCuCust;
		this.TEmEmp = TEmEmp;
		this.TSoStore = TSoStore;
		this.TCccostCenter = TCccostCenter;
		this.quCreationDate = quCreationDate;
		this.quExpiryDate = quExpiryDate;
		this.quActualExpiryDateN = quActualExpiryDateN;
		this.quSubTotalMn = quSubTotalMn;
		this.quTaxMn = quTaxMn;
		this.quCurrencyId = quCurrencyId;
		this.quExchangeRateFl = quExchangeRateFl;
		this.quLastUpdatedDate = quLastUpdatedDate;
		this.quNotesTxN = quNotesTxN;
		this.quVoidDateN = quVoidDateN;
		this.quVoidReasonTxN = quVoidReasonTxN;
		this.TQiquoteItems = TQiquoteItems;
	}

	@Id

	@Column(name = "QuQuoteID", unique = true, nullable = false)
	public int getQuQuoteId() {
		return this.quQuoteId;
	}

	public void setQuQuoteId(int quQuoteId) {
		this.quQuoteId = quQuoteId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QuTransStatusID", nullable = false)
	public TTstransStatus getTTstransStatus() {
		return this.TTstransStatus;
	}

	public void setTTstransStatus(TTstransStatus TTstransStatus) {
		this.TTstransStatus = TTstransStatus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QuPCID", nullable = false)
	public TPcpc getTPcpc() {
		return this.TPcpc;
	}

	public void setTPcpc(TPcpc TPcpc) {
		this.TPcpc = TPcpc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QuCustID", nullable = false)
	public TCuCust getTCuCust() {
		return this.TCuCust;
	}

	public void setTCuCust(TCuCust TCuCust) {
		this.TCuCust = TCuCust;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QuEmpID", nullable = false)
	public TEmEmp getTEmEmp() {
		return this.TEmEmp;
	}

	public void setTEmEmp(TEmEmp TEmEmp) {
		this.TEmEmp = TEmEmp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QuStoreID", nullable = false)
	public TSoStore getTSoStore() {
		return this.TSoStore;
	}

	public void setTSoStore(TSoStore TSoStore) {
		this.TSoStore = TSoStore;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QuCostCenterID", nullable = false)
	public TCccostCenter getTCccostCenter() {
		return this.TCccostCenter;
	}

	public void setTCccostCenter(TCccostCenter TCccostCenter) {
		this.TCccostCenter = TCccostCenter;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QuCreationDate", nullable = false, length = 23)
	public Date getQuCreationDate() {
		return this.quCreationDate;
	}

	public void setQuCreationDate(Date quCreationDate) {
		this.quCreationDate = quCreationDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QuExpiryDate", nullable = false, length = 23)
	public Date getQuExpiryDate() {
		return this.quExpiryDate;
	}

	public void setQuExpiryDate(Date quExpiryDate) {
		this.quExpiryDate = quExpiryDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QuActualExpiryDate_N", length = 23)
	public Date getQuActualExpiryDateN() {
		return this.quActualExpiryDateN;
	}

	public void setQuActualExpiryDateN(Date quActualExpiryDateN) {
		this.quActualExpiryDateN = quActualExpiryDateN;
	}

	@Column(name = "QuSubTotalMn", nullable = false, precision = 53, scale = 0)
	public double getQuSubTotalMn() {
		return this.quSubTotalMn;
	}

	public void setQuSubTotalMn(double quSubTotalMn) {
		this.quSubTotalMn = quSubTotalMn;
	}

	@Column(name = "QuTaxMn", nullable = false, precision = 53, scale = 0)
	public double getQuTaxMn() {
		return this.quTaxMn;
	}

	public void setQuTaxMn(double quTaxMn) {
		this.quTaxMn = quTaxMn;
	}

	@Column(name = "QuCurrencyID", nullable = false)
	public short getQuCurrencyId() {
		return this.quCurrencyId;
	}

	public void setQuCurrencyId(short quCurrencyId) {
		this.quCurrencyId = quCurrencyId;
	}

	@Column(name = "QuExchangeRateFl", nullable = false, precision = 24, scale = 0)
	public float getQuExchangeRateFl() {
		return this.quExchangeRateFl;
	}

	public void setQuExchangeRateFl(float quExchangeRateFl) {
		this.quExchangeRateFl = quExchangeRateFl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QuLastUpdatedDate", nullable = false, length = 23)
	public Date getQuLastUpdatedDate() {
		return this.quLastUpdatedDate;
	}

	public void setQuLastUpdatedDate(Date quLastUpdatedDate) {
		this.quLastUpdatedDate = quLastUpdatedDate;
	}

	@Column(name = "QuNotesTx_N")
	public String getQuNotesTxN() {
		return this.quNotesTxN;
	}

	public void setQuNotesTxN(String quNotesTxN) {
		this.quNotesTxN = quNotesTxN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QuVoidDate_N", length = 23)
	public Date getQuVoidDateN() {
		return this.quVoidDateN;
	}

	public void setQuVoidDateN(Date quVoidDateN) {
		this.quVoidDateN = quVoidDateN;
	}

	@Column(name = "QuVoidReasonTx_N")
	public String getQuVoidReasonTxN() {
		return this.quVoidReasonTxN;
	}

	public void setQuVoidReasonTxN(String quVoidReasonTxN) {
		this.quVoidReasonTxN = quVoidReasonTxN;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TQuQuote")
	public Set<TQiquoteItem> getTQiquoteItems() {
		return this.TQiquoteItems;
	}

	public void setTQiquoteItems(Set<TQiquoteItem> TQiquoteItems) {
		this.TQiquoteItems = TQiquoteItems;
	}

}
