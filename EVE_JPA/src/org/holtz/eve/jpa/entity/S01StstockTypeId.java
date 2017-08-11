package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * S01StstockTypeId generated by hbm2java
 */
@Embeddable
public class S01StstockTypeId implements java.io.Serializable {

	private int ststockTypeId;
	private String ststockTypeTx;
	private int stprofitCenterId;
	private boolean stprofileBl;
	private boolean stforRentBl;
	private boolean stforServiceBl;
	private boolean stforServicePartsBl;
	private boolean stforSaleBl;
	private boolean sttrackOwnershipBl;
	private boolean stforChecklistBl;
	private boolean stcustomerRequiredBl;
	private boolean stunavailableBl;
	private Date stlastUpdatedDate;
	private float stcommissionRateFl;
	private Integer stsaleDiscountBandIdN;
	private boolean strequiredBl;
	private String stinvoiceTextTxN;
	private short stservicePeriodIn;
	private Date stcreationDate;
	private boolean stgiftCertPromptBl;
	private boolean stgiftCardPromptBl;
	private boolean stroomBookingPromptBl;
	private Integer strebiidN;
	private boolean stwebAdminEntryBl;
	private boolean stwebAdminDeletedBl;
	private boolean sttechnicianActivityBl;
	private int stdisplayOrderIn;
	private Short steventDataTypeIdN;
	private String stseotagTxN;
	private boolean stshowCylinderInfoBl;
	private String stclassNameTxN;
	private String steolstockTypeTxN;
	private int steolheaderId;
	private boolean stallowPriceUpdatesBl;
	private String stqtyBasedDiscountsTxN;
	private boolean stallowPaymentSurchargeBl;

	public S01StstockTypeId() {
	}

	public S01StstockTypeId(int ststockTypeId, String ststockTypeTx, int stprofitCenterId, boolean stprofileBl,
			boolean stforRentBl, boolean stforServiceBl, boolean stforServicePartsBl, boolean stforSaleBl,
			boolean sttrackOwnershipBl, boolean stforChecklistBl, boolean stcustomerRequiredBl, boolean stunavailableBl,
			Date stlastUpdatedDate, float stcommissionRateFl, boolean strequiredBl, short stservicePeriodIn,
			Date stcreationDate, boolean stgiftCertPromptBl, boolean stgiftCardPromptBl, boolean stroomBookingPromptBl,
			boolean stwebAdminEntryBl, boolean stwebAdminDeletedBl, boolean sttechnicianActivityBl,
			int stdisplayOrderIn, boolean stshowCylinderInfoBl, int steolheaderId, boolean stallowPriceUpdatesBl,
			boolean stallowPaymentSurchargeBl) {
		this.ststockTypeId = ststockTypeId;
		this.ststockTypeTx = ststockTypeTx;
		this.stprofitCenterId = stprofitCenterId;
		this.stprofileBl = stprofileBl;
		this.stforRentBl = stforRentBl;
		this.stforServiceBl = stforServiceBl;
		this.stforServicePartsBl = stforServicePartsBl;
		this.stforSaleBl = stforSaleBl;
		this.sttrackOwnershipBl = sttrackOwnershipBl;
		this.stforChecklistBl = stforChecklistBl;
		this.stcustomerRequiredBl = stcustomerRequiredBl;
		this.stunavailableBl = stunavailableBl;
		this.stlastUpdatedDate = stlastUpdatedDate;
		this.stcommissionRateFl = stcommissionRateFl;
		this.strequiredBl = strequiredBl;
		this.stservicePeriodIn = stservicePeriodIn;
		this.stcreationDate = stcreationDate;
		this.stgiftCertPromptBl = stgiftCertPromptBl;
		this.stgiftCardPromptBl = stgiftCardPromptBl;
		this.stroomBookingPromptBl = stroomBookingPromptBl;
		this.stwebAdminEntryBl = stwebAdminEntryBl;
		this.stwebAdminDeletedBl = stwebAdminDeletedBl;
		this.sttechnicianActivityBl = sttechnicianActivityBl;
		this.stdisplayOrderIn = stdisplayOrderIn;
		this.stshowCylinderInfoBl = stshowCylinderInfoBl;
		this.steolheaderId = steolheaderId;
		this.stallowPriceUpdatesBl = stallowPriceUpdatesBl;
		this.stallowPaymentSurchargeBl = stallowPaymentSurchargeBl;
	}

