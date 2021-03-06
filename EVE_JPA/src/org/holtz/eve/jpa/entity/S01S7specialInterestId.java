package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * S01S7specialInterestId generated by hbm2java
 */
@Embeddable
public class S01S7specialInterestId implements java.io.Serializable {

	private int s7specialInterestId;
	private String s7specialInterestTx;
	private boolean s7unavailableBl;
	private Date s7lastUpdatedDate;
	private boolean s7requiredBl;
	private Date s7creationDate;

	public S01S7specialInterestId() {
	}

	public S01S7specialInterestId(int s7specialInterestId, String s7specialInterestTx, boolean s7unavailableBl,
			Date s7lastUpdatedDate, boolean s7requiredBl, Date s7creationDate) {
		this.s7specialInterestId = s7specialInterestId;
		this.s7specialInterestTx = s7specialInterestTx;
		this.s7unavailableBl = s7unavailableBl;
		this.s7lastUpdatedDate = s7lastUpdatedDate;
		this.s7requiredBl = s7requiredBl;
		this.s7creationDate = s7creationDate;
	}

	@Column(name = "S7SpecialInterestID", nullable = false)
	public int getS7specialInterestId() {
		return this.s7specialInterestId;
	}

	public void setS7specialInterestId(int s7specialInterestId) {
		this.s7specialInterestId = s7specialInterestId;
	}

	@Column(name = "S7SpecialInterestTx", nullable = false)
	public String getS7specialInterestTx() {
		return this.s7specialInterestTx;
	}

	public void setS7specialInterestTx(String s7specialInterestTx) {
		this.s7specialInterestTx = s7specialInterestTx;
	}

	@Column(name = "S7UnavailableBl", nullable = false)
	public boolean isS7unavailableBl() {
		return this.s7unavailableBl;
	}

	public void setS7unavailableBl(boolean s7unavailableBl) {
		this.s7unavailableBl = s7unavailableBl;
	}

	@Column(name = "S7LastUpdatedDate", nullable = false, length = 23)
	public Date getS7lastUpdatedDate() {
		return this.s7lastUpdatedDate;
	}

	public void setS7lastUpdatedDate(Date s7lastUpdatedDate) {
		this.s7lastUpdatedDate = s7lastUpdatedDate;
	}

	@Column(name = "S7RequiredBl", nullable = false)
	public boolean isS7requiredBl() {
		return this.s7requiredBl;
	}

	public void setS7requiredBl(boolean s7requiredBl) {
		this.s7requiredBl = s7requiredBl;
	}

	@Column(name = "S7CreationDate", nullable = false, length = 23)
	public Date getS7creationDate() {
		return this.s7creationDate;
	}

	public void setS7creationDate(Date s7creationDate) {
		this.s7creationDate = s7creationDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof S01S7specialInterestId))
			return false;
		S01S7specialInterestId castOther = (S01S7specialInterestId) other;

		return (this.getS7specialInterestId() == castOther.getS7specialInterestId())
				&& ((this.getS7specialInterestTx() == castOther.getS7specialInterestTx())
						|| (this.getS7specialInterestTx() != null && castOther.getS7specialInterestTx() != null
								&& this.getS7specialInterestTx().equals(castOther.getS7specialInterestTx())))
				&& (this.isS7unavailableBl() == castOther.isS7unavailableBl())
				&& ((this.getS7lastUpdatedDate() == castOther.getS7lastUpdatedDate())
						|| (this.getS7lastUpdatedDate() != null && castOther.getS7lastUpdatedDate() != null
								&& this.getS7lastUpdatedDate().equals(castOther.getS7lastUpdatedDate())))
				&& (this.isS7requiredBl() == castOther.isS7requiredBl())
				&& ((this.getS7creationDate() == castOther.getS7creationDate())
						|| (this.getS7creationDate() != null && castOther.getS7creationDate() != null
								&& this.getS7creationDate().equals(castOther.getS7creationDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getS7specialInterestId();
		result = 37 * result + (getS7specialInterestTx() == null ? 0 : this.getS7specialInterestTx().hashCode());
		result = 37 * result + (this.isS7unavailableBl() ? 1 : 0);
		result = 37 * result + (getS7lastUpdatedDate() == null ? 0 : this.getS7lastUpdatedDate().hashCode());
		result = 37 * result + (this.isS7requiredBl() ? 1 : 0);
		result = 37 * result + (getS7creationDate() == null ? 0 : this.getS7creationDate().hashCode());
		return result;
	}

}
