package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * D01VoVoucherId generated by hbm2java
 */
@Embeddable
public class D01VoVoucherId implements java.io.Serializable {

	private int voVoucherId;
	private int voCustId;
	private short voStoreId;
	private int voCostCenterId;
	private int voFaultyInvoiceId;
	private Integer voUsedInvoiceIdN;
	private Date voCreationDate;
	private Date voExpiryDate;
	private Date voActualExpiryDateN;
	private int voEmpId;
	private int voCommissionEmployeeId;
	private float voCommissionRateFl;
	private boolean voCommissionableBl;
	private double voAmountMn;
	private short voCurrencyId;
	private float voExchangeRateFl;
	private Date voLastUpdatedDate;
	private short voPcid;
	private int voTransStatusId;
	private String voNotesTxN;
	private Date voVoidDateN;
	private String voVoidReasonTxN;

	public D01VoVoucherId() {
	}

	public D01VoVoucherId(int voVoucherId, int voCustId, short voStoreId, int voCostCenterId, int voFaultyInvoiceId,
			Date voCreationDate, Date voExpiryDate, int voEmpId, int voCommissionEmployeeId, float voCommissionRateFl,
			boolean voCommissionableBl, double voAmountMn, short voCurrencyId, float voExchangeRateFl,
			Date voLastUpdatedDate, short voPcid, int voTransStatusId) {
		this.voVoucherId = voVoucherId;
		this.voCustId = voCustId;
		this.voStoreId = voStoreId;
		this.voCostCenterId = voCostCenterId;
		this.voFaultyInvoiceId = voFaultyInvoiceId;
		this.voCreationDate = voCreationDate;
		this.voExpiryDate = voExpiryDate;
		this.voEmpId = voEmpId;
		this.voCommissionEmployeeId = voCommissionEmployeeId;
		this.voCommissionRateFl = voCommissionRateFl;
		this.voCommissionableBl = voCommissionableBl;
		this.voAmountMn = voAmountMn;
		this.voCurrencyId = voCurrencyId;
		this.voExchangeRateFl = voExchangeRateFl;
		this.voLastUpdatedDate = voLastUpdatedDate;
		this.voPcid = voPcid;
		this.voTransStatusId = voTransStatusId;
	}

	public D01VoVoucherId(int voVoucherId, int voCustId, short voStoreId, int voCostCenterId, int voFaultyInvoiceId,
			Integer voUsedInvoiceIdN, Date voCreationDate, Date voExpiryDate, Date voActualExpiryDateN, int voEmpId,
			int voCommissionEmployeeId, float voCommissionRateFl, boolean voCommissionableBl, double voAmountMn,
			short voCurrencyId, float voExchangeRateFl, Date voLastUpdatedDate, short voPcid, int voTransStatusId,
			String voNotesTxN, Date voVoidDateN, String voVoidReasonTxN) {
		this.voVoucherId = voVoucherId;
		this.voCustId = voCustId;
		this.voStoreId = voStoreId;
		this.voCostCenterId = voCostCenterId;
		this.voFaultyInvoiceId = voFaultyInvoiceId;
		this.voUsedInvoiceIdN = voUsedInvoiceIdN;
		this.voCreationDate = voCreationDate;
		this.voExpiryDate = voExpiryDate;
		this.voActualExpiryDateN = voActualExpiryDateN;
		this.voEmpId = voEmpId;
		this.voCommissionEmployeeId = voCommissionEmployeeId;
		this.voCommissionRateFl = voCommissionRateFl;
		this.voCommissionableBl = voCommissionableBl;
		this.voAmountMn = voAmountMn;
		this.voCurrencyId = voCurrencyId;
		this.voExchangeRateFl = voExchangeRateFl;
		this.voLastUpdatedDate = voLastUpdatedDate;
		this.voPcid = voPcid;
		this.voTransStatusId = voTransStatusId;
		this.voNotesTxN = voNotesTxN;
		this.voVoidDateN = voVoidDateN;
		this.voVoidReasonTxN = voVoidReasonTxN;
	}

	@Column(name = "VoVoucherID", nullable = false)
	public int getVoVoucherId() {
		return this.voVoucherId;
	}

	public void setVoVoucherId(int voVoucherId) {
		this.voVoucherId = voVoucherId;
	}

	@Column(name = "VoCustID", nullable = false)
	public int getVoCustId() {
		return this.voCustId;
	}

	public void setVoCustId(int voCustId) {
		this.voCustId = voCustId;
	}

	@Column(name = "VoStoreID", nullable = false)
	public short getVoStoreId() {
		return this.voStoreId;
	}

	public void setVoStoreId(short voStoreId) {
		this.voStoreId = voStoreId;
	}

	@Column(name = "VoCostCenterID", nullable = false)
	public int getVoCostCenterId() {
		return this.voCostCenterId;
	}

	public void setVoCostCenterId(int voCostCenterId) {
		this.voCostCenterId = voCostCenterId;
	}

	@Column(name = "VoFaultyInvoiceID", nullable = false)
	public int getVoFaultyInvoiceId() {
		return this.voFaultyInvoiceId;
	}

