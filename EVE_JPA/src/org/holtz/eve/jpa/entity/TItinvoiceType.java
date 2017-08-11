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
 * TItinvoiceType generated by hbm2java
 */
@Entity
@Table(name = "T_ITInvoiceType")
public class TItinvoiceType implements java.io.Serializable {

	private short itinvoiceTypeId;
	private TRlreportLayout TRlreportLayout;
	private String itinvoiceTypeTx;
	private boolean itunavailableBl;
	private int itbaseTypeId;
	private boolean itrequiredBl;
	private boolean itexportToQbbl;
	private boolean itsavedLineItemsEditableBl;
	private boolean itlockedOnLoadBl;
	private boolean itinvoiceMustBalanceBl;
	private int itprintInvoiceIn;
	private int itnextTicketNoIn;
	private String itticketNoPrefixTxN;
	private boolean ittabVisUnpaidInvsUnsavedBl;
	private boolean ittabVisUnpaidInvsSavedBl;
	private boolean ittabVisPaidInvsUnsavedBl;
	private boolean ittabVisPaidInvsSavedBl;
	private boolean ittabVisPaymentsUnsavedBl;
	private boolean ittabVisPaymentsSavedBl;
	private boolean itconvertPromptBl;
	private int itrecordAsAsaleIn;
	private boolean itupdateDatesWhenConvertedBl;
	private boolean itupdateStockLevelsBl;
	private boolean itshowChangeBl;
	private String itchangeTextTxN;
	private Boolean itassignLoyaltyCreditBl;
	private Integer itrefundInvoiceTypeIdN;
	private Integer italtInvoiceTypeIdN;
	private String italtConditionTxN;
	private Set<TInInvoice> TInInvoices = new HashSet<TInInvoice>(0);
	private Set<TIsinvoiceTypeStore> TIsinvoiceTypeStores = new HashSet<TIsinvoiceTypeStore>(0);

	public TItinvoiceType() {
	}

	public TItinvoiceType(short itinvoiceTypeId, TRlreportLayout TRlreportLayout, String itinvoiceTypeTx,
			boolean itunavailableBl, int itbaseTypeId, boolean itrequiredBl, boolean itexportToQbbl,
			boolean itsavedLineItemsEditableBl, boolean itlockedOnLoadBl, boolean itinvoiceMustBalanceBl,
			int itprintInvoiceIn, int itnextTicketNoIn, boolean ittabVisUnpaidInvsUnsavedBl,
			boolean ittabVisUnpaidInvsSavedBl, boolean ittabVisPaidInvsUnsavedBl, boolean ittabVisPaidInvsSavedBl,
			boolean ittabVisPaymentsUnsavedBl, boolean ittabVisPaymentsSavedBl, boolean itconvertPromptBl,
			int itrecordAsAsaleIn, boolean itupdateDatesWhenConvertedBl, boolean itupdateStockLevelsBl,
			boolean itshowChangeBl) {
		this.itinvoiceTypeId = itinvoiceTypeId;
		this.TRlreportLayout = TRlreportLayout;
		this.itinvoiceTypeTx = itinvoiceTypeTx;
		this.itunavailableBl = itunavailableBl;
		this.itbaseTypeId = itbaseTypeId;
		this.itrequiredBl = itrequiredBl;
		this.itexportToQbbl = itexportToQbbl;
		this.itsavedLineItemsEditableBl = itsavedLineItemsEditableBl;
		this.itlockedOnLoadBl = itlockedOnLoadBl;
		this.itinvoiceMustBalanceBl = itinvoiceMustBalanceBl;
		this.itprintInvoiceIn = itprintInvoiceIn;
		this.itnextTicketNoIn = itnextTicketNoIn;
		this.ittabVisUnpaidInvsUnsavedBl = ittabVisUnpaidInvsUnsavedBl;
		this.ittabVisUnpaidInvsSavedBl = ittabVisUnpaidInvsSavedBl;
		this.ittabVisPaidInvsUnsavedBl = ittabVisPaidInvsUnsavedBl;
		this.ittabVisPaidInvsSavedBl = ittabVisPaidInvsSavedBl;
		this.ittabVisPaymentsUnsavedBl = ittabVisPaymentsUnsavedBl;
		this.ittabVisPaymentsSavedBl = ittabVisPaymentsSavedBl;
		this.itconvertPromptBl = itconvertPromptBl;
		this.itrecordAsAsaleIn = itrecordAsAsaleIn;
		this.itupdateDatesWhenConvertedBl = itupdateDatesWhenConvertedBl;
		this.itupdateStockLevelsBl = itupdateStockLevelsBl;
		this.itshowChangeBl = itshowChangeBl;
	}

