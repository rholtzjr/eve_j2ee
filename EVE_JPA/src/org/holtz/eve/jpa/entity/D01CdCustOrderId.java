package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * D01CdCustOrderId generated by hbm2java
 */
@Embeddable
public class D01CdCustOrderId implements java.io.Serializable {

	private int cdCustOrderId;
	private int cdEmpId;
	private int cdCustId;
	private int cdStockItemId;
	private short cdStoreId;
	private Date cdCreationDate;
	private Integer cdPoidN;
	private short cdQtyIn;
	private Date cdPickedUpDateN;
	private Date cdNotifiedDateN;
	private Integer cdContactMethodIdN;
	private String cdNotesTxN;
	private String cdPonotesTxN;
	private Date cdLastUpdatedDate;
	private String cdLocationTxN;
	private Integer cdInvoiceItemIdN;
	private Date cdRequiredByDateN;

	public D01CdCustOrderId() {
	}

	public D01CdCustOrderId(int cdCustOrderId, int cdEmpId, int cdCustId, int cdStockItemId, short cdStoreId,
			Date cdCreationDate, short cdQtyIn, Date cdLastUpdatedDate) {
		this.cdCustOrderId = cdCustOrderId;
		this.cdEmpId = cdEmpId;
		this.cdCustId = cdCustId;
		this.cdStockItemId = cdStockItemId;
		this.cdStoreId = cdStoreId;
		this.cdCreationDate = cdCreationDate;
		this.cdQtyIn = cdQtyIn;
		this.cdLastUpdatedDate = cdLastUpdatedDate;
	}

	public D01CdCustOrderId(int cdCustOrderId, int cdEmpId, int cdCustId, int cdStockItemId, short cdStoreId,
			Date cdCreationDate, Integer cdPoidN, short cdQtyIn, Date cdPickedUpDateN, Date cdNotifiedDateN,
			Integer cdContactMethodIdN, String cdNotesTxN, String cdPonotesTxN, Date cdLastUpdatedDate,
			String cdLocationTxN, Integer cdInvoiceItemIdN, Date cdRequiredByDateN) {
		this.cdCustOrderId = cdCustOrderId;
		this.cdEmpId = cdEmpId;
		this.cdCustId = cdCustId;
		this.cdStockItemId = cdStockItemId;
		this.cdStoreId = cdStoreId;
		this.cdCreationDate = cdCreationDate;
		this.cdPoidN = cdPoidN;
		this.cdQtyIn = cdQtyIn;
		this.cdPickedUpDateN = cdPickedUpDateN;
		this.cdNotifiedDateN = cdNotifiedDateN;
		this.cdContactMethodIdN = cdContactMethodIdN;
		this.cdNotesTxN = cdNotesTxN;
		this.cdPonotesTxN = cdPonotesTxN;
		this.cdLastUpdatedDate = cdLastUpdatedDate;
		this.cdLocationTxN = cdLocationTxN;
		this.cdInvoiceItemIdN = cdInvoiceItemIdN;
		this.cdRequiredByDateN = cdRequiredByDateN;
	}

	@Column(name = "CdCustOrderID", nullable = false)
	public int getCdCustOrderId() {
		return this.cdCustOrderId;
	}

	public void setCdCustOrderId(int cdCustOrderId) {
		this.cdCustOrderId = cdCustOrderId;
	}

	@Column(name = "CdEmpID", nullable = false)
	public int getCdEmpId() {
		return this.cdEmpId;
	}

	public void setCdEmpId(int cdEmpId) {
		this.cdEmpId = cdEmpId;
	}

	@Column(name = "CdCustID", nullable = false)
	public int getCdCustId() {
		return this.cdCustId;
	}

	public void setCdCustId(int cdCustId) {
		this.cdCustId = cdCustId;
	}

	@Column(name = "CdStockItemID", nullable = false)
	public int getCdStockItemId() {
		return this.cdStockItemId;
	}

	public void setCdStockItemId(int cdStockItemId) {
		this.cdStockItemId = cdStockItemId;
	}

	@Column(name = "CdStoreID", nullable = false)
	public short getCdStoreId() {
		return this.cdStoreId;
	}

	public void setCdStoreId(short cdStoreId) {
		this.cdStoreId = cdStoreId;
	}

