package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TXpPostcodeLookupId generated by hbm2java
 */
@Embeddable
public class TXpPostcodeLookupId implements java.io.Serializable {

	private int xpPostcodeLookupId;
	private String xpPostcodeTx;
	private String xpAddress2txN;
	private String xpAddress3txN;
	private String xpAddress4txN;
	private Integer xpStateIdN;
	private Integer xpCountryIdN;
	private boolean xpUnavailableBl;
	private Date xpCreationDate;
	private Date xpLastUpdatedDate;

	public TXpPostcodeLookupId() {
	}

	public TXpPostcodeLookupId(int xpPostcodeLookupId, String xpPostcodeTx, boolean xpUnavailableBl,
			Date xpCreationDate, Date xpLastUpdatedDate) {
		this.xpPostcodeLookupId = xpPostcodeLookupId;
		this.xpPostcodeTx = xpPostcodeTx;
		this.xpUnavailableBl = xpUnavailableBl;
		this.xpCreationDate = xpCreationDate;
		this.xpLastUpdatedDate = xpLastUpdatedDate;
	}

	public TXpPostcodeLookupId(int xpPostcodeLookupId, String xpPostcodeTx, String xpAddress2txN,
			String xpAddress3txN, String xpAddress4txN, Integer xpStateIdN, Integer xpCountryIdN,
			boolean xpUnavailableBl, Date xpCreationDate, Date xpLastUpdatedDate) {
		this.xpPostcodeLookupId = xpPostcodeLookupId;
		this.xpPostcodeTx = xpPostcodeTx;
		this.xpAddress2txN = xpAddress2txN;
		this.xpAddress3txN = xpAddress3txN;
		this.xpAddress4txN = xpAddress4txN;
		this.xpStateIdN = xpStateIdN;
		this.xpCountryIdN = xpCountryIdN;
		this.xpUnavailableBl = xpUnavailableBl;
		this.xpCreationDate = xpCreationDate;
		this.xpLastUpdatedDate = xpLastUpdatedDate;
	}

	@Column(name = "XpPostcodeLookupID", nullable = false)
	public int getXpPostcodeLookupId() {
		return this.xpPostcodeLookupId;
	}

	public void setXpPostcodeLookupId(int xpPostcodeLookupId) {
		this.xpPostcodeLookupId = xpPostcodeLookupId;
	}

	@Column(name = "XpPostcodeTx", unique = true, nullable = false)
	public String getXpPostcodeTx() {
		return this.xpPostcodeTx;
	}

	public void setXpPostcodeTx(String xpPostcodeTx) {
		this.xpPostcodeTx = xpPostcodeTx;
	}

	@Column(name = "XpAddress2Tx_N")
	public String getXpAddress2txN() {
		return this.xpAddress2txN;
	}

	public void setXpAddress2txN(String xpAddress2txN) {
		this.xpAddress2txN = xpAddress2txN;
	}

	@Column(name = "XpAddress3Tx_N")
	public String getXpAddress3txN() {
		return this.xpAddress3txN;
	}

	public void setXpAddress3txN(String xpAddress3txN) {
		this.xpAddress3txN = xpAddress3txN;
	}

	@Column(name = "XpAddress4Tx_N")
	public String getXpAddress4txN() {
		return this.xpAddress4txN;
	}

	public void setXpAddress4txN(String xpAddress4txN) {
		this.xpAddress4txN = xpAddress4txN;
	}

	@Column(name = "XpStateID_N")
	public Integer getXpStateIdN() {
		return this.xpStateIdN;
	}

	public void setXpStateIdN(Integer xpStateIdN) {
		this.xpStateIdN = xpStateIdN;
	}

	@Column(name = "XpCountryID_N")
	public Integer getXpCountryIdN() {
		return this.xpCountryIdN;
	}

	public void setXpCountryIdN(Integer xpCountryIdN) {
		this.xpCountryIdN = xpCountryIdN;
	}

	@Column(name = "XpUnavailableBl", nullable = false)
	public boolean isXpUnavailableBl() {
		return this.xpUnavailableBl;
	}

	public void setXpUnavailableBl(boolean xpUnavailableBl) {
		this.xpUnavailableBl = xpUnavailableBl;
	}

