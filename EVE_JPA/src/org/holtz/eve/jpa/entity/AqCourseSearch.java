package org.holtz.eve.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the aq_CourseSearch database table.
 * 
 */
@Entity
@Table(name="aq_CourseSearch")
@NamedQuery(name="AqCourseSearch.findAll", query="SELECT a FROM AqCourseSearch a")
public class AqCourseSearch implements Serializable {
	private static final long serialVersionUID = 1L;

	private int CCCostCenterID;

	@Id
	@Column(name="CsCourseID")
	private int csCourseID;

	@Column(name="CsCourseTypeId")
	private int csCourseTypeId;

	@Column(name="CsEndDate")
	private Timestamp csEndDate;

	@Column(name="CsStartDate")
	private Timestamp csStartDate;

	@Column(name="CsTermId_N")
	private int csTermId_N;

	private int CTCertPriorityIn_N;

	@Column(name="LcAddress1Tx_N")
	private String lcAddress1Tx_N;

	@Column(name="LcAddress2Tx_N")
	private String lcAddress2Tx_N;

	@Column(name="LcAddress3Tx_N")
	private String lcAddress3Tx_N;

	@Column(name="LcAddress4Tx_N")
	private String lcAddress4Tx_N;

	@Column(name="LcLocationId")
	private int lcLocationId;

	@Column(name="SeShortNameTx")
	private String seShortNameTx;

	@Column(name="SeStateID")
	private int seStateID;

	@Column(name="SeStateTx")
	private String seStateTx;

	private boolean SICalcTaxOnShippingAddressBl;

	private int SIChildrenCountIn;

	private int SIClickActionID;

	private String SIClickActionParamsTx_N;

	private String SIClickActionPromptTx_N;

	private String SIClickUrlTextTx_N;

	private String SIDescriptionTx_N;

	private BigDecimal SIEOLPriceMn;

	private short SIEventDataTypeID_N;

	private String SIImageURL2Tx_N;

	private String SIImageURL3Tx_N;

	private String SIImageURLTx_N;

	private boolean SIMaintainStockLevelBl;

	private int SIManufacturerID;

	private String SIModelNameTx;

	private String SIModelNumberTx;

	private int SIParentID_N;

	private int SIPrimaryColorID_N;

	private BigDecimal SIRegularPriceMn;

	private int SISecondaryColorID_N;

	private boolean SISerialRequiredBl;

	private boolean SIShowPriceInEOLBl;

	private int SISizeID_N;

	private String SISpecialOfferTx_N;

	private int SIStockItemID;

	private int SIStockLevelIn;

	private float SITaxRateFl;

	private BigDecimal SIUnitCostMn;

	private String SIVideoURLTx_N;

	private double SIWeightFl_N;

	@Column(name="SoStoreId")
	private short soStoreId;

	private String STCategoryNameTx;

	private int STStockTypeID;

	@Column(name="SuManufacturerNameTx")
	private String suManufacturerNameTx;

	@Column(name="ZlDisplayOnWebBl")
	private boolean zlDisplayOnWebBl;

	public AqCourseSearch() {
	}

	public int getCCCostCenterID() {
		return this.CCCostCenterID;
	}

	public void setCCCostCenterID(int CCCostCenterID) {
		this.CCCostCenterID = CCCostCenterID;
	}

	public int getCsCourseID() {
		return this.csCourseID;
	}

	public void setCsCourseID(int csCourseID) {
		this.csCourseID = csCourseID;
	}

	public int getCsCourseTypeId() {
		return this.csCourseTypeId;
	}

	public void setCsCourseTypeId(int csCourseTypeId) {
		this.csCourseTypeId = csCourseTypeId;
	}

	public Timestamp getCsEndDate() {
		return this.csEndDate;
	}

	public void setCsEndDate(Timestamp csEndDate) {
		this.csEndDate = csEndDate;
	}

	public Timestamp getCsStartDate() {
		return this.csStartDate;
	}

	public void setCsStartDate(Timestamp csStartDate) {
		this.csStartDate = csStartDate;
	}

	public int getCsTermId_N() {
		return this.csTermId_N;
	}

	public void setCsTermId_N(int csTermId_N) {
		this.csTermId_N = csTermId_N;
	}

	public int getCTCertPriorityIn_N() {
		return this.CTCertPriorityIn_N;
	}

	public void setCTCertPriorityIn_N(int CTCertPriorityIn_N) {
		this.CTCertPriorityIn_N = CTCertPriorityIn_N;
	}

	public String getLcAddress1Tx_N() {
		return this.lcAddress1Tx_N;
	}

	public void setLcAddress1Tx_N(String lcAddress1Tx_N) {
		this.lcAddress1Tx_N = lcAddress1Tx_N;
	}

	public String getLcAddress2Tx_N() {
		return this.lcAddress2Tx_N;
	}