	@Column(name = "CdCreationDate", nullable = false, length = 23)
	public Date getCdCreationDate() {
		return this.cdCreationDate;
	}

	public void setCdCreationDate(Date cdCreationDate) {
		this.cdCreationDate = cdCreationDate;
	}

	@Column(name = "CdPOID_N")
	public Integer getCdPoidN() {
		return this.cdPoidN;
	}

	public void setCdPoidN(Integer cdPoidN) {
		this.cdPoidN = cdPoidN;
	}

	@Column(name = "CdQtyIn", nullable = false)
	public short getCdQtyIn() {
		return this.cdQtyIn;
	}

	public void setCdQtyIn(short cdQtyIn) {
		this.cdQtyIn = cdQtyIn;
	}

	@Column(name = "CdPickedUpDate_N", length = 23)
	public Date getCdPickedUpDateN() {
		return this.cdPickedUpDateN;
	}

	public void setCdPickedUpDateN(Date cdPickedUpDateN) {
		this.cdPickedUpDateN = cdPickedUpDateN;
	}

	@Column(name = "CdNotifiedDate_N", length = 23)
	public Date getCdNotifiedDateN() {
		return this.cdNotifiedDateN;
	}

	public void setCdNotifiedDateN(Date cdNotifiedDateN) {
		this.cdNotifiedDateN = cdNotifiedDateN;
	}

	@Column(name = "CdContactMethodID_N")
	public Integer getCdContactMethodIdN() {
		return this.cdContactMethodIdN;
	}

	public void setCdContactMethodIdN(Integer cdContactMethodIdN) {
		this.cdContactMethodIdN = cdContactMethodIdN;
	}

	@Column(name = "CdNotesTx_N")
	public String getCdNotesTxN() {
		return this.cdNotesTxN;
	}

	public void setCdNotesTxN(String cdNotesTxN) {
		this.cdNotesTxN = cdNotesTxN;
	}

	@Column(name = "CdPONotesTx_N")
	public String getCdPonotesTxN() {
		return this.cdPonotesTxN;
	}

	public void setCdPonotesTxN(String cdPonotesTxN) {
		this.cdPonotesTxN = cdPonotesTxN;
	}

	@Column(name = "CdLastUpdatedDate", nullable = false, length = 23)
	public Date getCdLastUpdatedDate() {
		return this.cdLastUpdatedDate;
	}

	public void setCdLastUpdatedDate(Date cdLastUpdatedDate) {
		this.cdLastUpdatedDate = cdLastUpdatedDate;
	}

	@Column(name = "CdLocationTx_N")
	public String getCdLocationTxN() {
		return this.cdLocationTxN;
	}

	public void setCdLocationTxN(String cdLocationTxN) {
		this.cdLocationTxN = cdLocationTxN;
	}

	@Column(name = "CdInvoiceItemID_N")
	public Integer getCdInvoiceItemIdN() {
		return this.cdInvoiceItemIdN;
	}

	public void setCdInvoiceItemIdN(Integer cdInvoiceItemIdN) {
		this.cdInvoiceItemIdN = cdInvoiceItemIdN;
	}

	@Column(name = "CdRequiredByDate_N", length = 23)
	public Date getCdRequiredByDateN() {
		return this.cdRequiredByDateN;
	}

