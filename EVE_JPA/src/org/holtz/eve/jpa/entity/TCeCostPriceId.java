package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TCeCostPriceId generated by hbm2java
 */
@Embeddable
public class TCeCostPriceId implements java.io.Serializable {

	private short ceStoreId;
	private int ceSupplierId;
	private int ceStockItemId;
	private short ceLevelIn;

	public TCeCostPriceId() {
	}

	public TCeCostPriceId(short ceStoreId, int ceSupplierId, int ceStockItemId, short ceLevelIn) {
		this.ceStoreId = ceStoreId;
		this.ceSupplierId = ceSupplierId;
		this.ceStockItemId = ceStockItemId;
		this.ceLevelIn = ceLevelIn;
	}

	@Column(name = "CeStoreID", nullable = false)
	public short getCeStoreId() {
		return this.ceStoreId;
	}

	public void setCeStoreId(short ceStoreId) {
		this.ceStoreId = ceStoreId;
	}

	@Column(name = "CeSupplierID", nullable = false)
	public int getCeSupplierId() {
		return this.ceSupplierId;
	}

	public void setCeSupplierId(int ceSupplierId) {
		this.ceSupplierId = ceSupplierId;
	}

	@Column(name = "CeStockItemID", nullable = false)
	public int getCeStockItemId() {
		return this.ceStockItemId;
	}

	public void setCeStockItemId(int ceStockItemId) {
		this.ceStockItemId = ceStockItemId;
	}

	@Column(name = "CeLevelIn", nullable = false)
	public short getCeLevelIn() {
		return this.ceLevelIn;
	}

	public void setCeLevelIn(short ceLevelIn) {
		this.ceLevelIn = ceLevelIn;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCeCostPriceId))
			return false;
		TCeCostPriceId castOther = (TCeCostPriceId) other;

		return (this.getCeStoreId() == castOther.getCeStoreId())
				&& (this.getCeSupplierId() == castOther.getCeSupplierId())
				&& (this.getCeStockItemId() == castOther.getCeStockItemId())
				&& (this.getCeLevelIn() == castOther.getCeLevelIn());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCeStoreId();
		result = 37 * result + this.getCeSupplierId();
		result = 37 * result + this.getCeStockItemId();
		result = 37 * result + this.getCeLevelIn();
		return result;
	}

}
