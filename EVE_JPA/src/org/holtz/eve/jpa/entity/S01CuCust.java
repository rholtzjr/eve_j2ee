package org.holtz.eve.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the s01_CuCust database table.
 * 
 */
@Entity
@Table(name="s01_CuCust")
@NamedQuery(name="S01CuCust.findAll", query="SELECT s FROM S01CuCust s")
public class S01CuCust implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="Cu3rdPartyMailingsBl")
	private Boolean cu3rdPartyMailingsBl;

	@Column(name="CuAccManagerID_N",nullable=true )
	private Integer cuAccManagerID_N;

	@Column(name="CuAddress1Tx_N")
	private String cuAddress1Tx_N;

	@Column(name="CuAddress2Tx_N")
	private String cuAddress2Tx_N;

	@Column(name="CuAddress3Tx_N")
	private String cuAddress3Tx_N;

	@Column(name="CuAddress4Tx_N")
	private String cuAddress4Tx_N;

	@Column(name="CuBirthDate_N")
	private Timestamp cuBirthDate_N;

	@Column(name="CuBounceCountIn_N")
	private Integer cuBounceCountIn_N;

	@Column(name="CuCardSeenBl")
	private Boolean cuCardSeenBl;

	@Column(name="CuCommissionableBl")
	private Boolean cuCommissionableBl;

	@Column(name="CuCompanyID_N")
	private Integer cuCompanyID_N;

	@Column(name="CuCompanyTx_N")
	private String cuCompanyTx_N;

	@Column(name="CuCountryID_N")
	private Integer cuCountryID_N;

	@Column(name="CuCreationDate")
	private Timestamp cuCreationDate;

	@Column(name="CuCreditLimitMn")
	private double cuCreditLimitMn;

	@Column(name="CuCreditMn")
	private double cuCreditMn;

	@Column(name="CuCreditRiskBl")
	private Boolean cuCreditRiskBl;

	@Id
	@Column(name="CuCustID", insertable=false, updatable=false)
	private int cuCustID;

	@Column(name="CuCustNumberTx_N")
	private String cuCustNumberTx_N;

	@Column(name="CuDataSourceTx_N")
	private String cuDataSourceTx_N;

	@Column(name="CuDBPasswordTx_N")
	private String cuDBPasswordTx_N;

	@Column(name="CuDBUserIDTx_N")
	private String cuDBUserIDTx_N;

	@Column(name="CuDoctorsReportDate_N")
	private Timestamp cuDoctorsReportDate_N;

	@Column(name="CuDoctorsReportReceivedBl")
	private Boolean cuDoctorsReportReceivedBl;

	@Column(name="CuDoctorsReportRequiredBl")
	private Boolean cuDoctorsReportRequiredBl;

	@Column(name="CuEMailTx_N")
	private String cuEMailTx_N;

	@Column(name="CuFaxTx_N")
	private String cuFaxTx_N;

	@Column(name="CuFirstLanguageID_N")
	private Integer cuFirstLanguageID_N;

	@Column(name="CuFirstNameTx")
	private String cuFirstNameTx;

	@Column(name="CuFrequentFlyerTx_N")
	private String cuFrequentFlyerTx_N;

	@Column(name="CuHeightFl_N")
	private Float cuHeightFl_N;

	@Column(name="CuImagePathTx_N")
	private String cuImagePathTx_N;

	@Column(name="CuInitialCatalogTx_N")
	private String cuInitialCatalogTx_N;

	@Column(name="CuInsuranceCoTx_N")
	private String cuInsuranceCoTx_N;

	@Column(name="CuInsuranceDate_N")
	private Timestamp cuInsuranceDate_N;

	@Column(name="CuInsuranceNoTx_N")
	private String cuInsuranceNoTx_N;

	@Column(name="CuIsAnonymousBl_N")
	private Boolean cuIsAnonymousBl_N;

	@Column(name="CuIsCustomerCompletlyRegisteredBl")
	private Boolean cuIsCustomerCompletlyRegisteredBl;

	@Column(name="CuKnownAsTx_N")
	private String cuKnownAsTx_N;

	@Column(name="CuLAddress1Tx_N")
	private String cuLAddress1Tx_N;

	@Column(name="CuLAddress2Tx_N")
	private String cuLAddress2Tx_N;

	@Column(name="CuLAddress3Tx_N")
	private String cuLAddress3Tx_N;

	@Column(name="CuLAddress4Tx_N")
	private String cuLAddress4Tx_N;

	@Column(name="CuLastActivityDate_N")
	private Timestamp cuLastActivityDate_N;

	@Column(name="CuLastDiveDate_N")
	private Timestamp cuLastDiveDate_N;

	@Column(name="CuLastNameTx")
	private String cuLastNameTx;

	@Column(name="CuLastPurchaseDate")
	private Timestamp cuLastPurchaseDate;

	@Column(name="CuLastUpdatedDate")
	private Timestamp cuLastUpdatedDate;

	@Column(name="CuLPostcodeTx_N")
	private String cuLPostcodeTx_N;

	@Column(name="CuMaritalStatusID_N")
	private Short cuMaritalStatusID_N;

	@Column(name="CuMiddleInitialTx_N")
	private String cuMiddleInitialTx_N;

	@Column(name="CuNOKAddress1Tx_N")
	private String cuNOKAddress1Tx_N;

	@Column(name="CuNOKAddress2Tx_N")
	private String cuNOKAddress2Tx_N;

	@Column(name="CuNOKAddress3Tx_N")
	private String cuNOKAddress3Tx_N;

	@Column(name="CuNOKAddress4Tx_N")
	private String cuNOKAddress4Tx_N;

	@Column(name="CuNOKNameTx_N")
	private String cuNOKNameTx_N;

	@Column(name="CuNOKPostcodeTx_N")
	private String cuNOKPostcodeTx_N;

	@Column(name="CuNOKRelationshipTx_N")
	private String cuNOKRelationshipTx_N;

	@Column(name="CuNOKTelTx_N")
	private String cuNOKTelTx_N;

	@Column(name="CuNoOfDivesIn_N")
	private Short cuNoOfDivesIn_N;

	@Column(name="CuNotesTx_N")
	private String cuNotesTx_N;

	@Column(name="CuOccupationTx_N")
	private String cuOccupationTx_N;

	@Column(name="CuPADIID_N")
	private Integer cuPADIID_N;

	@Column(name="CuPADIKeyTx_N")
	private String cuPADIKeyTx_N;

	@Column(name="CuPADIMailingsBl")
	private Boolean cuPADIMailingsBl;

	@Column(name="CuPagerTx_N")
	private String cuPagerTx_N;

	@Column(name="CuPassportNoTx_N")
	private String cuPassportNoTx_N;

	@Column(name="CuPasswordTx_N")
	private String cuPasswordTx_N;

	@Column(name="CuPostcodeTx_N")
	private String cuPostcodeTx_N;

	@Column(name="CuRequiredBl")
	private Boolean cuRequiredBl;

	@Column(name="CuScubaTribeCodeTx_N")
	private String cuScubaTribeCodeTx_N;

	@Column(name="CuScubaTribeID_N")
	private Integer cuScubaTribeID_N;

	@Column(name="CuScubaTribeSentDate")
	private Timestamp cuScubaTribeSentDate;

	@Column(name="CuSecretAnswerTx_N")
	private String cuSecretAnswerTx_N;

	@Column(name="CuSecretQuestionTx_N")
	private String cuSecretQuestionTx_N;

	@Column(name="CuSexID_N")
	private Short cuSexID_N;

	@Column(name="CuShoeSizeFl_N")
	private Float cuShoeSizeFl_N;

	@Column(name="CuSkypeNameTx_N")
	private String cuSkypeNameTx_N;

	@Column(name="CuSourceID_N")
	private Integer cuSourceID_N;

	@Column(name="CuSSNTx_N")
	private String cuSSNTx_N;

	@Column(name="CuStateID_N")
	private Integer cuStateID_N;

	@Column(name="CuStatusID")
	private Integer cuStatusID;

	@Column(name="CuStoreID")
	private Short cuStoreID;

	@Column(name="CuStoreNoTx_N")
	private String cuStoreNoTx_N;

	@Column(name="CuSuggestionTx_N")
	private String cuSuggestionTx_N;

	@Column(name="CuSwipeTx_N")
	private String cuSwipeTx_N;

	@Column(name="CuTelHomeTx_N")
	private String cuTelHomeTx_N;

	@Column(name="CuTelLocalTx_N")
	private String cuTelLocalTx_N;

	@Column(name="CuTelMobileTx_N")
	private String cuTelMobileTx_N;

	@Column(name="CuTelWorkTx_N")
	private String cuTelWorkTx_N;

	@Column(name="CuUnavailableBl")
	private Boolean cuUnavailableBl;

	@Column(name="CuUserDefined1Tx_N")
	private String cuUserDefined1Tx_N;

	@Column(name="CuUserDefined2Tx_N")
	private String cuUserDefined2Tx_N;

	@Column(name="CuUserDefined3Tx_N")
	private String cuUserDefined3Tx_N;

	@Column(name="CuUserNameTx_N")
	private String cuUserNameTx_N;

	@Column(name="CuVerifyGuid")
	private String cuVerifyGuid;

	@Column(name="CuWAddress1Tx_N")
	private String cuWAddress1Tx_N;

	@Column(name="CuWAddress2Tx_N")
	private String cuWAddress2Tx_N;

	@Column(name="CuWAddress3Tx_N")
	private String cuWAddress3Tx_N;

	@Column(name="CuWAddress4Tx_N")
	private String cuWAddress4Tx_N;

	@Column(name="CuWCountryID_N")
	private Integer cuWCountryID_N;

	@Column(name="CuWeightFl_N")
	private Float cuWeightFl_N;

	@Column(name="CuWPostcodeTx_N")
	private String cuWPostcodeTx_N;

	@Column(name="CuWStateID_N")
	private Integer cuWStateID_N;

	public S01CuCust() {
	}

	public Boolean getCu3rdPartyMailingsBl() {
		return this.cu3rdPartyMailingsBl;
	}

	public void setCu3rdPartyMailingsBl(Boolean cu3rdPartyMailingsBl) {
		this.cu3rdPartyMailingsBl = cu3rdPartyMailingsBl;
	}

	public Integer getCuAccManagerID_N() {
		return this.cuAccManagerID_N;
	}

	public void setCuAccManagerID_N(Integer cuAccManagerID_N) {
		this.cuAccManagerID_N = cuAccManagerID_N;
	}

	public String getCuAddress1Tx_N() {
		return this.cuAddress1Tx_N;
	}

	public void setCuAddress1Tx_N(String cuAddress1Tx_N) {
		this.cuAddress1Tx_N = cuAddress1Tx_N;
	}

	public String getCuAddress2Tx_N() {
		return this.cuAddress2Tx_N;
	}

	public void setCuAddress2Tx_N(String cuAddress2Tx_N) {
		this.cuAddress2Tx_N = cuAddress2Tx_N;
	}

	public String getCuAddress3Tx_N() {
		return this.cuAddress3Tx_N;
	}

	public void setCuAddress3Tx_N(String cuAddress3Tx_N) {
		this.cuAddress3Tx_N = cuAddress3Tx_N;
	}

	public String getCuAddress4Tx_N() {
		return this.cuAddress4Tx_N;
	}

	public void setCuAddress4Tx_N(String cuAddress4Tx_N) {
		this.cuAddress4Tx_N = cuAddress4Tx_N;
	}

	public Timestamp getCuBirthDate_N() {
		return this.cuBirthDate_N;
	}

	public void setCuBirthDate_N(Timestamp cuBirthDate_N) {
		this.cuBirthDate_N = cuBirthDate_N;
	}

	public Integer getCuBounceCountIn_N() {
		return this.cuBounceCountIn_N;
	}

	public void setCuBounceCountIn_N(Integer cuBounceCountIn_N) {
		this.cuBounceCountIn_N = cuBounceCountIn_N;
	}

	public Boolean getCuCardSeenBl() {
		return this.cuCardSeenBl;
	}

	public void setCuCardSeenBl(Boolean cuCardSeenBl) {
		this.cuCardSeenBl = cuCardSeenBl;
	}

	public Boolean getCuCommissionableBl() {
		return this.cuCommissionableBl;
	}

	public void setCuCommissionableBl(Boolean cuCommissionableBl) {
		this.cuCommissionableBl = cuCommissionableBl;
	}

	public Integer getCuCompanyID_N() {
		return this.cuCompanyID_N;
	}

	public void setCuCompanyID_N(Integer cuCompanyID_N) {
		this.cuCompanyID_N = cuCompanyID_N;
	}

	public String getCuCompanyTx_N() {
		return this.cuCompanyTx_N;
	}

	public void setCuCompanyTx_N(String cuCompanyTx_N) {
		this.cuCompanyTx_N = cuCompanyTx_N;
	}

	public Integer getCuCountryID_N() {
		return this.cuCountryID_N;
	}

	public void setCuCountryID_N(Integer cuCountryID_N) {
		this.cuCountryID_N = cuCountryID_N;
	}

	public Timestamp getCuCreationDate() {
		return this.cuCreationDate;
	}

	public void setCuCreationDate(Timestamp cuCreationDate) {
		this.cuCreationDate = cuCreationDate;
	}

	public double getCuCreditLimitMn() {
		return this.cuCreditLimitMn;
	}

	public void setCuCreditLimitMn(double cuCreditLimitMn) {
		this.cuCreditLimitMn = cuCreditLimitMn;
	}

	public double getCuCreditMn() {
		return this.cuCreditMn;
	}

	public void setCuCreditMn(double cuCreditMn) {
		this.cuCreditMn = cuCreditMn;
	}

	public Boolean getCuCreditRiskBl() {
		return this.cuCreditRiskBl;
	}

	public void setCuCreditRiskBl(Boolean cuCreditRiskBl) {
		this.cuCreditRiskBl = cuCreditRiskBl;
	}

	public int getCuCustID() {
		return this.cuCustID;
	}

	public void setCuCustID(int cuCustID) {
		this.cuCustID = cuCustID;
	}

	public String getCuCustNumberTx_N() {
		return this.cuCustNumberTx_N;
	}

	public void setCuCustNumberTx_N(String cuCustNumberTx_N) {
		this.cuCustNumberTx_N = cuCustNumberTx_N;
	}

	public String getCuDataSourceTx_N() {
		return this.cuDataSourceTx_N;
	}

	public void setCuDataSourceTx_N(String cuDataSourceTx_N) {
		this.cuDataSourceTx_N = cuDataSourceTx_N;
	}

	public String getCuDBPasswordTx_N() {
		return this.cuDBPasswordTx_N;
	}

	public void setCuDBPasswordTx_N(String cuDBPasswordTx_N) {
		this.cuDBPasswordTx_N = cuDBPasswordTx_N;
	}

	public String getCuDBUserIDTx_N() {
		return this.cuDBUserIDTx_N;
	}

	public void setCuDBUserIDTx_N(String cuDBUserIDTx_N) {
		this.cuDBUserIDTx_N = cuDBUserIDTx_N;
	}

	public Timestamp getCuDoctorsReportDate_N() {
		return this.cuDoctorsReportDate_N;
	}

	public void setCuDoctorsReportDate_N(Timestamp cuDoctorsReportDate_N) {
		this.cuDoctorsReportDate_N = cuDoctorsReportDate_N;
	}

	public Boolean getCuDoctorsReportReceivedBl() {
		return this.cuDoctorsReportReceivedBl;
	}

	public void setCuDoctorsReportReceivedBl(Boolean cuDoctorsReportReceivedBl) {
		this.cuDoctorsReportReceivedBl = cuDoctorsReportReceivedBl;
	}

	public Boolean getCuDoctorsReportRequiredBl() {
		return this.cuDoctorsReportRequiredBl;
	}

	public void setCuDoctorsReportRequiredBl(Boolean cuDoctorsReportRequiredBl) {
		this.cuDoctorsReportRequiredBl = cuDoctorsReportRequiredBl;
	}

	public String getCuEMailTx_N() {
		return this.cuEMailTx_N;
	}

	public void setCuEMailTx_N(String cuEMailTx_N) {
		this.cuEMailTx_N = cuEMailTx_N;
	}

	public String getCuFaxTx_N() {
		return this.cuFaxTx_N;
	}

	public void setCuFaxTx_N(String cuFaxTx_N) {
		this.cuFaxTx_N = cuFaxTx_N;
	}

	public Integer getCuFirstLanguageID_N() {
		return this.cuFirstLanguageID_N;
	}

	public void setCuFirstLanguageID_N(Integer cuFirstLanguageID_N) {
		this.cuFirstLanguageID_N = cuFirstLanguageID_N;
	}

	public String getCuFirstNameTx() {
		return this.cuFirstNameTx;
	}

	public void setCuFirstNameTx(String cuFirstNameTx) {
		this.cuFirstNameTx = cuFirstNameTx;
	}

	public String getCuFrequentFlyerTx_N() {
		return this.cuFrequentFlyerTx_N;
	}

	public void setCuFrequentFlyerTx_N(String cuFrequentFlyerTx_N) {
		this.cuFrequentFlyerTx_N = cuFrequentFlyerTx_N;
	}

	public Float getCuHeightFl_N() {
		return this.cuHeightFl_N;
	}

	public void setCuHeightFl_N(Float cuHeightFl_N) {
		this.cuHeightFl_N = cuHeightFl_N;
	}

	public String getCuImagePathTx_N() {
		return this.cuImagePathTx_N;
	}

	public void setCuImagePathTx_N(String cuImagePathTx_N) {
		this.cuImagePathTx_N = cuImagePathTx_N;
	}

	public String getCuInitialCatalogTx_N() {
		return this.cuInitialCatalogTx_N;
	}

	public void setCuInitialCatalogTx_N(String cuInitialCatalogTx_N) {
		this.cuInitialCatalogTx_N = cuInitialCatalogTx_N;
	}

	public String getCuInsuranceCoTx_N() {
		return this.cuInsuranceCoTx_N;
	}

	public void setCuInsuranceCoTx_N(String cuInsuranceCoTx_N) {
		this.cuInsuranceCoTx_N = cuInsuranceCoTx_N;
	}

	public Timestamp getCuInsuranceDate_N() {
		return this.cuInsuranceDate_N;
	}

	public void setCuInsuranceDate_N(Timestamp cuInsuranceDate_N) {
		this.cuInsuranceDate_N = cuInsuranceDate_N;
	}

	public String getCuInsuranceNoTx_N() {
		return this.cuInsuranceNoTx_N;
	}

	public void setCuInsuranceNoTx_N(String cuInsuranceNoTx_N) {
		this.cuInsuranceNoTx_N = cuInsuranceNoTx_N;
	}

	public Boolean getCuIsAnonymousBl_N() {
		return this.cuIsAnonymousBl_N;
	}

	public void setCuIsAnonymousBl_N(Boolean cuIsAnonymousBl_N) {
		this.cuIsAnonymousBl_N = cuIsAnonymousBl_N;
	}

	public Boolean getCuIsCustomerCompletlyRegisteredBl() {
		return this.cuIsCustomerCompletlyRegisteredBl;
	}

	public void setCuIsCustomerCompletlyRegisteredBl(Boolean cuIsCustomerCompletlyRegisteredBl) {
		this.cuIsCustomerCompletlyRegisteredBl = cuIsCustomerCompletlyRegisteredBl;
	}

	public String getCuKnownAsTx_N() {
		return this.cuKnownAsTx_N;
	}

	public void setCuKnownAsTx_N(String cuKnownAsTx_N) {
		this.cuKnownAsTx_N = cuKnownAsTx_N;
	}

	public String getCuLAddress1Tx_N() {
		return this.cuLAddress1Tx_N;
	}

	public void setCuLAddress1Tx_N(String cuLAddress1Tx_N) {
		this.cuLAddress1Tx_N = cuLAddress1Tx_N;
	}

	public String getCuLAddress2Tx_N() {
		return this.cuLAddress2Tx_N;
	}

	public void setCuLAddress2Tx_N(String cuLAddress2Tx_N) {
		this.cuLAddress2Tx_N = cuLAddress2Tx_N;
	}

	public String getCuLAddress3Tx_N() {
		return this.cuLAddress3Tx_N;
	}

	public void setCuLAddress3Tx_N(String cuLAddress3Tx_N) {
		this.cuLAddress3Tx_N = cuLAddress3Tx_N;
	}

	public String getCuLAddress4Tx_N() {
		return this.cuLAddress4Tx_N;
	}

	public void setCuLAddress4Tx_N(String cuLAddress4Tx_N) {
		this.cuLAddress4Tx_N = cuLAddress4Tx_N;
	}

	public Timestamp getCuLastActivityDate_N() {
		return this.cuLastActivityDate_N;
	}

	public void setCuLastActivityDate_N(Timestamp cuLastActivityDate_N) {
		this.cuLastActivityDate_N = cuLastActivityDate_N;
	}

	public Timestamp getCuLastDiveDate_N() {
		return this.cuLastDiveDate_N;
	}

	public void setCuLastDiveDate_N(Timestamp cuLastDiveDate_N) {
		this.cuLastDiveDate_N = cuLastDiveDate_N;
	}

	public String getCuLastNameTx() {
		return this.cuLastNameTx;
	}

	public void setCuLastNameTx(String cuLastNameTx) {
		this.cuLastNameTx = cuLastNameTx;
	}

	public Timestamp getCuLastPurchaseDate() {
		return this.cuLastPurchaseDate;
	}

	public void setCuLastPurchaseDate(Timestamp cuLastPurchaseDate) {
		this.cuLastPurchaseDate = cuLastPurchaseDate;
	}

	public Timestamp getCuLastUpdatedDate() {
		return this.cuLastUpdatedDate;
	}

	public void setCuLastUpdatedDate(Timestamp cuLastUpdatedDate) {
		this.cuLastUpdatedDate = cuLastUpdatedDate;
	}

	public String getCuLPostcodeTx_N() {
		return this.cuLPostcodeTx_N;
	}

	public void setCuLPostcodeTx_N(String cuLPostcodeTx_N) {
		this.cuLPostcodeTx_N = cuLPostcodeTx_N;
	}

	public Short getCuMaritalStatusID_N() {
		return this.cuMaritalStatusID_N;
	}

	public void setCuMaritalStatusID_N(Short cuMaritalStatusID_N) {
		this.cuMaritalStatusID_N = cuMaritalStatusID_N;
	}

	public String getCuMiddleInitialTx_N() {
		return this.cuMiddleInitialTx_N;
	}

	public void setCuMiddleInitialTx_N(String cuMiddleInitialTx_N) {
		this.cuMiddleInitialTx_N = cuMiddleInitialTx_N;
	}

	public String getCuNOKAddress1Tx_N() {
		return this.cuNOKAddress1Tx_N;
	}

	public void setCuNOKAddress1Tx_N(String cuNOKAddress1Tx_N) {
		this.cuNOKAddress1Tx_N = cuNOKAddress1Tx_N;
	}

	public String getCuNOKAddress2Tx_N() {
		return this.cuNOKAddress2Tx_N;
	}

	public void setCuNOKAddress2Tx_N(String cuNOKAddress2Tx_N) {
		this.cuNOKAddress2Tx_N = cuNOKAddress2Tx_N;
	}

	public String getCuNOKAddress3Tx_N() {
		return this.cuNOKAddress3Tx_N;
	}

	public void setCuNOKAddress3Tx_N(String cuNOKAddress3Tx_N) {
		this.cuNOKAddress3Tx_N = cuNOKAddress3Tx_N;
	}

	public String getCuNOKAddress4Tx_N() {
		return this.cuNOKAddress4Tx_N;
	}

	public void setCuNOKAddress4Tx_N(String cuNOKAddress4Tx_N) {
		this.cuNOKAddress4Tx_N = cuNOKAddress4Tx_N;
	}

	public String getCuNOKNameTx_N() {
		return this.cuNOKNameTx_N;
	}

	public void setCuNOKNameTx_N(String cuNOKNameTx_N) {
		this.cuNOKNameTx_N = cuNOKNameTx_N;
	}

	public String getCuNOKPostcodeTx_N() {
		return this.cuNOKPostcodeTx_N;
	}

	public void setCuNOKPostcodeTx_N(String cuNOKPostcodeTx_N) {
		this.cuNOKPostcodeTx_N = cuNOKPostcodeTx_N;
	}

	public String getCuNOKRelationshipTx_N() {
		return this.cuNOKRelationshipTx_N;
	}

	public void setCuNOKRelationshipTx_N(String cuNOKRelationshipTx_N) {
		this.cuNOKRelationshipTx_N = cuNOKRelationshipTx_N;
	}

	public String getCuNOKTelTx_N() {
		return this.cuNOKTelTx_N;
	}

	public void setCuNOKTelTx_N(String cuNOKTelTx_N) {
		this.cuNOKTelTx_N = cuNOKTelTx_N;
	}

	public Short getCuNoOfDivesIn_N() {
		return this.cuNoOfDivesIn_N;
	}

	public void setCuNoOfDivesIn_N(Short cuNoOfDivesIn_N) {
		this.cuNoOfDivesIn_N = cuNoOfDivesIn_N;
	}

	public String getCuNotesTx_N() {
		return this.cuNotesTx_N;
	}

	public void setCuNotesTx_N(String cuNotesTx_N) {
		this.cuNotesTx_N = cuNotesTx_N;
	}

	public String getCuOccupationTx_N() {
		return this.cuOccupationTx_N;
	}

	public void setCuOccupationTx_N(String cuOccupationTx_N) {
		this.cuOccupationTx_N = cuOccupationTx_N;
	}

	public Integer getCuPADIID_N() {
		return this.cuPADIID_N;
	}

	public void setCuPADIID_N(Integer cuPADIID_N) {
		this.cuPADIID_N = cuPADIID_N;
	}

	public String getCuPADIKeyTx_N() {
		return this.cuPADIKeyTx_N;
	}

	public void setCuPADIKeyTx_N(String cuPADIKeyTx_N) {
		this.cuPADIKeyTx_N = cuPADIKeyTx_N;
	}

	public Boolean getCuPADIMailingsBl() {
		return this.cuPADIMailingsBl;
	}

	public void setCuPADIMailingsBl(Boolean cuPADIMailingsBl) {
		this.cuPADIMailingsBl = cuPADIMailingsBl;
	}

	public String getCuPagerTx_N() {
		return this.cuPagerTx_N;
	}

	public void setCuPagerTx_N(String cuPagerTx_N) {
		this.cuPagerTx_N = cuPagerTx_N;
	}

	public String getCuPassportNoTx_N() {
		return this.cuPassportNoTx_N;
	}

	public void setCuPassportNoTx_N(String cuPassportNoTx_N) {
		this.cuPassportNoTx_N = cuPassportNoTx_N;
	}

	public String getCuPasswordTx_N() {
		return this.cuPasswordTx_N;
	}

	public void setCuPasswordTx_N(String cuPasswordTx_N) {
		this.cuPasswordTx_N = cuPasswordTx_N;
	}

	public String getCuPostcodeTx_N() {
		return this.cuPostcodeTx_N;
	}

	public void setCuPostcodeTx_N(String cuPostcodeTx_N) {
		this.cuPostcodeTx_N = cuPostcodeTx_N;
	}

	public Boolean getCuRequiredBl() {
		return this.cuRequiredBl;
	}

	public void setCuRequiredBl(Boolean cuRequiredBl) {
		this.cuRequiredBl = cuRequiredBl;
	}

	public String getCuScubaTribeCodeTx_N() {
		return this.cuScubaTribeCodeTx_N;
	}

	public void setCuScubaTribeCodeTx_N(String cuScubaTribeCodeTx_N) {
		this.cuScubaTribeCodeTx_N = cuScubaTribeCodeTx_N;
	}

	public Integer getCuScubaTribeID_N() {
		return this.cuScubaTribeID_N;
	}

	public void setCuScubaTribeID_N(Integer cuScubaTribeID_N) {
		this.cuScubaTribeID_N = cuScubaTribeID_N;
	}

	public Timestamp getCuScubaTribeSentDate() {
		return this.cuScubaTribeSentDate;
	}

	public void setCuScubaTribeSentDate(Timestamp cuScubaTribeSentDate) {
		this.cuScubaTribeSentDate = cuScubaTribeSentDate;
	}

	public String getCuSecretAnswerTx_N() {
		return this.cuSecretAnswerTx_N;
	}

	public void setCuSecretAnswerTx_N(String cuSecretAnswerTx_N) {
		this.cuSecretAnswerTx_N = cuSecretAnswerTx_N;
	}

	public String getCuSecretQuestionTx_N() {
		return this.cuSecretQuestionTx_N;
	}

	public void setCuSecretQuestionTx_N(String cuSecretQuestionTx_N) {
		this.cuSecretQuestionTx_N = cuSecretQuestionTx_N;
	}

	public Short getCuSexID_N() {
		return this.cuSexID_N;
	}

	public void setCuSexID_N(Short cuSexID_N) {
		this.cuSexID_N = cuSexID_N;
	}

	public Float getCuShoeSizeFl_N() {
		return this.cuShoeSizeFl_N;
	}

	public void setCuShoeSizeFl_N(Float cuShoeSizeFl_N) {
		this.cuShoeSizeFl_N = cuShoeSizeFl_N;
	}

	public String getCuSkypeNameTx_N() {
		return this.cuSkypeNameTx_N;
	}

	public void setCuSkypeNameTx_N(String cuSkypeNameTx_N) {
		this.cuSkypeNameTx_N = cuSkypeNameTx_N;
	}

	public Integer getCuSourceID_N() {
		return this.cuSourceID_N;
	}

	public void setCuSourceID_N(Integer cuSourceID_N) {
		this.cuSourceID_N = cuSourceID_N;
	}

	public String getCuSSNTx_N() {
		return this.cuSSNTx_N;
	}

	public void setCuSSNTx_N(String cuSSNTx_N) {
		this.cuSSNTx_N = cuSSNTx_N;
	}

	public Integer getCuStateID_N() {
		return this.cuStateID_N;
	}

	public void setCuStateID_N(Integer cuStateID_N) {
		this.cuStateID_N = cuStateID_N;
	}

	public Integer getCuStatusID() {
		return this.cuStatusID;
	}

	public void setCuStatusID(Integer cuStatusID) {
		this.cuStatusID = cuStatusID;
	}

	public Short getCuStoreID() {
		return this.cuStoreID;
	}

	public void setCuStoreID(Short cuStoreID) {
		this.cuStoreID = cuStoreID;
	}

	public String getCuStoreNoTx_N() {
		return this.cuStoreNoTx_N;
	}

	public void setCuStoreNoTx_N(String cuStoreNoTx_N) {
		this.cuStoreNoTx_N = cuStoreNoTx_N;
	}

	public String getCuSuggestionTx_N() {
		return this.cuSuggestionTx_N;
	}

	public void setCuSuggestionTx_N(String cuSuggestionTx_N) {
		this.cuSuggestionTx_N = cuSuggestionTx_N;
	}

	public String getCuSwipeTx_N() {
		return this.cuSwipeTx_N;
	}

	public void setCuSwipeTx_N(String cuSwipeTx_N) {
		this.cuSwipeTx_N = cuSwipeTx_N;
	}

	public String getCuTelHomeTx_N() {
		return this.cuTelHomeTx_N;
	}

	public void setCuTelHomeTx_N(String cuTelHomeTx_N) {
		this.cuTelHomeTx_N = cuTelHomeTx_N;
	}

	public String getCuTelLocalTx_N() {
		return this.cuTelLocalTx_N;
	}

	public void setCuTelLocalTx_N(String cuTelLocalTx_N) {
		this.cuTelLocalTx_N = cuTelLocalTx_N;
	}

	public String getCuTelMobileTx_N() {
		return this.cuTelMobileTx_N;
	}

	public void setCuTelMobileTx_N(String cuTelMobileTx_N) {
		this.cuTelMobileTx_N = cuTelMobileTx_N;
	}

	public String getCuTelWorkTx_N() {
		return this.cuTelWorkTx_N;
	}

	public void setCuTelWorkTx_N(String cuTelWorkTx_N) {
		this.cuTelWorkTx_N = cuTelWorkTx_N;
	}

	public Boolean getCuUnavailableBl() {
		return this.cuUnavailableBl;
	}

	public void setCuUnavailableBl(Boolean cuUnavailableBl) {
		this.cuUnavailableBl = cuUnavailableBl;
	}

	public String getCuUserDefined1Tx_N() {
		return this.cuUserDefined1Tx_N;
	}

	public void setCuUserDefined1Tx_N(String cuUserDefined1Tx_N) {
		this.cuUserDefined1Tx_N = cuUserDefined1Tx_N;
	}

	public String getCuUserDefined2Tx_N() {
		return this.cuUserDefined2Tx_N;
	}

	public void setCuUserDefined2Tx_N(String cuUserDefined2Tx_N) {
		this.cuUserDefined2Tx_N = cuUserDefined2Tx_N;
	}

	public String getCuUserDefined3Tx_N() {
		return this.cuUserDefined3Tx_N;
	}

	public void setCuUserDefined3Tx_N(String cuUserDefined3Tx_N) {
		this.cuUserDefined3Tx_N = cuUserDefined3Tx_N;
	}

	public String getCuUserNameTx_N() {
		return this.cuUserNameTx_N;
	}

	public void setCuUserNameTx_N(String cuUserNameTx_N) {
		this.cuUserNameTx_N = cuUserNameTx_N;
	}

	public String getCuVerifyGuid() {
		return this.cuVerifyGuid;
	}

	public void setCuVerifyGuid(String cuVerifyGuid) {
		this.cuVerifyGuid = cuVerifyGuid;
	}

	public String getCuWAddress1Tx_N() {
		return this.cuWAddress1Tx_N;
	}

	public void setCuWAddress1Tx_N(String cuWAddress1Tx_N) {
		this.cuWAddress1Tx_N = cuWAddress1Tx_N;
	}

	public String getCuWAddress2Tx_N() {
		return this.cuWAddress2Tx_N;
	}

	public void setCuWAddress2Tx_N(String cuWAddress2Tx_N) {
		this.cuWAddress2Tx_N = cuWAddress2Tx_N;
	}

	public String getCuWAddress3Tx_N() {
		return this.cuWAddress3Tx_N;
	}

	public void setCuWAddress3Tx_N(String cuWAddress3Tx_N) {
		this.cuWAddress3Tx_N = cuWAddress3Tx_N;
	}

	public String getCuWAddress4Tx_N() {
		return this.cuWAddress4Tx_N;
	}

	public void setCuWAddress4Tx_N(String cuWAddress4Tx_N) {
		this.cuWAddress4Tx_N = cuWAddress4Tx_N;
	}

	public Integer getCuWCountryID_N() {
		return this.cuWCountryID_N;
	}

	public void setCuWCountryID_N(Integer cuWCountryID_N) {
		this.cuWCountryID_N = cuWCountryID_N;
	}

	public Float getCuWeightFl_N() {
		return this.cuWeightFl_N;
	}

	public void setCuWeightFl_N(Float cuWeightFl_N) {
		this.cuWeightFl_N = cuWeightFl_N;
	}

	public String getCuWPostcodeTx_N() {
		return this.cuWPostcodeTx_N;
	}

	public void setCuWPostcodeTx_N(String cuWPostcodeTx_N) {
		this.cuWPostcodeTx_N = cuWPostcodeTx_N;
	}

	public Integer getCuWStateID_N() {
		return this.cuWStateID_N;
	}

	public void setCuWStateID_N(Integer cuWStateID_N) {
		this.cuWStateID_N = cuWStateID_N;
	}

}