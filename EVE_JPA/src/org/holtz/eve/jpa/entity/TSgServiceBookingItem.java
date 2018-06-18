package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TSgServiceBookingItem generated by hbm2java
 */
@Entity
@Table(name = "T_SgServiceBookingItem")
public class TSgServiceBookingItem implements java.io.Serializable {

	private int sgServiceBookingItemId;
	private TEmEmp TEmEmp;
	private TEqEquipment TEqEquipment;
	private TSbserviceBooking TSbserviceBooking;
	private TTbtaxBand TTbtaxBand;
	private Float xxsgTaxRateFlXx;
	private short sgCurrencyId;
	private float sgExchangeRateFl;
	private Date sgLastUpdatedDate;
	private Date sgActualStartDateN;
	private Date sgActualEndDateN;
	private Date sgPickedUpDateN;
	private String sgFaultTxN;
	private String sgActionTakenTxN;
	private String sgPressureBeforeTxN;
	private String sgPressureAfterTxN;
	private double sgEstimateMn;
	private double sgPartsMn;
	private double sgPartsTaxMn;
	private double sgLaborChargeMn;
	private double sgLaborTaxMn;
	private double sgHandlingChargeMn;
	private double sgHandlingTaxMn;
	private String sgSentToTxN;
	private Date sgSentDateN;
	private Date sgDueBackDateN;
	private Date sgActuallyBackDateN;
	private double sgRushChargeMn;
	private String sgRmanoTxN;
	private String sgCylPaintConditionTxN;
	private String sgCylExteriorDescTxN;
	private String sgCylToneTestTxN;
	private String sgCylGougeLocationTxN;
	private String sgCylOtherServiceTxN;
	private Integer sgCylAlConditionIdN;
	private Integer sgCylStConditionIdN;
	private String sgCylContentsCompoTxN;
	private String sgCylInternalDescTxN;
	private String sgCylPittingLocationTxN;
	private String sgCylRoccolorTxN;
	private String sgCylRoccolor2txN;
	private String sgCylThreadConditionTxN;
	private String sgCylThreadNoDamagedTxN;
	private String sgCylCrackAccessTxN;
	private String sgCylOringSurfaceTxN;
	private String sgCylMpetxN;
	private String sgCylBuretReadingTxN;
	private String sgCylActionTakenTxN;
	private String sgCylRecommendationTxN;
	private String sgCylPeriodCertNoTxN;
	private boolean sgCylFireDamageBl;
	private boolean sgCylOdorBl;
	private boolean sgCylLineCorrosionBl;
	private boolean sgCylBulgesBl;
	private boolean sgCylRocfittedBl;
	private boolean sgCylAccuracyVerifiedBl;
	private boolean sgCylRocfitted2bl;
	private boolean sgCylStickerAttachedBl;
	private boolean sgCylBurstDiscBl;
	private boolean sgCylTumbleBl;
	private boolean sgCylHydroBl;
	private boolean sgCylDiscardBl;
	private Integer sgCylAbrasionsInN;
	private Integer sgCylConditionInN;
	private Date sgCylStickerDateN;
	private int sgCylExtExamIn;
	private int sgCylIntExamIn;
	private boolean sgCylHydroPassBl;
	private boolean sgCylRepeatVisualPassBl;
	private int sgCylThreadExamIn;
	private boolean sgCylValveOringBl;
	private int sgCylHydroPassIn;
	private int sgCylRepeatVisualPassIn;
	private Date sgCreationDate;
	private String sgCylLastHydroTxN;
	private Set<TSpservicePart> TSpserviceParts = new HashSet<TSpservicePart>(0);

	public TSgServiceBookingItem() {
	}

