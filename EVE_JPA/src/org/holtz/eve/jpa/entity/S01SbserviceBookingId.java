package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * S01SbserviceBookingId generated by hbm2java
 */
@Embeddable
public class S01SbserviceBookingId implements java.io.Serializable {

	private int sbserviceBookingId;
	private Integer sbinvoiceIdN;
	private short sbstoreId;
	private int sbcostCenterId;
	private int sbcustId;
	private Date sbcreationDate;
	private int sbempId;
	private short sbcurrencyId;
	private float sbexchangeRateFl;
	private Date sblastUpdatedDate;
	private String sbnotesTxN;
	private int sbstatusId;
	private Date sbvoidDateN;
	private String sbvoidReasonTxN;
	private BigDecimal sbpartsAmountMn;
	private BigDecimal sbpartTaxMn;
	private BigDecimal sbbookingLaborMn;
	private BigDecimal sbbookingLaborTaxMn;
	private BigDecimal sbbookingHandlingMn;
	private BigDecimal sbbookingHandlingTaxMn;
	private Date sbdueStartDate;
	private Date sbdueEndDate;
	private Integer sbticketNoInN;

	public S01SbserviceBookingId() {
	}

	public S01SbserviceBookingId(int sbserviceBookingId, short sbstoreId, int sbcostCenterId, int sbcustId,
			Date sbcreationDate, int sbempId, short sbcurrencyId, float sbexchangeRateFl, Date sblastUpdatedDate,
			int sbstatusId, BigDecimal sbpartsAmountMn, BigDecimal sbpartTaxMn, BigDecimal sbbookingLaborMn,
			BigDecimal sbbookingLaborTaxMn, BigDecimal sbbookingHandlingMn, BigDecimal sbbookingHandlingTaxMn,
			Date sbdueStartDate, Date sbdueEndDate) {
		this.sbserviceBookingId = sbserviceBookingId;
		this.sbstoreId = sbstoreId;
		this.sbcostCenterId = sbcostCenterId;
		this.sbcustId = sbcustId;
		this.sbcreationDate = sbcreationDate;
		this.sbempId = sbempId;
		this.sbcurrencyId = sbcurrencyId;
		this.sbexchangeRateFl = sbexchangeRateFl;
		this.sblastUpdatedDate = sblastUpdatedDate;
		this.sbstatusId = sbstatusId;
		this.sbpartsAmountMn = sbpartsAmountMn;
		this.sbpartTaxMn = sbpartTaxMn;
		this.sbbookingLaborMn = sbbookingLaborMn;
		this.sbbookingLaborTaxMn = sbbookingLaborTaxMn;
		this.sbbookingHandlingMn = sbbookingHandlingMn;
		this.sbbookingHandlingTaxMn = sbbookingHandlingTaxMn;
		this.sbdueStartDate = sbdueStartDate;
		this.sbdueEndDate = sbdueEndDate;
	}

	public S01SbserviceBookingId(int sbserviceBookingId, Integer sbinvoiceIdN, short sbstoreId, int sbcostCenterId,
			int sbcustId, Date sbcreationDate, int sbempId, short sbcurrencyId, float sbexchangeRateFl,
			Date sblastUpdatedDate, String sbnotesTxN, int sbstatusId, Date sbvoidDateN,
			String sbvoidReasonTxN, BigDecimal sbpartsAmountMn, BigDecimal sbpartTaxMn,
			BigDecimal sbbookingLaborMn, BigDecimal sbbookingLaborTaxMn, BigDecimal sbbookingHandlingMn,
			BigDecimal sbbookingHandlingTaxMn, Date sbdueStartDate, Date sbdueEndDate, Integer sbticketNoInN) {
		this.sbserviceBookingId = sbserviceBookingId;
		this.sbinvoiceIdN = sbinvoiceIdN;
		this.sbstoreId = sbstoreId;
		this.sbcostCenterId = sbcostCenterId;
		this.sbcustId = sbcustId;
		this.sbcreationDate = sbcreationDate;
		this.sbempId = sbempId;
		this.sbcurrencyId = sbcurrencyId;
		this.sbexchangeRateFl = sbexchangeRateFl;
		this.sblastUpdatedDate = sblastUpdatedDate;
		this.sbnotesTxN = sbnotesTxN;
		this.sbstatusId = sbstatusId;
		this.sbvoidDateN = sbvoidDateN;
		this.sbvoidReasonTxN = sbvoidReasonTxN;
		this.sbpartsAmountMn = sbpartsAmountMn;
		this.sbpartTaxMn = sbpartTaxMn;
		this.sbbookingLaborMn = sbbookingLaborMn;
		this.sbbookingLaborTaxMn = sbbookingLaborTaxMn;
		this.sbbookingHandlingMn = sbbookingHandlingMn;
		this.sbbookingHandlingTaxMn = sbbookingHandlingTaxMn;
		this.sbdueStartDate = sbdueStartDate;
		this.sbdueEndDate = sbdueEndDate;
		this.sbticketNoInN = sbticketNoInN;
	}

