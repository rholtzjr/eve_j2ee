package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * D01DtDestinationId generated by hbm2java
 */
@Embeddable
public class D01DtDestinationId implements java.io.Serializable {

	private int dtDestinationId;
	private String dtDestinationTx;
	private boolean dtUnavailableBl;
	private String dtVideoTxN;
	private short dtMinNoIn;
	private short dtMaxNoIn;
	private Date dtLastUpdatedDate;
	private boolean dtRequiredBl;
	private Date dtCreationDate;
	private int dtForeColorIn;
	private int dtBackColorIn;
	private String dtPrefixTx;
	private String dtUrltxN;

	public D01DtDestinationId() {
	}

	public D01DtDestinationId(int dtDestinationId, String dtDestinationTx, boolean dtUnavailableBl,
			short dtMinNoIn, short dtMaxNoIn, Date dtLastUpdatedDate, boolean dtRequiredBl, Date dtCreationDate,
			int dtForeColorIn, int dtBackColorIn, String dtPrefixTx) {
		this.dtDestinationId = dtDestinationId;
		this.dtDestinationTx = dtDestinationTx;
		this.dtUnavailableBl = dtUnavailableBl;
		this.dtMinNoIn = dtMinNoIn;
		this.dtMaxNoIn = dtMaxNoIn;
		this.dtLastUpdatedDate = dtLastUpdatedDate;
		this.dtRequiredBl = dtRequiredBl;
		this.dtCreationDate = dtCreationDate;
		this.dtForeColorIn = dtForeColorIn;
		this.dtBackColorIn = dtBackColorIn;
		this.dtPrefixTx = dtPrefixTx;
	}

	public D01DtDestinationId(int dtDestinationId, String dtDestinationTx, boolean dtUnavailableBl,
			String dtVideoTxN, short dtMinNoIn, short dtMaxNoIn, Date dtLastUpdatedDate, boolean dtRequiredBl,
			Date dtCreationDate, int dtForeColorIn, int dtBackColorIn, String dtPrefixTx, String dtUrltxN) {
		this.dtDestinationId = dtDestinationId;
		this.dtDestinationTx = dtDestinationTx;
		this.dtUnavailableBl = dtUnavailableBl;
		this.dtVideoTxN = dtVideoTxN;
		this.dtMinNoIn = dtMinNoIn;
		this.dtMaxNoIn = dtMaxNoIn;
		this.dtLastUpdatedDate = dtLastUpdatedDate;
		this.dtRequiredBl = dtRequiredBl;
		this.dtCreationDate = dtCreationDate;
		this.dtForeColorIn = dtForeColorIn;
		this.dtBackColorIn = dtBackColorIn;
		this.dtPrefixTx = dtPrefixTx;
		this.dtUrltxN = dtUrltxN;
	}

	@Column(name = "DtDestinationID", nullable = false)
	public int getDtDestinationId() {
		return this.dtDestinationId;
	}

	public void setDtDestinationId(int dtDestinationId) {
		this.dtDestinationId = dtDestinationId;
	}

	@Column(name = "DtDestinationTx", nullable = false)
	public String getDtDestinationTx() {
		return this.dtDestinationTx;
	}

	public void setDtDestinationTx(String dtDestinationTx) {
		this.dtDestinationTx = dtDestinationTx;
	}

	@Column(name = "DtUnavailableBl", nullable = false)
	public boolean isDtUnavailableBl() {
		return this.dtUnavailableBl;
	}

	public void setDtUnavailableBl(boolean dtUnavailableBl) {
		this.dtUnavailableBl = dtUnavailableBl;
	}

	@Column(name = "DtVideoTx_N")
	public String getDtVideoTxN() {
		return this.dtVideoTxN;
	}

	public void setDtVideoTxN(String dtVideoTxN) {
		this.dtVideoTxN = dtVideoTxN;
	}

	@Column(name = "DtMinNoIn", nullable = false)
	public short getDtMinNoIn() {
		return this.dtMinNoIn;
	}

	public void setDtMinNoIn(short dtMinNoIn) {
		this.dtMinNoIn = dtMinNoIn;
	}

	@Column(name = "DtMaxNoIn", nullable = false)
	public short getDtMaxNoIn() {
		return this.dtMaxNoIn;
	}

	public void setDtMaxNoIn(short dtMaxNoIn) {
		this.dtMaxNoIn = dtMaxNoIn;
	}

	@Column(name = "DtLastUpdatedDate", nullable = false, length = 23)
	public Date getDtLastUpdatedDate() {
		return this.dtLastUpdatedDate;
	}

	public void setDtLastUpdatedDate(Date dtLastUpdatedDate) {
		this.dtLastUpdatedDate = dtLastUpdatedDate;
	}

	@Column(name = "DtRequiredBl", nullable = false)
	public boolean isDtRequiredBl() {
		return this.dtRequiredBl;
	}

