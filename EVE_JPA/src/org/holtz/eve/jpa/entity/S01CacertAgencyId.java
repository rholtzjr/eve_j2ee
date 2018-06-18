package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * S01CacertAgencyId generated by hbm2java
 */
@Embeddable
public class S01CacertAgencyId implements java.io.Serializable {

	private int cacertAgencyId;
	private String cacontactTxN;
	private String cacertAgencyTx;
	private String caaddress1txN;
	private String caaddress2txN;
	private String caaddress3txN;
	private String caaddress4txN;
	private String capostcodeTxN;
	private String cacountryTxN;
	private String catelTxN;
	private String cafaxTxN;
	private String caemailTxN;
	private String caurltxN;
	private Date calastUpdatedDate;
	private boolean caunavailableBl;
	private String capicurltxN;
	private boolean carequiredBl;
	private Date cacreationDate;

	public S01CacertAgencyId() {
	}

	public S01CacertAgencyId(int cacertAgencyId, String cacertAgencyTx, Date calastUpdatedDate,
			boolean caunavailableBl, boolean carequiredBl, Date cacreationDate) {
		this.cacertAgencyId = cacertAgencyId;
		this.cacertAgencyTx = cacertAgencyTx;
		this.calastUpdatedDate = calastUpdatedDate;
		this.caunavailableBl = caunavailableBl;
		this.carequiredBl = carequiredBl;
		this.cacreationDate = cacreationDate;
	}

	public S01CacertAgencyId(int cacertAgencyId, String cacontactTxN, String cacertAgencyTx,
			String caaddress1txN, String caaddress2txN, String caaddress3txN,
			String caaddress4txN, String capostcodeTxN, String cacountryTxN, String catelTxN,
			String cafaxTxN, String caemailTxN, String caurltxN, Date calastUpdatedDate,
			boolean caunavailableBl, String capicurltxN, boolean carequiredBl, Date cacreationDate) {
		this.cacertAgencyId = cacertAgencyId;
		this.cacontactTxN = cacontactTxN;
		this.cacertAgencyTx = cacertAgencyTx;
		this.caaddress1txN = caaddress1txN;
		this.caaddress2txN = caaddress2txN;
		this.caaddress3txN = caaddress3txN;
		this.caaddress4txN = caaddress4txN;
		this.capostcodeTxN = capostcodeTxN;
		this.cacountryTxN = cacountryTxN;
		this.catelTxN = catelTxN;
		this.cafaxTxN = cafaxTxN;
		this.caemailTxN = caemailTxN;
		this.caurltxN = caurltxN;
		this.calastUpdatedDate = calastUpdatedDate;
		this.caunavailableBl = caunavailableBl;
		this.capicurltxN = capicurltxN;
		this.carequiredBl = carequiredBl;
		this.cacreationDate = cacreationDate;
	}

	@Column(name = "CACertAgencyID", nullable = false)
	public int getCacertAgencyId() {
		return this.cacertAgencyId;
	}

	public void setCacertAgencyId(int cacertAgencyId) {
		this.cacertAgencyId = cacertAgencyId;
	}

	@Column(name = "CAContactTx_N")
	public String getCacontactTxN() {
		return this.cacontactTxN;
	}

	public void setCacontactTxN(String cacontactTxN) {
		this.cacontactTxN = cacontactTxN;
	}

	@Column(name = "CACertAgencyTx", nullable = false)
	public String getCacertAgencyTx() {
		return this.cacertAgencyTx;
	}

	public void setCacertAgencyTx(String cacertAgencyTx) {
		this.cacertAgencyTx = cacertAgencyTx;
	}

	@Column(name = "CAAddress1Tx_N")
	public String getCaaddress1txN() {
		return this.caaddress1txN;
	}

	public void setCaaddress1txN(String caaddress1txN) {
		this.caaddress1txN = caaddress1txN;
	}

	@Column(name = "CAAddress2Tx_N")
	public String getCaaddress2txN() {
		return this.caaddress2txN;
	}

	public void setCaaddress2txN(String caaddress2txN) {
		this.caaddress2txN = caaddress2txN;
	}

	@Column(name = "CAAddress3Tx_N")
	public String getCaaddress3txN() {
		return this.caaddress3txN;
	}

	public void setCaaddress3txN(String caaddress3txN) {
		this.caaddress3txN = caaddress3txN;
	}

	@Column(name = "CAAddress4Tx_N")
	public String getCaaddress4txN() {
		return this.caaddress4txN;
	}