	public TItinvoiceType(short itinvoiceTypeId, TRlreportLayout TRlreportLayout, String itinvoiceTypeTx,
			boolean itunavailableBl, int itbaseTypeId, boolean itrequiredBl, boolean itexportToQbbl,
			boolean itsavedLineItemsEditableBl, boolean itlockedOnLoadBl, boolean itinvoiceMustBalanceBl,
			int itprintInvoiceIn, int itnextTicketNoIn, String itticketNoPrefixTxN,
			boolean ittabVisUnpaidInvsUnsavedBl, boolean ittabVisUnpaidInvsSavedBl, boolean ittabVisPaidInvsUnsavedBl,
			boolean ittabVisPaidInvsSavedBl, boolean ittabVisPaymentsUnsavedBl, boolean ittabVisPaymentsSavedBl,
			boolean itconvertPromptBl, int itrecordAsAsaleIn, boolean itupdateDatesWhenConvertedBl,
			boolean itupdateStockLevelsBl, boolean itshowChangeBl, String itchangeTextTxN,
			Boolean itassignLoyaltyCreditBl, Integer itrefundInvoiceTypeIdN, Integer italtInvoiceTypeIdN,
			String italtConditionTxN, Set<TInInvoice> TInInvoices,
			Set<TIsinvoiceTypeStore> TIsinvoiceTypeStores) {
		this.itinvoiceTypeId = itinvoiceTypeId;
		this.TRlreportLayout = TRlreportLayout;
		this.itinvoiceTypeTx = itinvoiceTypeTx;
		this.itunavailableBl = itunavailableBl;
		this.itbaseTypeId = itbaseTypeId;
		this.itrequiredBl = itrequiredBl;
		this.itexportToQbbl = itexportToQbbl;
		this.itsavedLineItemsEditableBl = itsavedLineItemsEditableBl;
		this.itlockedOnLoadBl = itlockedOnLoadBl;
		this.itinvoiceMustBalanceBl = itinvoiceMustBalanceBl;
		this.itprintInvoiceIn = itprintInvoiceIn;
		this.itnextTicketNoIn = itnextTicketNoIn;
		this.itticketNoPrefixTxN = itticketNoPrefixTxN;
		this.ittabVisUnpaidInvsUnsavedBl = ittabVisUnpaidInvsUnsavedBl;
		this.ittabVisUnpaidInvsSavedBl = ittabVisUnpaidInvsSavedBl;
		this.ittabVisPaidInvsUnsavedBl = ittabVisPaidInvsUnsavedBl;
		this.ittabVisPaidInvsSavedBl = ittabVisPaidInvsSavedBl;
		this.ittabVisPaymentsUnsavedBl = ittabVisPaymentsUnsavedBl;
		this.ittabVisPaymentsSavedBl = ittabVisPaymentsSavedBl;
		this.itconvertPromptBl = itconvertPromptBl;
		this.itrecordAsAsaleIn = itrecordAsAsaleIn;
		this.itupdateDatesWhenConvertedBl = itupdateDatesWhenConvertedBl;
		this.itupdateStockLevelsBl = itupdateStockLevelsBl;
		this.itshowChangeBl = itshowChangeBl;
		this.itchangeTextTxN = itchangeTextTxN;
		this.itassignLoyaltyCreditBl = itassignLoyaltyCreditBl;
		this.itrefundInvoiceTypeIdN = itrefundInvoiceTypeIdN;
		this.italtInvoiceTypeIdN = italtInvoiceTypeIdN;
		this.italtConditionTxN = italtConditionTxN;
		this.TInInvoices = TInInvoices;
		this.TIsinvoiceTypeStores = TIsinvoiceTypeStores;
	}

	@Id

	@Column(name = "ITInvoiceTypeID", unique = true, nullable = false)
	public short getItinvoiceTypeId() {
		return this.itinvoiceTypeId;
	}

