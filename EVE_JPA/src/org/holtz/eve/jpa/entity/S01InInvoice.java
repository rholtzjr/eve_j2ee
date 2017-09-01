package org.holtz.eve.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the s01_InInvoice database table.
 * 
 */
@Entity
@Table(name="s01_InInvoice")
@NamedQuery(name="S01InInvoice.findAll", query="SELECT s FROM S01InInvoice s")
public class S01InInvoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="InAccountID_N", insertable=false, updatable=false)
	private Integer inAccountID_N;

	@Column(name="InBillingAddressId", insertable=false, updatable=false)
	private Integer inBillingAddressId;

	@Column(name="InClosedDate_N", insertable=false, updatable=false)
	private Timestamp inClosedDate_N;

	@Column(name="InCommissionableBl", insertable=false, updatable=false)
	private Boolean inCommissionableBl;

	@Column(name="InCommissionEmpID", insertable=false, updatable=false)
	private Integer inCommissionEmpID;

	@Column(name="InCommissionRateFl", insertable=false, updatable=false)
	private Float inCommissionRateFl;

	@Column(name="InCommittedDate_N", insertable=false, updatable=false)
	private Timestamp inCommittedDate_N;

	@Column(name="InCostCenterID", insertable=false, updatable=false)
	private Integer inCostCenterID;

	@Column(name="InCreationDate", insertable=false, updatable=false)
	private Timestamp inCreationDate;

	@Column(name="InCurrencyID", insertable=false, updatable=false)
	private Short inCurrencyID;

	@Column(name="InCustID", insertable=false, updatable=false)
	private Integer inCustID;

	@Column(name="InEmpID", insertable=false, updatable=false)
	private Integer inEmpID;

	@Column(name="InExchangeRateFl", insertable=false, updatable=false)
	private Float inExchangeRateFl;
	@Id
	@Column(name="InInvoiceID", insertable=false, updatable=false)
	private Integer inInvoiceID;

	@Column(name="InInvoiceNumberTx_N", insertable=false, updatable=false)
	private String inInvoiceNumberTx_N;

	@Column(name="InInvoiceTypeID", insertable=false, updatable=false)
	private Short inInvoiceTypeID;

	@Column(name="InLastUpdatedDate", insertable=false, updatable=false)
	private Timestamp inLastUpdatedDate;

	@Column(name="InLegacyAccPayAmountMn_N", insertable=false, updatable=false)
	private Double inLegacyAccPayAmountMn_N;

	@Column(name="InNotesTx_N", insertable=false, updatable=false)
	private String inNotesTx_N;

	@Column(name="InOrderStatusCodeIn_N", insertable=false, updatable=false)
	private Integer inOrderStatusCodeIn_N;

	@Column(name="InOrderStatusTx_N", insertable=false, updatable=false)
	private String inOrderStatusTx_N;

	@Column(name="InPaymentDueDate_N", insertable=false, updatable=false)
	private Timestamp inPaymentDueDate_N;

	@Column(name="InPCID", insertable=false, updatable=false)
	private Short inPCID;

	@Column(name="InPostageID", insertable=false, updatable=false)
	private Integer inPostageID;

	@Column(name="InProcessedBl", insertable=false, updatable=false)
	private Boolean inProcessedBl;

	@Column(name="InShipDate", insertable=false, updatable=false)
	private Timestamp inShipDate;

	@Column(name="InShippingAddressId", insertable=false, updatable=false)
	private Integer inShippingAddressId;

	@Column(name="InSourceID_N", insertable=false, updatable=false)
	private Integer inSourceID_N;

	@Column(name="InStockLevelsUpdatedBl", insertable=false, updatable=false)
	private Boolean inStockLevelsUpdatedBl;

	@Column(name="InStoreID", insertable=false, updatable=false)
	private Short inStoreID;

	@Column(name="InSubTotalMn", insertable=false, updatable=false)
	private Double inSubTotalMn;

	@Column(name="InTaxMn", insertable=false, updatable=false)
	private Double inTaxMn;

	@Column(name="InTicketNoTx_N", insertable=false, updatable=false)
	private String inTicketNoTx_N;

	@Column(name="InTransStatusID", insertable=false, updatable=false)
	private Integer inTransStatusID;

	@Column(name="InUserIPTx_N", insertable=false, updatable=false)
	private String inUserIPTx_N;

	@Column(name="InVoidDate_N", insertable=false, updatable=false)
	private Timestamp inVoidDate_N;

	@Column(name="InVoidReasonTx_N", insertable=false, updatable=false)
	private String inVoidReasonTx_N;

	public S01InInvoice() {
	}

	public Integer getInAccountID_N() {
		return this.inAccountID_N;
	}

	public void setInAccountID_N(Integer inAccountID_N) {
		this.inAccountID_N = inAccountID_N;
	}

	public Integer getInBillingAddressId() {
		return this.inBillingAddressId;
	}

	public void setInBillingAddressId(Integer inBillingAddressId) {
		this.inBillingAddressId = inBillingAddressId;
	}

	public Timestamp getInClosedDate_N() {
		return this.inClosedDate_N;
	}

	public void setInClosedDate_N(Timestamp inClosedDate_N) {
		this.inClosedDate_N = inClosedDate_N;
	}

	public Boolean getInCommissionableBl() {
		return this.inCommissionableBl;
	}

	public void setInCommissionableBl(Boolean inCommissionableBl) {
		this.inCommissionableBl = inCommissionableBl;
	}

	public Integer getInCommissionEmpID() {
		return this.inCommissionEmpID;
	}

	public void setInCommissionEmpID(Integer inCommissionEmpID) {
		this.inCommissionEmpID = inCommissionEmpID;
	}

	public Float getInCommissionRateFl() {
		return this.inCommissionRateFl;
	}

	public void setInCommissionRateFl(Float inCommissionRateFl) {
		this.inCommissionRateFl = inCommissionRateFl;
	}

	public Timestamp getInCommittedDate_N() {
		return this.inCommittedDate_N;
	}

	public void setInCommittedDate_N(Timestamp inCommittedDate_N) {
		this.inCommittedDate_N = inCommittedDate_N;
	}

	public Integer getInCostCenterID() {
		return this.inCostCenterID;
	}

	public void setInCostCenterID(Integer inCostCenterID) {
		this.inCostCenterID = inCostCenterID;
	}

	public Timestamp getInCreationDate() {
		return this.inCreationDate;
	}

	public void setInCreationDate(Timestamp inCreationDate) {
		this.inCreationDate = inCreationDate;
	}

	public Short getInCurrencyID() {
		return this.inCurrencyID;
	}

	public void setInCurrencyID(Short inCurrencyID) {
		this.inCurrencyID = inCurrencyID;
	}

	public Integer getInCustID() {
		return this.inCustID;
	}

	public void setInCustID(Integer inCustID) {
		this.inCustID = inCustID;
	}

	public Integer getInEmpID() {
		return this.inEmpID;
	}

	public void setInEmpID(Integer inEmpID) {
		this.inEmpID = inEmpID;
	}

	public Float getInExchangeRateFl() {
		return this.inExchangeRateFl;
	}

	public void setInExchangeRateFl(Float inExchangeRateFl) {
		this.inExchangeRateFl = inExchangeRateFl;
	}

	public Integer getInInvoiceID() {
		return this.inInvoiceID;
	}

	public void setInInvoiceID(Integer inInvoiceID) {
		this.inInvoiceID = inInvoiceID;
	}

	public String getInInvoiceNumberTx_N() {
		return this.inInvoiceNumberTx_N;
	}

	public void setInInvoiceNumberTx_N(String inInvoiceNumberTx_N) {
		this.inInvoiceNumberTx_N = inInvoiceNumberTx_N;
	}

	public Short getInInvoiceTypeID() {
		return this.inInvoiceTypeID;
	}

	public void setInInvoiceTypeID(Short inInvoiceTypeID) {
		this.inInvoiceTypeID = inInvoiceTypeID;
	}

	public Timestamp getInLastUpdatedDate() {
		return this.inLastUpdatedDate;
	}

	public void setInLastUpdatedDate(Timestamp inLastUpdatedDate) {
		this.inLastUpdatedDate = inLastUpdatedDate;
	}

	public Double getInLegacyAccPayAmountMn_N() {
		return this.inLegacyAccPayAmountMn_N;
	}

	public void setInLegacyAccPayAmountMn_N(Double inLegacyAccPayAmountMn_N) {
		this.inLegacyAccPayAmountMn_N = inLegacyAccPayAmountMn_N;
	}

	public String getInNotesTx_N() {
		return this.inNotesTx_N;
	}

	public void setInNotesTx_N(String inNotesTx_N) {
		this.inNotesTx_N = inNotesTx_N;
	}

	public Integer getInOrderStatusCodeIn_N() {
		return this.inOrderStatusCodeIn_N;
	}

	public void setInOrderStatusCodeIn_N(Integer inOrderStatusCodeIn_N) {
		this.inOrderStatusCodeIn_N = inOrderStatusCodeIn_N;
	}

	public String getInOrderStatusTx_N() {
		return this.inOrderStatusTx_N;
	}

	public void setInOrderStatusTx_N(String inOrderStatusTx_N) {
		this.inOrderStatusTx_N = inOrderStatusTx_N;
	}

	public Timestamp getInPaymentDueDate_N() {
		return this.inPaymentDueDate_N;
	}

	public void setInPaymentDueDate_N(Timestamp inPaymentDueDate_N) {
		this.inPaymentDueDate_N = inPaymentDueDate_N;
	}

	public Short getInPCID() {
		return this.inPCID;
	}

	public void setInPCID(Short inPCID) {
		this.inPCID = inPCID;
	}

	public Integer getInPostageID() {
		return this.inPostageID;
	}

	public void setInPostageID(Integer inPostageID) {
		this.inPostageID = inPostageID;
	}

	public Boolean getInProcessedBl() {
		return this.inProcessedBl;
	}

	public void setInProcessedBl(Boolean inProcessedBl) {
		this.inProcessedBl = inProcessedBl;
	}

	public Timestamp getInShipDate() {
		return this.inShipDate;
	}

	public void setInShipDate(Timestamp inShipDate) {
		this.inShipDate = inShipDate;
	}

	public Integer getInShippingAddressId() {
		return this.inShippingAddressId;
	}

	public void setInShippingAddressId(Integer inShippingAddressId) {
		this.inShippingAddressId = inShippingAddressId;
	}

	public Integer getInSourceID_N() {
		return this.inSourceID_N;
	}

	public void setInSourceID_N(Integer inSourceID_N) {
		this.inSourceID_N = inSourceID_N;
	}

	public Boolean getInStockLevelsUpdatedBl() {
		return this.inStockLevelsUpdatedBl;
	}

	public void setInStockLevelsUpdatedBl(Boolean inStockLevelsUpdatedBl) {
		this.inStockLevelsUpdatedBl = inStockLevelsUpdatedBl;
	}

	public Short getInStoreID() {
		return this.inStoreID;
	}

	public void setInStoreID(Short inStoreID) {
		this.inStoreID = inStoreID;
	}

	public Double getInSubTotalMn() {
		return this.inSubTotalMn;
	}

	public void setInSubTotalMn(Double inSubTotalMn) {
		this.inSubTotalMn = inSubTotalMn;
	}

	public Double getInTaxMn() {
		return this.inTaxMn;
	}

	public void setInTaxMn(Double inTaxMn) {
		this.inTaxMn = inTaxMn;
	}

	public String getInTicketNoTx_N() {
		return this.inTicketNoTx_N;
	}

	public void setInTicketNoTx_N(String inTicketNoTx_N) {
		this.inTicketNoTx_N = inTicketNoTx_N;
	}

	public Integer getInTransStatusID() {
		return this.inTransStatusID;
	}

	public void setInTransStatusID(Integer inTransStatusID) {
		this.inTransStatusID = inTransStatusID;
	}

	public String getInUserIPTx_N() {
		return this.inUserIPTx_N;
	}

	public void setInUserIPTx_N(String inUserIPTx_N) {
		this.inUserIPTx_N = inUserIPTx_N;
	}

	public Timestamp getInVoidDate_N() {
		return this.inVoidDate_N;
	}

	public void setInVoidDate_N(Timestamp inVoidDate_N) {
		this.inVoidDate_N = inVoidDate_N;
	}

	public String getInVoidReasonTx_N() {
		return this.inVoidReasonTx_N;
	}

	public void setInVoidReasonTx_N(String inVoidReasonTx_N) {
		this.inVoidReasonTx_N = inVoidReasonTx_N;
	}

}