	public void setLcAddress2Tx_N(String lcAddress2Tx_N) {
		this.lcAddress2Tx_N = lcAddress2Tx_N;
	}

	public String getLcAddress3Tx_N() {
		return this.lcAddress3Tx_N;
	}

	public void setLcAddress3Tx_N(String lcAddress3Tx_N) {
		this.lcAddress3Tx_N = lcAddress3Tx_N;
	}

	public String getLcAddress4Tx_N() {
		return this.lcAddress4Tx_N;
	}

	public void setLcAddress4Tx_N(String lcAddress4Tx_N) {
		this.lcAddress4Tx_N = lcAddress4Tx_N;
	}

	public int getLcLocationId() {
		return this.lcLocationId;
	}

	public void setLcLocationId(int lcLocationId) {
		this.lcLocationId = lcLocationId;
	}

	public String getSeShortNameTx() {
		return this.seShortNameTx;
	}

	public void setSeShortNameTx(String seShortNameTx) {
		this.seShortNameTx = seShortNameTx;
	}

	public int getSeStateID() {
		return this.seStateID;
	}

	public void setSeStateID(int seStateID) {
		this.seStateID = seStateID;
	}

	public String getSeStateTx() {
		return this.seStateTx;
	}

	public void setSeStateTx(String seStateTx) {
		this.seStateTx = seStateTx;
	}

	public boolean getSICalcTaxOnShippingAddressBl() {
		return this.SICalcTaxOnShippingAddressBl;
	}

	public void setSICalcTaxOnShippingAddressBl(boolean SICalcTaxOnShippingAddressBl) {
		this.SICalcTaxOnShippingAddressBl = SICalcTaxOnShippingAddressBl;
	}

	public int getSIChildrenCountIn() {
		return this.SIChildrenCountIn;
	}

	public void setSIChildrenCountIn(int SIChildrenCountIn) {
		this.SIChildrenCountIn = SIChildrenCountIn;
	}

	public int getSIClickActionID() {
		return this.SIClickActionID;
	}

	public void setSIClickActionID(int SIClickActionID) {
		this.SIClickActionID = SIClickActionID;
	}

	public String getSIClickActionParamsTx_N() {
		return this.SIClickActionParamsTx_N;
	}

	public void setSIClickActionParamsTx_N(String SIClickActionParamsTx_N) {
		this.SIClickActionParamsTx_N = SIClickActionParamsTx_N;
	}

	public String getSIClickActionPromptTx_N() {
		return this.SIClickActionPromptTx_N;
	}

	public void setSIClickActionPromptTx_N(String SIClickActionPromptTx_N) {
		this.SIClickActionPromptTx_N = SIClickActionPromptTx_N;
	}

	public String getSIClickUrlTextTx_N() {
		return this.SIClickUrlTextTx_N;
	}

	public void setSIClickUrlTextTx_N(String SIClickUrlTextTx_N) {
		this.SIClickUrlTextTx_N = SIClickUrlTextTx_N;
	}

	public String getSIDescriptionTx_N() {
		return this.SIDescriptionTx_N;
	}

	public void setSIDescriptionTx_N(String SIDescriptionTx_N) {
		this.SIDescriptionTx_N = SIDescriptionTx_N;
	}

	public BigDecimal getSIEOLPriceMn() {
		return this.SIEOLPriceMn;
	}

	public void setSIEOLPriceMn(BigDecimal SIEOLPriceMn) {
		this.SIEOLPriceMn = SIEOLPriceMn;
	}

	public short getSIEventDataTypeID_N() {
		return this.SIEventDataTypeID_N;
	}

	public void setSIEventDataTypeID_N(short SIEventDataTypeID_N) {
		this.SIEventDataTypeID_N = SIEventDataTypeID_N;
	}

	public String getSIImageURL2Tx_N() {
		return this.SIImageURL2Tx_N;
	}

	public void setSIImageURL2Tx_N(String SIImageURL2Tx_N) {
		this.SIImageURL2Tx_N = SIImageURL2Tx_N;
	}

	public String getSIImageURL3Tx_N() {
		return this.SIImageURL3Tx_N;
	}

	public void setSIImageURL3Tx_N(String SIImageURL3Tx_N) {
		this.SIImageURL3Tx_N = SIImageURL3Tx_N;
	}

	public String getSIImageURLTx_N() {
		return this.SIImageURLTx_N;
	}

	public void setSIImageURLTx_N(String SIImageURLTx_N) {
		this.SIImageURLTx_N = SIImageURLTx_N;
	}

	public boolean getSIMaintainStockLevelBl() {
		return this.SIMaintainStockLevelBl;
	}

	public void setSIMaintainStockLevelBl(boolean SIMaintainStockLevelBl) {
		this.SIMaintainStockLevelBl = SIMaintainStockLevelBl;
	}

	public int getSIManufacturerID() {
		return this.SIManufacturerID;
	}

	public void setSIManufacturerID(int SIManufacturerID) {
		this.SIManufacturerID = SIManufacturerID;
	}