	public void setVoFaultyInvoiceId(int voFaultyInvoiceId) {
		this.voFaultyInvoiceId = voFaultyInvoiceId;
	}

	@Column(name = "VoUsedInvoiceID_N")
	public Integer getVoUsedInvoiceIdN() {
		return this.voUsedInvoiceIdN;
	}

	public void setVoUsedInvoiceIdN(Integer voUsedInvoiceIdN) {
		this.voUsedInvoiceIdN = voUsedInvoiceIdN;
	}

	@Column(name = "VoCreationDate", nullable = false, length = 23)
	public Date getVoCreationDate() {
		return this.voCreationDate;
	}

	public void setVoCreationDate(Date voCreationDate) {
		this.voCreationDate = voCreationDate;
	}

	@Column(name = "VoExpiryDate", nullable = false, length = 23)
	public Date getVoExpiryDate() {
		return this.voExpiryDate;
	}

	public void setVoExpiryDate(Date voExpiryDate) {
		this.voExpiryDate = voExpiryDate;
	}

	@Column(name = "VoActualExpiryDate_N", length = 23)
	public Date getVoActualExpiryDateN() {
		return this.voActualExpiryDateN;
	}

	public void setVoActualExpiryDateN(Date voActualExpiryDateN) {
		this.voActualExpiryDateN = voActualExpiryDateN;
	}

	@Column(name = "VoEmpID", nullable = false)
	public int getVoEmpId() {
		return this.voEmpId;
	}

	public void setVoEmpId(int voEmpId) {
		this.voEmpId = voEmpId;
	}

	@Column(name = "VoCommissionEmployeeID", nullable = false)
	public int getVoCommissionEmployeeId() {
		return this.voCommissionEmployeeId;
	}

	public void setVoCommissionEmployeeId(int voCommissionEmployeeId) {
		this.voCommissionEmployeeId = voCommissionEmployeeId;
	}

	@Column(name = "VoCommissionRateFl", nullable = false, precision = 24, scale = 0)
	public float getVoCommissionRateFl() {
		return this.voCommissionRateFl;
	}

	public void setVoCommissionRateFl(float voCommissionRateFl) {
		this.voCommissionRateFl = voCommissionRateFl;
	}

	@Column(name = "VoCommissionableBl", nullable = false)
	public boolean isVoCommissionableBl() {
		return this.voCommissionableBl;
	}

	public void setVoCommissionableBl(boolean voCommissionableBl) {
		this.voCommissionableBl = voCommissionableBl;
	}

	@Column(name = "VoAmountMn", nullable = false, precision = 53, scale = 0)
	public double getVoAmountMn() {
		return this.voAmountMn;
	}

	public void setVoAmountMn(double voAmountMn) {
		this.voAmountMn = voAmountMn;
	}

	@Column(name = "VoCurrencyID", nullable = false)
	public short getVoCurrencyId() {
		return this.voCurrencyId;
	}

	public void setVoCurrencyId(short voCurrencyId) {
		this.voCurrencyId = voCurrencyId;
	}

	@Column(name = "VoExchangeRateFl", nullable = false, precision = 24, scale = 0)
	public float getVoExchangeRateFl() {
		return this.voExchangeRateFl;
	}

	public void setVoExchangeRateFl(float voExchangeRateFl) {
		this.voExchangeRateFl = voExchangeRateFl;
	}

	@Column(name = "VoLastUpdatedDate", nullable = false, length = 23)
	public Date getVoLastUpdatedDate() {
		return this.voLastUpdatedDate;
	}

	public void setVoLastUpdatedDate(Date voLastUpdatedDate) {
		this.voLastUpdatedDate = voLastUpdatedDate;
	}

	@Column(name = "VoPCID", nullable = false)
	public short getVoPcid() {
		return this.voPcid;
	}

	public void setVoPcid(short voPcid) {
		this.voPcid = voPcid;
	}

	@Column(name = "VoTransStatusID", nullable = false)
	public int getVoTransStatusId() {
		return this.voTransStatusId;
	}

	public void setVoTransStatusId(int voTransStatusId) {
		this.voTransStatusId = voTransStatusId;
	}

	@Column(name = "VoNotesTx_N")
	public String getVoNotesTxN() {
		return this.voNotesTxN;
	}

	public void setVoNotesTxN(String voNotesTxN) {
		this.voNotesTxN = voNotesTxN;
	}

	@Column(name = "VoVoidDate_N", length = 23)
	public Date getVoVoidDateN() {
		return this.voVoidDateN;
	}

	public void setVoVoidDateN(Date voVoidDateN) {
		this.voVoidDateN = voVoidDateN;
	}

	@Column(name = "VoVoidReasonTx_N")
	public String getVoVoidReasonTxN() {
		return this.voVoidReasonTxN;
	}