	public TSgServiceBookingItem(int sgServiceBookingItemId, TEqEquipment TEqEquipment,
			TSbserviceBooking TSbserviceBooking, short sgCurrencyId, float sgExchangeRateFl, Date sgLastUpdatedDate,
			double sgEstimateMn, double sgPartsMn, double sgPartsTaxMn, double sgLaborChargeMn, double sgLaborTaxMn,
			double sgHandlingChargeMn, double sgHandlingTaxMn, double sgRushChargeMn, boolean sgCylFireDamageBl,
			boolean sgCylOdorBl, boolean sgCylLineCorrosionBl, boolean sgCylBulgesBl, boolean sgCylRocfittedBl,
			boolean sgCylAccuracyVerifiedBl, boolean sgCylRocfitted2bl, boolean sgCylStickerAttachedBl,
			boolean sgCylBurstDiscBl, boolean sgCylTumbleBl, boolean sgCylHydroBl, boolean sgCylDiscardBl,
			int sgCylExtExamIn, int sgCylIntExamIn, boolean sgCylHydroPassBl, boolean sgCylRepeatVisualPassBl,
			int sgCylThreadExamIn, boolean sgCylValveOringBl, int sgCylHydroPassIn, int sgCylRepeatVisualPassIn,
			Date sgCreationDate) {
		this.sgServiceBookingItemId = sgServiceBookingItemId;
		this.TEqEquipment = TEqEquipment;
		this.TSbserviceBooking = TSbserviceBooking;
		this.sgCurrencyId = sgCurrencyId;
		this.sgExchangeRateFl = sgExchangeRateFl;
		this.sgLastUpdatedDate = sgLastUpdatedDate;
		this.sgEstimateMn = sgEstimateMn;
		this.sgPartsMn = sgPartsMn;
		this.sgPartsTaxMn = sgPartsTaxMn;
		this.sgLaborChargeMn = sgLaborChargeMn;
		this.sgLaborTaxMn = sgLaborTaxMn;
		this.sgHandlingChargeMn = sgHandlingChargeMn;
		this.sgHandlingTaxMn = sgHandlingTaxMn;
		this.sgRushChargeMn = sgRushChargeMn;
		this.sgCylFireDamageBl = sgCylFireDamageBl;
		this.sgCylOdorBl = sgCylOdorBl;
		this.sgCylLineCorrosionBl = sgCylLineCorrosionBl;
		this.sgCylBulgesBl = sgCylBulgesBl;
		this.sgCylRocfittedBl = sgCylRocfittedBl;
		this.sgCylAccuracyVerifiedBl = sgCylAccuracyVerifiedBl;
		this.sgCylRocfitted2bl = sgCylRocfitted2bl;
		this.sgCylStickerAttachedBl = sgCylStickerAttachedBl;
		this.sgCylBurstDiscBl = sgCylBurstDiscBl;
		this.sgCylTumbleBl = sgCylTumbleBl;
		this.sgCylHydroBl = sgCylHydroBl;
		this.sgCylDiscardBl = sgCylDiscardBl;
		this.sgCylExtExamIn = sgCylExtExamIn;
		this.sgCylIntExamIn = sgCylIntExamIn;
		this.sgCylHydroPassBl = sgCylHydroPassBl;
		this.sgCylRepeatVisualPassBl = sgCylRepeatVisualPassBl;
		this.sgCylThreadExamIn = sgCylThreadExamIn;
		this.sgCylValveOringBl = sgCylValveOringBl;
		this.sgCylHydroPassIn = sgCylHydroPassIn;
		this.sgCylRepeatVisualPassIn = sgCylRepeatVisualPassIn;
		this.sgCreationDate = sgCreationDate;
	}

