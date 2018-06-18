package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * D01GcgiftCertId generated by hbm2java
 */
@Embeddable
public class D01GcgiftCertId implements java.io.Serializable {

	private int gcgiftCertId;
	private String gcgiftCertNoTx;
	private int gcpurchasedById;
	private int gcownedById;
	private short gcstoreId;
	private int gccostCenterId;
	private Integer gcpurchasedInvoiceIdN;
	private Integer gcusedInvoiceIdN;
	private Date gccreationDate;
	private Date gcexpiryDate;
	private Date gcactualExpiryDateN;
	private int gcempId;
	private double gcamountMn;
	private short gccurrencyId;
	private float gcexchangeRateFl;
	private Date gclastUpdatedDate;
	private short gcpcid;
	private int gctransStatusId;
	private String gcnotesTxN;
	private Date gcvoidDateN;
	private String gcvoidReasonTxN;
	private Integer gcaccountingPeriodIdN;
	private int gcgiftCertTypeId;

	public D01GcgiftCertId() {
	}

	public D01GcgiftCertId(int gcgiftCertId, int gcpurchasedById, int gcownedById, short gcstoreId, int gccostCenterId,
			Date gccreationDate, Date gcexpiryDate, int gcempId, double gcamountMn, short gccurrencyId,
			float gcexchangeRateFl, Date gclastUpdatedDate, short gcpcid, int gctransStatusId, int gcgiftCertTypeId) {
		this.gcgiftCertId = gcgiftCertId;
		this.gcpurchasedById = gcpurchasedById;
		this.gcownedById = gcownedById;
		this.gcstoreId = gcstoreId;
		this.gccostCenterId = gccostCenterId;
		this.gccreationDate = gccreationDate;
		this.gcexpiryDate = gcexpiryDate;
		this.gcempId = gcempId;
		this.gcamountMn = gcamountMn;
		this.gccurrencyId = gccurrencyId;
		this.gcexchangeRateFl = gcexchangeRateFl;
		this.gclastUpdatedDate = gclastUpdatedDate;
		this.gcpcid = gcpcid;
		this.gctransStatusId = gctransStatusId;
		this.gcgiftCertTypeId = gcgiftCertTypeId;
	}

	public D01GcgiftCertId(int gcgiftCertId, String gcgiftCertNoTx, int gcpurchasedById, int gcownedById,
			short gcstoreId, int gccostCenterId, Integer gcpurchasedInvoiceIdN, Integer gcusedInvoiceIdN,
			Date gccreationDate, Date gcexpiryDate, Date gcactualExpiryDateN, int gcempId, double gcamountMn,
			short gccurrencyId, float gcexchangeRateFl, Date gclastUpdatedDate, short gcpcid, int gctransStatusId,
			String gcnotesTxN, Date gcvoidDateN, String gcvoidReasonTxN, Integer gcaccountingPeriodIdN,
			int gcgiftCertTypeId) {
		this.gcgiftCertId = gcgiftCertId;
		this.gcgiftCertNoTx = gcgiftCertNoTx;
		this.gcpurchasedById = gcpurchasedById;
		this.gcownedById = gcownedById;
		this.gcstoreId = gcstoreId;
		this.gccostCenterId = gccostCenterId;
		this.gcpurchasedInvoiceIdN = gcpurchasedInvoiceIdN;
		this.gcusedInvoiceIdN = gcusedInvoiceIdN;
		this.gccreationDate = gccreationDate;
		this.gcexpiryDate = gcexpiryDate;
		this.gcactualExpiryDateN = gcactualExpiryDateN;
		this.gcempId = gcempId;
		this.gcamountMn = gcamountMn;
		this.gccurrencyId = gccurrencyId;
		this.gcexchangeRateFl = gcexchangeRateFl;
		this.gclastUpdatedDate = gclastUpdatedDate;
		this.gcpcid = gcpcid;
		this.gctransStatusId = gctransStatusId;
		this.gcnotesTxN = gcnotesTxN;
		this.gcvoidDateN = gcvoidDateN;
		this.gcvoidReasonTxN = gcvoidReasonTxN;
		this.gcaccountingPeriodIdN = gcaccountingPeriodIdN;
		this.gcgiftCertTypeId = gcgiftCertTypeId;
	}