	@Column(name = "XpCreationDate", nullable = false, length = 23)
	public Date getXpCreationDate() {
		return this.xpCreationDate;
	}

	public void setXpCreationDate(Date xpCreationDate) {
		this.xpCreationDate = xpCreationDate;
	}

	@Column(name = "XpLastUpdatedDate", nullable = false, length = 23)
	public Date getXpLastUpdatedDate() {
		return this.xpLastUpdatedDate;
	}

	public void setXpLastUpdatedDate(Date xpLastUpdatedDate) {
		this.xpLastUpdatedDate = xpLastUpdatedDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TXpPostcodeLookupId))
			return false;
		TXpPostcodeLookupId castOther = (TXpPostcodeLookupId) other;

		return (this.getXpPostcodeLookupId() == castOther.getXpPostcodeLookupId())
				&& ((this.getXpPostcodeTx() == castOther.getXpPostcodeTx())
						|| (this.getXpPostcodeTx() != null && castOther.getXpPostcodeTx() != null
								&& this.getXpPostcodeTx().equals(castOther.getXpPostcodeTx())))
				&& ((this.getXpAddress2txN() == castOther.getXpAddress2txN())
						|| (this.getXpAddress2txN() != null && castOther.getXpAddress2txN() != null
								&& this.getXpAddress2txN().equals(castOther.getXpAddress2txN())))
				&& ((this.getXpAddress3txN() == castOther.getXpAddress3txN())
						|| (this.getXpAddress3txN() != null && castOther.getXpAddress3txN() != null
								&& this.getXpAddress3txN().equals(castOther.getXpAddress3txN())))
				&& ((this.getXpAddress4txN() == castOther.getXpAddress4txN())
						|| (this.getXpAddress4txN() != null && castOther.getXpAddress4txN() != null
								&& this.getXpAddress4txN().equals(castOther.getXpAddress4txN())))
				&& ((this.getXpStateIdN() == castOther.getXpStateIdN()) || (this.getXpStateIdN() != null
						&& castOther.getXpStateIdN() != null && this.getXpStateIdN().equals(castOther.getXpStateIdN())))
				&& ((this.getXpCountryIdN() == castOther.getXpCountryIdN())
						|| (this.getXpCountryIdN() != null && castOther.getXpCountryIdN() != null
								&& this.getXpCountryIdN().equals(castOther.getXpCountryIdN())))
				&& (this.isXpUnavailableBl() == castOther.isXpUnavailableBl())
				&& ((this.getXpCreationDate() == castOther.getXpCreationDate())
						|| (this.getXpCreationDate() != null && castOther.getXpCreationDate() != null
								&& this.getXpCreationDate().equals(castOther.getXpCreationDate())))
				&& ((this.getXpLastUpdatedDate() == castOther.getXpLastUpdatedDate())
						|| (this.getXpLastUpdatedDate() != null && castOther.getXpLastUpdatedDate() != null
								&& this.getXpLastUpdatedDate().equals(castOther.getXpLastUpdatedDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getXpPostcodeLookupId();
		result = 37 * result + (getXpPostcodeTx() == null ? 0 : this.getXpPostcodeTx().hashCode());
		result = 37 * result + (getXpAddress2txN() == null ? 0 : this.getXpAddress2txN().hashCode());
		result = 37 * result + (getXpAddress3txN() == null ? 0 : this.getXpAddress3txN().hashCode());
		result = 37 * result + (getXpAddress4txN() == null ? 0 : this.getXpAddress4txN().hashCode());
		result = 37 * result + (getXpStateIdN() == null ? 0 : this.getXpStateIdN().hashCode());
		result = 37 * result + (getXpCountryIdN() == null ? 0 : this.getXpCountryIdN().hashCode());
		result = 37 * result + (this.isXpUnavailableBl() ? 1 : 0);
		result = 37 * result + (getXpCreationDate() == null ? 0 : this.getXpCreationDate().hashCode());
		result = 37 * result + (getXpLastUpdatedDate() == null ? 0 : this.getXpLastUpdatedDate().hashCode());
		return result;
	}

}