	public TSgServiceBookingItem(int sgServiceBookingItemId, TEmEmp TEmEmp, TEqEquipment TEqEquipment,
			TSbserviceBooking TSbserviceBooking, TTbtaxBand TTbtaxBand, Float xxsgTaxRateFlXx, short sgCurrencyId,
			float sgExchangeRateFl, Date sgLastUpdatedDate, Date sgActualStartDateN, Date sgActualEndDateN,
			Date sgPickedUpDateN, String sgFaultTxN, String sgActionTakenTxN,
			String sgPressureBeforeTxN, String sgPressureAfterTxN, double sgEstimateMn, double sgPartsMn,
			double sgPartsTaxMn, double sgLaborChargeMn, double sgLaborTaxMn, double sgHandlingChargeMn,
			double sgHandlingTaxMn, String sgSentToTxN, Date sgSentDateN, Date sgDueBackDateN,
			Date sgActuallyBackDateN, double sgRushChargeMn, String sgRmanoTxN,
			String sgCylPaintConditionTxN, String sgCylExteriorDescTxN, String sgCylToneTestTxN,
			String sgCylGougeLocationTxN, String sgCylOtherServiceTxN, Integer sgCylAlConditionIdN,
			Integer sgCylStConditionIdN, String sgCylContentsCompoTxN, String sgCylInternalDescTxN,
			String sgCylPittingLocationTxN, String sgCylRoccolorTxN, String sgCylRoccolor2txN,
			String sgCylThreadConditionTxN, String sgCylThreadNoDamagedTxN,
			String sgCylCrackAccessTxN, String sgCylOringSurfaceTxN, String sgCylMpetxN,
			String sgCylBuretReadingTxN, String sgCylActionTakenTxN, String sgCylRecommendationTxN,
			String sgCylPeriodCertNoTxN, boolean sgCylFireDamageBl, boolean sgCylOdorBl,
			boolean sgCylLineCorrosionBl, boolean sgCylBulgesBl, boolean sgCylRocfittedBl,
			boolean sgCylAccuracyVerifiedBl, boolean sgCylRocfitted2bl, boolean sgCylStickerAttachedBl,
			boolean sgCylBurstDiscBl, boolean sgCylTumbleBl, boolean sgCylHydroBl, boolean sgCylDiscardBl,
			Integer sgCylAbrasionsInN, Integer sgCylConditionInN, Date sgCylStickerDateN, int sgCylExtExamIn,
			int sgCylIntExamIn, boolean sgCylHydroPassBl, boolean sgCylRepeatVisualPassBl, int sgCylThreadExamIn,
			boolean sgCylValveOringBl, int sgCylHydroPassIn, int sgCylRepeatVisualPassIn, Date sgCreationDate,
			String sgCylLastHydroTxN, Set<TSpservicePart> TSpserviceParts) {
		this.sgServiceBookingItemId = sgServiceBookingItemId;
		this.TEmEmp = TEmEmp;
		this.TEqEquipment = TEqEquipment;
		this.TSbserviceBooking = TSbserviceBooking;
		this.TTbtaxBand = TTbtaxBand;
		this.xxsgTaxRateFlXx = xxsgTaxRateFlXx;
		this.sgCurrencyId = sgCurrencyId;
		this.sgExchangeRateFl = sgExchangeRateFl;
		this.sgLastUpdatedDate = sgLastUpdatedDate;
		this.sgActualStartDateN = sgActualStartDateN;
		this.sgActualEndDateN = sgActualEndDateN;
		this.sgPickedUpDateN = sgPickedUpDateN;
		this.sgFaultTxN = sgFaultTxN;
		this.sgActionTakenTxN = sgActionTakenTxN;
		this.sgPressureBeforeTxN = sgPressureBeforeTxN;
		this.sgPressureAfterTxN = sgPressureAfterTxN;
		this.sgEstimateMn = sgEstimateMn;
		this.sgPartsMn = sgPartsMn;
		this.sgPartsTaxMn = sgPartsTaxMn;
		this.sgLaborChargeMn = sgLaborChargeMn;
		this.sgLaborTaxMn = sgLaborTaxMn;
		this.sgHandlingChargeMn = sgHandlingChargeMn;
		this.sgHandlingTaxMn = sgHandlingTaxMn;
		this.sgSentToTxN = sgSentToTxN;
		this.sgSentDateN = sgSentDateN;
		this.sgDueBackDateN = sgDueBackDateN;
		this.sgActuallyBackDateN = sgActuallyBackDateN;
		this.sgRushChargeMn = sgRushChargeMn;
		this.sgRmanoTxN = sgRmanoTxN;
		this.sgCylPaintConditionTxN = sgCylPaintConditionTxN;
		this.sgCylExteriorDescTxN = sgCylExteriorDescTxN;
		this.sgCylToneTestTxN = sgCylToneTestTxN;
		this.sgCylGougeLocationTxN = sgCylGougeLocationTxN;
		this.sgCylOtherServiceTxN = sgCylOtherServiceTxN;
		this.sgCylAlConditionIdN = sgCylAlConditionIdN;
		this.sgCylStConditionIdN = sgCylStConditionIdN;
		this.sgCylContentsCompoTxN = sgCylContentsCompoTxN;
		this.sgCylInternalDescTxN = sgCylInternalDescTxN;
		this.sgCylPittingLocationTxN = sgCylPittingLocationTxN;
		this.sgCylRoccolorTxN = sgCylRoccolorTxN;
		this.sgCylRoccolor2txN = sgCylRoccolor2txN;
		this.sgCylThreadConditionTxN = sgCylThreadConditionTxN;
		this.sgCylThreadNoDamagedTxN = sgCylThreadNoDamagedTxN;
		this.sgCylCrackAccessTxN = sgCylCrackAccessTxN;
		this.sgCylOringSurfaceTxN = sgCylOringSurfaceTxN;
		this.sgCylMpetxN = sgCylMpetxN;
		this.sgCylBuretReadingTxN = sgCylBuretReadingTxN;
		this.sgCylActionTakenTxN = sgCylActionTakenTxN;
		this.sgCylRecommendationTxN = sgCylRecommendationTxN;
		this.sgCylPeriodCertNoTxN = sgCylPeriodCertNoTxN;
		this.sgCylFireDamageBl = sgCylFireDamageBl;
		this.sgCylOdorBl = sgCylOdorBl;
		this.sgCylLineCorrosionBl = sgCylLineCorrosionBl;
		this.sgCylBulgesBl = sgCylBulgesBl;
		this.sgCylRocfittedBl = sgCylRocfittedBl;
		this.sgCylAccuracyVerifiedBl = sgCylAccuracyVerifiedBl;
		this.sgCylRocfitted2bl = sgCylRocfitted2bl;
		this.sgCylStickerAttachedBl = sgCylStickerAttachedBl;
		this.sgCylBurstDiscBl = sgCylBurstDiscBl;
		this.sgCylTumbleBl = sgCylTumbleBl;
		this.sgCylHydroBl = sgCylHydroBl;
		this.sgCylDiscardBl = sgCylDiscardBl;
		this.sgCylAbrasionsInN = sgCylAbrasionsInN;
		this.sgCylConditionInN = sgCylConditionInN;
		this.sgCylStickerDateN = sgCylStickerDateN;
		this.sgCylExtExamIn = sgCylExtExamIn;
		this.sgCylIntExamIn = sgCylIntExamIn;
		this.sgCylHydroPassBl = sgCylHydroPassBl;
		this.sgCylRepeatVisualPassBl = sgCylRepeatVisualPassBl;
		this.sgCylThreadExamIn = sgCylThreadExamIn;
		this.sgCylValveOringBl = sgCylValveOringBl;
		this.sgCylHydroPassIn = sgCylHydroPassIn;
		this.sgCylRepeatVisualPassIn = sgCylRepeatVisualPassIn;
		this.sgCreationDate = sgCreationDate;
		this.sgCylLastHydroTxN = sgCylLastHydroTxN;
		this.TSpserviceParts = TSpserviceParts;
	}

