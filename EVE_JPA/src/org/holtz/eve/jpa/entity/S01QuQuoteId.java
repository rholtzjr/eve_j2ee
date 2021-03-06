package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * S01QuQuoteId generated by hbm2java
 */
@Embeddable
public class S01QuQuoteId implements java.io.Serializable {

	private int quQuoteId;
	private int quCustId;
	private short quStoreId;
	private int quCostCenterId;
	private Date quCreationDate;
	private Date quExpiryDate;
	private Date quActualExpiryDateN;
	private int quEmpId;
	private double quSubTotalMn;
	private double quTaxMn;
	private short quCurrencyId;
	private float quExchangeRateFl;
	private Date quLastUpdatedDate;
	private short quPcid;
	private int quTransStatusId;
	private String quNotesTxN;
	private Date quVoidDateN;
	private String quVoidReasonTxN;

	public S01QuQuoteId() {
	}

	public S01QuQuoteId(int quQuoteId, int quCustId, short quStoreId, int quCostCenterId, Date quCreationDate,
			Date quExpiryDate, int quEmpId, double quSubTotalMn, double quTaxMn, short quCurrencyId,
			float quExchangeRateFl, Date quLastUpdatedDate, short quPcid, int quTransStatusId) {
		this.quQuoteId = quQuoteId;
		this.quCustId = quCustId;
		this.quStoreId = quStoreId;
		this.quCostCenterId = quCostCenterId;
		this.quCreationDate = quCreationDate;
		this.quExpiryDate = quExpiryDate;
		this.quEmpId = quEmpId;
		this.quSubTotalMn = quSubTotalMn;
		this.quTaxMn = quTaxMn;
		this.quCurrencyId = quCurrencyId;
		this.quExchangeRateFl = quExchangeRateFl;
		this.quLastUpdatedDate = quLastUpdatedDate;
		this.quPcid = quPcid;
		this.quTransStatusId = quTransStatusId;
	}

	public S01QuQuoteId(int quQuoteId, int quCustId, short quStoreId, int quCostCenterId, Date quCreationDate,
			Date quExpiryDate, Date quActualExpiryDateN, int quEmpId, double quSubTotalMn, double quTaxMn,
			short quCurrencyId, float quExchangeRateFl, Date quLastUpdatedDate, short quPcid, int quTransStatusId,
			String quNotesTxN, Date quVoidDateN, String quVoidReasonTxN) {
		this.quQuoteId = quQuoteId;
		this.quCustId = quCustId;
		this.quStoreId = quStoreId;
		this.quCostCenterId = quCostCenterId;
		this.quCreationDate = quCreationDate;
		this.quExpiryDate = quExpiryDate;
		this.quActualExpiryDateN = quActualExpiryDateN;
		this.quEmpId = quEmpId;
		this.quSubTotalMn = quSubTotalMn;
		this.quTaxMn = quTaxMn;
		this.quCurrencyId = quCurrencyId;
		this.quExchangeRateFl = quExchangeRateFl;
		this.quLastUpdatedDate = quLastUpdatedDate;
		this.quPcid = quPcid;
		this.quTransStatusId = quTransStatusId;
		this.quNotesTxN = quNotesTxN;
		this.quVoidDateN = quVoidDateN;
		this.quVoidReasonTxN = quVoidReasonTxN;
	}

	@Column(name = "QuQuoteID", nullable = false)
	public int getQuQuoteId() {
		return this.quQuoteId;
	}

	public void setQuQuoteId(int quQuoteId) {
		this.quQuoteId = quQuoteId;
	}

	@Column(name = "QuCustID", nullable = false)
	public int getQuCustId() {
		return this.quCustId;
	}

	public void setQuCustId(int quCustId) {
		this.quCustId = quCustId;
	}

	@Column(name = "QuStoreID", nullable = false)
	public short getQuStoreId() {
		return this.quStoreId;
	}

	public void setQuStoreId(short quStoreId) {
		this.quStoreId = quStoreId;
	}

	@Column(name = "QuCostCenterID", nullable = false)
	public int getQuCostCenterId() {
		return this.quCostCenterId;
	}

	public void setQuCostCenterId(int quCostCenterId) {
		this.quCostCenterId = quCostCenterId;
	}

	@Column(name = "QuCreationDate", nullable = false, length = 23)
	public Date getQuCreationDate() {
		return this.quCreationDate;
	}

	public void setQuCreationDate(Date quCreationDate) {
		this.quCreationDate = quCreationDate;
	}

	@Column(name = "QuExpiryDate", nullable = false, length = 23)
	public Date getQuExpiryDate() {
		return this.quExpiryDate;
	}

	public void setQuExpiryDate(Date quExpiryDate) {
		this.quExpiryDate = quExpiryDate;
	}

	@Column(name = "QuActualExpiryDate_N", length = 23)
	public Date getQuActualExpiryDateN() {
		return this.quActualExpiryDateN;
	}

	public void setQuActualExpiryDateN(Date quActualExpiryDateN) {
		this.quActualExpiryDateN = quActualExpiryDateN;
	}

	@Column(name = "QuEmpID", nullable = false)
	public int getQuEmpId() {
		return this.quEmpId;
	}

