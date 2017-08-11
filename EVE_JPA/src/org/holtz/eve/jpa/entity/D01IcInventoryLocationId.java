package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * D01IcInventoryLocationId generated by hbm2java
 */
@Embeddable
public class D01IcInventoryLocationId implements java.io.Serializable {

	private int icInventoryLocationId;
	private String icInventoryLocationTx;
	private boolean icUnavailableBl;
	private Date icCreationDate;
	private Date icLastUpdatedDate;
	private int icLocationId;
	private boolean icRequiredBl;

	public D01IcInventoryLocationId() {
	}

	public D01IcInventoryLocationId(int icInventoryLocationId, String icInventoryLocationTx,
			boolean icUnavailableBl, Date icCreationDate, Date icLastUpdatedDate, int icLocationId,
			boolean icRequiredBl) {
		this.icInventoryLocationId = icInventoryLocationId;
		this.icInventoryLocationTx = icInventoryLocationTx;
		this.icUnavailableBl = icUnavailableBl;
		this.icCreationDate = icCreationDate;
		this.icLastUpdatedDate = icLastUpdatedDate;
		this.icLocationId = icLocationId;
		this.icRequiredBl = icRequiredBl;
	}

	@Column(name = "IcInventoryLocationID", nullable = false)
	public int getIcInventoryLocationId() {
		return this.icInventoryLocationId;
	}

	public void setIcInventoryLocationId(int icInventoryLocationId) {
		this.icInventoryLocationId = icInventoryLocationId;
	}

	@Column(name = "IcInventoryLocationTx", nullable = false)
	public String getIcInventoryLocationTx() {
		return this.icInventoryLocationTx;
	}

	public void setIcInventoryLocationTx(String icInventoryLocationTx) {
		this.icInventoryLocationTx = icInventoryLocationTx;
	}

	@Column(name = "IcUnavailableBl", nullable = false)
	public boolean isIcUnavailableBl() {
		return this.icUnavailableBl;
	}

	public void setIcUnavailableBl(boolean icUnavailableBl) {
		this.icUnavailableBl = icUnavailableBl;
	}

	@Column(name = "IcCreationDate", nullable = false, length = 23)
	public Date getIcCreationDate() {
		return this.icCreationDate;
	}

	public void setIcCreationDate(Date icCreationDate) {
		this.icCreationDate = icCreationDate;
	}

	@Column(name = "IcLastUpdatedDate", nullable = false, length = 23)
	public Date getIcLastUpdatedDate() {
		return this.icLastUpdatedDate;
	}

	public void setIcLastUpdatedDate(Date icLastUpdatedDate) {
		this.icLastUpdatedDate = icLastUpdatedDate;
	}

	@Column(name = "IcLocationID", nullable = false)
	public int getIcLocationId() {
		return this.icLocationId;
	}

	public void setIcLocationId(int icLocationId) {
		this.icLocationId = icLocationId;
	}

	@Column(name = "IcRequiredBl", nullable = false)
	public boolean isIcRequiredBl() {
		return this.icRequiredBl;
	}

	public void setIcRequiredBl(boolean icRequiredBl) {
		this.icRequiredBl = icRequiredBl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof D01IcInventoryLocationId))
			return false;
		D01IcInventoryLocationId castOther = (D01IcInventoryLocationId) other;

		return (this.getIcInventoryLocationId() == castOther.getIcInventoryLocationId())
				&& ((this.getIcInventoryLocationTx() == castOther.getIcInventoryLocationTx())
						|| (this.getIcInventoryLocationTx() != null && castOther.getIcInventoryLocationTx() != null
								&& this.getIcInventoryLocationTx().equals(castOther.getIcInventoryLocationTx())))
				&& (this.isIcUnavailableBl() == castOther.isIcUnavailableBl())
				&& ((this.getIcCreationDate() == castOther.getIcCreationDate())
						|| (this.getIcCreationDate() != null && castOther.getIcCreationDate() != null
								&& this.getIcCreationDate().equals(castOther.getIcCreationDate())))
				&& ((this.getIcLastUpdatedDate() == castOther.getIcLastUpdatedDate())
						|| (this.getIcLastUpdatedDate() != null && castOther.getIcLastUpdatedDate() != null
								&& this.getIcLastUpdatedDate().equals(castOther.getIcLastUpdatedDate())))
				&& (this.getIcLocationId() == castOther.getIcLocationId())
				&& (this.isIcRequiredBl() == castOther.isIcRequiredBl());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIcInventoryLocationId();
		result = 37 * result + (getIcInventoryLocationTx() == null ? 0 : this.getIcInventoryLocationTx().hashCode());
		result = 37 * result + (this.isIcUnavailableBl() ? 1 : 0);
		result = 37 * result + (getIcCreationDate() == null ? 0 : this.getIcCreationDate().hashCode());
		result = 37 * result + (getIcLastUpdatedDate() == null ? 0 : this.getIcLastUpdatedDate().hashCode());
		result = 37 * result + this.getIcLocationId();
		result = 37 * result + (this.isIcRequiredBl() ? 1 : 0);
		return result;
	}

}
