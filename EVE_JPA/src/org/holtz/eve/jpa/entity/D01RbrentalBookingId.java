package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * D01RbrentalBookingId generated by hbm2java
 */
@Embeddable
public class D01RbrentalBookingId implements java.io.Serializable {

	private int rbrentalBookingId;
	private Integer rbinvoiceIdN;
	private short rbstoreId;
	private Integer rbcostCenterIdN;
	private int rbcustId;
	private Date rbcreationDate;
	private int rbempId;
	private BigDecimal rbbookingAmountMn;
	private BigDecimal rbbookingTaxMn;
	private short rbcurrencyId;
	private float rbexchangeRateFl;
	private Date rblastUpdatedDate;
	private String rbnotesTxN;
	private int rbstatusId;
	private Date rbvoidDateN;
	private String rbvoidReasonTxN;
	private Date rbdueStartDate;
	private Date rbdueEndDate;
	private Short rbbagNoInN;
	private boolean rbpenaltyBl;

	public D01RbrentalBookingId() {
	}

	public D01RbrentalBookingId(int rbrentalBookingId, short rbstoreId, int rbcustId, Date rbcreationDate, int rbempId,
			BigDecimal rbbookingAmountMn, BigDecimal rbbookingTaxMn, short rbcurrencyId, float rbexchangeRateFl,
			Date rblastUpdatedDate, int rbstatusId, Date rbdueStartDate, Date rbdueEndDate, boolean rbpenaltyBl) {
		this.rbrentalBookingId = rbrentalBookingId;
		this.rbstoreId = rbstoreId;
		this.rbcustId = rbcustId;
		this.rbcreationDate = rbcreationDate;
		this.rbempId = rbempId;
		this.rbbookingAmountMn = rbbookingAmountMn;
		this.rbbookingTaxMn = rbbookingTaxMn;
		this.rbcurrencyId = rbcurrencyId;
		this.rbexchangeRateFl = rbexchangeRateFl;
		this.rblastUpdatedDate = rblastUpdatedDate;
		this.rbstatusId = rbstatusId;
		this.rbdueStartDate = rbdueStartDate;
		this.rbdueEndDate = rbdueEndDate;
		this.rbpenaltyBl = rbpenaltyBl;
	}

	public D01RbrentalBookingId(int rbrentalBookingId, Integer rbinvoiceIdN, short rbstoreId, Integer rbcostCenterIdN,
			int rbcustId, Date rbcreationDate, int rbempId, BigDecimal rbbookingAmountMn, BigDecimal rbbookingTaxMn,
			short rbcurrencyId, float rbexchangeRateFl, Date rblastUpdatedDate, String rbnotesTxN, int rbstatusId,
			Date rbvoidDateN, String rbvoidReasonTxN, Date rbdueStartDate, Date rbdueEndDate, Short rbbagNoInN,
			boolean rbpenaltyBl) {
		this.rbrentalBookingId = rbrentalBookingId;
		this.rbinvoiceIdN = rbinvoiceIdN;
		this.rbstoreId = rbstoreId;
		this.rbcostCenterIdN = rbcostCenterIdN;
		this.rbcustId = rbcustId;
		this.rbcreationDate = rbcreationDate;
		this.rbempId = rbempId;
		this.rbbookingAmountMn = rbbookingAmountMn;
		this.rbbookingTaxMn = rbbookingTaxMn;
		this.rbcurrencyId = rbcurrencyId;
		this.rbexchangeRateFl = rbexchangeRateFl;
		this.rblastUpdatedDate = rblastUpdatedDate;
		this.rbnotesTxN = rbnotesTxN;
		this.rbstatusId = rbstatusId;
		this.rbvoidDateN = rbvoidDateN;
		this.rbvoidReasonTxN = rbvoidReasonTxN;
		this.rbdueStartDate = rbdueStartDate;
		this.rbdueEndDate = rbdueEndDate;
		this.rbbagNoInN = rbbagNoInN;
		this.rbpenaltyBl = rbpenaltyBl;
	}