	public void setVoVoidReasonTxN(String voVoidReasonTxN) {
		this.voVoidReasonTxN = voVoidReasonTxN;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof D01VoVoucherId))
			return false;
		D01VoVoucherId castOther = (D01VoVoucherId) other;

		return (this.getVoVoucherId() == castOther.getVoVoucherId()) && (this.getVoCustId() == castOther.getVoCustId())
				&& (this.getVoStoreId() == castOther.getVoStoreId())
				&& (this.getVoCostCenterId() == castOther.getVoCostCenterId())
				&& (this.getVoFaultyInvoiceId() == castOther.getVoFaultyInvoiceId())
				&& ((this.getVoUsedInvoiceIdN() == castOther.getVoUsedInvoiceIdN())
						|| (this.getVoUsedInvoiceIdN() != null && castOther.getVoUsedInvoiceIdN() != null
								&& this.getVoUsedInvoiceIdN().equals(castOther.getVoUsedInvoiceIdN())))
				&& ((this.getVoCreationDate() == castOther.getVoCreationDate())
						|| (this.getVoCreationDate() != null && castOther.getVoCreationDate() != null
								&& this.getVoCreationDate().equals(castOther.getVoCreationDate())))
				&& ((this.getVoExpiryDate() == castOther.getVoExpiryDate())
						|| (this.getVoExpiryDate() != null && castOther.getVoExpiryDate() != null
								&& this.getVoExpiryDate().equals(castOther.getVoExpiryDate())))
				&& ((this.getVoActualExpiryDateN() == castOther.getVoActualExpiryDateN())
						|| (this.getVoActualExpiryDateN() != null && castOther.getVoActualExpiryDateN() != null
								&& this.getVoActualExpiryDateN().equals(castOther.getVoActualExpiryDateN())))
				&& (this.getVoEmpId() == castOther.getVoEmpId())
				&& (this.getVoCommissionEmployeeId() == castOther.getVoCommissionEmployeeId())
				&& (this.getVoCommissionRateFl() == castOther.getVoCommissionRateFl())
				&& (this.isVoCommissionableBl() == castOther.isVoCommissionableBl())
				&& (this.getVoAmountMn() == castOther.getVoAmountMn())
				&& (this.getVoCurrencyId() == castOther.getVoCurrencyId())
				&& (this.getVoExchangeRateFl() == castOther.getVoExchangeRateFl())
				&& ((this.getVoLastUpdatedDate() == castOther.getVoLastUpdatedDate())
						|| (this.getVoLastUpdatedDate() != null && castOther.getVoLastUpdatedDate() != null
								&& this.getVoLastUpdatedDate().equals(castOther.getVoLastUpdatedDate())))
				&& (this.getVoPcid() == castOther.getVoPcid())
				&& (this.getVoTransStatusId() == castOther.getVoTransStatusId())
				&& ((this.getVoNotesTxN() == castOther.getVoNotesTxN()) || (this.getVoNotesTxN() != null
						&& castOther.getVoNotesTxN() != null && this.getVoNotesTxN().equals(castOther.getVoNotesTxN())))
				&& ((this.getVoVoidDateN() == castOther.getVoVoidDateN())
						|| (this.getVoVoidDateN() != null && castOther.getVoVoidDateN() != null
								&& this.getVoVoidDateN().equals(castOther.getVoVoidDateN())))
				&& ((this.getVoVoidReasonTxN() == castOther.getVoVoidReasonTxN())
						|| (this.getVoVoidReasonTxN() != null && castOther.getVoVoidReasonTxN() != null
								&& this.getVoVoidReasonTxN().equals(castOther.getVoVoidReasonTxN())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getVoVoucherId();
		result = 37 * result + this.getVoCustId();
		result = 37 * result + this.getVoStoreId();
		result = 37 * result + this.getVoCostCenterId();
		result = 37 * result + this.getVoFaultyInvoiceId();
		result = 37 * result + (getVoUsedInvoiceIdN() == null ? 0 : this.getVoUsedInvoiceIdN().hashCode());
		result = 37 * result + (getVoCreationDate() == null ? 0 : this.getVoCreationDate().hashCode());
		result = 37 * result + (getVoExpiryDate() == null ? 0 : this.getVoExpiryDate().hashCode());
		result = 37 * result + (getVoActualExpiryDateN() == null ? 0 : this.getVoActualExpiryDateN().hashCode());
		result = 37 * result + this.getVoEmpId();
		result = 37 * result + this.getVoCommissionEmployeeId();
		result = 37 * result + (int) this.getVoCommissionRateFl();
		result = 37 * result + (this.isVoCommissionableBl() ? 1 : 0);
		result = 37 * result + (int) this.getVoAmountMn();
		result = 37 * result + this.getVoCurrencyId();
		result = 37 * result + (int) this.getVoExchangeRateFl();
		result = 37 * result + (getVoLastUpdatedDate() == null ? 0 : this.getVoLastUpdatedDate().hashCode());
		result = 37 * result + this.getVoPcid();
		result = 37 * result + this.getVoTransStatusId();
		result = 37 * result + (getVoNotesTxN() == null ? 0 : this.getVoNotesTxN().hashCode());
		result = 37 * result + (getVoVoidDateN() == null ? 0 : this.getVoVoidDateN().hashCode());
		result = 37 * result + (getVoVoidReasonTxN() == null ? 0 : this.getVoVoidReasonTxN().hashCode());
		return result;
	}

}
