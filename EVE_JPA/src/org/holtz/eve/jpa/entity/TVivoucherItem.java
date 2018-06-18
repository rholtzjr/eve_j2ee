package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TVivoucherItem generated by hbm2java
 */
@Entity
@Table(name = "T_VIVoucherItem")
public class TVivoucherItem implements java.io.Serializable {

	private int vivoucherItemId;
	private TRkRoomBooking TRkRoomBooking;
	private TPfProfitCenter TPfProfitCenter;
	private TCpCustTrip TCpCustTrip;
	private TGcgiftCert TGcgiftCert;
	private TSistockItem TSistockItem;
	private TC1custCourse TC1custCourse;
	private TVoVoucher TVoVoucher;
	private TSuSupplier TSuSupplier;
	private TRbrentalBooking TRbrentalBooking;
	private TSbserviceBooking TSbserviceBooking;
	private TDbdiscountBand TDbdiscountBand;
	private TAnClosing TAnClosing;
	private TGdGiftCard TGdGiftCard;
	private TStstockType TStstockType;
	private TApaccountingPeriod TApaccountingPeriod;
	private TMeMultiSale TMeMultiSale;
	private String viserialNoTxN;
	private String virefTxN;
	private short viqtyIn;
	private double viunitPriceMn;
	private double vipriceMn;
	private double vitaxMn;
	private double vicostPriceMn;
	private String vicostPriceCompsTx;
	private String vitaxBandIdsTx;
	private String vitaxRatesTx;
	private short vicurrencyId;
	private float viexchangeRateFl;
	private Date vilastUpdatedDate;
	private String vistockNoTx;
	private String vistockItemTx;
	private String vistockTypeTx;
	private String vimanufacturerTx;
	private String viprimaryColorTxN;
	private String visecondaryColorTxN;
	private String visizeTxN;
	private float vicommissionRateFl;
	private boolean vicourseRelatedBl;
	private boolean vitripRelatedBl;
	private String vinotesTxN;
	private Date vicreationDate;
	private Integer viparentIdN;

	public TVivoucherItem() {
	}

	public TVivoucherItem(int vivoucherItemId, TPfProfitCenter TPfProfitCenter, TSistockItem TSistockItem,
			TVoVoucher TVoVoucher, TSuSupplier TSuSupplier, TStstockType TStstockType, short viqtyIn,
			double viunitPriceMn, double vipriceMn, double vitaxMn, double vicostPriceMn,
			String vicostPriceCompsTx, String vitaxBandIdsTx, String vitaxRatesTx, short vicurrencyId,
			float viexchangeRateFl, Date vilastUpdatedDate, String vistockNoTx, String vistockItemTx,
			String vistockTypeTx, String vimanufacturerTx, float vicommissionRateFl,
			boolean vicourseRelatedBl, boolean vitripRelatedBl, Date vicreationDate) {
		this.vivoucherItemId = vivoucherItemId;
		this.TPfProfitCenter = TPfProfitCenter;
		this.TSistockItem = TSistockItem;
		this.TVoVoucher = TVoVoucher;
		this.TSuSupplier = TSuSupplier;
		this.TStstockType = TStstockType;
		this.viqtyIn = viqtyIn;
		this.viunitPriceMn = viunitPriceMn;
		this.vipriceMn = vipriceMn;
		this.vitaxMn = vitaxMn;
		this.vicostPriceMn = vicostPriceMn;
		this.vicostPriceCompsTx = vicostPriceCompsTx;
		this.vitaxBandIdsTx = vitaxBandIdsTx;
		this.vitaxRatesTx = vitaxRatesTx;
		this.vicurrencyId = vicurrencyId;
		this.viexchangeRateFl = viexchangeRateFl;
		this.vilastUpdatedDate = vilastUpdatedDate;
		this.vistockNoTx = vistockNoTx;
		this.vistockItemTx = vistockItemTx;
		this.vistockTypeTx = vistockTypeTx;
		this.vimanufacturerTx = vimanufacturerTx;
		this.vicommissionRateFl = vicommissionRateFl;
		this.vicourseRelatedBl = vicourseRelatedBl;
		this.vitripRelatedBl = vitripRelatedBl;
		this.vicreationDate = vicreationDate;
	}

