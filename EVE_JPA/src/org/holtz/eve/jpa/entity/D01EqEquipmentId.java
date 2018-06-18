package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * D01EqEquipmentId generated by hbm2java
 */
@Embeddable
public class D01EqEquipmentId implements java.io.Serializable {

	private int eqEquipmentId;
	private int eqCustId;
	private int eqStockTypeId;
	private String eqRefNoTxN;
	private String eqSerialNoTxN;
	private Integer eqManufacturerIdN;
	private String eqDescriptionTxN;
	private Integer eqSizeIdN;
	private Integer eqPrimaryColorIdN;
	private Integer eqSecondaryColorIdN;
	private double eqNetWorthMn;
	private short eqCurrencyId;
	private float eqExchangeRateFl;
	private String eqBarcodeNoTxN;
	private Date eqPurchasedDateN;
	private Date eqSoldDateN;
	private Date eqNextServiceDateN;
	private boolean eqUnavailableBl;
	private Date eqLastUpdatedDate;
	private boolean eqRequiredBl;
	private Date eqCreationDate;
	private boolean eqPackageBl;
	private boolean eqBypassDblBookingCheckBl;
	private Date eqManufacturedDateN;
	private int eqCylMaterialId;
	private int eqCylValveId;
	private int eqCylTypeId;
	private String eqCylValveOtherTxN;
	private String eqCylTypeOtherTxN;
	private Boolean eqCylBootBl;
	private Boolean eqCylBackpackBl;
	private String eqCylWorkPressureTxN;
	private String eqCylLabnoTxN;
	private String eqCylTestPressureTxN;
	private String eqCylWaterCapTxN;
	private boolean eqAddPackageItemsBl;
	private Date eqCylHydroDateN;

	public D01EqEquipmentId() {
	}

	public D01EqEquipmentId(int eqEquipmentId, int eqCustId, int eqStockTypeId, double eqNetWorthMn, short eqCurrencyId,
			float eqExchangeRateFl, boolean eqUnavailableBl, Date eqLastUpdatedDate, boolean eqRequiredBl,
			Date eqCreationDate, boolean eqPackageBl, boolean eqBypassDblBookingCheckBl, int eqCylMaterialId,
			int eqCylValveId, int eqCylTypeId, boolean eqAddPackageItemsBl) {
		this.eqEquipmentId = eqEquipmentId;
		this.eqCustId = eqCustId;
		this.eqStockTypeId = eqStockTypeId;
		this.eqNetWorthMn = eqNetWorthMn;
		this.eqCurrencyId = eqCurrencyId;
		this.eqExchangeRateFl = eqExchangeRateFl;
		this.eqUnavailableBl = eqUnavailableBl;
		this.eqLastUpdatedDate = eqLastUpdatedDate;
		this.eqRequiredBl = eqRequiredBl;
		this.eqCreationDate = eqCreationDate;
		this.eqPackageBl = eqPackageBl;
		this.eqBypassDblBookingCheckBl = eqBypassDblBookingCheckBl;
		this.eqCylMaterialId = eqCylMaterialId;
		this.eqCylValveId = eqCylValveId;
		this.eqCylTypeId = eqCylTypeId;
		this.eqAddPackageItemsBl = eqAddPackageItemsBl;
	}

