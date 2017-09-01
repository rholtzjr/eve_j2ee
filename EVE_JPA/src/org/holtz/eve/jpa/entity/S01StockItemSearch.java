package org.holtz.eve.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s01_StockItemSearch database table.
 * 
 */
@Entity
@Table(name="s01_StockItemSearch")
@NamedQuery(name="S01StockItemSearch.findAll", query="SELECT s FROM S01StockItemSearch s")
public class S01StockItemSearch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String SIBarcodeNoTx_N;

	@Column(insertable=false, updatable=false)
	private Integer SIManufacturerID;
	
	@Id
	@Column(insertable=false, updatable=false)
	private Integer SIStockItemID;

	@Column(insertable=false, updatable=false)
	private String SIStockItemTx;

	@Column(insertable=false, updatable=false)
	private String SIStockNoTx;

	@Column(insertable=false, updatable=false)
	private Integer SIStockTypeID;

	@Column(insertable=false, updatable=false)
	private Integer STStockTypeID;

	@Column(insertable=false, updatable=false)
	private String STStockTypeTx;

	@Column(name="SuSupplierID", insertable=false, updatable=false)
	private Integer suSupplierID;

	@Column(name="SuSupplierTx", insertable=false, updatable=false)
	private String suSupplierTx;

	@Column(name="ZlNoInStockInX", insertable=false, updatable=false)
	private Integer zlNoInStockInX;

	@Column(name="ZlNoOnOrderInX", insertable=false, updatable=false)
	private Integer zlNoOnOrderInX;

	@Column(name="ZlStockItemID", insertable=false, updatable=false)
	private Integer zlStockItemID;

	public S01StockItemSearch() {
	}

	public String getSIBarcodeNoTx_N() {
		return this.SIBarcodeNoTx_N;
	}

	public void setSIBarcodeNoTx_N(String SIBarcodeNoTx_N) {
		this.SIBarcodeNoTx_N = SIBarcodeNoTx_N;
	}

	public Integer getSIManufacturerID() {
		return this.SIManufacturerID;
	}

	public void setSIManufacturerID(Integer SIManufacturerID) {
		this.SIManufacturerID = SIManufacturerID;
	}

	public Integer getSIStockItemID() {
		return this.SIStockItemID;
	}

	public void setSIStockItemID(Integer SIStockItemID) {
		this.SIStockItemID = SIStockItemID;
	}

	public String getSIStockItemTx() {
		return this.SIStockItemTx;
	}

	public void setSIStockItemTx(String SIStockItemTx) {
		this.SIStockItemTx = SIStockItemTx;
	}

	public String getSIStockNoTx() {
		return this.SIStockNoTx;
	}

	public void setSIStockNoTx(String SIStockNoTx) {
		this.SIStockNoTx = SIStockNoTx;
	}

	public Integer getSIStockTypeID() {
		return this.SIStockTypeID;
	}

	public void setSIStockTypeID(Integer SIStockTypeID) {
		this.SIStockTypeID = SIStockTypeID;
	}

	public Integer getSTStockTypeID() {
		return this.STStockTypeID;
	}

	public void setSTStockTypeID(Integer STStockTypeID) {
		this.STStockTypeID = STStockTypeID;
	}

	public String getSTStockTypeTx() {
		return this.STStockTypeTx;
	}

	public void setSTStockTypeTx(String STStockTypeTx) {
		this.STStockTypeTx = STStockTypeTx;
	}

	public Integer getSuSupplierID() {
		return this.suSupplierID;
	}

	public void setSuSupplierID(Integer suSupplierID) {
		this.suSupplierID = suSupplierID;
	}

	public String getSuSupplierTx() {
		return this.suSupplierTx;
	}

	public void setSuSupplierTx(String suSupplierTx) {
		this.suSupplierTx = suSupplierTx;
	}

	public Integer getZlNoInStockInX() {
		return this.zlNoInStockInX;
	}

	public void setZlNoInStockInX(Integer zlNoInStockInX) {
		this.zlNoInStockInX = zlNoInStockInX;
	}

	public Integer getZlNoOnOrderInX() {
		return this.zlNoOnOrderInX;
	}

	public void setZlNoOnOrderInX(Integer zlNoOnOrderInX) {
		this.zlNoOnOrderInX = zlNoOnOrderInX;
	}

	public Integer getZlStockItemID() {
		return this.zlStockItemID;
	}

	public void setZlStockItemID(Integer zlStockItemID) {
		this.zlStockItemID = zlStockItemID;
	}

}