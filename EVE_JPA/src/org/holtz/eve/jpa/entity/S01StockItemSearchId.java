package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * S01StockItemSearchId generated by hbm2java
 */
@Embeddable
public class S01StockItemSearchId implements java.io.Serializable {

	private String sistockItemTx;
	private String sistockNoTx;
	private String suSupplierTx;
	private String ststockTypeTx;
	private String sibarcodeNoTxN;
	private int zlNoInStockInX;
	private int zlNoOnOrderInX;
	private int sistockItemId;
	private int simanufacturerId;
	private int sistockTypeId;
	private int zlStockItemId;
	private int suSupplierId;
	private int ststockTypeId;

	public S01StockItemSearchId() {
		
	}
	public S01StockItemSearchId(int sistockItemId) {
		this.sistockItemId = sistockItemId;
	}
	public S01StockItemSearchId(String sistockItemTx, String sistockNoTx, String suSupplierTx,
			String ststockTypeTx, int zlNoInStockInX, int zlNoOnOrderInX, int sistockItemId, int simanufacturerId,
			int sistockTypeId, int zlStockItemId, int suSupplierId, int ststockTypeId) {
		this.sistockItemTx = sistockItemTx;
		this.sistockNoTx = sistockNoTx;
		this.suSupplierTx = suSupplierTx;
		this.ststockTypeTx = ststockTypeTx;
		this.zlNoInStockInX = zlNoInStockInX;
		this.zlNoOnOrderInX = zlNoOnOrderInX;
		this.sistockItemId = sistockItemId;
		this.simanufacturerId = simanufacturerId;
		this.sistockTypeId = sistockTypeId;
		this.zlStockItemId = zlStockItemId;
		this.suSupplierId = suSupplierId;
		this.ststockTypeId = ststockTypeId;
	}

	public S01StockItemSearchId(String sistockItemTx, String sistockNoTx, String suSupplierTx,
			String ststockTypeTx, String sibarcodeNoTxN, int zlNoInStockInX, int zlNoOnOrderInX,
			int sistockItemId, int simanufacturerId, int sistockTypeId, int zlStockItemId, int suSupplierId,
			int ststockTypeId) {
		this.sistockItemTx = sistockItemTx;
		this.sistockNoTx = sistockNoTx;
		this.suSupplierTx = suSupplierTx;
		this.ststockTypeTx = ststockTypeTx;
		this.sibarcodeNoTxN = sibarcodeNoTxN;
		this.zlNoInStockInX = zlNoInStockInX;
		this.zlNoOnOrderInX = zlNoOnOrderInX;
		this.sistockItemId = sistockItemId;
		this.simanufacturerId = simanufacturerId;
		this.sistockTypeId = sistockTypeId;
		this.zlStockItemId = zlStockItemId;
		this.suSupplierId = suSupplierId;
		this.ststockTypeId = ststockTypeId;
	}

	@Column(name = "SIStockItemTx", nullable = false)
	public String getSistockItemTx() {
		return this.sistockItemTx;
	}

	public void setSistockItemTx(String sistockItemTx) {
		this.sistockItemTx = sistockItemTx;
	}

	@Column(name = "SIStockNoTx", nullable = false)
	public String getSistockNoTx() {
		return this.sistockNoTx;
	}

	public void setSistockNoTx(String sistockNoTx) {
		this.sistockNoTx = sistockNoTx;
	}

	@Column(name = "SuSupplierTx", nullable = false)
	public String getSuSupplierTx() {
		return this.suSupplierTx;
	}

	public void setSuSupplierTx(String suSupplierTx) {
		this.suSupplierTx = suSupplierTx;
	}

	@Column(name = "STStockTypeTx", nullable = false)
	public String getStstockTypeTx() {
		return this.ststockTypeTx;
	}

	public void setStstockTypeTx(String ststockTypeTx) {
		this.ststockTypeTx = ststockTypeTx;
	}

	@Column(name = "SIBarcodeNoTx_N")
	public String getSibarcodeNoTxN() {
		return this.sibarcodeNoTxN;
	}

	public void setSibarcodeNoTxN(String sibarcodeNoTxN) {
		this.sibarcodeNoTxN = sibarcodeNoTxN;
	}

	@Column(name = "ZlNoInStockInX", nullable = false)
	public int getZlNoInStockInX() {
		return this.zlNoInStockInX;
	}

	public void setZlNoInStockInX(int zlNoInStockInX) {
		this.zlNoInStockInX = zlNoInStockInX;
	}

	@Column(name = "ZlNoOnOrderInX", nullable = false)
	public int getZlNoOnOrderInX() {
		return this.zlNoOnOrderInX;
	}