	public D01EqEquipmentId(int eqEquipmentId, int eqCustId, int eqStockTypeId, String eqRefNoTxN,
			String eqSerialNoTxN, Integer eqManufacturerIdN, String eqDescriptionTxN, Integer eqSizeIdN,
			Integer eqPrimaryColorIdN, Integer eqSecondaryColorIdN, double eqNetWorthMn, short eqCurrencyId,
			float eqExchangeRateFl, String eqBarcodeNoTxN, Date eqPurchasedDateN, Date eqSoldDateN,
			Date eqNextServiceDateN, boolean eqUnavailableBl, Date eqLastUpdatedDate, boolean eqRequiredBl,
			Date eqCreationDate, boolean eqPackageBl, boolean eqBypassDblBookingCheckBl, Date eqManufacturedDateN,
			int eqCylMaterialId, int eqCylValveId, int eqCylTypeId, String eqCylValveOtherTxN,
			String eqCylTypeOtherTxN, Boolean eqCylBootBl, Boolean eqCylBackpackBl,
			String eqCylWorkPressureTxN, String eqCylLabnoTxN, String eqCylTestPressureTxN,
			String eqCylWaterCapTxN, boolean eqAddPackageItemsBl, Date eqCylHydroDateN) {
		this.eqEquipmentId = eqEquipmentId;
		this.eqCustId = eqCustId;
		this.eqStockTypeId = eqStockTypeId;
		this.eqRefNoTxN = eqRefNoTxN;
		this.eqSerialNoTxN = eqSerialNoTxN;
		this.eqManufacturerIdN = eqManufacturerIdN;
		this.eqDescriptionTxN = eqDescriptionTxN;
		this.eqSizeIdN = eqSizeIdN;
		this.eqPrimaryColorIdN = eqPrimaryColorIdN;
		this.eqSecondaryColorIdN = eqSecondaryColorIdN;
		this.eqNetWorthMn = eqNetWorthMn;
		this.eqCurrencyId = eqCurrencyId;
		this.eqExchangeRateFl = eqExchangeRateFl;
		this.eqBarcodeNoTxN = eqBarcodeNoTxN;
		this.eqPurchasedDateN = eqPurchasedDateN;
		this.eqSoldDateN = eqSoldDateN;
		this.eqNextServiceDateN = eqNextServiceDateN;
		this.eqUnavailableBl = eqUnavailableBl;
		this.eqLastUpdatedDate = eqLastUpdatedDate;
		this.eqRequiredBl = eqRequiredBl;
		this.eqCreationDate = eqCreationDate;
		this.eqPackageBl = eqPackageBl;
		this.eqBypassDblBookingCheckBl = eqBypassDblBookingCheckBl;
		this.eqManufacturedDateN = eqManufacturedDateN;
		this.eqCylMaterialId = eqCylMaterialId;
		this.eqCylValveId = eqCylValveId;
		this.eqCylTypeId = eqCylTypeId;
		this.eqCylValveOtherTxN = eqCylValveOtherTxN;
		this.eqCylTypeOtherTxN = eqCylTypeOtherTxN;
		this.eqCylBootBl = eqCylBootBl;
		this.eqCylBackpackBl = eqCylBackpackBl;
		this.eqCylWorkPressureTxN = eqCylWorkPressureTxN;
		this.eqCylLabnoTxN = eqCylLabnoTxN;
		this.eqCylTestPressureTxN = eqCylTestPressureTxN;
		this.eqCylWaterCapTxN = eqCylWaterCapTxN;
		this.eqAddPackageItemsBl = eqAddPackageItemsBl;
		this.eqCylHydroDateN = eqCylHydroDateN;
	}

	@Column(name = "EqEquipmentID", nullable = false)
	public int getEqEquipmentId() {
		return this.eqEquipmentId;
	}

	public void setEqEquipmentId(int eqEquipmentId) {
		this.eqEquipmentId = eqEquipmentId;
	}

	@Column(name = "EqCustID", nullable = false)
	public int getEqCustId() {
		return this.eqCustId;
	}

	public void setEqCustId(int eqCustId) {
		this.eqCustId = eqCustId;
	}

	@Column(name = "EqStockTypeID", nullable = false)
	public int getEqStockTypeId() {
		return this.eqStockTypeId;
	}

	public void setEqStockTypeId(int eqStockTypeId) {
		this.eqStockTypeId = eqStockTypeId;
	}

	@Column(name = "EqRefNoTx_N")
	public String getEqRefNoTxN() {
		return this.eqRefNoTxN;
	}

	public void setEqRefNoTxN(String eqRefNoTxN) {
		this.eqRefNoTxN = eqRefNoTxN;
	}

	@Column(name = "EqSerialNoTx_N")
	public String getEqSerialNoTxN() {
		return this.eqSerialNoTxN;
	}

	public void setEqSerialNoTxN(String eqSerialNoTxN) {
		this.eqSerialNoTxN = eqSerialNoTxN;
	}

	@Column(name = "EqManufacturerID_N")
	public Integer getEqManufacturerIdN() {
		return this.eqManufacturerIdN;
	}

	public void setEqManufacturerIdN(Integer eqManufacturerIdN) {
		this.eqManufacturerIdN = eqManufacturerIdN;
	}