	@Column(name = "GCGiftCertID", nullable = false)
	public int getGcgiftCertId() {
		return this.gcgiftCertId;
	}

	public void setGcgiftCertId(int gcgiftCertId) {
		this.gcgiftCertId = gcgiftCertId;
	}

	@Column(name = "GCGiftCertNoTx")
	public String getGcgiftCertNoTx() {
		return this.gcgiftCertNoTx;
	}

	public void setGcgiftCertNoTx(String gcgiftCertNoTx) {
		this.gcgiftCertNoTx = gcgiftCertNoTx;
	}

	@Column(name = "GCPurchasedByID", nullable = false)
	public int getGcpurchasedById() {
		return this.gcpurchasedById;
	}

	public void setGcpurchasedById(int gcpurchasedById) {
		this.gcpurchasedById = gcpurchasedById;
	}

	@Column(name = "GCOwnedByID", nullable = false)
	public int getGcownedById() {
		return this.gcownedById;
	}

	public void setGcownedById(int gcownedById) {
		this.gcownedById = gcownedById;
	}

	@Column(name = "GCStoreID", nullable = false)
	public short getGcstoreId() {
		return this.gcstoreId;
	}

	public void setGcstoreId(short gcstoreId) {
		this.gcstoreId = gcstoreId;
	}

	@Column(name = "GCCostCenterID", nullable = false)
	public int getGccostCenterId() {
		return this.gccostCenterId;
	}

	public void setGccostCenterId(int gccostCenterId) {
		this.gccostCenterId = gccostCenterId;
	}

	@Column(name = "GCPurchasedInvoiceID_N")
	public Integer getGcpurchasedInvoiceIdN() {
		return this.gcpurchasedInvoiceIdN;
	}

	public void setGcpurchasedInvoiceIdN(Integer gcpurchasedInvoiceIdN) {
		this.gcpurchasedInvoiceIdN = gcpurchasedInvoiceIdN;
	}

	@Column(name = "GCUsedInvoiceID_N")
	public Integer getGcusedInvoiceIdN() {
		return this.gcusedInvoiceIdN;
	}

	public void setGcusedInvoiceIdN(Integer gcusedInvoiceIdN) {
		this.gcusedInvoiceIdN = gcusedInvoiceIdN;
	}

	@Column(name = "GCCreationDate", nullable = false, length = 23)
	public Date getGccreationDate() {
		return this.gccreationDate;
	}

	public void setGccreationDate(Date gccreationDate) {
		this.gccreationDate = gccreationDate;
	}

	@Column(name = "GCExpiryDate", nullable = false, length = 23)
	public Date getGcexpiryDate() {
		return this.gcexpiryDate;
	}

	public void setGcexpiryDate(Date gcexpiryDate) {
		this.gcexpiryDate = gcexpiryDate;
	}

	@Column(name = "GCActualExpiryDate_N", length = 23)
	public Date getGcactualExpiryDateN() {
		return this.gcactualExpiryDateN;
	}

	public void setGcactualExpiryDateN(Date gcactualExpiryDateN) {
		this.gcactualExpiryDateN = gcactualExpiryDateN;
	}

	@Column(name = "GCEmpID", nullable = false)
	public int getGcempId() {
		return this.gcempId;
	}

	public void setGcempId(int gcempId) {
		this.gcempId = gcempId;
	}

	@Column(name = "GCAmountMn", nullable = false, precision = 53, scale = 0)
	public double getGcamountMn() {
		return this.gcamountMn;
	}

	public void setGcamountMn(double gcamountMn) {
		this.gcamountMn = gcamountMn;
	}

	@Column(name = "GCCurrencyID", nullable = false)
	public short getGccurrencyId() {
		return this.gccurrencyId;
	}

	public void setGccurrencyId(short gccurrencyId) {
		this.gccurrencyId = gccurrencyId;
	}

	@Column(name = "GCExchangeRateFl", nullable = false, precision = 24, scale = 0)
	public float getGcexchangeRateFl() {
		return this.gcexchangeRateFl;
	}

	public void setGcexchangeRateFl(float gcexchangeRateFl) {
		this.gcexchangeRateFl = gcexchangeRateFl;
	}

