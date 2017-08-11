package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TC7costCenterStockTypeId generated by hbm2java
 */
@Embeddable
public class TC7costCenterStockTypeId implements java.io.Serializable {

	private int c7costCenterId;
	private int c7stockTypeId;

	public TC7costCenterStockTypeId() {
	}

	public TC7costCenterStockTypeId(int c7costCenterId, int c7stockTypeId) {
		this.c7costCenterId = c7costCenterId;
		this.c7stockTypeId = c7stockTypeId;
	}

	@Column(name = "C7CostCenterID", nullable = false)
	public int getC7costCenterId() {
		return this.c7costCenterId;
	}

	public void setC7costCenterId(int c7costCenterId) {
		this.c7costCenterId = c7costCenterId;
	}

	@Column(name = "C7StockTypeID", nullable = false)
	public int getC7stockTypeId() {
		return this.c7stockTypeId;
	}

	public void setC7stockTypeId(int c7stockTypeId) {
		this.c7stockTypeId = c7stockTypeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TC7costCenterStockTypeId))
			return false;
		TC7costCenterStockTypeId castOther = (TC7costCenterStockTypeId) other;

		return (this.getC7costCenterId() == castOther.getC7costCenterId())
				&& (this.getC7stockTypeId() == castOther.getC7stockTypeId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getC7costCenterId();
		result = 37 * result + this.getC7stockTypeId();
		return result;
	}

}