	@Column(name = "EqDescriptionTx_N")
	public String getEqDescriptionTxN() {
		return this.eqDescriptionTxN;
	}

	public void setEqDescriptionTxN(String eqDescriptionTxN) {
		this.eqDescriptionTxN = eqDescriptionTxN;
	}

	@Column(name = "EqSizeID_N")
	public Integer getEqSizeIdN() {
		return this.eqSizeIdN;
	}

	public void setEqSizeIdN(Integer eqSizeIdN) {
		this.eqSizeIdN = eqSizeIdN;
	}

	@Column(name = "EqPrimaryColorID_N")
	public Integer getEqPrimaryColorIdN() {
		return this.eqPrimaryColorIdN;
	}

	public void setEqPrimaryColorIdN(Integer eqPrimaryColorIdN) {
		this.eqPrimaryColorIdN = eqPrimaryColorIdN;
	}

	@Column(name = "EqSecondaryColorID_N")
	public Integer getEqSecondaryColorIdN() {
		return this.eqSecondaryColorIdN;
	}

	public void setEqSecondaryColorIdN(Integer eqSecondaryColorIdN) {
		this.eqSecondaryColorIdN = eqSecondaryColorIdN;
	}

	@Column(name = "EqNetWorthMn", nullable = false, precision = 53, scale = 0)
	public double getEqNetWorthMn() {
		return this.eqNetWorthMn;
	}

	public void setEqNetWorthMn(double eqNetWorthMn) {
		this.eqNetWorthMn = eqNetWorthMn;
	}

	@Column(name = "EqCurrencyID", nullable = false)
	public short getEqCurrencyId() {
		return this.eqCurrencyId;
	}

	public void setEqCurrencyId(short eqCurrencyId) {
		this.eqCurrencyId = eqCurrencyId;
	}

	@Column(name = "EqExchangeRateFl", nullable = false, precision = 24, scale = 0)
	public float getEqExchangeRateFl() {
		return this.eqExchangeRateFl;
	}

	public void setEqExchangeRateFl(float eqExchangeRateFl) {
		this.eqExchangeRateFl = eqExchangeRateFl;
	}

	@Column(name = "EqBarcodeNoTx_N")
	public String getEqBarcodeNoTxN() {
		return this.eqBarcodeNoTxN;
	}

	public void setEqBarcodeNoTxN(String eqBarcodeNoTxN) {
		this.eqBarcodeNoTxN = eqBarcodeNoTxN;
	}

	@Column(name = "EqPurchasedDate_N", length = 23)
	public Date getEqPurchasedDateN() {
		return this.eqPurchasedDateN;
	}

	public void setEqPurchasedDateN(Date eqPurchasedDateN) {
		this.eqPurchasedDateN = eqPurchasedDateN;
	}

	@Column(name = "EqSoldDate_N", length = 23)
	public Date getEqSoldDateN() {
		return this.eqSoldDateN;
	}

	public void setEqSoldDateN(Date eqSoldDateN) {
		this.eqSoldDateN = eqSoldDateN;
	}

	@Column(name = "EqNextServiceDate_N", length = 23)
	public Date getEqNextServiceDateN() {
		return this.eqNextServiceDateN;
	}

	public void setEqNextServiceDateN(Date eqNextServiceDateN) {
		this.eqNextServiceDateN = eqNextServiceDateN;
	}

	@Column(name = "EqUnavailableBl", nullable = false)
	public boolean isEqUnavailableBl() {
		return this.eqUnavailableBl;
	}

	public void setEqUnavailableBl(boolean eqUnavailableBl) {
		this.eqUnavailableBl = eqUnavailableBl;
	}

	@Column(name = "EqLastUpdatedDate", nullable = false, length = 23)
	public Date getEqLastUpdatedDate() {
		return this.eqLastUpdatedDate;
	}

	public void setEqLastUpdatedDate(Date eqLastUpdatedDate) {
		this.eqLastUpdatedDate = eqLastUpdatedDate;
	}

	@Column(name = "EqRequiredBl", nullable = false)
	public boolean isEqRequiredBl() {
		return this.eqRequiredBl;
	}

	public void setEqRequiredBl(boolean eqRequiredBl) {
		this.eqRequiredBl = eqRequiredBl;
	}

	@Column(name = "EqCreationDate", nullable = false, length = 23)
	public Date getEqCreationDate() {
		return this.eqCreationDate;
	}