	@Column(name = "SBServiceBookingID", nullable = false)
	public int getSbserviceBookingId() {
		return this.sbserviceBookingId;
	}

	public void setSbserviceBookingId(int sbserviceBookingId) {
		this.sbserviceBookingId = sbserviceBookingId;
	}

	@Column(name = "SBInvoiceID_N")
	public Integer getSbinvoiceIdN() {
		return this.sbinvoiceIdN;
	}

	public void setSbinvoiceIdN(Integer sbinvoiceIdN) {
		this.sbinvoiceIdN = sbinvoiceIdN;
	}

	@Column(name = "SBStoreID", nullable = false)
	public short getSbstoreId() {
		return this.sbstoreId;
	}

	public void setSbstoreId(short sbstoreId) {
		this.sbstoreId = sbstoreId;
	}

	@Column(name = "SBCostCenterID", nullable = false)
	public int getSbcostCenterId() {
		return this.sbcostCenterId;
	}

	public void setSbcostCenterId(int sbcostCenterId) {
		this.sbcostCenterId = sbcostCenterId;
	}

	@Column(name = "SBCustID", nullable = false)
	public int getSbcustId() {
		return this.sbcustId;
	}

	public void setSbcustId(int sbcustId) {
		this.sbcustId = sbcustId;
	}

	@Column(name = "SBCreationDate", nullable = false, length = 23)
	public Date getSbcreationDate() {
		return this.sbcreationDate;
	}

	public void setSbcreationDate(Date sbcreationDate) {
		this.sbcreationDate = sbcreationDate;
	}

	@Column(name = "SBEmpID", nullable = false)
	public int getSbempId() {
		return this.sbempId;
	}

	public void setSbempId(int sbempId) {
		this.sbempId = sbempId;
	}

	@Column(name = "SBCurrencyID", nullable = false)
	public short getSbcurrencyId() {
		return this.sbcurrencyId;
	}

	public void setSbcurrencyId(short sbcurrencyId) {
		this.sbcurrencyId = sbcurrencyId;
	}

	@Column(name = "SBExchangeRateFl", nullable = false, precision = 24, scale = 0)
	public float getSbexchangeRateFl() {
		return this.sbexchangeRateFl;
	}

	public void setSbexchangeRateFl(float sbexchangeRateFl) {
		this.sbexchangeRateFl = sbexchangeRateFl;
	}

	@Column(name = "SBLastUpdatedDate", nullable = false, length = 23)
	public Date getSblastUpdatedDate() {
		return this.sblastUpdatedDate;
	}

	public void setSblastUpdatedDate(Date sblastUpdatedDate) {
		this.sblastUpdatedDate = sblastUpdatedDate;
	}

	@Column(name = "SBNotesTx_N")
	public String getSbnotesTxN() {
		return this.sbnotesTxN;
	}

	public void setSbnotesTxN(String sbnotesTxN) {
		this.sbnotesTxN = sbnotesTxN;
	}

	@Column(name = "SBStatusID", nullable = false)
	public int getSbstatusId() {
		return this.sbstatusId;
	}

	public void setSbstatusId(int sbstatusId) {
		this.sbstatusId = sbstatusId;
	}

	@Column(name = "SBVoidDate_N", length = 23)
	public Date getSbvoidDateN() {
		return this.sbvoidDateN;
	}

	public void setSbvoidDateN(Date sbvoidDateN) {
		this.sbvoidDateN = sbvoidDateN;
	}

	@Column(name = "SBVoidReasonTx_N")
	public String getSbvoidReasonTxN() {
		return this.sbvoidReasonTxN;
	}

	public void setSbvoidReasonTxN(String sbvoidReasonTxN) {
		this.sbvoidReasonTxN = sbvoidReasonTxN;
	}

	@Column(name = "SBPartsAmountMn", nullable = false, scale = 4)
	public BigDecimal getSbpartsAmountMn() {
		return this.sbpartsAmountMn;
	}

	public void setSbpartsAmountMn(BigDecimal sbpartsAmountMn) {
		this.sbpartsAmountMn = sbpartsAmountMn;
	}

	@Column(name = "SBPartTaxMn", nullable = false, scale = 4)
	public BigDecimal getSbpartTaxMn() {
		return this.sbpartTaxMn;
	}

	public void setSbpartTaxMn(BigDecimal sbpartTaxMn) {
		this.sbpartTaxMn = sbpartTaxMn;
	}