	public void setZlNoOnOrderInX(int zlNoOnOrderInX) {
		this.zlNoOnOrderInX = zlNoOnOrderInX;
	}

	@Column(name = "SIStockItemID", nullable = false)
	public int getSistockItemId() {
		return this.sistockItemId;
	}

	public void setSistockItemId(int sistockItemId) {
		this.sistockItemId = sistockItemId;
	}

	@Column(name = "SIManufacturerID", nullable = false)
	public int getSimanufacturerId() {
		return this.simanufacturerId;
	}

	public void setSimanufacturerId(int simanufacturerId) {
		this.simanufacturerId = simanufacturerId;
	}

	@Column(name = "SIStockTypeID", nullable = false)
	public int getSistockTypeId() {
		return this.sistockTypeId;
	}

	public void setSistockTypeId(int sistockTypeId) {
		this.sistockTypeId = sistockTypeId;
	}

	@Column(name = "ZlStockItemID", nullable = false)
	public int getZlStockItemId() {
		return this.zlStockItemId;
	}

	public void setZlStockItemId(int zlStockItemId) {
		this.zlStockItemId = zlStockItemId;
	}

	@Column(name = "SuSupplierID", nullable = false)
	public int getSuSupplierId() {
		return this.suSupplierId;
	}

	public void setSuSupplierId(int suSupplierId) {
		this.suSupplierId = suSupplierId;
	}

	@Column(name = "STStockTypeID", nullable = false)
	public int getStstockTypeId() {
		return this.ststockTypeId;
	}

	public void setStstockTypeId(int ststockTypeId) {
		this.ststockTypeId = ststockTypeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof S01StockItemSearchId))
			return false;
		S01StockItemSearchId castOther = (S01StockItemSearchId) other;

		return ((this.getSistockItemTx() == castOther.getSistockItemTx())
				|| (this.getSistockItemTx() != null && castOther.getSistockItemTx() != null
						&& this.getSistockItemTx().equals(castOther.getSistockItemTx())))
				&& ((this.getSistockNoTx() == castOther.getSistockNoTx())
						|| (this.getSistockNoTx() != null && castOther.getSistockNoTx() != null
								&& this.getSistockNoTx().equals(castOther.getSistockNoTx())))
				&& ((this.getSuSupplierTx() == castOther.getSuSupplierTx())
						|| (this.getSuSupplierTx() != null && castOther.getSuSupplierTx() != null
								&& this.getSuSupplierTx().equals(castOther.getSuSupplierTx())))
				&& ((this.getStstockTypeTx() == castOther.getStstockTypeTx())
						|| (this.getStstockTypeTx() != null && castOther.getStstockTypeTx() != null
								&& this.getStstockTypeTx().equals(castOther.getStstockTypeTx())))
				&& ((this.getSibarcodeNoTxN() == castOther.getSibarcodeNoTxN())
						|| (this.getSibarcodeNoTxN() != null && castOther.getSibarcodeNoTxN() != null
								&& this.getSibarcodeNoTxN().equals(castOther.getSibarcodeNoTxN())))
				&& (this.getZlNoInStockInX() == castOther.getZlNoInStockInX())
				&& (this.getZlNoOnOrderInX() == castOther.getZlNoOnOrderInX())
				&& (this.getSistockItemId() == castOther.getSistockItemId())
				&& (this.getSimanufacturerId() == castOther.getSimanufacturerId())
				&& (this.getSistockTypeId() == castOther.getSistockTypeId())
				&& (this.getZlStockItemId() == castOther.getZlStockItemId())
				&& (this.getSuSupplierId() == castOther.getSuSupplierId())
				&& (this.getStstockTypeId() == castOther.getStstockTypeId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSistockItemTx() == null ? 0 : this.getSistockItemTx().hashCode());
		result = 37 * result + (getSistockNoTx() == null ? 0 : this.getSistockNoTx().hashCode());
		result = 37 * result + (getSuSupplierTx() == null ? 0 : this.getSuSupplierTx().hashCode());
		result = 37 * result + (getStstockTypeTx() == null ? 0 : this.getStstockTypeTx().hashCode());
		result = 37 * result + (getSibarcodeNoTxN() == null ? 0 : this.getSibarcodeNoTxN().hashCode());
		result = 37 * result + this.getZlNoInStockInX();
		result = 37 * result + this.getZlNoOnOrderInX();
		result = 37 * result + this.getSistockItemId();
		result = 37 * result + this.getSimanufacturerId();
		result = 37 * result + this.getSistockTypeId();
		result = 37 * result + this.getZlStockItemId();
		result = 37 * result + this.getSuSupplierId();
		result = 37 * result + this.getStstockTypeId();
		return result;
	}

}