	public void setCaaddress4txN(String caaddress4txN) {
		this.caaddress4txN = caaddress4txN;
	}

	@Column(name = "CAPostcodeTx_N")
	public String getCapostcodeTxN() {
		return this.capostcodeTxN;
	}

	public void setCapostcodeTxN(String capostcodeTxN) {
		this.capostcodeTxN = capostcodeTxN;
	}

	@Column(name = "CACountryTx_N")
	public String getCacountryTxN() {
		return this.cacountryTxN;
	}

	public void setCacountryTxN(String cacountryTxN) {
		this.cacountryTxN = cacountryTxN;
	}

	@Column(name = "CATelTx_N")
	public String getCatelTxN() {
		return this.catelTxN;
	}

	public void setCatelTxN(String catelTxN) {
		this.catelTxN = catelTxN;
	}

	@Column(name = "CAFaxTx_N")
	public String getCafaxTxN() {
		return this.cafaxTxN;
	}

	public void setCafaxTxN(String cafaxTxN) {
		this.cafaxTxN = cafaxTxN;
	}

	@Column(name = "CAEMailTx_N")
	public String getCaemailTxN() {
		return this.caemailTxN;
	}

	public void setCaemailTxN(String caemailTxN) {
		this.caemailTxN = caemailTxN;
	}

	@Column(name = "CAURLTx_N")
	public String getCaurltxN() {
		return this.caurltxN;
	}

	public void setCaurltxN(String caurltxN) {
		this.caurltxN = caurltxN;
	}

	@Column(name = "CALastUpdatedDate", nullable = false, length = 23)
	public Date getCalastUpdatedDate() {
		return this.calastUpdatedDate;
	}

	public void setCalastUpdatedDate(Date calastUpdatedDate) {
		this.calastUpdatedDate = calastUpdatedDate;
	}

	@Column(name = "CAUnavailableBl", nullable = false)
	public boolean isCaunavailableBl() {
		return this.caunavailableBl;
	}

	public void setCaunavailableBl(boolean caunavailableBl) {
		this.caunavailableBl = caunavailableBl;
	}

	@Column(name = "CAPICURLTx_N")
	public String getCapicurltxN() {
		return this.capicurltxN;
	}

	public void setCapicurltxN(String capicurltxN) {
		this.capicurltxN = capicurltxN;
	}

	@Column(name = "CARequiredBl", nullable = false)
	public boolean isCarequiredBl() {
		return this.carequiredBl;
	}

	public void setCarequiredBl(boolean carequiredBl) {
		this.carequiredBl = carequiredBl;
	}

	@Column(name = "CACreationDate", nullable = false, length = 23)
	public Date getCacreationDate() {
		return this.cacreationDate;
	}