	public void setQuEmpId(int quEmpId) {
		this.quEmpId = quEmpId;
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

	@Column(name = "QuLastUpdatedDate", nullable = false, length = 23)
	public Date getQuLastUpdatedDate() {
		return this.quLastUpdatedDate;
	}

	public void setQuLastUpdatedDate(Date quLastUpdatedDate) {
		this.quLastUpdatedDate = quLastUpdatedDate;
	}

	@Column(name = "QuPCID", nullable = false)
	public short getQuPcid() {
		return this.quPcid;
	}

	public void setQuPcid(short quPcid) {
		this.quPcid = quPcid;
	}

	@Column(name = "QuTransStatusID", nullable = false)
	public int getQuTransStatusId() {
		return this.quTransStatusId;
	}

	public void setQuTransStatusId(int quTransStatusId) {
		this.quTransStatusId = quTransStatusId;
	}

	@Column(name = "QuNotesTx_N")
	public String getQuNotesTxN() {
		return this.quNotesTxN;
	}

	public void setQuNotesTxN(String quNotesTxN) {
		this.quNotesTxN = quNotesTxN;
	}

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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof S01QuQuoteId))
			return false;
		S01QuQuoteId castOther = (S01QuQuoteId) other;

		return (this.getQuQuoteId() == castOther.getQuQuoteId()) && (this.getQuCustId() == castOther.getQuCustId())
				&& (this.getQuStoreId() == castOther.getQuStoreId())
				&& (this.getQuCostCenterId() == castOther.getQuCostCenterId())
				&& ((this.getQuCreationDate() == castOther.getQuCreationDate())
						|| (this.getQuCreationDate() != null && castOther.getQuCreationDate() != null
								&& this.getQuCreationDate().equals(castOther.getQuCreationDate())))
				&& ((this.getQuExpiryDate() == castOther.getQuExpiryDate())
						|| (this.getQuExpiryDate() != null && castOther.getQuExpiryDate() != null
								&& this.getQuExpiryDate().equals(castOther.getQuExpiryDate())))
				&& ((this.getQuActualExpiryDateN() == castOther.getQuActualExpiryDateN())
						|| (this.getQuActualExpiryDateN() != null && castOther.getQuActualExpiryDateN() != null
								&& this.getQuActualExpiryDateN().equals(castOther.getQuActualExpiryDateN())))
				&& (this.getQuEmpId() == castOther.getQuEmpId())
				&& (this.getQuSubTotalMn() == castOther.getQuSubTotalMn())
				&& (this.getQuTaxMn() == castOther.getQuTaxMn())
				&& (this.getQuCurrencyId() == castOther.getQuCurrencyId())
				&& (this.getQuExchangeRateFl() == castOther.getQuExchangeRateFl())
				&& ((this.getQuLastUpdatedDate() == castOther.getQuLastUpdatedDate())
						|| (this.getQuLastUpdatedDate() != null && castOther.getQuLastUpdatedDate() != null
								&& this.getQuLastUpdatedDate().equals(castOther.getQuLastUpdatedDate())))
				&& (this.getQuPcid() == castOther.getQuPcid())
				&& (this.getQuTransStatusId() == castOther.getQuTransStatusId())
				&& ((this.getQuNotesTxN() == castOther.getQuNotesTxN()) || (this.getQuNotesTxN() != null
						&& castOther.getQuNotesTxN() != null && this.getQuNotesTxN().equals(castOther.getQuNotesTxN())))
				&& ((this.getQuVoidDateN() == castOther.getQuVoidDateN())
						|| (this.getQuVoidDateN() != null && castOther.getQuVoidDateN() != null
								&& this.getQuVoidDateN().equals(castOther.getQuVoidDateN())))
				&& ((this.getQuVoidReasonTxN() == castOther.getQuVoidReasonTxN())
						|| (this.getQuVoidReasonTxN() != null && castOther.getQuVoidReasonTxN() != null
								&& this.getQuVoidReasonTxN().equals(castOther.getQuVoidReasonTxN())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getQuQuoteId();
		result = 37 * result + this.getQuCustId();
		result = 37 * result + this.getQuStoreId();
		result = 37 * result + this.getQuCostCenterId();
		result = 37 * result + (getQuCreationDate() == null ? 0 : this.getQuCreationDate().hashCode());
		result = 37 * result + (getQuExpiryDate() == null ? 0 : this.getQuExpiryDate().hashCode());
		result = 37 * result + (getQuActualExpiryDateN() == null ? 0 : this.getQuActualExpiryDateN().hashCode());
		result = 37 * result + this.getQuEmpId();
		result = 37 * result + (int) this.getQuSubTotalMn();
		result = 37 * result + (int) this.getQuTaxMn();
		result = 37 * result + this.getQuCurrencyId();
		result = 37 * result + (int) this.getQuExchangeRateFl();
		result = 37 * result + (getQuLastUpdatedDate() == null ? 0 : this.getQuLastUpdatedDate().hashCode());
		result = 37 * result + this.getQuPcid();
		result = 37 * result + this.getQuTransStatusId();
		result = 37 * result + (getQuNotesTxN() == null ? 0 : this.getQuNotesTxN().hashCode());
		result = 37 * result + (getQuVoidDateN() == null ? 0 : this.getQuVoidDateN().hashCode());
		result = 37 * result + (getQuVoidReasonTxN() == null ? 0 : this.getQuVoidReasonTxN().hashCode());
		return result;
	}

}