	public S01StstockTypeId(int ststockTypeId, String ststockTypeTx, int stprofitCenterId, boolean stprofileBl,
			boolean stforRentBl, boolean stforServiceBl, boolean stforServicePartsBl, boolean stforSaleBl,
			boolean sttrackOwnershipBl, boolean stforChecklistBl, boolean stcustomerRequiredBl, boolean stunavailableBl,
			Date stlastUpdatedDate, float stcommissionRateFl, Integer stsaleDiscountBandIdN, boolean strequiredBl,
			String stinvoiceTextTxN, short stservicePeriodIn, Date stcreationDate, boolean stgiftCertPromptBl,
			boolean stgiftCardPromptBl, boolean stroomBookingPromptBl, Integer strebiidN, boolean stwebAdminEntryBl,
			boolean stwebAdminDeletedBl, boolean sttechnicianActivityBl, int stdisplayOrderIn, Short steventDataTypeIdN,
			String stseotagTxN, boolean stshowCylinderInfoBl, String stclassNameTxN,
			String steolstockTypeTxN, int steolheaderId, boolean stallowPriceUpdatesBl,
			String stqtyBasedDiscountsTxN, boolean stallowPaymentSurchargeBl) {
		this.ststockTypeId = ststockTypeId;
		this.ststockTypeTx = ststockTypeTx;
		this.stprofitCenterId = stprofitCenterId;
		this.stprofileBl = stprofileBl;
		this.stforRentBl = stforRentBl;
		this.stforServiceBl = stforServiceBl;
		this.stforServicePartsBl = stforServicePartsBl;
		this.stforSaleBl = stforSaleBl;
		this.sttrackOwnershipBl = sttrackOwnershipBl;
		this.stforChecklistBl = stforChecklistBl;
		this.stcustomerRequiredBl = stcustomerRequiredBl;
		this.stunavailableBl = stunavailableBl;
		this.stlastUpdatedDate = stlastUpdatedDate;
		this.stcommissionRateFl = stcommissionRateFl;
		this.stsaleDiscountBandIdN = stsaleDiscountBandIdN;
		this.strequiredBl = strequiredBl;
		this.stinvoiceTextTxN = stinvoiceTextTxN;
		this.stservicePeriodIn = stservicePeriodIn;
		this.stcreationDate = stcreationDate;
		this.stgiftCertPromptBl = stgiftCertPromptBl;
		this.stgiftCardPromptBl = stgiftCardPromptBl;
		this.stroomBookingPromptBl = stroomBookingPromptBl;
		this.strebiidN = strebiidN;
		this.stwebAdminEntryBl = stwebAdminEntryBl;
		this.stwebAdminDeletedBl = stwebAdminDeletedBl;
		this.sttechnicianActivityBl = sttechnicianActivityBl;
		this.stdisplayOrderIn = stdisplayOrderIn;
		this.steventDataTypeIdN = steventDataTypeIdN;
		this.stseotagTxN = stseotagTxN;
		this.stshowCylinderInfoBl = stshowCylinderInfoBl;
		this.stclassNameTxN = stclassNameTxN;
		this.steolstockTypeTxN = steolstockTypeTxN;
		this.steolheaderId = steolheaderId;
		this.stallowPriceUpdatesBl = stallowPriceUpdatesBl;
		this.stqtyBasedDiscountsTxN = stqtyBasedDiscountsTxN;
		this.stallowPaymentSurchargeBl = stallowPaymentSurchargeBl;
	}