	public void setCacreationDate(Date cacreationDate) {
		this.cacreationDate = cacreationDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof S01CacertAgencyId))
			return false;
		S01CacertAgencyId castOther = (S01CacertAgencyId) other;

		return (this.getCacertAgencyId() == castOther.getCacertAgencyId())
				&& ((this.getCacontactTxN() == castOther.getCacontactTxN())
						|| (this.getCacontactTxN() != null && castOther.getCacontactTxN() != null
								&& this.getCacontactTxN().equals(castOther.getCacontactTxN())))
				&& ((this.getCacertAgencyTx() == castOther.getCacertAgencyTx())
						|| (this.getCacertAgencyTx() != null && castOther.getCacertAgencyTx() != null
								&& this.getCacertAgencyTx().equals(castOther.getCacertAgencyTx())))
				&& ((this.getCaaddress1txN() == castOther.getCaaddress1txN())
						|| (this.getCaaddress1txN() != null && castOther.getCaaddress1txN() != null
								&& this.getCaaddress1txN().equals(castOther.getCaaddress1txN())))
				&& ((this.getCaaddress2txN() == castOther.getCaaddress2txN())
						|| (this.getCaaddress2txN() != null && castOther.getCaaddress2txN() != null
								&& this.getCaaddress2txN().equals(castOther.getCaaddress2txN())))
				&& ((this.getCaaddress3txN() == castOther.getCaaddress3txN())
						|| (this.getCaaddress3txN() != null && castOther.getCaaddress3txN() != null
								&& this.getCaaddress3txN().equals(castOther.getCaaddress3txN())))
				&& ((this.getCaaddress4txN() == castOther.getCaaddress4txN())
						|| (this.getCaaddress4txN() != null && castOther.getCaaddress4txN() != null
								&& this.getCaaddress4txN().equals(castOther.getCaaddress4txN())))
				&& ((this.getCapostcodeTxN() == castOther.getCapostcodeTxN())
						|| (this.getCapostcodeTxN() != null && castOther.getCapostcodeTxN() != null
								&& this.getCapostcodeTxN().equals(castOther.getCapostcodeTxN())))
				&& ((this.getCacountryTxN() == castOther.getCacountryTxN())
						|| (this.getCacountryTxN() != null && castOther.getCacountryTxN() != null
								&& this.getCacountryTxN().equals(castOther.getCacountryTxN())))
				&& ((this.getCatelTxN() == castOther.getCatelTxN()) || (this.getCatelTxN() != null
						&& castOther.getCatelTxN() != null && this.getCatelTxN().equals(castOther.getCatelTxN())))
				&& ((this.getCafaxTxN() == castOther.getCafaxTxN()) || (this.getCafaxTxN() != null
						&& castOther.getCafaxTxN() != null && this.getCafaxTxN().equals(castOther.getCafaxTxN())))
				&& ((this.getCaemailTxN() == castOther.getCaemailTxN()) || (this.getCaemailTxN() != null
						&& castOther.getCaemailTxN() != null && this.getCaemailTxN().equals(castOther.getCaemailTxN())))
				&& ((this.getCaurltxN() == castOther.getCaurltxN()) || (this.getCaurltxN() != null
						&& castOther.getCaurltxN() != null && this.getCaurltxN().equals(castOther.getCaurltxN())))
				&& ((this.getCalastUpdatedDate() == castOther.getCalastUpdatedDate())
						|| (this.getCalastUpdatedDate() != null && castOther.getCalastUpdatedDate() != null
								&& this.getCalastUpdatedDate().equals(castOther.getCalastUpdatedDate())))
				&& (this.isCaunavailableBl() == castOther.isCaunavailableBl())
				&& ((this.getCapicurltxN() == castOther.getCapicurltxN())
						|| (this.getCapicurltxN() != null && castOther.getCapicurltxN() != null
								&& this.getCapicurltxN().equals(castOther.getCapicurltxN())))
				&& (this.isCarequiredBl() == castOther.isCarequiredBl())
				&& ((this.getCacreationDate() == castOther.getCacreationDate())
						|| (this.getCacreationDate() != null && castOther.getCacreationDate() != null
								&& this.getCacreationDate().equals(castOther.getCacreationDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCacertAgencyId();
		result = 37 * result + (getCacontactTxN() == null ? 0 : this.getCacontactTxN().hashCode());
		result = 37 * result + (getCacertAgencyTx() == null ? 0 : this.getCacertAgencyTx().hashCode());
		result = 37 * result + (getCaaddress1txN() == null ? 0 : this.getCaaddress1txN().hashCode());
		result = 37 * result + (getCaaddress2txN() == null ? 0 : this.getCaaddress2txN().hashCode());
		result = 37 * result + (getCaaddress3txN() == null ? 0 : this.getCaaddress3txN().hashCode());
		result = 37 * result + (getCaaddress4txN() == null ? 0 : this.getCaaddress4txN().hashCode());
		result = 37 * result + (getCapostcodeTxN() == null ? 0 : this.getCapostcodeTxN().hashCode());
		result = 37 * result + (getCacountryTxN() == null ? 0 : this.getCacountryTxN().hashCode());
		result = 37 * result + (getCatelTxN() == null ? 0 : this.getCatelTxN().hashCode());
		result = 37 * result + (getCafaxTxN() == null ? 0 : this.getCafaxTxN().hashCode());
		result = 37 * result + (getCaemailTxN() == null ? 0 : this.getCaemailTxN().hashCode());
		result = 37 * result + (getCaurltxN() == null ? 0 : this.getCaurltxN().hashCode());
		result = 37 * result + (getCalastUpdatedDate() == null ? 0 : this.getCalastUpdatedDate().hashCode());
		result = 37 * result + (this.isCaunavailableBl() ? 1 : 0);
		result = 37 * result + (getCapicurltxN() == null ? 0 : this.getCapicurltxN().hashCode());
		result = 37 * result + (this.isCarequiredBl() ? 1 : 0);
		result = 37 * result + (getCacreationDate() == null ? 0 : this.getCacreationDate().hashCode());
		return result;
	}

}