	public TVivoucherItem(int vivoucherItemId, TRkRoomBooking TRkRoomBooking, TPfProfitCenter TPfProfitCenter,
			TCpCustTrip TCpCustTrip, TGcgiftCert TGcgiftCert, TSistockItem TSistockItem, TC1custCourse TC1custCourse,
			TVoVoucher TVoVoucher, TSuSupplier TSuSupplier, TRbrentalBooking TRbrentalBooking,
			TSbserviceBooking TSbserviceBooking, TDbdiscountBand TDbdiscountBand, TAnClosing TAnClosing,
			TGdGiftCard TGdGiftCard, TStstockType TStstockType, TApaccountingPeriod TApaccountingPeriod,
			TMeMultiSale TMeMultiSale, String viserialNoTxN, String virefTxN, short viqtyIn,
			double viunitPriceMn, double vipriceMn, double vitaxMn, double vicostPriceMn,
			String vicostPriceCompsTx, String vitaxBandIdsTx, String vitaxRatesTx, short vicurrencyId,
			float viexchangeRateFl, Date vilastUpdatedDate, String vistockNoTx, String vistockItemTx,
			String vistockTypeTx, String vimanufacturerTx, String viprimaryColorTxN,
			String visecondaryColorTxN, String visizeTxN, float vicommissionRateFl,
			boolean vicourseRelatedBl, boolean vitripRelatedBl, String vinotesTxN, Date vicreationDate,
			Integer viparentIdN) {
		this.vivoucherItemId = vivoucherItemId;
		this.TRkRoomBooking = TRkRoomBooking;
		this.TPfProfitCenter = TPfProfitCenter;
		this.TCpCustTrip = TCpCustTrip;
		this.TGcgiftCert = TGcgiftCert;
		this.TSistockItem = TSistockItem;
		this.TC1custCourse = TC1custCourse;
		this.TVoVoucher = TVoVoucher;
		this.TSuSupplier = TSuSupplier;
		this.TRbrentalBooking = TRbrentalBooking;
		this.TSbserviceBooking = TSbserviceBooking;
		this.TDbdiscountBand = TDbdiscountBand;
		this.TAnClosing = TAnClosing;
		this.TGdGiftCard = TGdGiftCard;
		this.TStstockType = TStstockType;
		this.TApaccountingPeriod = TApaccountingPeriod;
		this.TMeMultiSale = TMeMultiSale;
		this.viserialNoTxN = viserialNoTxN;
		this.virefTxN = virefTxN;
		this.viqtyIn = viqtyIn;
		this.viunitPriceMn = viunitPriceMn;
		this.vipriceMn = vipriceMn;
		this.vitaxMn = vitaxMn;
		this.vicostPriceMn = vicostPriceMn;
		this.vicostPriceCompsTx = vicostPriceCompsTx;
		this.vitaxBandIdsTx = vitaxBandIdsTx;
		this.vitaxRatesTx = vitaxRatesTx;
		this.vicurrencyId = vicurrencyId;
		this.viexchangeRateFl = viexchangeRateFl;
		this.vilastUpdatedDate = vilastUpdatedDate;
		this.vistockNoTx = vistockNoTx;
		this.vistockItemTx = vistockItemTx;
		this.vistockTypeTx = vistockTypeTx;
		this.vimanufacturerTx = vimanufacturerTx;
		this.viprimaryColorTxN = viprimaryColorTxN;
		this.visecondaryColorTxN = visecondaryColorTxN;
		this.visizeTxN = visizeTxN;
		this.vicommissionRateFl = vicommissionRateFl;
		this.vicourseRelatedBl = vicourseRelatedBl;
		this.vitripRelatedBl = vitripRelatedBl;
		this.vinotesTxN = vinotesTxN;
		this.vicreationDate = vicreationDate;
		this.viparentIdN = viparentIdN;
	}