	@Column(name = "SBBookingLaborMn", nullable = false, scale = 4)
	public BigDecimal getSbbookingLaborMn() {
		return this.sbbookingLaborMn;
	}

	public void setSbbookingLaborMn(BigDecimal sbbookingLaborMn) {
		this.sbbookingLaborMn = sbbookingLaborMn;
	}

	@Column(name = "SBBookingLaborTaxMn", nullable = false, scale = 4)
	public BigDecimal getSbbookingLaborTaxMn() {
		return this.sbbookingLaborTaxMn;
	}

	public void setSbbookingLaborTaxMn(BigDecimal sbbookingLaborTaxMn) {
		this.sbbookingLaborTaxMn = sbbookingLaborTaxMn;
	}

	@Column(name = "SBBookingHandlingMn", nullable = false, scale = 4)
	public BigDecimal getSbbookingHandlingMn() {
		return this.sbbookingHandlingMn;
	}

	public void setSbbookingHandlingMn(BigDecimal sbbookingHandlingMn) {
		this.sbbookingHandlingMn = sbbookingHandlingMn;
	}

	@Column(name = "SBBookingHandlingTaxMn", nullable = false, scale = 4)
	public BigDecimal getSbbookingHandlingTaxMn() {
		return this.sbbookingHandlingTaxMn;
	}

	public void setSbbookingHandlingTaxMn(BigDecimal sbbookingHandlingTaxMn) {
		this.sbbookingHandlingTaxMn = sbbookingHandlingTaxMn;
	}

	@Column(name = "SBDueStartDate", nullable = false, length = 23)
	public Date getSbdueStartDate() {
		return this.sbdueStartDate;
	}

	public void setSbdueStartDate(Date sbdueStartDate) {
		this.sbdueStartDate = sbdueStartDate;
	}

	@Column(name = "SBDueEndDate", nullable = false, length = 23)
	public Date getSbdueEndDate() {
		return this.sbdueEndDate;
	}

	public void setSbdueEndDate(Date sbdueEndDate) {
		this.sbdueEndDate = sbdueEndDate;
	}

	@Column(name = "SBTicketNoIn_N")
	public Integer getSbticketNoInN() {
		return this.sbticketNoInN;
	}