	@Column(name = "STStockTypeID", nullable = false)
	public int getStstockTypeId() {
		return this.ststockTypeId;
	}

	public void setStstockTypeId(int ststockTypeId) {
		this.ststockTypeId = ststockTypeId;
	}

	@Column(name = "STStockTypeTx", nullable = false)
	public String getStstockTypeTx() {
		return this.ststockTypeTx;
	}

	public void setStstockTypeTx(String ststockTypeTx) {
		this.ststockTypeTx = ststockTypeTx;
	}

	@Column(name = "STProfitCenterID", nullable = false)
	public int getStprofitCenterId() {
		return this.stprofitCenterId;
	}

	public void setStprofitCenterId(int stprofitCenterId) {
		this.stprofitCenterId = stprofitCenterId;
	}

	@Column(name = "STProfileBl", nullable = false)
	public boolean isStprofileBl() {
		return this.stprofileBl;
	}

	public void setStprofileBl(boolean stprofileBl) {
		this.stprofileBl = stprofileBl;
	}

	@Column(name = "STForRentBl", nullable = false)
	public boolean isStforRentBl() {
		return this.stforRentBl;
	}

	public void setStforRentBl(boolean stforRentBl) {
		this.stforRentBl = stforRentBl;
	}

	@Column(name = "STForServiceBl", nullable = false)
	public boolean isStforServiceBl() {
		return this.stforServiceBl;
	}

	public void setStforServiceBl(boolean stforServiceBl) {
		this.stforServiceBl = stforServiceBl;
	}

	@Column(name = "STForServicePartsBl", nullable = false)
	public boolean isStforServicePartsBl() {
		return this.stforServicePartsBl;
	}

	public void setStforServicePartsBl(boolean stforServicePartsBl) {
		this.stforServicePartsBl = stforServicePartsBl;
	}

	@Column(name = "STForSaleBl", nullable = false)
	public boolean isStforSaleBl() {
		return this.stforSaleBl;
	}

	public void setStforSaleBl(boolean stforSaleBl) {
		this.stforSaleBl = stforSaleBl;
	}

	@Column(name = "STTrackOwnershipBl", nullable = false)
	public boolean isSttrackOwnershipBl() {
		return this.sttrackOwnershipBl;
	}

	public void setSttrackOwnershipBl(boolean sttrackOwnershipBl) {
		this.sttrackOwnershipBl = sttrackOwnershipBl;
	}

	@Column(name = "STForChecklistBl", nullable = false)
	public boolean isStforChecklistBl() {
		return this.stforChecklistBl;
	}

	public void setStforChecklistBl(boolean stforChecklistBl) {
		this.stforChecklistBl = stforChecklistBl;
	}

	@Column(name = "STCustomerRequiredBl", nullable = false)
	public boolean isStcustomerRequiredBl() {
		return this.stcustomerRequiredBl;
	}

	public void setStcustomerRequiredBl(boolean stcustomerRequiredBl) {
		this.stcustomerRequiredBl = stcustomerRequiredBl;
	}

	@Column(name = "STUnavailableBl", nullable = false)
	public boolean isStunavailableBl() {
		return this.stunavailableBl;
	}

	public void setStunavailableBl(boolean stunavailableBl) {
		this.stunavailableBl = stunavailableBl;
	}

	@Column(name = "STLastUpdatedDate", nullable = false, length = 23)
	public Date getStlastUpdatedDate() {
		return this.stlastUpdatedDate;
	}

	public void setStlastUpdatedDate(Date stlastUpdatedDate) {
		this.stlastUpdatedDate = stlastUpdatedDate;
	}

	@Column(name = "STCommissionRateFl", nullable = false, precision = 24, scale = 0)
	public float getStcommissionRateFl() {
		return this.stcommissionRateFl;
	}

