package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * D01CuCust generated by hbm2java
 */
@Entity
@Table(name = "d01_CuCust")
public class D01CuCust implements java.io.Serializable {

	private D01CuCustId id;

	public D01CuCust() {
	}

	public D01CuCust(D01CuCustId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "cuCustId", column = @Column(name = "CuCustID", nullable = false)),
			@AttributeOverride(name = "cuStoreId", column = @Column(name = "CuStoreID", nullable = false)),
			@AttributeOverride(name = "cuFirstNameTx", column = @Column(name = "CuFirstNameTx", nullable = false)),
			@AttributeOverride(name = "cuMiddleInitialTxN", column = @Column(name = "CuMiddleInitialTx_N")),
			@AttributeOverride(name = "cuLastNameTx", column = @Column(name = "CuLastNameTx", nullable = false)),
			@AttributeOverride(name = "cuKnownAsTxN", column = @Column(name = "CuKnownAsTx_N")),
			@AttributeOverride(name = "cuOccupationTxN", column = @Column(name = "CuOccupationTx_N")),
			@AttributeOverride(name = "cuBirthDateN", column = @Column(name = "CuBirthDate_N", length = 23)),
			@AttributeOverride(name = "cuSexIdN", column = @Column(name = "CuSexID_N")),
			@AttributeOverride(name = "cuMaritalStatusIdN", column = @Column(name = "CuMaritalStatusID_N")),
			@AttributeOverride(name = "cuSourceIdN", column = @Column(name = "CuSourceID_N")),
			@AttributeOverride(name = "cuAddress1txN", column = @Column(name = "CuAddress1Tx_N")),
			@AttributeOverride(name = "cuAddress2txN", column = @Column(name = "CuAddress2Tx_N")),
			@AttributeOverride(name = "cuAddress3txN", column = @Column(name = "CuAddress3Tx_N")),
			@AttributeOverride(name = "cuAddress4txN", column = @Column(name = "CuAddress4Tx_N")),
			@AttributeOverride(name = "cuStateIdN", column = @Column(name = "CuStateID_N")),
			@AttributeOverride(name = "cuPostcodeTxN", column = @Column(name = "CuPostcodeTx_N")),
			@AttributeOverride(name = "cuCountryIdN", column = @Column(name = "CuCountryID_N")),
			@AttributeOverride(name = "cuCompanyIdN", column = @Column(name = "CuCompanyID_N")),
			@AttributeOverride(name = "cuCompanyTxN", column = @Column(name = "CuCompanyTx_N")),
			@AttributeOverride(name = "cuWaddress1txN", column = @Column(name = "CuWAddress1Tx_N")),
			@AttributeOverride(name = "cuWaddress2txN", column = @Column(name = "CuWAddress2Tx_N")),
			@AttributeOverride(name = "cuWaddress3txN", column = @Column(name = "CuWAddress3Tx_N")),
			@AttributeOverride(name = "cuWaddress4txN", column = @Column(name = "CuWAddress4Tx_N")),
			@AttributeOverride(name = "cuWstateIdN", column = @Column(name = "CuWStateID_N")),
			@AttributeOverride(name = "cuWpostcodeTxN", column = @Column(name = "CuWPostcodeTx_N")),
			@AttributeOverride(name = "cuWcountryIdN", column = @Column(name = "CuWCountryID_N")),
			@AttributeOverride(name = "cuLaddress1txN", column = @Column(name = "CuLAddress1Tx_N")),
			@AttributeOverride(name = "cuLaddress2txN", column = @Column(name = "CuLAddress2Tx_N")),
			@AttributeOverride(name = "cuLaddress3txN", column = @Column(name = "CuLAddress3Tx_N")),
			@AttributeOverride(name = "cuLaddress4txN", column = @Column(name = "CuLAddress4Tx_N")),
			@AttributeOverride(name = "cuLpostcodeTxN", column = @Column(name = "CuLPostcodeTx_N")),
			@AttributeOverride(name = "cuTelLocalTxN", column = @Column(name = "CuTelLocalTx_N")),
			@AttributeOverride(name = "cuTelHomeTxN", column = @Column(name = "CuTelHomeTx_N")),
			@AttributeOverride(name = "cuTelWorkTxN", column = @Column(name = "CuTelWorkTx_N")),
			@AttributeOverride(name = "cuTelMobileTxN", column = @Column(name = "CuTelMobileTx_N")),
			@AttributeOverride(name = "cuFaxTxN", column = @Column(name = "CuFaxTx_N")),
			@AttributeOverride(name = "cuEmailTxN", column = @Column(name = "CuEMailTx_N")),
			@AttributeOverride(name = "cuPagerTxN", column = @Column(name = "CuPagerTx_N")),
			@AttributeOverride(name = "cuFirstLanguageIdN", column = @Column(name = "CuFirstLanguageID_N")),
			@AttributeOverride(name = "cuNoknameTxN", column = @Column(name = "CuNOKNameTx_N")),
			@AttributeOverride(name = "cuNokrelationshipTxN", column = @Column(name = "CuNOKRelationshipTx_N")),
			@AttributeOverride(name = "cuNokaddress1txN", column = @Column(name = "CuNOKAddress1Tx_N")),
			@AttributeOverride(name = "cuNokaddress2txN", column = @Column(name = "CuNOKAddress2Tx_N")),
			@AttributeOverride(name = "cuNokaddress3txN", column = @Column(name = "CuNOKAddress3Tx_N")),
			@AttributeOverride(name = "cuNokaddress4txN", column = @Column(name = "CuNOKAddress4Tx_N")),
			@AttributeOverride(name = "cuNokpostcodeTxN", column = @Column(name = "CuNOKPostcodeTx_N")),
			@AttributeOverride(name = "cuNoktelTxN", column = @Column(name = "CuNOKTelTx_N")),
			@AttributeOverride(name = "cuImagePathTxN", column = @Column(name = "CuImagePathTx_N")),
			@AttributeOverride(name = "cuNotesTxN", column = @Column(name = "CuNotesTx_N")),
			@AttributeOverride(name = "cuDoctorsReportRequiredBl", column = @Column(name = "CuDoctorsReportRequiredBl", nullable = false)),
			@AttributeOverride(name = "cuDoctorsReportReceivedBl", column = @Column(name = "CuDoctorsReportReceivedBl", nullable = false)),
			@AttributeOverride(name = "cuSuggestionTxN", column = @Column(name = "CuSuggestionTx_N")),
			@AttributeOverride(name = "cuUnavailableBl", column = @Column(name = "CuUnavailableBl", nullable = false)),
			@AttributeOverride(name = "cuLastUpdatedDate", column = @Column(name = "CuLastUpdatedDate", nullable = false, length = 23)),
			@AttributeOverride(name = "cuPassportNoTxN", column = @Column(name = "CuPassportNoTx_N")),
			@AttributeOverride(name = "cuFrequentFlyerTxN", column = @Column(name = "CuFrequentFlyerTx_N")),
			@AttributeOverride(name = "cuSsntxN", column = @Column(name = "CuSSNTx_N")),
			@AttributeOverride(name = "cuStatusId", column = @Column(name = "CuStatusID", nullable = false)),
			@AttributeOverride(name = "cuPadikeyTxN", column = @Column(name = "CuPADIKeyTx_N")),
			@AttributeOverride(name = "cuCommissionableBl", column = @Column(name = "CuCommissionableBl", nullable = false)),
			@AttributeOverride(name = "cuLastPurchaseDate", column = @Column(name = "CuLastPurchaseDate", nullable = false, length = 23)),
			@AttributeOverride(name = "cuCreditMn", column = @Column(name = "CuCreditMn", nullable = false, precision = 53, scale = 0)),
			@AttributeOverride(name = "cuCreditLimitMn", column = @Column(name = "CuCreditLimitMn", nullable = false, precision = 53, scale = 0)),
			@AttributeOverride(name = "cuCreationDate", column = @Column(name = "CuCreationDate", nullable = false, length = 23)),
			@AttributeOverride(name = "cuUserDefined1txN", column = @Column(name = "CuUserDefined1Tx_N")),
			@AttributeOverride(name = "cuUserDefined2txN", column = @Column(name = "CuUserDefined2Tx_N")),
			@AttributeOverride(name = "cuUserDefined3txN", column = @Column(name = "CuUserDefined3Tx_N")),
			@AttributeOverride(name = "cuUserNameTxN", column = @Column(name = "CuUserNameTx_N")),
			@AttributeOverride(name = "cuPasswordTxN", column = @Column(name = "CuPasswordTx_N")),
			@AttributeOverride(name = "cuNoOfDivesInN", column = @Column(name = "CuNoOfDivesIn_N")),
			@AttributeOverride(name = "cuLastDiveDateN", column = @Column(name = "CuLastDiveDate_N", length = 23)),
			@AttributeOverride(name = "cuCardSeenBl", column = @Column(name = "CuCardSeenBl", nullable = false)),
			@AttributeOverride(name = "cuHeightFlN", column = @Column(name = "CuHeightFl_N", precision = 24, scale = 0)),
			@AttributeOverride(name = "cuWeightFlN", column = @Column(name = "CuWeightFl_N", precision = 24, scale = 0)),
			@AttributeOverride(name = "cuInsuranceNoTxN", column = @Column(name = "CuInsuranceNoTx_N")),
			@AttributeOverride(name = "cuInsuranceCoTxN", column = @Column(name = "CuInsuranceCoTx_N")),
			@AttributeOverride(name = "cuShoeSizeFlN", column = @Column(name = "CuShoeSizeFl_N", precision = 24, scale = 0)),
			@AttributeOverride(name = "cuSkypeNameTxN", column = @Column(name = "CuSkypeNameTx_N")),
			@AttributeOverride(name = "cuInsuranceDateN", column = @Column(name = "CuInsuranceDate_N", length = 23)),
			@AttributeOverride(name = "cuDoctorsReportDateN", column = @Column(name = "CuDoctorsReportDate_N", length = 23)),
			@AttributeOverride(name = "cuVerifyGuid", column = @Column(name = "CuVerifyGuid", length = 36)),
			@AttributeOverride(name = "cuBounceCountInN", column = @Column(name = "CuBounceCountIn_N")),
			@AttributeOverride(name = "cuStoreNoTxN", column = @Column(name = "CuStoreNoTx_N")),
			@AttributeOverride(name = "cuIsAnonymousBlN", column = @Column(name = "CuIsAnonymousBl_N")),
			@AttributeOverride(name = "cuLastActivityDateN", column = @Column(name = "CuLastActivityDate_N", length = 23)),
			@AttributeOverride(name = "cuCreditRiskBl", column = @Column(name = "CuCreditRiskBl", nullable = false)),
			@AttributeOverride(name = "cuAccManagerIdN", column = @Column(name = "CuAccManagerID_N")),
			@AttributeOverride(name = "cuSecretQuestionTxN", column = @Column(name = "CuSecretQuestionTx_N")),
			@AttributeOverride(name = "cuSecretAnswerTxN", column = @Column(name = "CuSecretAnswerTx_N")),
			@AttributeOverride(name = "cuIsCustomerCompletlyRegisteredBl", column = @Column(name = "CuIsCustomerCompletlyRegisteredBl", nullable = false)),
			@AttributeOverride(name = "cuCustNumberTxN", column = @Column(name = "CuCustNumberTx_N")),
			@AttributeOverride(name = "cuSwipeTxN", column = @Column(name = "CuSwipeTx_N")),
			@AttributeOverride(name = "cuRequiredBl", column = @Column(name = "CuRequiredBl", nullable = false)),
			@AttributeOverride(name = "cuPadimailingsBl", column = @Column(name = "CuPADIMailingsBl", nullable = false)),
			@AttributeOverride(name = "cu3rdPartyMailingsBl", column = @Column(name = "Cu3rdPartyMailingsBl", nullable = false)),
			@AttributeOverride(name = "cuScubaTribeIdN", column = @Column(name = "CuScubaTribeID_N")),
			@AttributeOverride(name = "cuScubaTribeSentDate", column = @Column(name = "CuScubaTribeSentDate", nullable = false, length = 23)),
			@AttributeOverride(name = "cuScubaTribeCodeTxN", column = @Column(name = "CuScubaTribeCodeTx_N")),
			@AttributeOverride(name = "cuPadiidN", column = @Column(name = "CuPADIID_N")),
			@AttributeOverride(name = "cuDataSourceTxN", column = @Column(name = "CuDataSourceTx_N")),
			@AttributeOverride(name = "cuInitialCatalogTxN", column = @Column(name = "CuInitialCatalogTx_N")),
			@AttributeOverride(name = "cuDbuserIdtxN", column = @Column(name = "CuDBUserIDTx_N")),
			@AttributeOverride(name = "cuDbpasswordTxN", column = @Column(name = "CuDBPasswordTx_N")) })
	public D01CuCustId getId() {
		return this.id;
	}

	public void setId(D01CuCustId id) {
		this.id = id;
	}

}
