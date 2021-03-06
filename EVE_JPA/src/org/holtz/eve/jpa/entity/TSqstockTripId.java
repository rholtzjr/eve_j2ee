package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TSqstockTripId generated by hbm2java
 */
@Embeddable
public class TSqstockTripId implements java.io.Serializable {

	private int sqstockItemId;
	private int sqtripId;

	public TSqstockTripId() {
	}

	public TSqstockTripId(int sqstockItemId, int sqtripId) {
		this.sqstockItemId = sqstockItemId;
		this.sqtripId = sqtripId;
	}

	@Column(name = "SQStockItemID", nullable = false)
	public int getSqstockItemId() {
		return this.sqstockItemId;
	}

	public void setSqstockItemId(int sqstockItemId) {
		this.sqstockItemId = sqstockItemId;
	}

	@Column(name = "SQTripID", nullable = false)
	public int getSqtripId() {
		return this.sqtripId;
	}

	public void setSqtripId(int sqtripId) {
		this.sqtripId = sqtripId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSqstockTripId))
			return false;
		TSqstockTripId castOther = (TSqstockTripId) other;

		return (this.getSqstockItemId() == castOther.getSqstockItemId())
				&& (this.getSqtripId() == castOther.getSqtripId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSqstockItemId();
		result = 37 * result + this.getSqtripId();
		return result;
	}

}