	public void setStcommissionRateFl(float stcommissionRateFl) {
		this.stcommissionRateFl = stcommissionRateFl;
	}

	@Column(name = "STSaleDiscountBandID_N")
	public Integer getStsaleDiscountBandIdN() {
		return this.stsaleDiscountBandIdN;
	}

	public void setStsaleDiscountBandIdN(Integer stsaleDiscountBandIdN) {
		this.stsaleDiscountBandIdN = stsaleDiscountBandIdN;
	}

	@Column(name = "STRequiredBl", nullable = false)
	public boolean isStrequiredBl() {
		return this.strequiredBl;
	}

	public void setStrequiredBl(boolean strequiredBl) {
		this.strequiredBl = strequiredBl;
	}

	@Column(name = "STInvoiceTextTx_N")
	public String getStinvoiceTextTxN() {
		return this.stinvoiceTextTxN;
	}

	public void setStinvoiceTextTxN(String stinvoiceTextTxN) {
		this.stinvoiceTextTxN = stinvoiceTextTxN;
	}

	@Column(name = "STServicePeriodIn", nullable = false)
	public short getStservicePeriodIn() {
		return this.stservicePeriodIn;
	}

	public void setStservicePeriodIn(short stservicePeriodIn) {
		this.stservicePeriodIn = stservicePeriodIn;
	}

	@Column(name = "STCreationDate", nullable = false, length = 23)
	public Date getStcreationDate() {
		return this.stcreationDate;
	}

	public void setStcreationDate(Date stcreationDate) {
		this.stcreationDate = stcreationDate;
	}

	@Column(name = "STGiftCertPromptBl", nullable = false)
	public boolean isStgiftCertPromptBl() {
		return this.stgiftCertPromptBl;
	}

	public void setStgiftCertPromptBl(boolean stgiftCertPromptBl) {
		this.stgiftCertPromptBl = stgiftCertPromptBl;
	}

	@Column(name = "STGiftCardPromptBl", nullable = false)
	public boolean isStgiftCardPromptBl() {
		return this.stgiftCardPromptBl;
	}

	public void setStgiftCardPromptBl(boolean stgiftCardPromptBl) {
		this.stgiftCardPromptBl = stgiftCardPromptBl;
	}

	@Column(name = "STRoomBookingPromptBl", nullable = false)
	public boolean isStroomBookingPromptBl() {
		return this.stroomBookingPromptBl;
	}

	public void setStroomBookingPromptBl(boolean stroomBookingPromptBl) {
		this.stroomBookingPromptBl = stroomBookingPromptBl;
	}

	@Column(name = "STREBIID_N")
	public Integer getStrebiidN() {
		return this.strebiidN;
	}

	public void setStrebiidN(Integer strebiidN) {
		this.strebiidN = strebiidN;
	}

	@Column(name = "STWebAdminEntryBl", nullable = false)
	public boolean isStwebAdminEntryBl() {
		return this.stwebAdminEntryBl;
	}

	public void setStwebAdminEntryBl(boolean stwebAdminEntryBl) {
		this.stwebAdminEntryBl = stwebAdminEntryBl;
	}

	@Column(name = "STWebAdminDeletedBl", nullable = false)
	public boolean isStwebAdminDeletedBl() {
		return this.stwebAdminDeletedBl;
	}

	public void setStwebAdminDeletedBl(boolean stwebAdminDeletedBl) {
		this.stwebAdminDeletedBl = stwebAdminDeletedBl;
	}

	@Column(name = "STTechnicianActivityBl", nullable = false)
	public boolean isSttechnicianActivityBl() {
		return this.sttechnicianActivityBl;
	}

	public void setSttechnicianActivityBl(boolean sttechnicianActivityBl) {
		this.sttechnicianActivityBl = sttechnicianActivityBl;
	}

	@Column(name = "STDisplayOrderIn", nullable = false)
	public int getStdisplayOrderIn() {
		return this.stdisplayOrderIn;
	}