	@Column(name = "RBRentalBookingID", nullable = false)
	public int getRbrentalBookingId() {
		return this.rbrentalBookingId;
	}

	public void setRbrentalBookingId(int rbrentalBookingId) {
		this.rbrentalBookingId = rbrentalBookingId;
	}

	@Column(name = "RBInvoiceID_N")
	public Integer getRbinvoiceIdN() {
		return this.rbinvoiceIdN;
	}

	public void setRbinvoiceIdN(Integer rbinvoiceIdN) {
		this.rbinvoiceIdN = rbinvoiceIdN;
	}

	@Column(name = "RBStoreID", nullable = false)
	public short getRbstoreId() {
		return this.rbstoreId;
	}

	public void setRbstoreId(short rbstoreId) {
		this.rbstoreId = rbstoreId;
	}

	@Column(name = "RBCostCenterID_N")
	public Integer getRbcostCenterIdN() {
		return this.rbcostCenterIdN;
	}

	public void setRbcostCenterIdN(Integer rbcostCenterIdN) {
		this.rbcostCenterIdN = rbcostCenterIdN;
	}

	@Column(name = "RBCustID", nullable = false)
	public int getRbcustId() {
		return this.rbcustId;
	}

	public void setRbcustId(int rbcustId) {
		this.rbcustId = rbcustId;
	}

	@Column(name = "RBCreationDate", nullable = false, length = 23)
	public Date getRbcreationDate() {
		return this.rbcreationDate;
	}

	public void setRbcreationDate(Date rbcreationDate) {
		this.rbcreationDate = rbcreationDate;
	}

	@Column(name = "RBEmpID", nullable = false)
	public int getRbempId() {
		return this.rbempId;
	}

	public void setRbempId(int rbempId) {
		this.rbempId = rbempId;
	}

	@Column(name = "RBBookingAmountMn", nullable = false, scale = 4)
	public BigDecimal getRbbookingAmountMn() {
		return this.rbbookingAmountMn;
	}

	public void setRbbookingAmountMn(BigDecimal rbbookingAmountMn) {
		this.rbbookingAmountMn = rbbookingAmountMn;
	}

	@Column(name = "RBBookingTaxMn", nullable = false, scale = 4)
	public BigDecimal getRbbookingTaxMn() {
		return this.rbbookingTaxMn;
	}

	public void setRbbookingTaxMn(BigDecimal rbbookingTaxMn) {
		this.rbbookingTaxMn = rbbookingTaxMn;
	}

	@Column(name = "RBCurrencyID", nullable = false)
	public short getRbcurrencyId() {
		return this.rbcurrencyId;
	}

	public void setRbcurrencyId(short rbcurrencyId) {
		this.rbcurrencyId = rbcurrencyId;
	}

	@Column(name = "RBExchangeRateFl", nullable = false, precision = 24, scale = 0)
	public float getRbexchangeRateFl() {
		return this.rbexchangeRateFl;
	}

	public void setRbexchangeRateFl(float rbexchangeRateFl) {
		this.rbexchangeRateFl = rbexchangeRateFl;
	}

	@Column(name = "RBLastUpdatedDate", nullable = false, length = 23)
	public Date getRblastUpdatedDate() {
		return this.rblastUpdatedDate;
	}

	public void setRblastUpdatedDate(Date rblastUpdatedDate) {
		this.rblastUpdatedDate = rblastUpdatedDate;
	}

	@Column(name = "RBNotesTx_N")
	public String getRbnotesTxN() {
		return this.rbnotesTxN;
	}

	public void setRbnotesTxN(String rbnotesTxN) {
		this.rbnotesTxN = rbnotesTxN;
	}

	@Column(name = "RBStatusID", nullable = false)
	public int getRbstatusId() {
		return this.rbstatusId;
	}