	@Id

	@Column(name = "SgServiceBookingItemID", unique = true, nullable = false)
	public int getSgServiceBookingItemId() {
		return this.sgServiceBookingItemId;
	}

	public void setSgServiceBookingItemId(int sgServiceBookingItemId) {
		this.sgServiceBookingItemId = sgServiceBookingItemId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SgTechnicianID_N")
	public TEmEmp getTEmEmp() {
		return this.TEmEmp;
	}

	public void setTEmEmp(TEmEmp TEmEmp) {
		this.TEmEmp = TEmEmp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SgEquipmentID", nullable = false)
	public TEqEquipment getTEqEquipment() {
		return this.TEqEquipment;
	}

	public void setTEqEquipment(TEqEquipment TEqEquipment) {
		this.TEqEquipment = TEqEquipment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SgServiceBookingID", nullable = false)
	public TSbserviceBooking getTSbserviceBooking() {
		return this.TSbserviceBooking;
	}

	public void setTSbserviceBooking(TSbserviceBooking TSbserviceBooking) {
		this.TSbserviceBooking = TSbserviceBooking;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "XXSgTaxBandIDXX")
	public TTbtaxBand getTTbtaxBand() {
		return this.TTbtaxBand;
	}

	public void setTTbtaxBand(TTbtaxBand TTbtaxBand) {
		this.TTbtaxBand = TTbtaxBand;
	}

	@Column(name = "XXSgTaxRateFlXX", precision = 24, scale = 0)
	public Float getXxsgTaxRateFlXx() {
		return this.xxsgTaxRateFlXx;
	}

	public void setXxsgTaxRateFlXx(Float xxsgTaxRateFlXx) {
		this.xxsgTaxRateFlXx = xxsgTaxRateFlXx;
	}

	@Column(name = "SgCurrencyID", nullable = false)
	public short getSgCurrencyId() {
		return this.sgCurrencyId;
	}

	public void setSgCurrencyId(short sgCurrencyId) {
		this.sgCurrencyId = sgCurrencyId;
	}

	@Column(name = "SgExchangeRateFl", nullable = false, precision = 24, scale = 0)
	public float getSgExchangeRateFl() {
		return this.sgExchangeRateFl;
	}

	public void setSgExchangeRateFl(float sgExchangeRateFl) {
		this.sgExchangeRateFl = sgExchangeRateFl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SgLastUpdatedDate", nullable = false, length = 23)
	public Date getSgLastUpdatedDate() {
		return this.sgLastUpdatedDate;
	}

	public void setSgLastUpdatedDate(Date sgLastUpdatedDate) {
		this.sgLastUpdatedDate = sgLastUpdatedDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SgActualStartDate_N", length = 23)
	public Date getSgActualStartDateN() {
		return this.sgActualStartDateN;
	}

	public void setSgActualStartDateN(Date sgActualStartDateN) {
		this.sgActualStartDateN = sgActualStartDateN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SgActualEndDate_N", length = 23)
	public Date getSgActualEndDateN() {
		return this.sgActualEndDateN;
	}

	public void setSgActualEndDateN(Date sgActualEndDateN) {
		this.sgActualEndDateN = sgActualEndDateN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SgPickedUpDate_N", length = 23)
	public Date getSgPickedUpDateN() {
		return this.sgPickedUpDateN;
	}

	public void setSgPickedUpDateN(Date sgPickedUpDateN) {
		this.sgPickedUpDateN = sgPickedUpDateN;
	}

	@Column(name = "SgFaultTx_N")
	public String getSgFaultTxN() {
		return this.sgFaultTxN;
	}

	public void setSgFaultTxN(String sgFaultTxN) {
		this.sgFaultTxN = sgFaultTxN;
	}

	@Column(name = "SgActionTakenTx_N")
	public String getSgActionTakenTxN() {
		return this.sgActionTakenTxN;
	}

	public void setSgActionTakenTxN(String sgActionTakenTxN) {
		this.sgActionTakenTxN = sgActionTakenTxN;
	}

	@Column(name = "SgPressureBeforeTx_N")
	public String getSgPressureBeforeTxN() {
		return this.sgPressureBeforeTxN;
	}

	public void setSgPressureBeforeTxN(String sgPressureBeforeTxN) {
		this.sgPressureBeforeTxN = sgPressureBeforeTxN;
	}

	@Column(name = "SgPressureAfterTx_N")
	public String getSgPressureAfterTxN() {
		return this.sgPressureAfterTxN;
	}

	public void setSgPressureAfterTxN(String sgPressureAfterTxN) {
		this.sgPressureAfterTxN = sgPressureAfterTxN;
	}

	@Column(name = "SgEstimateMn", nullable = false, precision = 53, scale = 0)
	public double getSgEstimateMn() {
		return this.sgEstimateMn;
	}

	public void setSgEstimateMn(double sgEstimateMn) {
		this.sgEstimateMn = sgEstimateMn;
	}

	@Column(name = "SgPartsMn", nullable = false, precision = 53, scale = 0)
	public double getSgPartsMn() {
		return this.sgPartsMn;
	}

	public void setSgPartsMn(double sgPartsMn) {
		this.sgPartsMn = sgPartsMn;
	}

	@Column(name = "SgPartsTaxMn", nullable = false, precision = 53, scale = 0)
	public double getSgPartsTaxMn() {
		return this.sgPartsTaxMn;
	}

	public void setSgPartsTaxMn(double sgPartsTaxMn) {
		this.sgPartsTaxMn = sgPartsTaxMn;
	}

	@Column(name = "SgLaborChargeMn", nullable = false, precision = 53, scale = 0)
	public double getSgLaborChargeMn() {
		return this.sgLaborChargeMn;
	}

	public void setSgLaborChargeMn(double sgLaborChargeMn) {
		this.sgLaborChargeMn = sgLaborChargeMn;
	}

	@Column(name = "SgLaborTaxMn", nullable = false, precision = 53, scale = 0)
	public double getSgLaborTaxMn() {
		return this.sgLaborTaxMn;
	}

	public void setSgLaborTaxMn(double sgLaborTaxMn) {
		this.sgLaborTaxMn = sgLaborTaxMn;
	}

	@Column(name = "SgHandlingChargeMn", nullable = false, precision = 53, scale = 0)
	public double getSgHandlingChargeMn() {
		return this.sgHandlingChargeMn;
	}

	public void setSgHandlingChargeMn(double sgHandlingChargeMn) {
		this.sgHandlingChargeMn = sgHandlingChargeMn;
	}

	@Column(name = "SgHandlingTaxMn", nullable = false, precision = 53, scale = 0)
	public double getSgHandlingTaxMn() {
		return this.sgHandlingTaxMn;
	}

	public void setSgHandlingTaxMn(double sgHandlingTaxMn) {
		this.sgHandlingTaxMn = sgHandlingTaxMn;
	}

	@Column(name = "SgSentToTx_N")
	public String getSgSentToTxN() {
		return this.sgSentToTxN;
	}

	public void setSgSentToTxN(String sgSentToTxN) {
		this.sgSentToTxN = sgSentToTxN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SgSentDate_N", length = 23)
	public Date getSgSentDateN() {
		return this.sgSentDateN;
	}

	public void setSgSentDateN(Date sgSentDateN) {
		this.sgSentDateN = sgSentDateN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SgDueBackDate_N", length = 23)
	public Date getSgDueBackDateN() {
		return this.sgDueBackDateN;
	}

	public void setSgDueBackDateN(Date sgDueBackDateN) {
		this.sgDueBackDateN = sgDueBackDateN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SgActuallyBackDate_N", length = 23)
	public Date getSgActuallyBackDateN() {
		return this.sgActuallyBackDateN;
	}

	public void setSgActuallyBackDateN(Date sgActuallyBackDateN) {
		this.sgActuallyBackDateN = sgActuallyBackDateN;
	}

	@Column(name = "SgRushChargeMn", nullable = false, precision = 53, scale = 0)
	public double getSgRushChargeMn() {
		return this.sgRushChargeMn;
	}

	public void setSgRushChargeMn(double sgRushChargeMn) {
		this.sgRushChargeMn = sgRushChargeMn;
	}

	@Column(name = "SgRMANoTx_N")
	public String getSgRmanoTxN() {
		return this.sgRmanoTxN;
	}

	public void setSgRmanoTxN(String sgRmanoTxN) {
		this.sgRmanoTxN = sgRmanoTxN;
	}

	@Column(name = "SgCylPaintConditionTx_N")
	public String getSgCylPaintConditionTxN() {
		return this.sgCylPaintConditionTxN;
	}

	public void setSgCylPaintConditionTxN(String sgCylPaintConditionTxN) {
		this.sgCylPaintConditionTxN = sgCylPaintConditionTxN;
	}

	@Column(name = "SgCylExteriorDescTx_N")
	public String getSgCylExteriorDescTxN() {
		return this.sgCylExteriorDescTxN;
	}

	public void setSgCylExteriorDescTxN(String sgCylExteriorDescTxN) {
		this.sgCylExteriorDescTxN = sgCylExteriorDescTxN;
	}

	@Column(name = "SgCylToneTestTx_N")
	public String getSgCylToneTestTxN() {
		return this.sgCylToneTestTxN;
	}

	public void setSgCylToneTestTxN(String sgCylToneTestTxN) {
		this.sgCylToneTestTxN = sgCylToneTestTxN;
	}

	@Column(name = "SgCylGougeLocationTx_N")
	public String getSgCylGougeLocationTxN() {
		return this.sgCylGougeLocationTxN;
	}

	public void setSgCylGougeLocationTxN(String sgCylGougeLocationTxN) {
		this.sgCylGougeLocationTxN = sgCylGougeLocationTxN;
	}

	@Column(name = "SgCylOtherServiceTx_N")
	public String getSgCylOtherServiceTxN() {
		return this.sgCylOtherServiceTxN;
	}

	public void setSgCylOtherServiceTxN(String sgCylOtherServiceTxN) {
		this.sgCylOtherServiceTxN = sgCylOtherServiceTxN;
	}

	@Column(name = "SgCylAlConditionID_N")
	public Integer getSgCylAlConditionIdN() {
		return this.sgCylAlConditionIdN;
	}

	public void setSgCylAlConditionIdN(Integer sgCylAlConditionIdN) {
		this.sgCylAlConditionIdN = sgCylAlConditionIdN;
	}

	@Column(name = "SgCylStConditionID_N")
	public Integer getSgCylStConditionIdN() {
		return this.sgCylStConditionIdN;
	}

	public void setSgCylStConditionIdN(Integer sgCylStConditionIdN) {
		this.sgCylStConditionIdN = sgCylStConditionIdN;
	}

	@Column(name = "SgCylContentsCompoTx_N")
	public String getSgCylContentsCompoTxN() {
		return this.sgCylContentsCompoTxN;
	}

	public void setSgCylContentsCompoTxN(String sgCylContentsCompoTxN) {
		this.sgCylContentsCompoTxN = sgCylContentsCompoTxN;
	}

	@Column(name = "SgCylInternalDescTx_N")
	public String getSgCylInternalDescTxN() {
		return this.sgCylInternalDescTxN;
	}

	public void setSgCylInternalDescTxN(String sgCylInternalDescTxN) {
		this.sgCylInternalDescTxN = sgCylInternalDescTxN;
	}

	@Column(name = "SgCylPittingLocationTx_N")
	public String getSgCylPittingLocationTxN() {
		return this.sgCylPittingLocationTxN;
	}

	public void setSgCylPittingLocationTxN(String sgCylPittingLocationTxN) {
		this.sgCylPittingLocationTxN = sgCylPittingLocationTxN;
	}

	@Column(name = "SgCylROCColorTx_N")
	public String getSgCylRoccolorTxN() {
		return this.sgCylRoccolorTxN;
	}

	public void setSgCylRoccolorTxN(String sgCylRoccolorTxN) {
		this.sgCylRoccolorTxN = sgCylRoccolorTxN;
	}

	@Column(name = "SgCylROCColor2Tx_N")
	public String getSgCylRoccolor2txN() {
		return this.sgCylRoccolor2txN;
	}

	public void setSgCylRoccolor2txN(String sgCylRoccolor2txN) {
		this.sgCylRoccolor2txN = sgCylRoccolor2txN;
	}

	@Column(name = "SgCylThreadConditionTx_N")
	public String getSgCylThreadConditionTxN() {
		return this.sgCylThreadConditionTxN;
	}

	public void setSgCylThreadConditionTxN(String sgCylThreadConditionTxN) {
		this.sgCylThreadConditionTxN = sgCylThreadConditionTxN;
	}

	@Column(name = "SgCylThreadNoDamagedTx_N")
	public String getSgCylThreadNoDamagedTxN() {
		return this.sgCylThreadNoDamagedTxN;
	}

	public void setSgCylThreadNoDamagedTxN(String sgCylThreadNoDamagedTxN) {
		this.sgCylThreadNoDamagedTxN = sgCylThreadNoDamagedTxN;
	}

	@Column(name = "SgCylCrackAccessTx_N")
	public String getSgCylCrackAccessTxN() {
		return this.sgCylCrackAccessTxN;
	}

	public void setSgCylCrackAccessTxN(String sgCylCrackAccessTxN) {
		this.sgCylCrackAccessTxN = sgCylCrackAccessTxN;
	}

	@Column(name = "SgCylORingSurfaceTx_N")
	public String getSgCylOringSurfaceTxN() {
		return this.sgCylOringSurfaceTxN;
	}

	public void setSgCylOringSurfaceTxN(String sgCylOringSurfaceTxN) {
		this.sgCylOringSurfaceTxN = sgCylOringSurfaceTxN;
	}

	@Column(name = "SgCylMPETx_N")
	public String getSgCylMpetxN() {
		return this.sgCylMpetxN;
	}

	public void setSgCylMpetxN(String sgCylMpetxN) {
		this.sgCylMpetxN = sgCylMpetxN;
	}

	@Column(name = "SgCylBuretReadingTx_N")
	public String getSgCylBuretReadingTxN() {
		return this.sgCylBuretReadingTxN;
	}

	public void setSgCylBuretReadingTxN(String sgCylBuretReadingTxN) {
		this.sgCylBuretReadingTxN = sgCylBuretReadingTxN;
	}

	@Column(name = "SgCylActionTakenTx_N")
	public String getSgCylActionTakenTxN() {
		return this.sgCylActionTakenTxN;
	}

	public void setSgCylActionTakenTxN(String sgCylActionTakenTxN) {
		this.sgCylActionTakenTxN = sgCylActionTakenTxN;
	}

	@Column(name = "SgCylRecommendationTx_N")
	public String getSgCylRecommendationTxN() {
		return this.sgCylRecommendationTxN;
	}

	public void setSgCylRecommendationTxN(String sgCylRecommendationTxN) {
		this.sgCylRecommendationTxN = sgCylRecommendationTxN;
	}

	@Column(name = "SgCylPeriodCertNoTx_N")
	public String getSgCylPeriodCertNoTxN() {
		return this.sgCylPeriodCertNoTxN;
	}

	public void setSgCylPeriodCertNoTxN(String sgCylPeriodCertNoTxN) {
		this.sgCylPeriodCertNoTxN = sgCylPeriodCertNoTxN;
	}

	@Column(name = "SgCylFireDamageBl", nullable = false)
	public boolean isSgCylFireDamageBl() {
		return this.sgCylFireDamageBl;
	}

	public void setSgCylFireDamageBl(boolean sgCylFireDamageBl) {
		this.sgCylFireDamageBl = sgCylFireDamageBl;
	}

	@Column(name = "SgCylOdorBl", nullable = false)
	public boolean isSgCylOdorBl() {
		return this.sgCylOdorBl;
	}

	public void setSgCylOdorBl(boolean sgCylOdorBl) {
		this.sgCylOdorBl = sgCylOdorBl;
	}

	@Column(name = "SgCylLineCorrosionBl", nullable = false)
	public boolean isSgCylLineCorrosionBl() {
		return this.sgCylLineCorrosionBl;
	}

	public void setSgCylLineCorrosionBl(boolean sgCylLineCorrosionBl) {
		this.sgCylLineCorrosionBl = sgCylLineCorrosionBl;
	}

	@Column(name = "SgCylBulgesBl", nullable = false)
	public boolean isSgCylBulgesBl() {
		return this.sgCylBulgesBl;
	}

	public void setSgCylBulgesBl(boolean sgCylBulgesBl) {
		this.sgCylBulgesBl = sgCylBulgesBl;
	}

	@Column(name = "SgCylROCFittedBl", nullable = false)
	public boolean isSgCylRocfittedBl() {
		return this.sgCylRocfittedBl;
	}

	public void setSgCylRocfittedBl(boolean sgCylRocfittedBl) {
		this.sgCylRocfittedBl = sgCylRocfittedBl;
	}

	@Column(name = "SgCylAccuracyVerifiedBl", nullable = false)
	public boolean isSgCylAccuracyVerifiedBl() {
		return this.sgCylAccuracyVerifiedBl;
	}

	public void setSgCylAccuracyVerifiedBl(boolean sgCylAccuracyVerifiedBl) {
		this.sgCylAccuracyVerifiedBl = sgCylAccuracyVerifiedBl;
	}

	@Column(name = "SgCylROCFitted2Bl", nullable = false)
	public boolean isSgCylRocfitted2bl() {
		return this.sgCylRocfitted2bl;
	}

	public void setSgCylRocfitted2bl(boolean sgCylRocfitted2bl) {
		this.sgCylRocfitted2bl = sgCylRocfitted2bl;
	}

	@Column(name = "SgCylStickerAttachedBl", nullable = false)
	public boolean isSgCylStickerAttachedBl() {
		return this.sgCylStickerAttachedBl;
	}

	public void setSgCylStickerAttachedBl(boolean sgCylStickerAttachedBl) {
		this.sgCylStickerAttachedBl = sgCylStickerAttachedBl;
	}

	@Column(name = "SgCylBurstDiscBl", nullable = false)
	public boolean isSgCylBurstDiscBl() {
		return this.sgCylBurstDiscBl;
	}

	public void setSgCylBurstDiscBl(boolean sgCylBurstDiscBl) {
		this.sgCylBurstDiscBl = sgCylBurstDiscBl;
	}

	@Column(name = "SgCylTumbleBl", nullable = false)
	public boolean isSgCylTumbleBl() {
		return this.sgCylTumbleBl;
	}

	public void setSgCylTumbleBl(boolean sgCylTumbleBl) {
		this.sgCylTumbleBl = sgCylTumbleBl;
	}

	@Column(name = "SgCylHydroBl", nullable = false)
	public boolean isSgCylHydroBl() {
		return this.sgCylHydroBl;
	}

	public void setSgCylHydroBl(boolean sgCylHydroBl) {
		this.sgCylHydroBl = sgCylHydroBl;
	}

	@Column(name = "SgCylDiscardBl", nullable = false)
	public boolean isSgCylDiscardBl() {
		return this.sgCylDiscardBl;
	}

	public void setSgCylDiscardBl(boolean sgCylDiscardBl) {
		this.sgCylDiscardBl = sgCylDiscardBl;
	}

	@Column(name = "SgCylAbrasionsIn_N")
	public Integer getSgCylAbrasionsInN() {
		return this.sgCylAbrasionsInN;
	}

	public void setSgCylAbrasionsInN(Integer sgCylAbrasionsInN) {
		this.sgCylAbrasionsInN = sgCylAbrasionsInN;
	}

	@Column(name = "SgCylConditionIn_N")
	public Integer getSgCylConditionInN() {
		return this.sgCylConditionInN;
	}

	public void setSgCylConditionInN(Integer sgCylConditionInN) {
		this.sgCylConditionInN = sgCylConditionInN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SgCylStickerDate_N", length = 23)
	public Date getSgCylStickerDateN() {
		return this.sgCylStickerDateN;
	}

	public void setSgCylStickerDateN(Date sgCylStickerDateN) {
		this.sgCylStickerDateN = sgCylStickerDateN;
	}

	@Column(name = "SgCylExtExamIn", nullable = false)
	public int getSgCylExtExamIn() {
		return this.sgCylExtExamIn;
	}

	public void setSgCylExtExamIn(int sgCylExtExamIn) {
		this.sgCylExtExamIn = sgCylExtExamIn;
	}

	@Column(name = "SgCylIntExamIn", nullable = false)
	public int getSgCylIntExamIn() {
		return this.sgCylIntExamIn;
	}

	public void setSgCylIntExamIn(int sgCylIntExamIn) {
		this.sgCylIntExamIn = sgCylIntExamIn;
	}

	@Column(name = "SgCylHydroPassBl", nullable = false)
	public boolean isSgCylHydroPassBl() {
		return this.sgCylHydroPassBl;
	}

	public void setSgCylHydroPassBl(boolean sgCylHydroPassBl) {
		this.sgCylHydroPassBl = sgCylHydroPassBl;
	}

	@Column(name = "SgCylRepeatVisualPassBl", nullable = false)
	public boolean isSgCylRepeatVisualPassBl() {
		return this.sgCylRepeatVisualPassBl;
	}

	public void setSgCylRepeatVisualPassBl(boolean sgCylRepeatVisualPassBl) {
		this.sgCylRepeatVisualPassBl = sgCylRepeatVisualPassBl;
	}

	@Column(name = "SgCylThreadExamIn", nullable = false)
	public int getSgCylThreadExamIn() {
		return this.sgCylThreadExamIn;
	}

	public void setSgCylThreadExamIn(int sgCylThreadExamIn) {
		this.sgCylThreadExamIn = sgCylThreadExamIn;
	}

	@Column(name = "SgCylValveORingBl", nullable = false)
	public boolean isSgCylValveOringBl() {
		return this.sgCylValveOringBl;
	}

	public void setSgCylValveOringBl(boolean sgCylValveOringBl) {
		this.sgCylValveOringBl = sgCylValveOringBl;
	}

	@Column(name = "SgCylHydroPassIn", nullable = false)
	public int getSgCylHydroPassIn() {
		return this.sgCylHydroPassIn;
	}

	public void setSgCylHydroPassIn(int sgCylHydroPassIn) {
		this.sgCylHydroPassIn = sgCylHydroPassIn;
	}

	@Column(name = "SgCylRepeatVisualPassIn", nullable = false)
	public int getSgCylRepeatVisualPassIn() {
		return this.sgCylRepeatVisualPassIn;
	}

	public void setSgCylRepeatVisualPassIn(int sgCylRepeatVisualPassIn) {
		this.sgCylRepeatVisualPassIn = sgCylRepeatVisualPassIn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SgCreationDate", nullable = false, length = 23)
	public Date getSgCreationDate() {
		return this.sgCreationDate;
	}

	public void setSgCreationDate(Date sgCreationDate) {
		this.sgCreationDate = sgCreationDate;
	}

	@Column(name = "SgCylLastHydroTx_N")
	public String getSgCylLastHydroTxN() {
		return this.sgCylLastHydroTxN;
	}

	public void setSgCylLastHydroTxN(String sgCylLastHydroTxN) {
		this.sgCylLastHydroTxN = sgCylLastHydroTxN;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TSgServiceBookingItem")
	public Set<TSpservicePart> getTSpserviceParts() {
		return this.TSpserviceParts;
	}

	public void setTSpserviceParts(Set<TSpservicePart> TSpserviceParts) {
		this.TSpserviceParts = TSpserviceParts;
	}

}