	public void setStdisplayOrderIn(int stdisplayOrderIn) {
		this.stdisplayOrderIn = stdisplayOrderIn;
	}

	@Column(name = "STEventDataTypeID_N")
	public Short getSteventDataTypeIdN() {
		return this.steventDataTypeIdN;
	}

	public void setSteventDataTypeIdN(Short steventDataTypeIdN) {
		this.steventDataTypeIdN = steventDataTypeIdN;
	}

	@Column(name = "STSEOTagTx_N")
	public String getStseotagTxN() {
		return this.stseotagTxN;
	}

	public void setStseotagTxN(String stseotagTxN) {
		this.stseotagTxN = stseotagTxN;
	}

	@Column(name = "STShowCylinderInfoBl", nullable = false)
	public boolean isStshowCylinderInfoBl() {
		return this.stshowCylinderInfoBl;
	}

	public void setStshowCylinderInfoBl(boolean stshowCylinderInfoBl) {
		this.stshowCylinderInfoBl = stshowCylinderInfoBl;
	}

	@Column(name = "STClassNameTx_N", length = 50)
	public String getStclassNameTxN() {
		return this.stclassNameTxN;
	}

	public void setStclassNameTxN(String stclassNameTxN) {
		this.stclassNameTxN = stclassNameTxN;
	}

	@Column(name = "STEOLStockTypeTx_N")
	public String getSteolstockTypeTxN() {
		return this.steolstockTypeTxN;
	}

	public void setSteolstockTypeTxN(String steolstockTypeTxN) {
		this.steolstockTypeTxN = steolstockTypeTxN;
	}

	@Column(name = "STEOLHeaderID", nullable = false)
	public int getSteolheaderId() {
		return this.steolheaderId;
	}

	public void setSteolheaderId(int steolheaderId) {
		this.steolheaderId = steolheaderId;
	}

	@Column(name = "STAllowPriceUpdatesBl", nullable = false)
	public boolean isStallowPriceUpdatesBl() {
		return this.stallowPriceUpdatesBl;
	}

	public void setStallowPriceUpdatesBl(boolean stallowPriceUpdatesBl) {
		this.stallowPriceUpdatesBl = stallowPriceUpdatesBl;
	}

	@Column(name = "STQtyBasedDiscountsTx_N")
	public String getStqtyBasedDiscountsTxN() {
		return this.stqtyBasedDiscountsTxN;
	}

	public void setStqtyBasedDiscountsTxN(String stqtyBasedDiscountsTxN) {
		this.stqtyBasedDiscountsTxN = stqtyBasedDiscountsTxN;
	}

	@Column(name = "STAllowPaymentSurchargeBl", nullable = false)
	public boolean isStallowPaymentSurchargeBl() {
		return this.stallowPaymentSurchargeBl;
	}