	public void setRbstatusId(int rbstatusId) {
		this.rbstatusId = rbstatusId;
	}

	@Column(name = "RBVoidDate_N", length = 23)
	public Date getRbvoidDateN() {
		return this.rbvoidDateN;
	}

	public void setRbvoidDateN(Date rbvoidDateN) {
		this.rbvoidDateN = rbvoidDateN;
	}

	@Column(name = "RBVoidReasonTx_N")
	public String getRbvoidReasonTxN() {
		return this.rbvoidReasonTxN;
	}

	public void setRbvoidReasonTxN(String rbvoidReasonTxN) {
		this.rbvoidReasonTxN = rbvoidReasonTxN;
	}

	@Column(name = "RBDueStartDate", nullable = false, length = 23)
	public Date getRbdueStartDate() {
		return this.rbdueStartDate;
	}

	public void setRbdueStartDate(Date rbdueStartDate) {
		this.rbdueStartDate = rbdueStartDate;
	}

	@Column(name = "RBDueEndDate", nullable = false, length = 23)
	public Date getRbdueEndDate() {
		return this.rbdueEndDate;
	}

	public void setRbdueEndDate(Date rbdueEndDate) {
		this.rbdueEndDate = rbdueEndDate;
	}

	@Column(name = "RBBagNoIn_N")
	public Short getRbbagNoInN() {
		return this.rbbagNoInN;
	}

	public void setRbbagNoInN(Short rbbagNoInN) {
		this.rbbagNoInN = rbbagNoInN;
	}

	@Column(name = "RBPenaltyBl", nullable = false)
	public boolean isRbpenaltyBl() {
		return this.rbpenaltyBl;
	}