	public void setCdRequiredByDateN(Date cdRequiredByDateN) {
		this.cdRequiredByDateN = cdRequiredByDateN;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof D01CdCustOrderId))
			return false;
		D01CdCustOrderId castOther = (D01CdCustOrderId) other;

		return (this.getCdCustOrderId() == castOther.getCdCustOrderId())
				&& (this.getCdEmpId() == castOther.getCdEmpId()) && (this.getCdCustId() == castOther.getCdCustId())
				&& (this.getCdStockItemId() == castOther.getCdStockItemId())
				&& (this.getCdStoreId() == castOther.getCdStoreId())
				&& ((this.getCdCreationDate() == castOther.getCdCreationDate())
						|| (this.getCdCreationDate() != null && castOther.getCdCreationDate() != null
								&& this.getCdCreationDate().equals(castOther.getCdCreationDate())))
				&& ((this.getCdPoidN() == castOther.getCdPoidN()) || (this.getCdPoidN() != null
						&& castOther.getCdPoidN() != null && this.getCdPoidN().equals(castOther.getCdPoidN())))
				&& (this.getCdQtyIn() == castOther.getCdQtyIn())
				&& ((this.getCdPickedUpDateN() == castOther.getCdPickedUpDateN())
						|| (this.getCdPickedUpDateN() != null && castOther.getCdPickedUpDateN() != null
								&& this.getCdPickedUpDateN().equals(castOther.getCdPickedUpDateN())))
				&& ((this.getCdNotifiedDateN() == castOther.getCdNotifiedDateN())
						|| (this.getCdNotifiedDateN() != null && castOther.getCdNotifiedDateN() != null
								&& this.getCdNotifiedDateN().equals(castOther.getCdNotifiedDateN())))
				&& ((this.getCdContactMethodIdN() == castOther.getCdContactMethodIdN())
						|| (this.getCdContactMethodIdN() != null && castOther.getCdContactMethodIdN() != null
								&& this.getCdContactMethodIdN().equals(castOther.getCdContactMethodIdN())))
				&& ((this.getCdNotesTxN() == castOther.getCdNotesTxN()) || (this.getCdNotesTxN() != null
						&& castOther.getCdNotesTxN() != null && this.getCdNotesTxN().equals(castOther.getCdNotesTxN())))
				&& ((this.getCdPonotesTxN() == castOther.getCdPonotesTxN())
						|| (this.getCdPonotesTxN() != null && castOther.getCdPonotesTxN() != null
								&& this.getCdPonotesTxN().equals(castOther.getCdPonotesTxN())))
				&& ((this.getCdLastUpdatedDate() == castOther.getCdLastUpdatedDate())
						|| (this.getCdLastUpdatedDate() != null && castOther.getCdLastUpdatedDate() != null
								&& this.getCdLastUpdatedDate().equals(castOther.getCdLastUpdatedDate())))
				&& ((this.getCdLocationTxN() == castOther.getCdLocationTxN())
						|| (this.getCdLocationTxN() != null && castOther.getCdLocationTxN() != null
								&& this.getCdLocationTxN().equals(castOther.getCdLocationTxN())))
				&& ((this.getCdInvoiceItemIdN() == castOther.getCdInvoiceItemIdN())
						|| (this.getCdInvoiceItemIdN() != null && castOther.getCdInvoiceItemIdN() != null
								&& this.getCdInvoiceItemIdN().equals(castOther.getCdInvoiceItemIdN())))
				&& ((this.getCdRequiredByDateN() == castOther.getCdRequiredByDateN())
						|| (this.getCdRequiredByDateN() != null && castOther.getCdRequiredByDateN() != null
								&& this.getCdRequiredByDateN().equals(castOther.getCdRequiredByDateN())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCdCustOrderId();
		result = 37 * result + this.getCdEmpId();
		result = 37 * result + this.getCdCustId();
		result = 37 * result + this.getCdStockItemId();
		result = 37 * result + this.getCdStoreId();
		result = 37 * result + (getCdCreationDate() == null ? 0 : this.getCdCreationDate().hashCode());
		result = 37 * result + (getCdPoidN() == null ? 0 : this.getCdPoidN().hashCode());
		result = 37 * result + this.getCdQtyIn();
		result = 37 * result + (getCdPickedUpDateN() == null ? 0 : this.getCdPickedUpDateN().hashCode());
		result = 37 * result + (getCdNotifiedDateN() == null ? 0 : this.getCdNotifiedDateN().hashCode());
		result = 37 * result + (getCdContactMethodIdN() == null ? 0 : this.getCdContactMethodIdN().hashCode());
		result = 37 * result + (getCdNotesTxN() == null ? 0 : this.getCdNotesTxN().hashCode());
		result = 37 * result + (getCdPonotesTxN() == null ? 0 : this.getCdPonotesTxN().hashCode());
		result = 37 * result + (getCdLastUpdatedDate() == null ? 0 : this.getCdLastUpdatedDate().hashCode());
		result = 37 * result + (getCdLocationTxN() == null ? 0 : this.getCdLocationTxN().hashCode());
		result = 37 * result + (getCdInvoiceItemIdN() == null ? 0 : this.getCdInvoiceItemIdN().hashCode());
		result = 37 * result + (getCdRequiredByDateN() == null ? 0 : this.getCdRequiredByDateN().hashCode());
		return result;
	}

}
