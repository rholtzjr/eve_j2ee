package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * D01MlmailingListId generated by hbm2java
 */
@Embeddable
public class D01MlmailingListId implements java.io.Serializable {

	private int mlmailingListId;
	private String mlmailingListTx;
	private boolean mlunavailableBl;
	private Date mllastUpdatedDate;
	private boolean mlrequiredBl;
	private Date mlcreationDate;
	private boolean mlshowInEolbl;

	public D01MlmailingListId() {
	}

	public D01MlmailingListId(int mlmailingListId, String mlmailingListTx, boolean mlunavailableBl,
			Date mllastUpdatedDate, boolean mlrequiredBl, Date mlcreationDate, boolean mlshowInEolbl) {
		this.mlmailingListId = mlmailingListId;
		this.mlmailingListTx = mlmailingListTx;
		this.mlunavailableBl = mlunavailableBl;
		this.mllastUpdatedDate = mllastUpdatedDate;
		this.mlrequiredBl = mlrequiredBl;
		this.mlcreationDate = mlcreationDate;
		this.mlshowInEolbl = mlshowInEolbl;
	}

	@Column(name = "MLMailingListID", nullable = false)
	public int getMlmailingListId() {
		return this.mlmailingListId;
	}

	public void setMlmailingListId(int mlmailingListId) {
		this.mlmailingListId = mlmailingListId;
	}

	@Column(name = "MLMailingListTx", nullable = false)
	public String getMlmailingListTx() {
		return this.mlmailingListTx;
	}

	public void setMlmailingListTx(String mlmailingListTx) {
		this.mlmailingListTx = mlmailingListTx;
	}

	@Column(name = "MLUnavailableBl", nullable = false)
	public boolean isMlunavailableBl() {
		return this.mlunavailableBl;
	}

	public void setMlunavailableBl(boolean mlunavailableBl) {
		this.mlunavailableBl = mlunavailableBl;
	}

	@Column(name = "MLLastUpdatedDate", nullable = false, length = 23)
	public Date getMllastUpdatedDate() {
		return this.mllastUpdatedDate;
	}

	public void setMllastUpdatedDate(Date mllastUpdatedDate) {
		this.mllastUpdatedDate = mllastUpdatedDate;
	}

	@Column(name = "MLRequiredBl", nullable = false)
	public boolean isMlrequiredBl() {
		return this.mlrequiredBl;
	}

	public void setMlrequiredBl(boolean mlrequiredBl) {
		this.mlrequiredBl = mlrequiredBl;
	}

	@Column(name = "MLCreationDate", nullable = false, length = 23)
	public Date getMlcreationDate() {
		return this.mlcreationDate;
	}

	public void setMlcreationDate(Date mlcreationDate) {
		this.mlcreationDate = mlcreationDate;
	}

	@Column(name = "MLShowInEOLBl", nullable = false)
	public boolean isMlshowInEolbl() {
		return this.mlshowInEolbl;
	}

	public void setMlshowInEolbl(boolean mlshowInEolbl) {
		this.mlshowInEolbl = mlshowInEolbl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof D01MlmailingListId))
			return false;
		D01MlmailingListId castOther = (D01MlmailingListId) other;

		return (this.getMlmailingListId() == castOther.getMlmailingListId())
				&& ((this.getMlmailingListTx() == castOther.getMlmailingListTx())
						|| (this.getMlmailingListTx() != null && castOther.getMlmailingListTx() != null
								&& this.getMlmailingListTx().equals(castOther.getMlmailingListTx())))
				&& (this.isMlunavailableBl() == castOther.isMlunavailableBl())
				&& ((this.getMllastUpdatedDate() == castOther.getMllastUpdatedDate())
						|| (this.getMllastUpdatedDate() != null && castOther.getMllastUpdatedDate() != null
								&& this.getMllastUpdatedDate().equals(castOther.getMllastUpdatedDate())))
				&& (this.isMlrequiredBl() == castOther.isMlrequiredBl())
				&& ((this.getMlcreationDate() == castOther.getMlcreationDate())
						|| (this.getMlcreationDate() != null && castOther.getMlcreationDate() != null
								&& this.getMlcreationDate().equals(castOther.getMlcreationDate())))
				&& (this.isMlshowInEolbl() == castOther.isMlshowInEolbl());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMlmailingListId();
		result = 37 * result + (getMlmailingListTx() == null ? 0 : this.getMlmailingListTx().hashCode());
		result = 37 * result + (this.isMlunavailableBl() ? 1 : 0);
		result = 37 * result + (getMllastUpdatedDate() == null ? 0 : this.getMllastUpdatedDate().hashCode());
		result = 37 * result + (this.isMlrequiredBl() ? 1 : 0);
		result = 37 * result + (getMlcreationDate() == null ? 0 : this.getMlcreationDate().hashCode());
		result = 37 * result + (this.isMlshowInEolbl() ? 1 : 0);
		return result;
	}

}