	public void setRbpenaltyBl(boolean rbpenaltyBl) {
		this.rbpenaltyBl = rbpenaltyBl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof D01RbrentalBookingId))
			return false;
		D01RbrentalBookingId castOther = (D01RbrentalBookingId) other;

		return (this.getRbrentalBookingId() == castOther.getRbrentalBookingId())
				&& ((this.getRbinvoiceIdN() == castOther.getRbinvoiceIdN())
						|| (this.getRbinvoiceIdN() != null && castOther.getRbinvoiceIdN() != null
								&& this.getRbinvoiceIdN().equals(castOther.getRbinvoiceIdN())))
				&& (this.getRbstoreId() == castOther.getRbstoreId())
				&& ((this.getRbcostCenterIdN() == castOther.getRbcostCenterIdN())
						|| (this.getRbcostCenterIdN() != null && castOther.getRbcostCenterIdN() != null
								&& this.getRbcostCenterIdN().equals(castOther.getRbcostCenterIdN())))
				&& (this.getRbcustId() == castOther.getRbcustId())
				&& ((this.getRbcreationDate() == castOther.getRbcreationDate())
						|| (this.getRbcreationDate() != null && castOther.getRbcreationDate() != null
								&& this.getRbcreationDate().equals(castOther.getRbcreationDate())))
				&& (this.getRbempId() == castOther.getRbempId())
				&& ((this.getRbbookingAmountMn() == castOther.getRbbookingAmountMn())
						|| (this.getRbbookingAmountMn() != null && castOther.getRbbookingAmountMn() != null
								&& this.getRbbookingAmountMn().equals(castOther.getRbbookingAmountMn())))
				&& ((this.getRbbookingTaxMn() == castOther.getRbbookingTaxMn())
						|| (this.getRbbookingTaxMn() != null && castOther.getRbbookingTaxMn() != null
								&& this.getRbbookingTaxMn().equals(castOther.getRbbookingTaxMn())))
				&& (this.getRbcurrencyId() == castOther.getRbcurrencyId())
				&& (this.getRbexchangeRateFl() == castOther.getRbexchangeRateFl())
				&& ((this.getRblastUpdatedDate() == castOther.getRblastUpdatedDate())
						|| (this.getRblastUpdatedDate() != null && castOther.getRblastUpdatedDate() != null
								&& this.getRblastUpdatedDate().equals(castOther.getRblastUpdatedDate())))
				&& ((this.getRbnotesTxN() == castOther.getRbnotesTxN()) || (this.getRbnotesTxN() != null
						&& castOther.getRbnotesTxN() != null && this.getRbnotesTxN().equals(castOther.getRbnotesTxN())))
				&& (this.getRbstatusId() == castOther.getRbstatusId())
				&& ((this.getRbvoidDateN() == castOther.getRbvoidDateN())
						|| (this.getRbvoidDateN() != null && castOther.getRbvoidDateN() != null
								&& this.getRbvoidDateN().equals(castOther.getRbvoidDateN())))
				&& ((this.getRbvoidReasonTxN() == castOther.getRbvoidReasonTxN())
						|| (this.getRbvoidReasonTxN() != null && castOther.getRbvoidReasonTxN() != null
								&& this.getRbvoidReasonTxN().equals(castOther.getRbvoidReasonTxN())))
				&& ((this.getRbdueStartDate() == castOther.getRbdueStartDate())
						|| (this.getRbdueStartDate() != null && castOther.getRbdueStartDate() != null
								&& this.getRbdueStartDate().equals(castOther.getRbdueStartDate())))
				&& ((this.getRbdueEndDate() == castOther.getRbdueEndDate())
						|| (this.getRbdueEndDate() != null && castOther.getRbdueEndDate() != null
								&& this.getRbdueEndDate().equals(castOther.getRbdueEndDate())))
				&& ((this.getRbbagNoInN() == castOther.getRbbagNoInN()) || (this.getRbbagNoInN() != null
						&& castOther.getRbbagNoInN() != null && this.getRbbagNoInN().equals(castOther.getRbbagNoInN())))
				&& (this.isRbpenaltyBl() == castOther.isRbpenaltyBl());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRbrentalBookingId();
		result = 37 * result + (getRbinvoiceIdN() == null ? 0 : this.getRbinvoiceIdN().hashCode());
		result = 37 * result + this.getRbstoreId();
		result = 37 * result + (getRbcostCenterIdN() == null ? 0 : this.getRbcostCenterIdN().hashCode());
		result = 37 * result + this.getRbcustId();
		result = 37 * result + (getRbcreationDate() == null ? 0 : this.getRbcreationDate().hashCode());
		result = 37 * result + this.getRbempId();
		result = 37 * result + (getRbbookingAmountMn() == null ? 0 : this.getRbbookingAmountMn().hashCode());
		result = 37 * result + (getRbbookingTaxMn() == null ? 0 : this.getRbbookingTaxMn().hashCode());
		result = 37 * result + this.getRbcurrencyId();
		result = 37 * result + (int) this.getRbexchangeRateFl();
		result = 37 * result + (getRblastUpdatedDate() == null ? 0 : this.getRblastUpdatedDate().hashCode());
		result = 37 * result + (getRbnotesTxN() == null ? 0 : this.getRbnotesTxN().hashCode());
		result = 37 * result + this.getRbstatusId();
		result = 37 * result + (getRbvoidDateN() == null ? 0 : this.getRbvoidDateN().hashCode());
		result = 37 * result + (getRbvoidReasonTxN() == null ? 0 : this.getRbvoidReasonTxN().hashCode());
		result = 37 * result + (getRbdueStartDate() == null ? 0 : this.getRbdueStartDate().hashCode());
		result = 37 * result + (getRbdueEndDate() == null ? 0 : this.getRbdueEndDate().hashCode());
		result = 37 * result + (getRbbagNoInN() == null ? 0 : this.getRbbagNoInN().hashCode());
		result = 37 * result + (this.isRbpenaltyBl() ? 1 : 0);
		return result;
	}

}