	public void setSbticketNoInN(Integer sbticketNoInN) {
		this.sbticketNoInN = sbticketNoInN;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof S01SbserviceBookingId))
			return false;
		S01SbserviceBookingId castOther = (S01SbserviceBookingId) other;

		return (this.getSbserviceBookingId() == castOther.getSbserviceBookingId())
				&& ((this.getSbinvoiceIdN() == castOther.getSbinvoiceIdN())
						|| (this.getSbinvoiceIdN() != null && castOther.getSbinvoiceIdN() != null
								&& this.getSbinvoiceIdN().equals(castOther.getSbinvoiceIdN())))
				&& (this.getSbstoreId() == castOther.getSbstoreId())
				&& (this.getSbcostCenterId() == castOther.getSbcostCenterId())
				&& (this.getSbcustId() == castOther.getSbcustId())
				&& ((this.getSbcreationDate() == castOther.getSbcreationDate())
						|| (this.getSbcreationDate() != null && castOther.getSbcreationDate() != null
								&& this.getSbcreationDate().equals(castOther.getSbcreationDate())))
				&& (this.getSbempId() == castOther.getSbempId())
				&& (this.getSbcurrencyId() == castOther.getSbcurrencyId())
				&& (this.getSbexchangeRateFl() == castOther.getSbexchangeRateFl())
				&& ((this.getSblastUpdatedDate() == castOther.getSblastUpdatedDate())
						|| (this.getSblastUpdatedDate() != null && castOther.getSblastUpdatedDate() != null
								&& this.getSblastUpdatedDate().equals(castOther.getSblastUpdatedDate())))
				&& ((this.getSbnotesTxN() == castOther.getSbnotesTxN()) || (this.getSbnotesTxN() != null
						&& castOther.getSbnotesTxN() != null && this.getSbnotesTxN().equals(castOther.getSbnotesTxN())))
				&& (this.getSbstatusId() == castOther.getSbstatusId())
				&& ((this.getSbvoidDateN() == castOther.getSbvoidDateN())
						|| (this.getSbvoidDateN() != null && castOther.getSbvoidDateN() != null
								&& this.getSbvoidDateN().equals(castOther.getSbvoidDateN())))
				&& ((this.getSbvoidReasonTxN() == castOther.getSbvoidReasonTxN())
						|| (this.getSbvoidReasonTxN() != null && castOther.getSbvoidReasonTxN() != null
								&& this.getSbvoidReasonTxN().equals(castOther.getSbvoidReasonTxN())))
				&& ((this.getSbpartsAmountMn() == castOther.getSbpartsAmountMn())
						|| (this.getSbpartsAmountMn() != null && castOther.getSbpartsAmountMn() != null
								&& this.getSbpartsAmountMn().equals(castOther.getSbpartsAmountMn())))
				&& ((this.getSbpartTaxMn() == castOther.getSbpartTaxMn())
						|| (this.getSbpartTaxMn() != null && castOther.getSbpartTaxMn() != null
								&& this.getSbpartTaxMn().equals(castOther.getSbpartTaxMn())))
				&& ((this.getSbbookingLaborMn() == castOther.getSbbookingLaborMn())
						|| (this.getSbbookingLaborMn() != null && castOther.getSbbookingLaborMn() != null
								&& this.getSbbookingLaborMn().equals(castOther.getSbbookingLaborMn())))
				&& ((this.getSbbookingLaborTaxMn() == castOther.getSbbookingLaborTaxMn())
						|| (this.getSbbookingLaborTaxMn() != null && castOther.getSbbookingLaborTaxMn() != null
								&& this.getSbbookingLaborTaxMn().equals(castOther.getSbbookingLaborTaxMn())))
				&& ((this.getSbbookingHandlingMn() == castOther.getSbbookingHandlingMn())
						|| (this.getSbbookingHandlingMn() != null && castOther.getSbbookingHandlingMn() != null
								&& this.getSbbookingHandlingMn().equals(castOther.getSbbookingHandlingMn())))
				&& ((this.getSbbookingHandlingTaxMn() == castOther.getSbbookingHandlingTaxMn())
						|| (this.getSbbookingHandlingTaxMn() != null && castOther.getSbbookingHandlingTaxMn() != null
								&& this.getSbbookingHandlingTaxMn().equals(castOther.getSbbookingHandlingTaxMn())))
				&& ((this.getSbdueStartDate() == castOther.getSbdueStartDate())
						|| (this.getSbdueStartDate() != null && castOther.getSbdueStartDate() != null
								&& this.getSbdueStartDate().equals(castOther.getSbdueStartDate())))
				&& ((this.getSbdueEndDate() == castOther.getSbdueEndDate())
						|| (this.getSbdueEndDate() != null && castOther.getSbdueEndDate() != null
								&& this.getSbdueEndDate().equals(castOther.getSbdueEndDate())))
				&& ((this.getSbticketNoInN() == castOther.getSbticketNoInN())
						|| (this.getSbticketNoInN() != null && castOther.getSbticketNoInN() != null
								&& this.getSbticketNoInN().equals(castOther.getSbticketNoInN())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSbserviceBookingId();
		result = 37 * result + (getSbinvoiceIdN() == null ? 0 : this.getSbinvoiceIdN().hashCode());
		result = 37 * result + this.getSbstoreId();
		result = 37 * result + this.getSbcostCenterId();
		result = 37 * result + this.getSbcustId();
		result = 37 * result + (getSbcreationDate() == null ? 0 : this.getSbcreationDate().hashCode());
		result = 37 * result + this.getSbempId();
		result = 37 * result + this.getSbcurrencyId();
		result = 37 * result + (int) this.getSbexchangeRateFl();
		result = 37 * result + (getSblastUpdatedDate() == null ? 0 : this.getSblastUpdatedDate().hashCode());
		result = 37 * result + (getSbnotesTxN() == null ? 0 : this.getSbnotesTxN().hashCode());
		result = 37 * result + this.getSbstatusId();
		result = 37 * result + (getSbvoidDateN() == null ? 0 : this.getSbvoidDateN().hashCode());
		result = 37 * result + (getSbvoidReasonTxN() == null ? 0 : this.getSbvoidReasonTxN().hashCode());
		result = 37 * result + (getSbpartsAmountMn() == null ? 0 : this.getSbpartsAmountMn().hashCode());
		result = 37 * result + (getSbpartTaxMn() == null ? 0 : this.getSbpartTaxMn().hashCode());
		result = 37 * result + (getSbbookingLaborMn() == null ? 0 : this.getSbbookingLaborMn().hashCode());
		result = 37 * result + (getSbbookingLaborTaxMn() == null ? 0 : this.getSbbookingLaborTaxMn().hashCode());
		result = 37 * result + (getSbbookingHandlingMn() == null ? 0 : this.getSbbookingHandlingMn().hashCode());
		result = 37 * result + (getSbbookingHandlingTaxMn() == null ? 0 : this.getSbbookingHandlingTaxMn().hashCode());
		result = 37 * result + (getSbdueStartDate() == null ? 0 : this.getSbdueStartDate().hashCode());
		result = 37 * result + (getSbdueEndDate() == null ? 0 : this.getSbdueEndDate().hashCode());
		result = 37 * result + (getSbticketNoInN() == null ? 0 : this.getSbticketNoInN().hashCode());
		return result;
	}

}
