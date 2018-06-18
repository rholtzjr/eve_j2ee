package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * S01DnDenominationId generated by hbm2java
 */
@Embeddable
public class S01DnDenominationId implements java.io.Serializable {

	private int dnDenominationId;
	private double dnValueMn;
	private String dnDescriptionTx;
	private boolean dnUnavailableBl;
	private Date dnCreationDate;
	private Date dnLastUpdatedDate;
	private int dnSortOrderIn;
	private boolean dnRequiredBl;

	public S01DnDenominationId() {
	}

	public S01DnDenominationId(int dnDenominationId, double dnValueMn, String dnDescriptionTx,
			boolean dnUnavailableBl, Date dnCreationDate, Date dnLastUpdatedDate, int dnSortOrderIn,
			boolean dnRequiredBl) {
		this.dnDenominationId = dnDenominationId;
		this.dnValueMn = dnValueMn;
		this.dnDescriptionTx = dnDescriptionTx;
		this.dnUnavailableBl = dnUnavailableBl;
		this.dnCreationDate = dnCreationDate;
		this.dnLastUpdatedDate = dnLastUpdatedDate;
		this.dnSortOrderIn = dnSortOrderIn;
		this.dnRequiredBl = dnRequiredBl;
	}

	@Column(name = "DnDenominationID", nullable = false)
	public int getDnDenominationId() {
		return this.dnDenominationId;
	}

	public void setDnDenominationId(int dnDenominationId) {
		this.dnDenominationId = dnDenominationId;
	}

	@Column(name = "DnValueMn", nullable = false, precision = 53, scale = 0)
	public double getDnValueMn() {
		return this.dnValueMn;
	}

	public void setDnValueMn(double dnValueMn) {
		this.dnValueMn = dnValueMn;
	}

	@Column(name = "DnDescriptionTx", nullable = false)
	public String getDnDescriptionTx() {
		return this.dnDescriptionTx;
	}

	public void setDnDescriptionTx(String dnDescriptionTx) {
		this.dnDescriptionTx = dnDescriptionTx;
	}

	@Column(name = "DnUnavailableBl", nullable = false)
	public boolean isDnUnavailableBl() {
		return this.dnUnavailableBl;
	}

	public void setDnUnavailableBl(boolean dnUnavailableBl) {
		this.dnUnavailableBl = dnUnavailableBl;
	}

	@Column(name = "DnCreationDate", nullable = false, length = 23)
	public Date getDnCreationDate() {
		return this.dnCreationDate;
	}

	public void setDnCreationDate(Date dnCreationDate) {
		this.dnCreationDate = dnCreationDate;
	}

	@Column(name = "DnLastUpdatedDate", nullable = false, length = 23)
	public Date getDnLastUpdatedDate() {
		return this.dnLastUpdatedDate;
	}

	public void setDnLastUpdatedDate(Date dnLastUpdatedDate) {
		this.dnLastUpdatedDate = dnLastUpdatedDate;
	}

	@Column(name = "DnSortOrderIn", nullable = false)
	public int getDnSortOrderIn() {
		return this.dnSortOrderIn;
	}

	public void setDnSortOrderIn(int dnSortOrderIn) {
		this.dnSortOrderIn = dnSortOrderIn;
	}

	@Column(name = "DnRequiredBl", nullable = false)
	public boolean isDnRequiredBl() {
		return this.dnRequiredBl;
	}

	public void setDnRequiredBl(boolean dnRequiredBl) {
		this.dnRequiredBl = dnRequiredBl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof S01DnDenominationId))
			return false;
		S01DnDenominationId castOther = (S01DnDenominationId) other;

		return (this.getDnDenominationId() == castOther.getDnDenominationId())
				&& (this.getDnValueMn() == castOther.getDnValueMn())
				&& ((this.getDnDescriptionTx() == castOther.getDnDescriptionTx())
						|| (this.getDnDescriptionTx() != null && castOther.getDnDescriptionTx() != null
								&& this.getDnDescriptionTx().equals(castOther.getDnDescriptionTx())))
				&& (this.isDnUnavailableBl() == castOther.isDnUnavailableBl())
				&& ((this.getDnCreationDate() == castOther.getDnCreationDate())
						|| (this.getDnCreationDate() != null && castOther.getDnCreationDate() != null
								&& this.getDnCreationDate().equals(castOther.getDnCreationDate())))
				&& ((this.getDnLastUpdatedDate() == castOther.getDnLastUpdatedDate())
						|| (this.getDnLastUpdatedDate() != null && castOther.getDnLastUpdatedDate() != null
								&& this.getDnLastUpdatedDate().equals(castOther.getDnLastUpdatedDate())))
				&& (this.getDnSortOrderIn() == castOther.getDnSortOrderIn())
				&& (this.isDnRequiredBl() == castOther.isDnRequiredBl());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getDnDenominationId();
		result = 37 * result + (int) this.getDnValueMn();
		result = 37 * result + (getDnDescriptionTx() == null ? 0 : this.getDnDescriptionTx().hashCode());
		result = 37 * result + (this.isDnUnavailableBl() ? 1 : 0);
		result = 37 * result + (getDnCreationDate() == null ? 0 : this.getDnCreationDate().hashCode());
		result = 37 * result + (getDnLastUpdatedDate() == null ? 0 : this.getDnLastUpdatedDate().hashCode());
		result = 37 * result + this.getDnSortOrderIn();
		result = 37 * result + (this.isDnRequiredBl() ? 1 : 0);
		return result;
	}

}