	@Column(name = "GCLastUpdatedDate", nullable = false, length = 23)
	public Date getGclastUpdatedDate() {
		return this.gclastUpdatedDate;
	}

	public void setGclastUpdatedDate(Date gclastUpdatedDate) {
		this.gclastUpdatedDate = gclastUpdatedDate;
	}

	@Column(name = "GCPCID", nullable = false)
	public short getGcpcid() {
		return this.gcpcid;
	}

	public void setGcpcid(short gcpcid) {
		this.gcpcid = gcpcid;
	}

	@Column(name = "GCTransStatusID", nullable = false)
	public int getGctransStatusId() {
		return this.gctransStatusId;
	}

	public void setGctransStatusId(int gctransStatusId) {
		this.gctransStatusId = gctransStatusId;
	}

	@Column(name = "GCNotesTx_N")
	public String getGcnotesTxN() {
		return this.gcnotesTxN;
	}

	public void setGcnotesTxN(String gcnotesTxN) {
		this.gcnotesTxN = gcnotesTxN;
	}

	@Column(name = "GCVoidDate_N", length = 23)
	public Date getGcvoidDateN() {
		return this.gcvoidDateN;
	}

	public void setGcvoidDateN(Date gcvoidDateN) {
		this.gcvoidDateN = gcvoidDateN;
	}

	@Column(name = "GCVoidReasonTx_N")
	public String getGcvoidReasonTxN() {
		return this.gcvoidReasonTxN;
	}

	public void setGcvoidReasonTxN(String gcvoidReasonTxN) {
		this.gcvoidReasonTxN = gcvoidReasonTxN;
	}

	@Column(name = "GCAccountingPeriodID_N")
	public Integer getGcaccountingPeriodIdN() {
		return this.gcaccountingPeriodIdN;
	}

	public void setGcaccountingPeriodIdN(Integer gcaccountingPeriodIdN) {
		this.gcaccountingPeriodIdN = gcaccountingPeriodIdN;
	}

	@Column(name = "GCGiftCertTypeID", nullable = false)
	public int getGcgiftCertTypeId() {
		return this.gcgiftCertTypeId;
	}