	public void setItinvoiceTypeId(short itinvoiceTypeId) {
		this.itinvoiceTypeId = itinvoiceTypeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITReportLayoutID", nullable = false)
	public TRlreportLayout getTRlreportLayout() {
		return this.TRlreportLayout;
	}

	public void setTRlreportLayout(TRlreportLayout TRlreportLayout) {
		this.TRlreportLayout = TRlreportLayout;
	}

	@Column(name = "ITInvoiceTypeTx", nullable = false)
	public String getItinvoiceTypeTx() {
		return this.itinvoiceTypeTx;
	}

	public void setItinvoiceTypeTx(String itinvoiceTypeTx) {
		this.itinvoiceTypeTx = itinvoiceTypeTx;
	}

	@Column(name = "ITUnavailableBl", nullable = false)
	public boolean isItunavailableBl() {
		return this.itunavailableBl;
	}

	public void setItunavailableBl(boolean itunavailableBl) {
		this.itunavailableBl = itunavailableBl;
	}

	@Column(name = "ITBaseTypeID", nullable = false)
	public int getItbaseTypeId() {
		return this.itbaseTypeId;
	}

	public void setItbaseTypeId(int itbaseTypeId) {
		this.itbaseTypeId = itbaseTypeId;
	}

	@Column(name = "ITRequiredBl", nullable = false)
	public boolean isItrequiredBl() {
		return this.itrequiredBl;
	}

	public void setItrequiredBl(boolean itrequiredBl) {
		this.itrequiredBl = itrequiredBl;
	}

	@Column(name = "ITExportToQBBl", nullable = false)
	public boolean isItexportToQbbl() {
		return this.itexportToQbbl;
	}

	public void setItexportToQbbl(boolean itexportToQbbl) {
		this.itexportToQbbl = itexportToQbbl;
	}

	@Column(name = "ITSavedLineItemsEditableBl", nullable = false)
	public boolean isItsavedLineItemsEditableBl() {
		return this.itsavedLineItemsEditableBl;
	}

	public void setItsavedLineItemsEditableBl(boolean itsavedLineItemsEditableBl) {
		this.itsavedLineItemsEditableBl = itsavedLineItemsEditableBl;
	}

	@Column(name = "ITLockedOnLoadBl", nullable = false)
	public boolean isItlockedOnLoadBl() {
		return this.itlockedOnLoadBl;
	}

	public void setItlockedOnLoadBl(boolean itlockedOnLoadBl) {
		this.itlockedOnLoadBl = itlockedOnLoadBl;
	}

	@Column(name = "ITInvoiceMustBalanceBl", nullable = false)
	public boolean isItinvoiceMustBalanceBl() {
		return this.itinvoiceMustBalanceBl;
	}

	public void setItinvoiceMustBalanceBl(boolean itinvoiceMustBalanceBl) {
		this.itinvoiceMustBalanceBl = itinvoiceMustBalanceBl;
	}

	@Column(name = "ITPrintInvoiceIn", nullable = false)
	public int getItprintInvoiceIn() {
		return this.itprintInvoiceIn;
	}

	public void setItprintInvoiceIn(int itprintInvoiceIn) {
		this.itprintInvoiceIn = itprintInvoiceIn;
	}

	@Column(name = "ITNextTicketNoIn", nullable = false)
	public int getItnextTicketNoIn() {
		return this.itnextTicketNoIn;
	}

	public void setItnextTicketNoIn(int itnextTicketNoIn) {
		this.itnextTicketNoIn = itnextTicketNoIn;
	}

	@Column(name = "ITTicketNoPrefixTx_N")
	public String getItticketNoPrefixTxN() {
		return this.itticketNoPrefixTxN;
	}

	public void setItticketNoPrefixTxN(String itticketNoPrefixTxN) {
		this.itticketNoPrefixTxN = itticketNoPrefixTxN;
	}

	@Column(name = "ITTabVisUnpaidInvsUnsavedBl", nullable = false)
	public boolean isIttabVisUnpaidInvsUnsavedBl() {
		return this.ittabVisUnpaidInvsUnsavedBl;
	}

	public void setIttabVisUnpaidInvsUnsavedBl(boolean ittabVisUnpaidInvsUnsavedBl) {
		this.ittabVisUnpaidInvsUnsavedBl = ittabVisUnpaidInvsUnsavedBl;
	}

	@Column(name = "ITTabVisUnpaidInvsSavedBl", nullable = false)
	public boolean isIttabVisUnpaidInvsSavedBl() {
		return this.ittabVisUnpaidInvsSavedBl;
	}

	public void setIttabVisUnpaidInvsSavedBl(boolean ittabVisUnpaidInvsSavedBl) {
		this.ittabVisUnpaidInvsSavedBl = ittabVisUnpaidInvsSavedBl;
	}

	@Column(name = "ITTabVisPaidInvsUnsavedBl", nullable = false)
	public boolean isIttabVisPaidInvsUnsavedBl() {
		return this.ittabVisPaidInvsUnsavedBl;
	}

	public void setIttabVisPaidInvsUnsavedBl(boolean ittabVisPaidInvsUnsavedBl) {
		this.ittabVisPaidInvsUnsavedBl = ittabVisPaidInvsUnsavedBl;
	}

	@Column(name = "ITTabVisPaidInvsSavedBl", nullable = false)
	public boolean isIttabVisPaidInvsSavedBl() {
		return this.ittabVisPaidInvsSavedBl;
	}

	public void setIttabVisPaidInvsSavedBl(boolean ittabVisPaidInvsSavedBl) {
		this.ittabVisPaidInvsSavedBl = ittabVisPaidInvsSavedBl;
	}

	@Column(name = "ITTabVisPaymentsUnsavedBl", nullable = false)
	public boolean isIttabVisPaymentsUnsavedBl() {
		return this.ittabVisPaymentsUnsavedBl;
	}

	public void setIttabVisPaymentsUnsavedBl(boolean ittabVisPaymentsUnsavedBl) {
		this.ittabVisPaymentsUnsavedBl = ittabVisPaymentsUnsavedBl;
	}

	@Column(name = "ITTabVisPaymentsSavedBl", nullable = false)
	public boolean isIttabVisPaymentsSavedBl() {
		return this.ittabVisPaymentsSavedBl;
	}

	public void setIttabVisPaymentsSavedBl(boolean ittabVisPaymentsSavedBl) {
		this.ittabVisPaymentsSavedBl = ittabVisPaymentsSavedBl;
	}

	@Column(name = "ITConvertPromptBl", nullable = false)
	public boolean isItconvertPromptBl() {
		return this.itconvertPromptBl;
	}

	public void setItconvertPromptBl(boolean itconvertPromptBl) {
		this.itconvertPromptBl = itconvertPromptBl;
	}

	@Column(name = "ITRecordAsASaleIn", nullable = false)
	public int getItrecordAsAsaleIn() {
		return this.itrecordAsAsaleIn;
	}

	public void setItrecordAsAsaleIn(int itrecordAsAsaleIn) {
		this.itrecordAsAsaleIn = itrecordAsAsaleIn;
	}

	@Column(name = "ITUpdateDatesWhenConvertedBl", nullable = false)
	public boolean isItupdateDatesWhenConvertedBl() {
		return this.itupdateDatesWhenConvertedBl;
	}

	public void setItupdateDatesWhenConvertedBl(boolean itupdateDatesWhenConvertedBl) {
		this.itupdateDatesWhenConvertedBl = itupdateDatesWhenConvertedBl;
	}

	@Column(name = "ITUpdateStockLevelsBl", nullable = false)
	public boolean isItupdateStockLevelsBl() {
		return this.itupdateStockLevelsBl;
	}

	public void setItupdateStockLevelsBl(boolean itupdateStockLevelsBl) {
		this.itupdateStockLevelsBl = itupdateStockLevelsBl;
	}

	@Column(name = "ITShowChangeBl", nullable = false)
	public boolean isItshowChangeBl() {
		return this.itshowChangeBl;
	}

	public void setItshowChangeBl(boolean itshowChangeBl) {
		this.itshowChangeBl = itshowChangeBl;
	}

	@Column(name = "ITChangeTextTx_N")
	public String getItchangeTextTxN() {
		return this.itchangeTextTxN;
	}

	public void setItchangeTextTxN(String itchangeTextTxN) {
		this.itchangeTextTxN = itchangeTextTxN;
	}

	@Column(name = "ITAssignLoyaltyCreditBl")
	public Boolean getItassignLoyaltyCreditBl() {
		return this.itassignLoyaltyCreditBl;
	}

	public void setItassignLoyaltyCreditBl(Boolean itassignLoyaltyCreditBl) {
		this.itassignLoyaltyCreditBl = itassignLoyaltyCreditBl;
	}

	@Column(name = "ITRefundInvoiceTypeID_N")
	public Integer getItrefundInvoiceTypeIdN() {
		return this.itrefundInvoiceTypeIdN;
	}

	public void setItrefundInvoiceTypeIdN(Integer itrefundInvoiceTypeIdN) {
		this.itrefundInvoiceTypeIdN = itrefundInvoiceTypeIdN;
	}

	@Column(name = "ITAltInvoiceTypeID_N")
	public Integer getItaltInvoiceTypeIdN() {
		return this.italtInvoiceTypeIdN;
	}

	public void setItaltInvoiceTypeIdN(Integer italtInvoiceTypeIdN) {
		this.italtInvoiceTypeIdN = italtInvoiceTypeIdN;
	}

	@Column(name = "ITAltConditionTx_N")
	public String getItaltConditionTxN() {
		return this.italtConditionTxN;
	}

	public void setItaltConditionTxN(String italtConditionTxN) {
		this.italtConditionTxN = italtConditionTxN;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TItinvoiceType")
	public Set<TInInvoice> getTInInvoices() {
		return this.TInInvoices;
	}

	public void setTInInvoices(Set<TInInvoice> TInInvoices) {
		this.TInInvoices = TInInvoices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TItinvoiceType")
	public Set<TIsinvoiceTypeStore> getTIsinvoiceTypeStores() {
		return this.TIsinvoiceTypeStores;
	}

	public void setTIsinvoiceTypeStores(Set<TIsinvoiceTypeStore> TIsinvoiceTypeStores) {
		this.TIsinvoiceTypeStores = TIsinvoiceTypeStores;
	}

}