	public void setDtRequiredBl(boolean dtRequiredBl) {
		this.dtRequiredBl = dtRequiredBl;
	}

	@Column(name = "DtCreationDate", nullable = false, length = 23)
	public Date getDtCreationDate() {
		return this.dtCreationDate;
	}

	public void setDtCreationDate(Date dtCreationDate) {
		this.dtCreationDate = dtCreationDate;
	}

	@Column(name = "DtForeColorIn", nullable = false)
	public int getDtForeColorIn() {
		return this.dtForeColorIn;
	}

	public void setDtForeColorIn(int dtForeColorIn) {
		this.dtForeColorIn = dtForeColorIn;
	}

	@Column(name = "DtBackColorIn", nullable = false)
	public int getDtBackColorIn() {
		return this.dtBackColorIn;
	}

	public void setDtBackColorIn(int dtBackColorIn) {
		this.dtBackColorIn = dtBackColorIn;
	}

	@Column(name = "DtPrefixTx", nullable = false)
	public String getDtPrefixTx() {
		return this.dtPrefixTx;
	}

	public void setDtPrefixTx(String dtPrefixTx) {
		this.dtPrefixTx = dtPrefixTx;
	}

	@Column(name = "DtURLTx_N")
	public String getDtUrltxN() {
		return this.dtUrltxN;
	}

	public void setDtUrltxN(String dtUrltxN) {
		this.dtUrltxN = dtUrltxN;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof D01DtDestinationId))
			return false;
		D01DtDestinationId castOther = (D01DtDestinationId) other;

		return (this.getDtDestinationId() == castOther.getDtDestinationId())
				&& ((this.getDtDestinationTx() == castOther.getDtDestinationTx())
						|| (this.getDtDestinationTx() != null && castOther.getDtDestinationTx() != null
								&& this.getDtDestinationTx().equals(castOther.getDtDestinationTx())))
				&& (this.isDtUnavailableBl() == castOther.isDtUnavailableBl())
				&& ((this.getDtVideoTxN() == castOther.getDtVideoTxN()) || (this.getDtVideoTxN() != null
						&& castOther.getDtVideoTxN() != null && this.getDtVideoTxN().equals(castOther.getDtVideoTxN())))
				&& (this.getDtMinNoIn() == castOther.getDtMinNoIn())
				&& (this.getDtMaxNoIn() == castOther.getDtMaxNoIn())
				&& ((this.getDtLastUpdatedDate() == castOther.getDtLastUpdatedDate())
						|| (this.getDtLastUpdatedDate() != null && castOther.getDtLastUpdatedDate() != null
								&& this.getDtLastUpdatedDate().equals(castOther.getDtLastUpdatedDate())))
				&& (this.isDtRequiredBl() == castOther.isDtRequiredBl())
				&& ((this.getDtCreationDate() == castOther.getDtCreationDate())
						|| (this.getDtCreationDate() != null && castOther.getDtCreationDate() != null
								&& this.getDtCreationDate().equals(castOther.getDtCreationDate())))
				&& (this.getDtForeColorIn() == castOther.getDtForeColorIn())
				&& (this.getDtBackColorIn() == castOther.getDtBackColorIn())
				&& ((this.getDtPrefixTx() == castOther.getDtPrefixTx()) || (this.getDtPrefixTx() != null
						&& castOther.getDtPrefixTx() != null && this.getDtPrefixTx().equals(castOther.getDtPrefixTx())))
				&& ((this.getDtUrltxN() == castOther.getDtUrltxN()) || (this.getDtUrltxN() != null
						&& castOther.getDtUrltxN() != null && this.getDtUrltxN().equals(castOther.getDtUrltxN())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getDtDestinationId();
		result = 37 * result + (getDtDestinationTx() == null ? 0 : this.getDtDestinationTx().hashCode());
		result = 37 * result + (this.isDtUnavailableBl() ? 1 : 0);
		result = 37 * result + (getDtVideoTxN() == null ? 0 : this.getDtVideoTxN().hashCode());
		result = 37 * result + this.getDtMinNoIn();
		result = 37 * result + this.getDtMaxNoIn();
		result = 37 * result + (getDtLastUpdatedDate() == null ? 0 : this.getDtLastUpdatedDate().hashCode());
		result = 37 * result + (this.isDtRequiredBl() ? 1 : 0);
		result = 37 * result + (getDtCreationDate() == null ? 0 : this.getDtCreationDate().hashCode());
		result = 37 * result + this.getDtForeColorIn();
		result = 37 * result + this.getDtBackColorIn();
		result = 37 * result + (getDtPrefixTx() == null ? 0 : this.getDtPrefixTx().hashCode());
		result = 37 * result + (getDtUrltxN() == null ? 0 : this.getDtUrltxN().hashCode());
		return result;
	}

}
