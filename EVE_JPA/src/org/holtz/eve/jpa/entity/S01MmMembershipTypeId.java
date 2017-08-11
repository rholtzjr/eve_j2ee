package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * S01MmMembershipTypeId generated by hbm2java
 */
@Embeddable
public class S01MmMembershipTypeId implements java.io.Serializable {

	private int mmMembershipTypeId;
	private String mmMembershipTypeTx;
	private boolean mmUnavailableBl;
	private Date mmLastUpdatedDate;
	private boolean mmRequiredBl;
	private Date mmCreationDate;

	public S01MmMembershipTypeId() {
	}

	public S01MmMembershipTypeId(int mmMembershipTypeId, String mmMembershipTypeTx, boolean mmUnavailableBl,
			Date mmLastUpdatedDate, boolean mmRequiredBl, Date mmCreationDate) {
		this.mmMembershipTypeId = mmMembershipTypeId;
		this.mmMembershipTypeTx = mmMembershipTypeTx;
		this.mmUnavailableBl = mmUnavailableBl;
		this.mmLastUpdatedDate = mmLastUpdatedDate;
		this.mmRequiredBl = mmRequiredBl;
		this.mmCreationDate = mmCreationDate;
	}

	@Column(name = "MmMembershipTypeID", nullable = false)
	public int getMmMembershipTypeId() {
		return this.mmMembershipTypeId;
	}

	public void setMmMembershipTypeId(int mmMembershipTypeId) {
		this.mmMembershipTypeId = mmMembershipTypeId;
	}

	@Column(name = "MmMembershipTypeTx", nullable = false)
	public String getMmMembershipTypeTx() {
		return this.mmMembershipTypeTx;
	}

	public void setMmMembershipTypeTx(String mmMembershipTypeTx) {
		this.mmMembershipTypeTx = mmMembershipTypeTx;
	}

	@Column(name = "MmUnavailableBl", nullable = false)
	public boolean isMmUnavailableBl() {
		return this.mmUnavailableBl;
	}

	public void setMmUnavailableBl(boolean mmUnavailableBl) {
		this.mmUnavailableBl = mmUnavailableBl;
	}

	@Column(name = "MmLastUpdatedDate", nullable = false, length = 23)
	public Date getMmLastUpdatedDate() {
		return this.mmLastUpdatedDate;
	}

	public void setMmLastUpdatedDate(Date mmLastUpdatedDate) {
		this.mmLastUpdatedDate = mmLastUpdatedDate;
	}

	@Column(name = "MmRequiredBl", nullable = false)
	public boolean isMmRequiredBl() {
		return this.mmRequiredBl;
	}

	public void setMmRequiredBl(boolean mmRequiredBl) {
		this.mmRequiredBl = mmRequiredBl;
	}

	@Column(name = "MmCreationDate", nullable = false, length = 23)
	public Date getMmCreationDate() {
		return this.mmCreationDate;
	}

	public void setMmCreationDate(Date mmCreationDate) {
		this.mmCreationDate = mmCreationDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof S01MmMembershipTypeId))
			return false;
		S01MmMembershipTypeId castOther = (S01MmMembershipTypeId) other;

		return (this.getMmMembershipTypeId() == castOther.getMmMembershipTypeId())
				&& ((this.getMmMembershipTypeTx() == castOther.getMmMembershipTypeTx())
						|| (this.getMmMembershipTypeTx() != null && castOther.getMmMembershipTypeTx() != null
								&& this.getMmMembershipTypeTx().equals(castOther.getMmMembershipTypeTx())))
				&& (this.isMmUnavailableBl() == castOther.isMmUnavailableBl())
				&& ((this.getMmLastUpdatedDate() == castOther.getMmLastUpdatedDate())
						|| (this.getMmLastUpdatedDate() != null && castOther.getMmLastUpdatedDate() != null
								&& this.getMmLastUpdatedDate().equals(castOther.getMmLastUpdatedDate())))
				&& (this.isMmRequiredBl() == castOther.isMmRequiredBl())
				&& ((this.getMmCreationDate() == castOther.getMmCreationDate())
						|| (this.getMmCreationDate() != null && castOther.getMmCreationDate() != null
								&& this.getMmCreationDate().equals(castOther.getMmCreationDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMmMembershipTypeId();
		result = 37 * result + (getMmMembershipTypeTx() == null ? 0 : this.getMmMembershipTypeTx().hashCode());
		result = 37 * result + (this.isMmUnavailableBl() ? 1 : 0);
		result = 37 * result + (getMmLastUpdatedDate() == null ? 0 : this.getMmLastUpdatedDate().hashCode());
		result = 37 * result + (this.isMmRequiredBl() ? 1 : 0);
		result = 37 * result + (getMmCreationDate() == null ? 0 : this.getMmCreationDate().hashCode());
		return result;
	}

}