	@Id

	@Column(name = "VIVoucherItemID", unique = true, nullable = false)
	public int getVivoucherItemId() {
		return this.vivoucherItemId;
	}

	public void setVivoucherItemId(int vivoucherItemId) {
		this.vivoucherItemId = vivoucherItemId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIRoomBookingID_N")
	public TRkRoomBooking getTRkRoomBooking() {
		return this.TRkRoomBooking;
	}

	public void setTRkRoomBooking(TRkRoomBooking TRkRoomBooking) {
		this.TRkRoomBooking = TRkRoomBooking;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIProfitCenterID", nullable = false)
	public TPfProfitCenter getTPfProfitCenter() {
		return this.TPfProfitCenter;
	}

	public void setTPfProfitCenter(TPfProfitCenter TPfProfitCenter) {
		this.TPfProfitCenter = TPfProfitCenter;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VICustTripID_N")
	public TCpCustTrip getTCpCustTrip() {
		return this.TCpCustTrip;
	}

	public void setTCpCustTrip(TCpCustTrip TCpCustTrip) {
		this.TCpCustTrip = TCpCustTrip;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIGiftCertID_N")
	public TGcgiftCert getTGcgiftCert() {
		return this.TGcgiftCert;
	}

	public void setTGcgiftCert(TGcgiftCert TGcgiftCert) {
		this.TGcgiftCert = TGcgiftCert;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIStockItemID", nullable = false)
	public TSistockItem getTSistockItem() {
		return this.TSistockItem;
	}

	public void setTSistockItem(TSistockItem TSistockItem) {
		this.TSistockItem = TSistockItem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VICustCourseID_N")
	public TC1custCourse getTC1custCourse() {
		return this.TC1custCourse;
	}

	public void setTC1custCourse(TC1custCourse TC1custCourse) {
		this.TC1custCourse = TC1custCourse;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIVoucherID", nullable = false)
	public TVoVoucher getTVoVoucher() {
		return this.TVoVoucher;
	}

	public void setTVoVoucher(TVoVoucher TVoVoucher) {
		this.TVoVoucher = TVoVoucher;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIManufacturerID", nullable = false)
	public TSuSupplier getTSuSupplier() {
		return this.TSuSupplier;
	}

	public void setTSuSupplier(TSuSupplier TSuSupplier) {
		this.TSuSupplier = TSuSupplier;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIRentalBookingID_N")
	public TRbrentalBooking getTRbrentalBooking() {
		return this.TRbrentalBooking;
	}

	public void setTRbrentalBooking(TRbrentalBooking TRbrentalBooking) {
		this.TRbrentalBooking = TRbrentalBooking;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIServiceBookingID_N")
	public TSbserviceBooking getTSbserviceBooking() {
		return this.TSbserviceBooking;
	}

	public void setTSbserviceBooking(TSbserviceBooking TSbserviceBooking) {
		this.TSbserviceBooking = TSbserviceBooking;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIDiscountBandID_N")
	public TDbdiscountBand getTDbdiscountBand() {
		return this.TDbdiscountBand;
	}

	public void setTDbdiscountBand(TDbdiscountBand TDbdiscountBand) {
		this.TDbdiscountBand = TDbdiscountBand;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIClosingID_N")
	public TAnClosing getTAnClosing() {
		return this.TAnClosing;
	}

	public void setTAnClosing(TAnClosing TAnClosing) {
		this.TAnClosing = TAnClosing;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIGiftCardID_N")
	public TGdGiftCard getTGdGiftCard() {
		return this.TGdGiftCard;
	}

	public void setTGdGiftCard(TGdGiftCard TGdGiftCard) {
		this.TGdGiftCard = TGdGiftCard;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIStockTypeID", nullable = false)
	public TStstockType getTStstockType() {
		return this.TStstockType;
	}

	public void setTStstockType(TStstockType TStstockType) {
		this.TStstockType = TStstockType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIAccountingPeriodID_N")
	public TApaccountingPeriod getTApaccountingPeriod() {
		return this.TApaccountingPeriod;
	}

	public void setTApaccountingPeriod(TApaccountingPeriod TApaccountingPeriod) {
		this.TApaccountingPeriod = TApaccountingPeriod;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIMultiSaleID_N")
	public TMeMultiSale getTMeMultiSale() {
		return this.TMeMultiSale;
	}

	public void setTMeMultiSale(TMeMultiSale TMeMultiSale) {
		this.TMeMultiSale = TMeMultiSale;
	}

	@Column(name = "VISerialNoTx_N")
	public String getViserialNoTxN() {
		return this.viserialNoTxN;
	}

	public void setViserialNoTxN(String viserialNoTxN) {
		this.viserialNoTxN = viserialNoTxN;
	}

	@Column(name = "VIRefTx_N")
	public String getVirefTxN() {
		return this.virefTxN;
	}

	public void setVirefTxN(String virefTxN) {
		this.virefTxN = virefTxN;
	}

	@Column(name = "VIQtyIn", nullable = false)
	public short getViqtyIn() {
		return this.viqtyIn;
	}

	public void setViqtyIn(short viqtyIn) {
		this.viqtyIn = viqtyIn;
	}

	@Column(name = "VIUnitPriceMn", nullable = false, precision = 53, scale = 0)
	public double getViunitPriceMn() {
		return this.viunitPriceMn;
	}

	public void setViunitPriceMn(double viunitPriceMn) {
		this.viunitPriceMn = viunitPriceMn;
	}

	@Column(name = "VIPriceMn", nullable = false, precision = 53, scale = 0)
	public double getVipriceMn() {
		return this.vipriceMn;
	}

	public void setVipriceMn(double vipriceMn) {
		this.vipriceMn = vipriceMn;
	}

	@Column(name = "VITaxMn", nullable = false, precision = 53, scale = 0)
	public double getVitaxMn() {
		return this.vitaxMn;
	}

	public void setVitaxMn(double vitaxMn) {
		this.vitaxMn = vitaxMn;
	}

	@Column(name = "VICostPriceMn", nullable = false, precision = 53, scale = 0)
	public double getVicostPriceMn() {
		return this.vicostPriceMn;
	}

	public void setVicostPriceMn(double vicostPriceMn) {
		this.vicostPriceMn = vicostPriceMn;
	}

	@Column(name = "VICostPriceCompsTx", nullable = false)
	public String getVicostPriceCompsTx() {
		return this.vicostPriceCompsTx;
	}

	public void setVicostPriceCompsTx(String vicostPriceCompsTx) {
		this.vicostPriceCompsTx = vicostPriceCompsTx;
	}

	@Column(name = "VITaxBandIDsTx", nullable = false)
	public String getVitaxBandIdsTx() {
		return this.vitaxBandIdsTx;
	}

	public void setVitaxBandIdsTx(String vitaxBandIdsTx) {
		this.vitaxBandIdsTx = vitaxBandIdsTx;
	}

	@Column(name = "VITaxRatesTx", nullable = false)
	public String getVitaxRatesTx() {
		return this.vitaxRatesTx;
	}

	public void setVitaxRatesTx(String vitaxRatesTx) {
		this.vitaxRatesTx = vitaxRatesTx;
	}

	@Column(name = "VICurrencyID", nullable = false)
	public short getVicurrencyId() {
		return this.vicurrencyId;
	}

	public void setVicurrencyId(short vicurrencyId) {
		this.vicurrencyId = vicurrencyId;
	}

	@Column(name = "VIExchangeRateFl", nullable = false, precision = 24, scale = 0)
	public float getViexchangeRateFl() {
		return this.viexchangeRateFl;
	}

	public void setViexchangeRateFl(float viexchangeRateFl) {
		this.viexchangeRateFl = viexchangeRateFl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "VILastUpdatedDate", nullable = false, length = 23)
	public Date getVilastUpdatedDate() {
		return this.vilastUpdatedDate;
	}

	public void setVilastUpdatedDate(Date vilastUpdatedDate) {
		this.vilastUpdatedDate = vilastUpdatedDate;
	}

	@Column(name = "VIStockNoTx", nullable = false)
	public String getVistockNoTx() {
		return this.vistockNoTx;
	}

	public void setVistockNoTx(String vistockNoTx) {
		this.vistockNoTx = vistockNoTx;
	}

	@Column(name = "VIStockItemTx", nullable = false)
	public String getVistockItemTx() {
		return this.vistockItemTx;
	}

	public void setVistockItemTx(String vistockItemTx) {
		this.vistockItemTx = vistockItemTx;
	}

	@Column(name = "VIStockTypeTx", nullable = false)
	public String getVistockTypeTx() {
		return this.vistockTypeTx;
	}

	public void setVistockTypeTx(String vistockTypeTx) {
		this.vistockTypeTx = vistockTypeTx;
	}

	@Column(name = "VIManufacturerTx", nullable = false)
	public String getVimanufacturerTx() {
		return this.vimanufacturerTx;
	}

	public void setVimanufacturerTx(String vimanufacturerTx) {
		this.vimanufacturerTx = vimanufacturerTx;
	}

	@Column(name = "VIPrimaryColorTx_N")
	public String getViprimaryColorTxN() {
		return this.viprimaryColorTxN;
	}

	public void setViprimaryColorTxN(String viprimaryColorTxN) {
		this.viprimaryColorTxN = viprimaryColorTxN;
	}

	@Column(name = "VISecondaryColorTx_N")
	public String getVisecondaryColorTxN() {
		return this.visecondaryColorTxN;
	}

	public void setVisecondaryColorTxN(String visecondaryColorTxN) {
		this.visecondaryColorTxN = visecondaryColorTxN;
	}

	@Column(name = "VISizeTx_N")
	public String getVisizeTxN() {
		return this.visizeTxN;
	}

	public void setVisizeTxN(String visizeTxN) {
		this.visizeTxN = visizeTxN;
	}

	@Column(name = "VICommissionRateFl", nullable = false, precision = 24, scale = 0)
	public float getVicommissionRateFl() {
		return this.vicommissionRateFl;
	}

	public void setVicommissionRateFl(float vicommissionRateFl) {
		this.vicommissionRateFl = vicommissionRateFl;
	}

	@Column(name = "VICourseRelatedBl", nullable = false)
	public boolean isVicourseRelatedBl() {
		return this.vicourseRelatedBl;
	}

	public void setVicourseRelatedBl(boolean vicourseRelatedBl) {
		this.vicourseRelatedBl = vicourseRelatedBl;
	}

	@Column(name = "VITripRelatedBl", nullable = false)
	public boolean isVitripRelatedBl() {
		return this.vitripRelatedBl;
	}

	public void setVitripRelatedBl(boolean vitripRelatedBl) {
		this.vitripRelatedBl = vitripRelatedBl;
	}

	@Column(name = "VINotesTx_N")
	public String getVinotesTxN() {
		return this.vinotesTxN;
	}

	public void setVinotesTxN(String vinotesTxN) {
		this.vinotesTxN = vinotesTxN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "VICreationDate", nullable = false, length = 23)
	public Date getVicreationDate() {
		return this.vicreationDate;
	}

	public void setVicreationDate(Date vicreationDate) {
		this.vicreationDate = vicreationDate;
	}

	@Column(name = "VIParentID_N")
	public Integer getViparentIdN() {
		return this.viparentIdN;
	}

	public void setViparentIdN(Integer viparentIdN) {
		this.viparentIdN = viparentIdN;
	}

}