	public void setStallowPaymentSurchargeBl(boolean stallowPaymentSurchargeBl) {
		this.stallowPaymentSurchargeBl = stallowPaymentSurchargeBl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof S01StstockTypeId))
			return false;
		S01StstockTypeId castOther = (S01StstockTypeId) other;

		return (this.getStstockTypeId() == castOther.getStstockTypeId())
				&& ((this.getStstockTypeTx() == castOther.getStstockTypeTx())
						|| (this.getStstockTypeTx() != null && castOther.getStstockTypeTx() != null
								&& this.getStstockTypeTx().equals(castOther.getStstockTypeTx())))
				&& (this.getStprofitCenterId() == castOther.getStprofitCenterId())
				&& (this.isStprofileBl() == castOther.isStprofileBl())
				&& (this.isStforRentBl() == castOther.isStforRentBl())
				&& (this.isStforServiceBl() == castOther.isStforServiceBl())
				&& (this.isStforServicePartsBl() == castOther.isStforServicePartsBl())
				&& (this.isStforSaleBl() == castOther.isStforSaleBl())
				&& (this.isSttrackOwnershipBl() == castOther.isSttrackOwnershipBl())
				&& (this.isStforChecklistBl() == castOther.isStforChecklistBl())
				&& (this.isStcustomerRequiredBl() == castOther.isStcustomerRequiredBl())
				&& (this.isStunavailableBl() == castOther.isStunavailableBl())
				&& ((this.getStlastUpdatedDate() == castOther.getStlastUpdatedDate())
						|| (this.getStlastUpdatedDate() != null && castOther.getStlastUpdatedDate() != null
								&& this.getStlastUpdatedDate().equals(castOther.getStlastUpdatedDate())))
				&& (this.getStcommissionRateFl() == castOther.getStcommissionRateFl())
				&& ((this.getStsaleDiscountBandIdN() == castOther.getStsaleDiscountBandIdN())
						|| (this.getStsaleDiscountBandIdN() != null && castOther.getStsaleDiscountBandIdN() != null
								&& this.getStsaleDiscountBandIdN().equals(castOther.getStsaleDiscountBandIdN())))
				&& (this.isStrequiredBl() == castOther.isStrequiredBl())
				&& ((this.getStinvoiceTextTxN() == castOther.getStinvoiceTextTxN())
						|| (this.getStinvoiceTextTxN() != null && castOther.getStinvoiceTextTxN() != null
								&& this.getStinvoiceTextTxN().equals(castOther.getStinvoiceTextTxN())))
				&& (this.getStservicePeriodIn() == castOther.getStservicePeriodIn())
				&& ((this.getStcreationDate() == castOther.getStcreationDate())
						|| (this.getStcreationDate() != null && castOther.getStcreationDate() != null
								&& this.getStcreationDate().equals(castOther.getStcreationDate())))
				&& (this.isStgiftCertPromptBl() == castOther.isStgiftCertPromptBl())
				&& (this.isStgiftCardPromptBl() == castOther.isStgiftCardPromptBl())
				&& (this.isStroomBookingPromptBl() == castOther.isStroomBookingPromptBl())
				&& ((this.getStrebiidN() == castOther.getStrebiidN()) || (this.getStrebiidN() != null
						&& castOther.getStrebiidN() != null && this.getStrebiidN().equals(castOther.getStrebiidN())))
				&& (this.isStwebAdminEntryBl() == castOther.isStwebAdminEntryBl())
				&& (this.isStwebAdminDeletedBl() == castOther.isStwebAdminDeletedBl())
				&& (this.isSttechnicianActivityBl() == castOther.isSttechnicianActivityBl())
				&& (this.getStdisplayOrderIn() == castOther.getStdisplayOrderIn())
				&& ((this.getSteventDataTypeIdN() == castOther.getSteventDataTypeIdN())
						|| (this.getSteventDataTypeIdN() != null && castOther.getSteventDataTypeIdN() != null
								&& this.getSteventDataTypeIdN().equals(castOther.getSteventDataTypeIdN())))
				&& ((this.getStseotagTxN() == castOther.getStseotagTxN())
						|| (this.getStseotagTxN() != null && castOther.getStseotagTxN() != null
								&& this.getStseotagTxN().equals(castOther.getStseotagTxN())))
				&& (this.isStshowCylinderInfoBl() == castOther.isStshowCylinderInfoBl())
				&& ((this.getStclassNameTxN() == castOther.getStclassNameTxN())
						|| (this.getStclassNameTxN() != null && castOther.getStclassNameTxN() != null
								&& this.getStclassNameTxN().equals(castOther.getStclassNameTxN())))
				&& ((this.getSteolstockTypeTxN() == castOther.getSteolstockTypeTxN())
						|| (this.getSteolstockTypeTxN() != null && castOther.getSteolstockTypeTxN() != null
								&& this.getSteolstockTypeTxN().equals(castOther.getSteolstockTypeTxN())))
				&& (this.getSteolheaderId() == castOther.getSteolheaderId())
				&& (this.isStallowPriceUpdatesBl() == castOther.isStallowPriceUpdatesBl())
				&& ((this.getStqtyBasedDiscountsTxN() == castOther.getStqtyBasedDiscountsTxN())
						|| (this.getStqtyBasedDiscountsTxN() != null && castOther.getStqtyBasedDiscountsTxN() != null
								&& this.getStqtyBasedDiscountsTxN().equals(castOther.getStqtyBasedDiscountsTxN())))
				&& (this.isStallowPaymentSurchargeBl() == castOther.isStallowPaymentSurchargeBl());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getStstockTypeId();
		result = 37 * result + (getStstockTypeTx() == null ? 0 : this.getStstockTypeTx().hashCode());
		result = 37 * result + this.getStprofitCenterId();
		result = 37 * result + (this.isStprofileBl() ? 1 : 0);
		result = 37 * result + (this.isStforRentBl() ? 1 : 0);
		result = 37 * result + (this.isStforServiceBl() ? 1 : 0);
		result = 37 * result + (this.isStforServicePartsBl() ? 1 : 0);
		result = 37 * result + (this.isStforSaleBl() ? 1 : 0);
		result = 37 * result + (this.isSttrackOwnershipBl() ? 1 : 0);
		result = 37 * result + (this.isStforChecklistBl() ? 1 : 0);
		result = 37 * result + (this.isStcustomerRequiredBl() ? 1 : 0);
		result = 37 * result + (this.isStunavailableBl() ? 1 : 0);
		result = 37 * result + (getStlastUpdatedDate() == null ? 0 : this.getStlastUpdatedDate().hashCode());
		result = 37 * result + (int) this.getStcommissionRateFl();
		result = 37 * result + (getStsaleDiscountBandIdN() == null ? 0 : this.getStsaleDiscountBandIdN().hashCode());
		result = 37 * result + (this.isStrequiredBl() ? 1 : 0);
		result = 37 * result + (getStinvoiceTextTxN() == null ? 0 : this.getStinvoiceTextTxN().hashCode());
		result = 37 * result + this.getStservicePeriodIn();
		result = 37 * result + (getStcreationDate() == null ? 0 : this.getStcreationDate().hashCode());
		result = 37 * result + (this.isStgiftCertPromptBl() ? 1 : 0);
		result = 37 * result + (this.isStgiftCardPromptBl() ? 1 : 0);
		result = 37 * result + (this.isStroomBookingPromptBl() ? 1 : 0);
		result = 37 * result + (getStrebiidN() == null ? 0 : this.getStrebiidN().hashCode());
		result = 37 * result + (this.isStwebAdminEntryBl() ? 1 : 0);
		result = 37 * result + (this.isStwebAdminDeletedBl() ? 1 : 0);
		result = 37 * result + (this.isSttechnicianActivityBl() ? 1 : 0);
		result = 37 * result + this.getStdisplayOrderIn();
		result = 37 * result + (getSteventDataTypeIdN() == null ? 0 : this.getSteventDataTypeIdN().hashCode());
		result = 37 * result + (getStseotagTxN() == null ? 0 : this.getStseotagTxN().hashCode());
		result = 37 * result + (this.isStshowCylinderInfoBl() ? 1 : 0);
		result = 37 * result + (getStclassNameTxN() == null ? 0 : this.getStclassNameTxN().hashCode());
		result = 37 * result + (getSteolstockTypeTxN() == null ? 0 : this.getSteolstockTypeTxN().hashCode());
		result = 37 * result + this.getSteolheaderId();
		result = 37 * result + (this.isStallowPriceUpdatesBl() ? 1 : 0);
		result = 37 * result + (getStqtyBasedDiscountsTxN() == null ? 0 : this.getStqtyBasedDiscountsTxN().hashCode());
		result = 37 * result + (this.isStallowPaymentSurchargeBl() ? 1 : 0);
		return result;
	}

}