	public void setEqCreationDate(Date eqCreationDate) {
		this.eqCreationDate = eqCreationDate;
	}

	@Column(name = "EqPackageBl", nullable = false)
	public boolean isEqPackageBl() {
		return this.eqPackageBl;
	}

	public void setEqPackageBl(boolean eqPackageBl) {
		this.eqPackageBl = eqPackageBl;
	}

	@Column(name = "EqBypassDblBookingCheckBl", nullable = false)
	public boolean isEqBypassDblBookingCheckBl() {
		return this.eqBypassDblBookingCheckBl;
	}

	public void setEqBypassDblBookingCheckBl(boolean eqBypassDblBookingCheckBl) {
		this.eqBypassDblBookingCheckBl = eqBypassDblBookingCheckBl;
	}

	@Column(name = "EqManufacturedDate_N", length = 23)
	public Date getEqManufacturedDateN() {
		return this.eqManufacturedDateN;
	}

	public void setEqManufacturedDateN(Date eqManufacturedDateN) {
		this.eqManufacturedDateN = eqManufacturedDateN;
	}

	@Column(name = "EqCylMaterialID", nullable = false)
	public int getEqCylMaterialId() {
		return this.eqCylMaterialId;
	}

	public void setEqCylMaterialId(int eqCylMaterialId) {
		this.eqCylMaterialId = eqCylMaterialId;
	}

	@Column(name = "EqCylValveID", nullable = false)
	public int getEqCylValveId() {
		return this.eqCylValveId;
	}

	public void setEqCylValveId(int eqCylValveId) {
		this.eqCylValveId = eqCylValveId;
	}

	@Column(name = "EqCylTypeID", nullable = false)
	public int getEqCylTypeId() {
		return this.eqCylTypeId;
	}

	public void setEqCylTypeId(int eqCylTypeId) {
		this.eqCylTypeId = eqCylTypeId;
	}

	@Column(name = "EqCylValveOtherTx_N")
	public String getEqCylValveOtherTxN() {
		return this.eqCylValveOtherTxN;
	}

	public void setEqCylValveOtherTxN(String eqCylValveOtherTxN) {
		this.eqCylValveOtherTxN = eqCylValveOtherTxN;
	}

	@Column(name = "EqCylTypeOtherTx_N")
	public String getEqCylTypeOtherTxN() {
		return this.eqCylTypeOtherTxN;
	}

	public void setEqCylTypeOtherTxN(String eqCylTypeOtherTxN) {
		this.eqCylTypeOtherTxN = eqCylTypeOtherTxN;
	}

	@Column(name = "EqCylBootBl")
	public Boolean getEqCylBootBl() {
		return this.eqCylBootBl;
	}

	public void setEqCylBootBl(Boolean eqCylBootBl) {
		this.eqCylBootBl = eqCylBootBl;
	}

	@Column(name = "EqCylBackpackBl")
	public Boolean getEqCylBackpackBl() {
		return this.eqCylBackpackBl;
	}

	public void setEqCylBackpackBl(Boolean eqCylBackpackBl) {
		this.eqCylBackpackBl = eqCylBackpackBl;
	}

	@Column(name = "EqCylWorkPressureTx_N")
	public String getEqCylWorkPressureTxN() {
		return this.eqCylWorkPressureTxN;
	}

	public void setEqCylWorkPressureTxN(String eqCylWorkPressureTxN) {
		this.eqCylWorkPressureTxN = eqCylWorkPressureTxN;
	}

	@Column(name = "EqCylLABNoTx_N")
	public String getEqCylLabnoTxN() {
		return this.eqCylLabnoTxN;
	}

	public void setEqCylLabnoTxN(String eqCylLabnoTxN) {
		this.eqCylLabnoTxN = eqCylLabnoTxN;
	}

	@Column(name = "EqCylTestPressureTx_N")
	public String getEqCylTestPressureTxN() {
		return this.eqCylTestPressureTxN;
	}

	public void setEqCylTestPressureTxN(String eqCylTestPressureTxN) {
		this.eqCylTestPressureTxN = eqCylTestPressureTxN;
	}

	@Column(name = "EqCylWaterCapTx_N")
	public String getEqCylWaterCapTxN() {
		return this.eqCylWaterCapTxN;
	}