	public String getSIModelNameTx() {
		return this.SIModelNameTx;
	}

	public void setSIModelNameTx(String SIModelNameTx) {
		this.SIModelNameTx = SIModelNameTx;
	}

	public String getSIModelNumberTx() {
		return this.SIModelNumberTx;
	}

	public void setSIModelNumberTx(String SIModelNumberTx) {
		this.SIModelNumberTx = SIModelNumberTx;
	}

	public int getSIParentID_N() {
		return this.SIParentID_N;
	}

	public void setSIParentID_N(int SIParentID_N) {
		this.SIParentID_N = SIParentID_N;
	}

	public int getSIPrimaryColorID_N() {
		return this.SIPrimaryColorID_N;
	}

	public void setSIPrimaryColorID_N(int SIPrimaryColorID_N) {
		this.SIPrimaryColorID_N = SIPrimaryColorID_N;
	}

	public BigDecimal getSIRegularPriceMn() {
		return this.SIRegularPriceMn;
	}

	public void setSIRegularPriceMn(BigDecimal SIRegularPriceMn) {
		this.SIRegularPriceMn = SIRegularPriceMn;
	}

	public int getSISecondaryColorID_N() {
		return this.SISecondaryColorID_N;
	}

	public void setSISecondaryColorID_N(int SISecondaryColorID_N) {
		this.SISecondaryColorID_N = SISecondaryColorID_N;
	}

	public boolean getSISerialRequiredBl() {
		return this.SISerialRequiredBl;
	}

	public void setSISerialRequiredBl(boolean SISerialRequiredBl) {
		this.SISerialRequiredBl = SISerialRequiredBl;
	}

	public boolean getSIShowPriceInEOLBl() {
		return this.SIShowPriceInEOLBl;
	}

	public void setSIShowPriceInEOLBl(boolean SIShowPriceInEOLBl) {
		this.SIShowPriceInEOLBl = SIShowPriceInEOLBl;
	}

	public int getSISizeID_N() {
		return this.SISizeID_N;
	}

	public void setSISizeID_N(int SISizeID_N) {
		this.SISizeID_N = SISizeID_N;
	}

	public String getSISpecialOfferTx_N() {
		return this.SISpecialOfferTx_N;
	}

	public void setSISpecialOfferTx_N(String SISpecialOfferTx_N) {
		this.SISpecialOfferTx_N = SISpecialOfferTx_N;
	}

	public int getSIStockItemID() {
		return this.SIStockItemID;
	}

	public void setSIStockItemID(int SIStockItemID) {
		this.SIStockItemID = SIStockItemID;
	}

	public int getSIStockLevelIn() {
		return this.SIStockLevelIn;
	}

	public void setSIStockLevelIn(int SIStockLevelIn) {
		this.SIStockLevelIn = SIStockLevelIn;
	}

	public float getSITaxRateFl() {
		return this.SITaxRateFl;
	}

	public void setSITaxRateFl(float SITaxRateFl) {
		this.SITaxRateFl = SITaxRateFl;
	}

	public BigDecimal getSIUnitCostMn() {
		return this.SIUnitCostMn;
	}

	public void setSIUnitCostMn(BigDecimal SIUnitCostMn) {
		this.SIUnitCostMn = SIUnitCostMn;
	}

	public String getSIVideoURLTx_N() {
		return this.SIVideoURLTx_N;
	}

	public void setSIVideoURLTx_N(String SIVideoURLTx_N) {
		this.SIVideoURLTx_N = SIVideoURLTx_N;
	}

	public double getSIWeightFl_N() {
		return this.SIWeightFl_N;
	}

	public void setSIWeightFl_N(double SIWeightFl_N) {
		this.SIWeightFl_N = SIWeightFl_N;
	}

	public short getSoStoreId() {
		return this.soStoreId;
	}

	public void setSoStoreId(short soStoreId) {
		this.soStoreId = soStoreId;
	}

	public String getSTCategoryNameTx() {
		return this.STCategoryNameTx;
	}

	public void setSTCategoryNameTx(String STCategoryNameTx) {
		this.STCategoryNameTx = STCategoryNameTx;
	}

	public int getSTStockTypeID() {
		return this.STStockTypeID;
	}

	public void setSTStockTypeID(int STStockTypeID) {
		this.STStockTypeID = STStockTypeID;
	}

	public String getSuManufacturerNameTx() {
		return this.suManufacturerNameTx;
	}

	public void setSuManufacturerNameTx(String suManufacturerNameTx) {
		this.suManufacturerNameTx = suManufacturerNameTx;
	}

	public boolean getZlDisplayOnWebBl() {
		return this.zlDisplayOnWebBl;
	}

	public void setZlDisplayOnWebBl(boolean zlDisplayOnWebBl) {
		this.zlDisplayOnWebBl = zlDisplayOnWebBl;
	}

}