	public void setGcgiftCertTypeId(int gcgiftCertTypeId) {
		this.gcgiftCertTypeId = gcgiftCertTypeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof D01GcgiftCertId))
			return false;
		D01GcgiftCertId castOther = (D01GcgiftCertId) other;

		return (this.getGcgiftCertId() == castOther.getGcgiftCertId())
				&& ((this.getGcgiftCertNoTx() == castOther.getGcgiftCertNoTx())
						|| (this.getGcgiftCertNoTx() != null && castOther.getGcgiftCertNoTx() != null
								&& this.getGcgiftCertNoTx().equals(castOther.getGcgiftCertNoTx())))
				&& (this.getGcpurchasedById() == castOther.getGcpurchasedById())
				&& (this.getGcownedById() == castOther.getGcownedById())
				&& (this.getGcstoreId() == castOther.getGcstoreId())
				&& (this.getGccostCenterId() == castOther.getGccostCenterId())
				&& ((this.getGcpurchasedInvoiceIdN() == castOther.getGcpurchasedInvoiceIdN())
						|| (this.getGcpurchasedInvoiceIdN() != null && castOther.getGcpurchasedInvoiceIdN() != null
								&& this.getGcpurchasedInvoiceIdN().equals(castOther.getGcpurchasedInvoiceIdN())))
				&& ((this.getGcusedInvoiceIdN() == castOther.getGcusedInvoiceIdN())
						|| (this.getGcusedInvoiceIdN() != null && castOther.getGcusedInvoiceIdN() != null
								&& this.getGcusedInvoiceIdN().equals(castOther.getGcusedInvoiceIdN())))
				&& ((this.getGccreationDate() == castOther.getGccreationDate())
						|| (this.getGccreationDate() != null && castOther.getGccreationDate() != null
								&& this.getGccreationDate().equals(castOther.getGccreationDate())))
				&& ((this.getGcexpiryDate() == castOther.getGcexpiryDate())
						|| (this.getGcexpiryDate() != null && castOther.getGcexpiryDate() != null
								&& this.getGcexpiryDate().equals(castOther.getGcexpiryDate())))
				&& ((this.getGcactualExpiryDateN() == castOther.getGcactualExpiryDateN())
						|| (this.getGcactualExpiryDateN() != null && castOther.getGcactualExpiryDateN() != null
								&& this.getGcactualExpiryDateN().equals(castOther.getGcactualExpiryDateN())))
				&& (this.getGcempId() == castOther.getGcempId()) && (this.getGcamountMn() == castOther.getGcamountMn())
				&& (this.getGccurrencyId() == castOther.getGccurrencyId())
				&& (this.getGcexchangeRateFl() == castOther.getGcexchangeRateFl())
				&& ((this.getGclastUpdatedDate() == castOther.getGclastUpdatedDate())
						|| (this.getGclastUpdatedDate() != null && castOther.getGclastUpdatedDate() != null
								&& this.getGclastUpdatedDate().equals(castOther.getGclastUpdatedDate())))
				&& (this.getGcpcid() == castOther.getGcpcid())
				&& (this.getGctransStatusId() == castOther.getGctransStatusId())
				&& ((this.getGcnotesTxN() == castOther.getGcnotesTxN()) || (this.getGcnotesTxN() != null
						&& castOther.getGcnotesTxN() != null && this.getGcnotesTxN().equals(castOther.getGcnotesTxN())))
				&& ((this.getGcvoidDateN() == castOther.getGcvoidDateN())
						|| (this.getGcvoidDateN() != null && castOther.getGcvoidDateN() != null
								&& this.getGcvoidDateN().equals(castOther.getGcvoidDateN())))
				&& ((this.getGcvoidReasonTxN() == castOther.getGcvoidReasonTxN())
						|| (this.getGcvoidReasonTxN() != null && castOther.getGcvoidReasonTxN() != null
								&& this.getGcvoidReasonTxN().equals(castOther.getGcvoidReasonTxN())))
				&& ((this.getGcaccountingPeriodIdN() == castOther.getGcaccountingPeriodIdN())
						|| (this.getGcaccountingPeriodIdN() != null && castOther.getGcaccountingPeriodIdN() != null
								&& this.getGcaccountingPeriodIdN().equals(castOther.getGcaccountingPeriodIdN())))
				&& (this.getGcgiftCertTypeId() == castOther.getGcgiftCertTypeId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getGcgiftCertId();
		result = 37 * result + (getGcgiftCertNoTx() == null ? 0 : this.getGcgiftCertNoTx().hashCode());
		result = 37 * result + this.getGcpurchasedById();
		result = 37 * result + this.getGcownedById();
		result = 37 * result + this.getGcstoreId();
		result = 37 * result + this.getGccostCenterId();
		result = 37 * result + (getGcpurchasedInvoiceIdN() == null ? 0 : this.getGcpurchasedInvoiceIdN().hashCode());
		result = 37 * result + (getGcusedInvoiceIdN() == null ? 0 : this.getGcusedInvoiceIdN().hashCode());
		result = 37 * result + (getGccreationDate() == null ? 0 : this.getGccreationDate().hashCode());
		result = 37 * result + (getGcexpiryDate() == null ? 0 : this.getGcexpiryDate().hashCode());
		result = 37 * result + (getGcactualExpiryDateN() == null ? 0 : this.getGcactualExpiryDateN().hashCode());
		result = 37 * result + this.getGcempId();
		result = 37 * result + (int) this.getGcamountMn();
		result = 37 * result + this.getGccurrencyId();
		result = 37 * result + (int) this.getGcexchangeRateFl();
		result = 37 * result + (getGclastUpdatedDate() == null ? 0 : this.getGclastUpdatedDate().hashCode());
		result = 37 * result + this.getGcpcid();
		result = 37 * result + this.getGctransStatusId();
		result = 37 * result + (getGcnotesTxN() == null ? 0 : this.getGcnotesTxN().hashCode());
		result = 37 * result + (getGcvoidDateN() == null ? 0 : this.getGcvoidDateN().hashCode());
		result = 37 * result + (getGcvoidReasonTxN() == null ? 0 : this.getGcvoidReasonTxN().hashCode());
		result = 37 * result + (getGcaccountingPeriodIdN() == null ? 0 : this.getGcaccountingPeriodIdN().hashCode());
		result = 37 * result + this.getGcgiftCertTypeId();
		return result;
	}

}