	public void setEqCylWaterCapTxN(String eqCylWaterCapTxN) {
		this.eqCylWaterCapTxN = eqCylWaterCapTxN;
	}

	@Column(name = "EqAddPackageItemsBl", nullable = false)
	public boolean isEqAddPackageItemsBl() {
		return this.eqAddPackageItemsBl;
	}

	public void setEqAddPackageItemsBl(boolean eqAddPackageItemsBl) {
		this.eqAddPackageItemsBl = eqAddPackageItemsBl;
	}

	@Column(name = "EqCylHydroDate_N", length = 23)
	public Date getEqCylHydroDateN() {
		return this.eqCylHydroDateN;
	}

	public void setEqCylHydroDateN(Date eqCylHydroDateN) {
		this.eqCylHydroDateN = eqCylHydroDateN;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof D01EqEquipmentId))
			return false;
		D01EqEquipmentId castOther = (D01EqEquipmentId) other;

		return (this.getEqEquipmentId() == castOther.getEqEquipmentId())
				&& (this.getEqCustId() == castOther.getEqCustId())
				&& (this.getEqStockTypeId() == castOther.getEqStockTypeId())
				&& ((this.getEqRefNoTxN() == castOther.getEqRefNoTxN()) || (this.getEqRefNoTxN() != null
						&& castOther.getEqRefNoTxN() != null && this.getEqRefNoTxN().equals(castOther.getEqRefNoTxN())))
				&& ((this.getEqSerialNoTxN() == castOther.getEqSerialNoTxN())
						|| (this.getEqSerialNoTxN() != null && castOther.getEqSerialNoTxN() != null
								&& this.getEqSerialNoTxN().equals(castOther.getEqSerialNoTxN())))
				&& ((this.getEqManufacturerIdN() == castOther.getEqManufacturerIdN())
						|| (this.getEqManufacturerIdN() != null && castOther.getEqManufacturerIdN() != null
								&& this.getEqManufacturerIdN().equals(castOther.getEqManufacturerIdN())))
				&& ((this.getEqDescriptionTxN() == castOther.getEqDescriptionTxN())
						|| (this.getEqDescriptionTxN() != null && castOther.getEqDescriptionTxN() != null
								&& this.getEqDescriptionTxN().equals(castOther.getEqDescriptionTxN())))
				&& ((this.getEqSizeIdN() == castOther.getEqSizeIdN()) || (this.getEqSizeIdN() != null
						&& castOther.getEqSizeIdN() != null && this.getEqSizeIdN().equals(castOther.getEqSizeIdN())))
				&& ((this.getEqPrimaryColorIdN() == castOther.getEqPrimaryColorIdN())
						|| (this.getEqPrimaryColorIdN() != null && castOther.getEqPrimaryColorIdN() != null
								&& this.getEqPrimaryColorIdN().equals(castOther.getEqPrimaryColorIdN())))
				&& ((this.getEqSecondaryColorIdN() == castOther.getEqSecondaryColorIdN())
						|| (this.getEqSecondaryColorIdN() != null && castOther.getEqSecondaryColorIdN() != null
								&& this.getEqSecondaryColorIdN().equals(castOther.getEqSecondaryColorIdN())))
				&& (this.getEqNetWorthMn() == castOther.getEqNetWorthMn())
				&& (this.getEqCurrencyId() == castOther.getEqCurrencyId())
				&& (this.getEqExchangeRateFl() == castOther.getEqExchangeRateFl())
				&& ((this.getEqBarcodeNoTxN() == castOther.getEqBarcodeNoTxN())
						|| (this.getEqBarcodeNoTxN() != null && castOther.getEqBarcodeNoTxN() != null
								&& this.getEqBarcodeNoTxN().equals(castOther.getEqBarcodeNoTxN())))
				&& ((this.getEqPurchasedDateN() == castOther.getEqPurchasedDateN())
						|| (this.getEqPurchasedDateN() != null && castOther.getEqPurchasedDateN() != null
								&& this.getEqPurchasedDateN().equals(castOther.getEqPurchasedDateN())))
				&& ((this.getEqSoldDateN() == castOther.getEqSoldDateN())
						|| (this.getEqSoldDateN() != null && castOther.getEqSoldDateN() != null
								&& this.getEqSoldDateN().equals(castOther.getEqSoldDateN())))
				&& ((this.getEqNextServiceDateN() == castOther.getEqNextServiceDateN())
						|| (this.getEqNextServiceDateN() != null && castOther.getEqNextServiceDateN() != null
								&& this.getEqNextServiceDateN().equals(castOther.getEqNextServiceDateN())))
				&& (this.isEqUnavailableBl() == castOther.isEqUnavailableBl())
				&& ((this.getEqLastUpdatedDate() == castOther.getEqLastUpdatedDate())
						|| (this.getEqLastUpdatedDate() != null && castOther.getEqLastUpdatedDate() != null
								&& this.getEqLastUpdatedDate().equals(castOther.getEqLastUpdatedDate())))
				&& (this.isEqRequiredBl() == castOther.isEqRequiredBl())
				&& ((this.getEqCreationDate() == castOther.getEqCreationDate())
						|| (this.getEqCreationDate() != null && castOther.getEqCreationDate() != null
								&& this.getEqCreationDate().equals(castOther.getEqCreationDate())))
				&& (this.isEqPackageBl() == castOther.isEqPackageBl())
				&& (this.isEqBypassDblBookingCheckBl() == castOther.isEqBypassDblBookingCheckBl())
				&& ((this.getEqManufacturedDateN() == castOther.getEqManufacturedDateN())
						|| (this.getEqManufacturedDateN() != null && castOther.getEqManufacturedDateN() != null
								&& this.getEqManufacturedDateN().equals(castOther.getEqManufacturedDateN())))
				&& (this.getEqCylMaterialId() == castOther.getEqCylMaterialId())
				&& (this.getEqCylValveId() == castOther.getEqCylValveId())
				&& (this.getEqCylTypeId() == castOther.getEqCylTypeId())
				&& ((this.getEqCylValveOtherTxN() == castOther.getEqCylValveOtherTxN())
						|| (this.getEqCylValveOtherTxN() != null && castOther.getEqCylValveOtherTxN() != null
								&& this.getEqCylValveOtherTxN().equals(castOther.getEqCylValveOtherTxN())))
				&& ((this.getEqCylTypeOtherTxN() == castOther.getEqCylTypeOtherTxN())
						|| (this.getEqCylTypeOtherTxN() != null && castOther.getEqCylTypeOtherTxN() != null
								&& this.getEqCylTypeOtherTxN().equals(castOther.getEqCylTypeOtherTxN())))
				&& ((this.getEqCylBootBl() == castOther.getEqCylBootBl())
						|| (this.getEqCylBootBl() != null && castOther.getEqCylBootBl() != null
								&& this.getEqCylBootBl().equals(castOther.getEqCylBootBl())))
				&& ((this.getEqCylBackpackBl() == castOther.getEqCylBackpackBl())
						|| (this.getEqCylBackpackBl() != null && castOther.getEqCylBackpackBl() != null
								&& this.getEqCylBackpackBl().equals(castOther.getEqCylBackpackBl())))
				&& ((this.getEqCylWorkPressureTxN() == castOther.getEqCylWorkPressureTxN())
						|| (this.getEqCylWorkPressureTxN() != null && castOther.getEqCylWorkPressureTxN() != null
								&& this.getEqCylWorkPressureTxN().equals(castOther.getEqCylWorkPressureTxN())))
				&& ((this.getEqCylLabnoTxN() == castOther.getEqCylLabnoTxN())
						|| (this.getEqCylLabnoTxN() != null && castOther.getEqCylLabnoTxN() != null
								&& this.getEqCylLabnoTxN().equals(castOther.getEqCylLabnoTxN())))
				&& ((this.getEqCylTestPressureTxN() == castOther.getEqCylTestPressureTxN())
						|| (this.getEqCylTestPressureTxN() != null && castOther.getEqCylTestPressureTxN() != null
								&& this.getEqCylTestPressureTxN().equals(castOther.getEqCylTestPressureTxN())))
				&& ((this.getEqCylWaterCapTxN() == castOther.getEqCylWaterCapTxN())
						|| (this.getEqCylWaterCapTxN() != null && castOther.getEqCylWaterCapTxN() != null
								&& this.getEqCylWaterCapTxN().equals(castOther.getEqCylWaterCapTxN())))
				&& (this.isEqAddPackageItemsBl() == castOther.isEqAddPackageItemsBl())
				&& ((this.getEqCylHydroDateN() == castOther.getEqCylHydroDateN())
						|| (this.getEqCylHydroDateN() != null && castOther.getEqCylHydroDateN() != null
								&& this.getEqCylHydroDateN().equals(castOther.getEqCylHydroDateN())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEqEquipmentId();
		result = 37 * result + this.getEqCustId();
		result = 37 * result + this.getEqStockTypeId();
		result = 37 * result + (getEqRefNoTxN() == null ? 0 : this.getEqRefNoTxN().hashCode());
		result = 37 * result + (getEqSerialNoTxN() == null ? 0 : this.getEqSerialNoTxN().hashCode());
		result = 37 * result + (getEqManufacturerIdN() == null ? 0 : this.getEqManufacturerIdN().hashCode());
		result = 37 * result + (getEqDescriptionTxN() == null ? 0 : this.getEqDescriptionTxN().hashCode());
		result = 37 * result + (getEqSizeIdN() == null ? 0 : this.getEqSizeIdN().hashCode());
		result = 37 * result + (getEqPrimaryColorIdN() == null ? 0 : this.getEqPrimaryColorIdN().hashCode());
		result = 37 * result + (getEqSecondaryColorIdN() == null ? 0 : this.getEqSecondaryColorIdN().hashCode());
		result = 37 * result + (int) this.getEqNetWorthMn();
		result = 37 * result + this.getEqCurrencyId();
		result = 37 * result + (int) this.getEqExchangeRateFl();
		result = 37 * result + (getEqBarcodeNoTxN() == null ? 0 : this.getEqBarcodeNoTxN().hashCode());
		result = 37 * result + (getEqPurchasedDateN() == null ? 0 : this.getEqPurchasedDateN().hashCode());
		result = 37 * result + (getEqSoldDateN() == null ? 0 : this.getEqSoldDateN().hashCode());
		result = 37 * result + (getEqNextServiceDateN() == null ? 0 : this.getEqNextServiceDateN().hashCode());
		result = 37 * result + (this.isEqUnavailableBl() ? 1 : 0);
		result = 37 * result + (getEqLastUpdatedDate() == null ? 0 : this.getEqLastUpdatedDate().hashCode());
		result = 37 * result + (this.isEqRequiredBl() ? 1 : 0);
		result = 37 * result + (getEqCreationDate() == null ? 0 : this.getEqCreationDate().hashCode());
		result = 37 * result + (this.isEqPackageBl() ? 1 : 0);
		result = 37 * result + (this.isEqBypassDblBookingCheckBl() ? 1 : 0);
		result = 37 * result + (getEqManufacturedDateN() == null ? 0 : this.getEqManufacturedDateN().hashCode());
		result = 37 * result + this.getEqCylMaterialId();
		result = 37 * result + this.getEqCylValveId();
		result = 37 * result + this.getEqCylTypeId();
		result = 37 * result + (getEqCylValveOtherTxN() == null ? 0 : this.getEqCylValveOtherTxN().hashCode());
		result = 37 * result + (getEqCylTypeOtherTxN() == null ? 0 : this.getEqCylTypeOtherTxN().hashCode());
		result = 37 * result + (getEqCylBootBl() == null ? 0 : this.getEqCylBootBl().hashCode());
		result = 37 * result + (getEqCylBackpackBl() == null ? 0 : this.getEqCylBackpackBl().hashCode());
		result = 37 * result + (getEqCylWorkPressureTxN() == null ? 0 : this.getEqCylWorkPressureTxN().hashCode());
		result = 37 * result + (getEqCylLabnoTxN() == null ? 0 : this.getEqCylLabnoTxN().hashCode());
		result = 37 * result + (getEqCylTestPressureTxN() == null ? 0 : this.getEqCylTestPressureTxN().hashCode());
		result = 37 * result + (getEqCylWaterCapTxN() == null ? 0 : this.getEqCylWaterCapTxN().hashCode());
		result = 37 * result + (this.isEqAddPackageItemsBl() ? 1 : 0);
		result = 37 * result + (getEqCylHydroDateN() == null ? 0 : this.getEqCylHydroDateN().hashCode());
		return result;
	}

}
