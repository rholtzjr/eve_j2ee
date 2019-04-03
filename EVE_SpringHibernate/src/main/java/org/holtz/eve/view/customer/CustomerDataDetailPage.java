package org.holtz.eve.view.customer;

import java.sql.Timestamp;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.holtz.eve.jpa.entity.S01CuCust;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerDataDetailPage extends CustomerBasePage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory.getLogger(CustomerDataDetailPage.class);
	private Integer cuCustID;
	private String cuCustNumberTx_N;
	private String cuDataSourceTx_N;
	private String cuDBPasswordTx_N;
	private String cuDBUserIDTx_N;
	private Timestamp cuDoctorsReportDate_N;
	private Boolean cuDoctorsReportReceivedBl;
	private Boolean cuDoctorsReportRequiredBl;
	private String cuEMailTx_N;
	private String cuFaxTx_N;
	private Integer cuFirstLanguageID_N;
	private String cuFirstNameTx;
	private String cuFrequentFlyerTx_N;
	private Float cuHeightFl_N;
	private String cuImagePathTx_N;
	private String cuInitialCatalogTx_N;
	private String cuInsuranceCoTx_N;
	private Timestamp cuInsuranceDate_N;
	private String cuInsuranceNoTx_N;
	private Boolean cuIsAnonymousBl_N;
	private Boolean cuIsCustomerCompletlyRegisteredBl;
	private String cuKnownAsTx_N;
	private String cuLAddress1Tx_N;
	private String cuLAddress2Tx_N;
	private String cuLAddress3Tx_N;
	private String cuLAddress4Tx_N;
	private Timestamp cuLastActivityDate_N;
	private Timestamp cuLastDiveDate_N;
	private String cuLastNameTx;
	private Timestamp cuLastPurchaseDate;
	private Timestamp cuLastUpdatedDate;
	private String cuLPostcodeTx_N;
	private Short cuMaritalStatusID_N;
	private String cuMiddleInitialTx_N;
	private String cuNOKAddress1Tx_N;
	private String cuNOKAddress2Tx_N;
	private String cuNOKAddress3Tx_N;
	private String cuNOKAddress4Tx_N;
	private String cuNOKNameTx_N;
	private String cuNOKPostcodeTx_N;
	private String cuNOKRelationshipTx_N;
	private String cuNOKTelTx_N;
	private Short cuNoOfDivesIn_N;
	private String cuNotesTx_N;
	private String cuOccupationTx_N;
	private Integer cuPADIID_N;
	private String cuPADIKeyTx_N;
	private Boolean cuPADIMailingsBl;
	private String cuPagerTx_N;
	private String cuPassportNoTx_N;
	private String cuPasswordTx_N;
	private String cuPostcodeTx_N;
	private Boolean cuRequiredBl;
	private String cuScubaTribeCodeTx_N;
	private Integer cuScubaTribeID_N;
	private Timestamp cuScubaTribeSentDate;
	private String cuSecretAnswerTx_N;
	private String cuSecretQuestionTx_N;
	private Short cuSexID_N;
	private Float cuShoeSizeFl_N;
	private String cuSkypeNameTx_N;
	private Integer cuSourceID_N;
	private String cuSSNTx_N;
	private Integer cuStateID_N;
	private Integer cuStatusID;
	private Short cuStoreID;
	private String cuStoreNoTx_N;
	private String cuSuggestionTx_N;
	private String cuSwipeTx_N;
	private String cuTelHomeTx_N;
	private String cuTelLocalTx_N;
	private String cuTelMobileTx_N;
	private String cuTelWorkTx_N;
	private Boolean cuUnavailableBl;
	private String cuUserDefined1Tx_N;
	private String cuUserDefined2Tx_N;
	private String cuUserDefined3Tx_N;
	private String cuUserNameTx_N;
	private String cuVerifyGuid;
	private String cuWAddress1Tx_N;
	private String cuWAddress2Tx_N;
	private String cuWAddress3Tx_N;
	private String cuWAddress4Tx_N;
	private Integer cuWCountryID_N;
	private Float cuWeightFl_N;
	private String cuWPostcodeTx_N;
	private Integer cuWStateID_N;
	
	public CustomerDataDetailPage(S01CuCust custItem) {
		setOutputMarkupId(true);
        setOutputMarkupPlaceholderTag(true);
        Form<?> editForm = new Form<>("editForm");
        
        editForm.setMultiPart(true);

        if(custItem != null) { 		
        	editForm.addOrReplace(new TextField<>("cuCustID", new PropertyModel<Object>(custItem, "cuCustID")));
        	editForm.addOrReplace(new TextField<>("cuCustNumberTx_N", new PropertyModel<Object>(custItem, "cuCustNumberTx_N"))); 
			editForm.addOrReplace(new TextField<>("cuDataSourceTx_N", new PropertyModel<Object>(custItem, "cuDataSourceTx_N")));
			editForm.addOrReplace(new TextField<>("cuDBPasswordTx_N", new PropertyModel<Object>(custItem, "cuDBPasswordTx_N")));
			editForm.addOrReplace(new TextField<>("cuDBUserIDTx_N", new PropertyModel<Object>(custItem, "cuDBUserIDTx_N")));
			editForm.addOrReplace(new TextField<>("cuDoctorsReportDate_N", new PropertyModel<Object>(custItem, "cuDoctorsReportDate_N")));
			editForm.addOrReplace(new TextField<>("cuDoctorsReportReceivedBl", new PropertyModel<Object>(custItem, "cuDoctorsReportReceivedBl")));
			editForm.addOrReplace(new TextField<>("cuDoctorsReportRequiredBl", new PropertyModel<Object>(custItem, "cuDoctorsReportRequiredBl")));
			editForm.addOrReplace(new TextField<>("cuEMailTx_N", new PropertyModel<Object>(custItem, "cuEMailTx_N")));
			editForm.addOrReplace(new TextField<>("cuFaxTx_N", new PropertyModel<Object>(custItem, "cuFaxTx_N")));
			editForm.addOrReplace(new TextField<>("cuFirstLanguageID_N", new PropertyModel<Object>(custItem, "cuFirstLanguageID_N")));
			editForm.addOrReplace(new TextField<>("cuFirstNameTx", new PropertyModel<Object>(custItem, "cuFirstNameTx")));
			editForm.addOrReplace(new TextField<>("cuFrequentFlyerTx_N", new PropertyModel<Object>(custItem, "cuFrequentFlyerTx_N")));
			editForm.addOrReplace(new TextField<>("cuHeightFl_N", new PropertyModel<Object>(custItem, "cuHeightFl_N")));
			editForm.addOrReplace(new TextField<>("cuImagePathTx_N", new PropertyModel<Object>(custItem, "cuImagePathTx_N")));
			editForm.addOrReplace(new TextField<>("cuInitialCatalogTx_N", new PropertyModel<Object>(custItem, "cuInitialCatalogTx_N")));
			editForm.addOrReplace(new TextField<>("cuInsuranceCoTx_N", new PropertyModel<Object>(custItem, "cuInsuranceCoTx_N")));
			editForm.addOrReplace(new TextField<>("cuInsuranceDate_N", new PropertyModel<Object>(custItem, "cuInsuranceDate_N")));
			editForm.addOrReplace(new TextField<>("cuIsAnonymousBl_N", new PropertyModel<Object>(custItem, "cuIsAnonymousBl_N")));
			editForm.addOrReplace(new TextField<>("cuIsCustomerCompletlyRegisteredBl", new PropertyModel<Object>(custItem, "cuIsCustomerCompletlyRegisteredBl")));
			editForm.addOrReplace(new TextField<>("cuKnownAsTx_N", new PropertyModel<Object>(custItem, "cuKnownAsTx_N")));
			editForm.addOrReplace(new TextField<>("cuLAddress1Tx_N", new PropertyModel<Object>(custItem, "cuLAddress1Tx_N")));
			editForm.addOrReplace(new TextField<>("cuLAddress2Tx_N", new PropertyModel<Object>(custItem, "cuLAddress2Tx_N")));
			editForm.addOrReplace(new TextField<>("cuLAddress3Tx_N", new PropertyModel<Object>(custItem, "cuLAddress3Tx_N")));
			editForm.addOrReplace(new TextField<>("cuLAddress4Tx_N", new PropertyModel<Object>(custItem, "cuLAddress4Tx_N")));
			editForm.addOrReplace(new TextField<>("cuLastActivityDate_N", new PropertyModel<Object>(custItem, "cuLastActivityDate_N")));
			editForm.addOrReplace(new TextField<>("cuLastDiveDate_N", new PropertyModel<Object>(custItem, "cuLastDiveDate_N")));
			editForm.addOrReplace(new TextField<>("cuLastNameTx", new PropertyModel<Object>(custItem, "cuLastNameTx")));
			editForm.addOrReplace(new TextField<>("cuLastPurchaseDate", new PropertyModel<Object>(custItem, "cuLastPurchaseDate")));
			editForm.addOrReplace(new TextField<>("cuLastUpdatedDate", new PropertyModel<Object>(custItem, "cuLastUpdatedDate")));
			editForm.addOrReplace(new TextField<>("cuLPostcodeTx_N", new PropertyModel<Object>(custItem, "cuLPostcodeTx_N")));
			editForm.addOrReplace(new TextField<>("cuMaritalStatusID_N", new PropertyModel<Object>(custItem, "cuMaritalStatusID_N")));
			editForm.addOrReplace(new TextField<>("cuMiddleInitialTx_N", new PropertyModel<Object>(custItem, "cuMiddleInitialTx_N")));
			editForm.addOrReplace(new TextField<>("cuNOKAddress1Tx_N", new PropertyModel<Object>(custItem, "cuNOKAddress1Tx_N")));
			editForm.addOrReplace(new TextField<>("cuNOKAddress2Tx_N", new PropertyModel<Object>(custItem, "cuNOKAddress2Tx_N")));
			editForm.addOrReplace(new TextField<>("cuNOKAddress3Tx_N", new PropertyModel<Object>(custItem, "cuNOKAddress3Tx_N")));
			editForm.addOrReplace(new TextField<>("cuNOKAddress4Tx_N", new PropertyModel<Object>(custItem, "cuNOKAddress4Tx_N")));
			editForm.addOrReplace(new TextField<>("cuNOKNameTx_N", new PropertyModel<Object>(custItem, "cuNOKNameTx_N")));
			editForm.addOrReplace(new TextField<>("cuNOKPostcodeTx_N", new PropertyModel<Object>(custItem, "cuNOKPostcodeTx_N")));
			editForm.addOrReplace(new TextField<>("cuNOKRelationshipTx_N", new PropertyModel<Object>(custItem, "cuNOKRelationshipTx_N")));
			editForm.addOrReplace(new TextField<>("cuNOKTelTx_N", new PropertyModel<Object>(custItem, "cuNOKTelTx_N")));
			editForm.addOrReplace(new TextField<>("cuNoOfDivesIn_N", new PropertyModel<Object>(custItem, "cuNoOfDivesIn_N")));
			editForm.addOrReplace(new TextField<>("cuNotesTx_N", new PropertyModel<Object>(custItem, "cuNotesTx_N")));
			editForm.addOrReplace(new TextField<>("cuOccupationTx_N", new PropertyModel<Object>(custItem, "cuOccupationTx_N")));
			editForm.addOrReplace(new TextField<>("cuPADIID_N", new PropertyModel<Object>(custItem, "cuPADIID_N")));
			editForm.addOrReplace(new TextField<>("cuPADIKeyTx_N", new PropertyModel<Object>(custItem, "cuPADIKeyTx_N")));
			editForm.addOrReplace(new TextField<>("cuPADIMailingsBl", new PropertyModel<Object>(custItem, "cuPADIMailingsBl")));
			editForm.addOrReplace(new TextField<>("cuPagerTx_N", new PropertyModel<Object>(custItem, "cuPagerTx_N")));
			editForm.addOrReplace(new TextField<>("cuPassportNoTx_N", new PropertyModel<Object>(custItem, "cuPassportNoTx_N")));
			editForm.addOrReplace(new TextField<>("cuPasswordTx_N", new PropertyModel<Object>(custItem, "cuPasswordTx_N")));
			editForm.addOrReplace(new TextField<>("cuPostcodeTx_N", new PropertyModel<Object>(custItem, "cuPostcodeTx_N")));
			editForm.addOrReplace(new TextField<>("cuRequiredBl", new PropertyModel<Object>(custItem, "cuRequiredBl")));
			editForm.addOrReplace(new TextField<>("cuScubaTribeCodeTx_N", new PropertyModel<Object>(custItem, "cuScubaTribeCodeTx_N")));
			editForm.addOrReplace(new TextField<>("cuSecretAnswerTx_N", new PropertyModel<Object>(custItem, "cuSecretAnswerTx_N")));
			editForm.addOrReplace(new TextField<>("cuSecretQuestionTx_N", new PropertyModel<Object>(custItem, "cuSecretQuestionTx_N")));
			editForm.addOrReplace(new TextField<>("cuSexID_N", new PropertyModel<Object>(custItem, "cuSexID_N")));
			editForm.addOrReplace(new TextField<>("cuShoeSizeFl_N", new PropertyModel<Object>(custItem, "cuShoeSizeFl_N")));
			editForm.addOrReplace(new TextField<>("cuSkypeNameTx_N", new PropertyModel<Object>(custItem, "cuSkypeNameTx_N")));
			editForm.addOrReplace(new TextField<>("cuSourceID_N", new PropertyModel<Object>(custItem, "cuSourceID_N")));
			editForm.addOrReplace(new TextField<>("cuSSNTx_N", new PropertyModel<Object>(custItem, "cuSSNTx_N")));
			editForm.addOrReplace(new TextField<>("cuStateID_N", new PropertyModel<Object>(custItem, "cuStateID_N")));
			editForm.addOrReplace(new TextField<>("cuStatusID", new PropertyModel<Object>(custItem, "cuStatusID")));
			editForm.addOrReplace(new TextField<>("cuStoreID", new PropertyModel<Object>(custItem, "cuStoreID")));
			editForm.addOrReplace(new TextField<>("cuStoreNoTx_N", new PropertyModel<Object>(custItem, "cuStoreNoTx_N")));
			editForm.addOrReplace(new TextField<>("cuSuggestionTx_N", new PropertyModel<Object>(custItem, "cuSuggestionTx_N")));
			editForm.addOrReplace(new TextField<>("cuSwipeTx_N", new PropertyModel<Object>(custItem, "cuSwipeTx_N")));
			editForm.addOrReplace(new TextField<>("cuTelHomeTx_N", new PropertyModel<Object>(custItem, "cuTelHomeTx_N")));
			editForm.addOrReplace(new TextField<>("cuTelLocalTx_N", new PropertyModel<Object>(custItem, "cuTelLocalTx_N")));
			editForm.addOrReplace(new TextField<>("cuTelMobileTx_N", new PropertyModel<Object>(custItem, "cuTelMobileTx_N")));
			editForm.addOrReplace(new TextField<>("cuTelWorkTx_N", new PropertyModel<Object>(custItem, "cuTelWorkTx_N")));
			editForm.addOrReplace(new TextField<>("cuUnavailableBl", new PropertyModel<Object>(custItem, "cuUnavailableBl")));
			editForm.addOrReplace(new TextField<>("cuUserDefined1Tx_N", new PropertyModel<Object>(custItem, "cuUserDefined1Tx_N")));
			editForm.addOrReplace(new TextField<>("cuUserDefined2Tx_N", new PropertyModel<Object>(custItem, "cuUserDefined2Tx_N")));
			editForm.addOrReplace(new TextField<>("cuUserDefined3Tx_N", new PropertyModel<Object>(custItem, "cuUserDefined3Tx_N")));
			editForm.addOrReplace(new TextField<>("cuUserNameTx_N", new PropertyModel<Object>(custItem, "cuUserNameTx_N")));
			editForm.addOrReplace(new TextField<>("cuVerifyGuid", new PropertyModel<Object>(custItem, "cuVerifyGuid")));
			editForm.addOrReplace(new TextField<>("cuWAddress1Tx_N", new PropertyModel<Object>(custItem, "cuWAddress1Tx_N")));
			editForm.addOrReplace(new TextField<>("cuWAddress2Tx_N", new PropertyModel<Object>(custItem, "cuWAddress2Tx_N")));
			editForm.addOrReplace(new TextField<>("cuWAddress3Tx_N", new PropertyModel<Object>(custItem, "cuWAddress3Tx_N")));
			editForm.addOrReplace(new TextField<>("cuWAddress4Tx_N", new PropertyModel<Object>(custItem, "cuWAddress4Tx_N")));
			editForm.addOrReplace(new TextField<>("cuWCountryID_N", new PropertyModel<Object>(custItem, "cuWCountryID_N")));
			editForm.addOrReplace(new TextField<>("cuWeightFl_N", new PropertyModel<Object>(custItem, "cuWeightFl_N")));
			editForm.addOrReplace(new TextField<>("cuWPostcodeTx_N", new PropertyModel<Object>(custItem, "cuWPostcodeTx_N")));
			editForm.addOrReplace(new TextField<>("cuWStateID_N", new PropertyModel<Object>(custItem, "cuWStateID_N")));
			
	 	    
//			editForm.addOrReplace(new AjaxButton("close") {
//				public void onSubmit(AjaxRequestTarget target, String contentId) {
//					onCancel(target);
//				
//				}
//			});
//			editForm.addOrReplace(new AjaxButton("save") {
//				public void onSubmit(AjaxRequestTarget target, TZlStoreStockItem custItem) {
//					onSelect(target, custItem);
//				}
//			});
			if(log.isDebugEnabled()) {
				log.debug("CustItem found: " + custItem.toString());
			}
        }
		
	}

	public CustomerDataDetailPage(IModel<?> model) {
//		super(model);
		// TODO Auto-generated constructor stub
	}

	public CustomerDataDetailPage(PageParameters parameters) {
//		super(parameters);
		// TODO Auto-generated constructor stub
	}

	public String getCuCustNumberTx_N() {
		return cuCustNumberTx_N;
	}

	public Integer getCuCustID() {
		return cuCustID;
	}

	public void setCuCustID(Integer cuCustID) {
		this.cuCustID = cuCustID;
	}

	public void setCuCustNumberTx_N(String cuCustNumberTx_N) {
		this.cuCustNumberTx_N = cuCustNumberTx_N;
	}

	public String getCuDataSourceTx_N() {
		return cuDataSourceTx_N;
	}

	public void setCuDataSourceTx_N(String cuDataSourceTx_N) {
		this.cuDataSourceTx_N = cuDataSourceTx_N;
	}

	public String getCuDBPasswordTx_N() {
		return cuDBPasswordTx_N;
	}

	public void setCuDBPasswordTx_N(String cuDBPasswordTx_N) {
		this.cuDBPasswordTx_N = cuDBPasswordTx_N;
	}

	public String getCuDBUserIDTx_N() {
		return cuDBUserIDTx_N;
	}

	public void setCuDBUserIDTx_N(String cuDBUserIDTx_N) {
		this.cuDBUserIDTx_N = cuDBUserIDTx_N;
	}

	public Timestamp getCuDoctorsReportDate_N() {
		return cuDoctorsReportDate_N;
	}

	public void setCuDoctorsReportDate_N(Timestamp cuDoctorsReportDate_N) {
		this.cuDoctorsReportDate_N = cuDoctorsReportDate_N;
	}

	public Boolean getCuDoctorsReportReceivedBl() {
		return cuDoctorsReportReceivedBl;
	}

	public void setCuDoctorsReportReceivedBl(Boolean cuDoctorsReportReceivedBl) {
		this.cuDoctorsReportReceivedBl = cuDoctorsReportReceivedBl;
	}

	public Boolean getCuDoctorsReportRequiredBl() {
		return cuDoctorsReportRequiredBl;
	}

	public void setCuDoctorsReportRequiredBl(Boolean cuDoctorsReportRequiredBl) {
		this.cuDoctorsReportRequiredBl = cuDoctorsReportRequiredBl;
	}

	public String getCuEMailTx_N() {
		return cuEMailTx_N;
	}

	public void setCuEMailTx_N(String cuEMailTx_N) {
		this.cuEMailTx_N = cuEMailTx_N;
	}

	public String getCuFaxTx_N() {
		return cuFaxTx_N;
	}

	public void setCuFaxTx_N(String cuFaxTx_N) {
		this.cuFaxTx_N = cuFaxTx_N;
	}

	public Integer getCuFirstLanguageID_N() {
		return cuFirstLanguageID_N;
	}

	public void setCuFirstLanguageID_N(Integer cuFirstLanguageID_N) {
		this.cuFirstLanguageID_N = cuFirstLanguageID_N;
	}

	public String getCuFirstNameTx() {
		return cuFirstNameTx;
	}

	public void setCuFirstNameTx(String cuFirstNameTx) {
		this.cuFirstNameTx = cuFirstNameTx;
	}

	public String getCuFrequentFlyerTx_N() {
		return cuFrequentFlyerTx_N;
	}

	public void setCuFrequentFlyerTx_N(String cuFrequentFlyerTx_N) {
		this.cuFrequentFlyerTx_N = cuFrequentFlyerTx_N;
	}

	public Float getCuHeightFl_N() {
		return cuHeightFl_N;
	}

	public void setCuHeightFl_N(Float cuHeightFl_N) {
		this.cuHeightFl_N = cuHeightFl_N;
	}

	public String getCuImagePathTx_N() {
		return cuImagePathTx_N;
	}

	public void setCuImagePathTx_N(String cuImagePathTx_N) {
		this.cuImagePathTx_N = cuImagePathTx_N;
	}

	public String getCuInitialCatalogTx_N() {
		return cuInitialCatalogTx_N;
	}

	public void setCuInitialCatalogTx_N(String cuInitialCatalogTx_N) {
		this.cuInitialCatalogTx_N = cuInitialCatalogTx_N;
	}

	public String getCuInsuranceCoTx_N() {
		return cuInsuranceCoTx_N;
	}

	public void setCuInsuranceCoTx_N(String cuInsuranceCoTx_N) {
		this.cuInsuranceCoTx_N = cuInsuranceCoTx_N;
	}

	public Timestamp getCuInsuranceDate_N() {
		return cuInsuranceDate_N;
	}

	public void setCuInsuranceDate_N(Timestamp cuInsuranceDate_N) {
		this.cuInsuranceDate_N = cuInsuranceDate_N;
	}

	public String getCuInsuranceNoTx_N() {
		return cuInsuranceNoTx_N;
	}

	public void setCuInsuranceNoTx_N(String cuInsuranceNoTx_N) {
		this.cuInsuranceNoTx_N = cuInsuranceNoTx_N;
	}

	public Boolean getCuIsAnonymousBl_N() {
		return cuIsAnonymousBl_N;
	}

	public void setCuIsAnonymousBl_N(Boolean cuIsAnonymousBl_N) {
		this.cuIsAnonymousBl_N = cuIsAnonymousBl_N;
	}

	public Boolean getCuIsCustomerCompletlyRegisteredBl() {
		return cuIsCustomerCompletlyRegisteredBl;
	}

	public void setCuIsCustomerCompletlyRegisteredBl(Boolean cuIsCustomerCompletlyRegisteredBl) {
		this.cuIsCustomerCompletlyRegisteredBl = cuIsCustomerCompletlyRegisteredBl;
	}

	public String getCuKnownAsTx_N() {
		return cuKnownAsTx_N;
	}

	public void setCuKnownAsTx_N(String cuKnownAsTx_N) {
		this.cuKnownAsTx_N = cuKnownAsTx_N;
	}

	public String getCuLAddress1Tx_N() {
		return cuLAddress1Tx_N;
	}

	public void setCuLAddress1Tx_N(String cuLAddress1Tx_N) {
		this.cuLAddress1Tx_N = cuLAddress1Tx_N;
	}

	public String getCuLAddress2Tx_N() {
		return cuLAddress2Tx_N;
	}

	public void setCuLAddress2Tx_N(String cuLAddress2Tx_N) {
		this.cuLAddress2Tx_N = cuLAddress2Tx_N;
	}

	public String getCuLAddress3Tx_N() {
		return cuLAddress3Tx_N;
	}

	public void setCuLAddress3Tx_N(String cuLAddress3Tx_N) {
		this.cuLAddress3Tx_N = cuLAddress3Tx_N;
	}

	public String getCuLAddress4Tx_N() {
		return cuLAddress4Tx_N;
	}

	public void setCuLAddress4Tx_N(String cuLAddress4Tx_N) {
		this.cuLAddress4Tx_N = cuLAddress4Tx_N;
	}

	public Timestamp getCuLastActivityDate_N() {
		return cuLastActivityDate_N;
	}

	public void setCuLastActivityDate_N(Timestamp cuLastActivityDate_N) {
		this.cuLastActivityDate_N = cuLastActivityDate_N;
	}

	public Timestamp getCuLastDiveDate_N() {
		return cuLastDiveDate_N;
	}

	public void setCuLastDiveDate_N(Timestamp cuLastDiveDate_N) {
		this.cuLastDiveDate_N = cuLastDiveDate_N;
	}

	public String getCuLastNameTx() {
		return cuLastNameTx;
	}

	public void setCuLastNameTx(String cuLastNameTx) {
		this.cuLastNameTx = cuLastNameTx;
	}

	public Timestamp getCuLastPurchaseDate() {
		return cuLastPurchaseDate;
	}

	public void setCuLastPurchaseDate(Timestamp cuLastPurchaseDate) {
		this.cuLastPurchaseDate = cuLastPurchaseDate;
	}

	public Timestamp getCuLastUpdatedDate() {
		return cuLastUpdatedDate;
	}

	public void setCuLastUpdatedDate(Timestamp cuLastUpdatedDate) {
		this.cuLastUpdatedDate = cuLastUpdatedDate;
	}

	public String getCuLPostcodeTx_N() {
		return cuLPostcodeTx_N;
	}

	public void setCuLPostcodeTx_N(String cuLPostcodeTx_N) {
		this.cuLPostcodeTx_N = cuLPostcodeTx_N;
	}

	public Short getCuMaritalStatusID_N() {
		return cuMaritalStatusID_N;
	}

	public void setCuMaritalStatusID_N(Short cuMaritalStatusID_N) {
		this.cuMaritalStatusID_N = cuMaritalStatusID_N;
	}

	public String getCuMiddleInitialTx_N() {
		return cuMiddleInitialTx_N;
	}

	public void setCuMiddleInitialTx_N(String cuMiddleInitialTx_N) {
		this.cuMiddleInitialTx_N = cuMiddleInitialTx_N;
	}

	public String getCuNOKAddress1Tx_N() {
		return cuNOKAddress1Tx_N;
	}

	public void setCuNOKAddress1Tx_N(String cuNOKAddress1Tx_N) {
		this.cuNOKAddress1Tx_N = cuNOKAddress1Tx_N;
	}

	public String getCuNOKAddress2Tx_N() {
		return cuNOKAddress2Tx_N;
	}

	public void setCuNOKAddress2Tx_N(String cuNOKAddress2Tx_N) {
		this.cuNOKAddress2Tx_N = cuNOKAddress2Tx_N;
	}

	public String getCuNOKAddress3Tx_N() {
		return cuNOKAddress3Tx_N;
	}

	public void setCuNOKAddress3Tx_N(String cuNOKAddress3Tx_N) {
		this.cuNOKAddress3Tx_N = cuNOKAddress3Tx_N;
	}

	public String getCuNOKAddress4Tx_N() {
		return cuNOKAddress4Tx_N;
	}

	public void setCuNOKAddress4Tx_N(String cuNOKAddress4Tx_N) {
		this.cuNOKAddress4Tx_N = cuNOKAddress4Tx_N;
	}

	public String getCuNOKNameTx_N() {
		return cuNOKNameTx_N;
	}

	public void setCuNOKNameTx_N(String cuNOKNameTx_N) {
		this.cuNOKNameTx_N = cuNOKNameTx_N;
	}

	public String getCuNOKPostcodeTx_N() {
		return cuNOKPostcodeTx_N;
	}

	public void setCuNOKPostcodeTx_N(String cuNOKPostcodeTx_N) {
		this.cuNOKPostcodeTx_N = cuNOKPostcodeTx_N;
	}

	public String getCuNOKRelationshipTx_N() {
		return cuNOKRelationshipTx_N;
	}

	public void setCuNOKRelationshipTx_N(String cuNOKRelationshipTx_N) {
		this.cuNOKRelationshipTx_N = cuNOKRelationshipTx_N;
	}

	public String getCuNOKTelTx_N() {
		return cuNOKTelTx_N;
	}

	public void setCuNOKTelTx_N(String cuNOKTelTx_N) {
		this.cuNOKTelTx_N = cuNOKTelTx_N;
	}

	public Short getCuNoOfDivesIn_N() {
		return cuNoOfDivesIn_N;
	}

	public void setCuNoOfDivesIn_N(Short cuNoOfDivesIn_N) {
		this.cuNoOfDivesIn_N = cuNoOfDivesIn_N;
	}

	public String getCuNotesTx_N() {
		return cuNotesTx_N;
	}

	public void setCuNotesTx_N(String cuNotesTx_N) {
		this.cuNotesTx_N = cuNotesTx_N;
	}

	public String getCuOccupationTx_N() {
		return cuOccupationTx_N;
	}

	public void setCuOccupationTx_N(String cuOccupationTx_N) {
		this.cuOccupationTx_N = cuOccupationTx_N;
	}

	public Integer getCuPADIID_N() {
		return cuPADIID_N;
	}

	public void setCuPADIID_N(Integer cuPADIID_N) {
		this.cuPADIID_N = cuPADIID_N;
	}

	public String getCuPADIKeyTx_N() {
		return cuPADIKeyTx_N;
	}

	public void setCuPADIKeyTx_N(String cuPADIKeyTx_N) {
		this.cuPADIKeyTx_N = cuPADIKeyTx_N;
	}

	public Boolean getCuPADIMailingsBl() {
		return cuPADIMailingsBl;
	}

	public void setCuPADIMailingsBl(Boolean cuPADIMailingsBl) {
		this.cuPADIMailingsBl = cuPADIMailingsBl;
	}

	public String getCuPagerTx_N() {
		return cuPagerTx_N;
	}

	public void setCuPagerTx_N(String cuPagerTx_N) {
		this.cuPagerTx_N = cuPagerTx_N;
	}

	public String getCuPassportNoTx_N() {
		return cuPassportNoTx_N;
	}

	public void setCuPassportNoTx_N(String cuPassportNoTx_N) {
		this.cuPassportNoTx_N = cuPassportNoTx_N;
	}

	public String getCuPasswordTx_N() {
		return cuPasswordTx_N;
	}

	public void setCuPasswordTx_N(String cuPasswordTx_N) {
		this.cuPasswordTx_N = cuPasswordTx_N;
	}

	public String getCuPostcodeTx_N() {
		return cuPostcodeTx_N;
	}

	public void setCuPostcodeTx_N(String cuPostcodeTx_N) {
		this.cuPostcodeTx_N = cuPostcodeTx_N;
	}

	public Boolean getCuRequiredBl() {
		return cuRequiredBl;
	}

	public void setCuRequiredBl(Boolean cuRequiredBl) {
		this.cuRequiredBl = cuRequiredBl;
	}

	public String getCuScubaTribeCodeTx_N() {
		return cuScubaTribeCodeTx_N;
	}

	public void setCuScubaTribeCodeTx_N(String cuScubaTribeCodeTx_N) {
		this.cuScubaTribeCodeTx_N = cuScubaTribeCodeTx_N;
	}

	public Integer getCuScubaTribeID_N() {
		return cuScubaTribeID_N;
	}

	public void setCuScubaTribeID_N(Integer cuScubaTribeID_N) {
		this.cuScubaTribeID_N = cuScubaTribeID_N;
	}

	public Timestamp getCuScubaTribeSentDate() {
		return cuScubaTribeSentDate;
	}

	public void setCuScubaTribeSentDate(Timestamp cuScubaTribeSentDate) {
		this.cuScubaTribeSentDate = cuScubaTribeSentDate;
	}

	public String getCuSecretAnswerTx_N() {
		return cuSecretAnswerTx_N;
	}

	public void setCuSecretAnswerTx_N(String cuSecretAnswerTx_N) {
		this.cuSecretAnswerTx_N = cuSecretAnswerTx_N;
	}

	public String getCuSecretQuestionTx_N() {
		return cuSecretQuestionTx_N;
	}

	public void setCuSecretQuestionTx_N(String cuSecretQuestionTx_N) {
		this.cuSecretQuestionTx_N = cuSecretQuestionTx_N;
	}

	public Short getCuSexID_N() {
		return cuSexID_N;
	}

	public void setCuSexID_N(Short cuSexID_N) {
		this.cuSexID_N = cuSexID_N;
	}

	public Float getCuShoeSizeFl_N() {
		return cuShoeSizeFl_N;
	}

	public void setCuShoeSizeFl_N(Float cuShoeSizeFl_N) {
		this.cuShoeSizeFl_N = cuShoeSizeFl_N;
	}

	public String getCuSkypeNameTx_N() {
		return cuSkypeNameTx_N;
	}

	public void setCuSkypeNameTx_N(String cuSkypeNameTx_N) {
		this.cuSkypeNameTx_N = cuSkypeNameTx_N;
	}

	public Integer getCuSourceID_N() {
		return cuSourceID_N;
	}

	public void setCuSourceID_N(Integer cuSourceID_N) {
		this.cuSourceID_N = cuSourceID_N;
	}

	public String getCuSSNTx_N() {
		return cuSSNTx_N;
	}

	public void setCuSSNTx_N(String cuSSNTx_N) {
		this.cuSSNTx_N = cuSSNTx_N;
	}

	public Integer getCuStateID_N() {
		return cuStateID_N;
	}

	public void setCuStateID_N(Integer cuStateID_N) {
		this.cuStateID_N = cuStateID_N;
	}

	public Integer getCuStatusID() {
		return cuStatusID;
	}

	public void setCuStatusID(Integer cuStatusID) {
		this.cuStatusID = cuStatusID;
	}

	public Short getCuStoreID() {
		return cuStoreID;
	}

	public void setCuStoreID(Short cuStoreID) {
		this.cuStoreID = cuStoreID;
	}

	public String getCuStoreNoTx_N() {
		return cuStoreNoTx_N;
	}

	public void setCuStoreNoTx_N(String cuStoreNoTx_N) {
		this.cuStoreNoTx_N = cuStoreNoTx_N;
	}

	public String getCuSuggestionTx_N() {
		return cuSuggestionTx_N;
	}

	public void setCuSuggestionTx_N(String cuSuggestionTx_N) {
		this.cuSuggestionTx_N = cuSuggestionTx_N;
	}

	public String getCuSwipeTx_N() {
		return cuSwipeTx_N;
	}

	public void setCuSwipeTx_N(String cuSwipeTx_N) {
		this.cuSwipeTx_N = cuSwipeTx_N;
	}

	public String getCuTelHomeTx_N() {
		return cuTelHomeTx_N;
	}

	public void setCuTelHomeTx_N(String cuTelHomeTx_N) {
		this.cuTelHomeTx_N = cuTelHomeTx_N;
	}

	public String getCuTelLocalTx_N() {
		return cuTelLocalTx_N;
	}

	public void setCuTelLocalTx_N(String cuTelLocalTx_N) {
		this.cuTelLocalTx_N = cuTelLocalTx_N;
	}

	public String getCuTelMobileTx_N() {
		return cuTelMobileTx_N;
	}

	public void setCuTelMobileTx_N(String cuTelMobileTx_N) {
		this.cuTelMobileTx_N = cuTelMobileTx_N;
	}

	public String getCuTelWorkTx_N() {
		return cuTelWorkTx_N;
	}

	public void setCuTelWorkTx_N(String cuTelWorkTx_N) {
		this.cuTelWorkTx_N = cuTelWorkTx_N;
	}

	public Boolean getCuUnavailableBl() {
		return cuUnavailableBl;
	}

	public void setCuUnavailableBl(Boolean cuUnavailableBl) {
		this.cuUnavailableBl = cuUnavailableBl;
	}

	public String getCuUserDefined1Tx_N() {
		return cuUserDefined1Tx_N;
	}

	public void setCuUserDefined1Tx_N(String cuUserDefined1Tx_N) {
		this.cuUserDefined1Tx_N = cuUserDefined1Tx_N;
	}

	public String getCuUserDefined2Tx_N() {
		return cuUserDefined2Tx_N;
	}

	public void setCuUserDefined2Tx_N(String cuUserDefined2Tx_N) {
		this.cuUserDefined2Tx_N = cuUserDefined2Tx_N;
	}

	public String getCuUserDefined3Tx_N() {
		return cuUserDefined3Tx_N;
	}

	public void setCuUserDefined3Tx_N(String cuUserDefined3Tx_N) {
		this.cuUserDefined3Tx_N = cuUserDefined3Tx_N;
	}

	public String getCuUserNameTx_N() {
		return cuUserNameTx_N;
	}

	public void setCuUserNameTx_N(String cuUserNameTx_N) {
		this.cuUserNameTx_N = cuUserNameTx_N;
	}

	public String getCuVerifyGuid() {
		return cuVerifyGuid;
	}

	public void setCuVerifyGuid(String cuVerifyGuid) {
		this.cuVerifyGuid = cuVerifyGuid;
	}

	public String getCuWAddress1Tx_N() {
		return cuWAddress1Tx_N;
	}

	public void setCuWAddress1Tx_N(String cuWAddress1Tx_N) {
		this.cuWAddress1Tx_N = cuWAddress1Tx_N;
	}

	public String getCuWAddress2Tx_N() {
		return cuWAddress2Tx_N;
	}

	public void setCuWAddress2Tx_N(String cuWAddress2Tx_N) {
		this.cuWAddress2Tx_N = cuWAddress2Tx_N;
	}

	public String getCuWAddress3Tx_N() {
		return cuWAddress3Tx_N;
	}

	public void setCuWAddress3Tx_N(String cuWAddress3Tx_N) {
		this.cuWAddress3Tx_N = cuWAddress3Tx_N;
	}

	public String getCuWAddress4Tx_N() {
		return cuWAddress4Tx_N;
	}

	public void setCuWAddress4Tx_N(String cuWAddress4Tx_N) {
		this.cuWAddress4Tx_N = cuWAddress4Tx_N;
	}

	public Integer getCuWCountryID_N() {
		return cuWCountryID_N;
	}

	public void setCuWCountryID_N(Integer cuWCountryID_N) {
		this.cuWCountryID_N = cuWCountryID_N;
	}

	public Float getCuWeightFl_N() {
		return cuWeightFl_N;
	}

	public void setCuWeightFl_N(Float cuWeightFl_N) {
		this.cuWeightFl_N = cuWeightFl_N;
	}

	public String getCuWPostcodeTx_N() {
		return cuWPostcodeTx_N;
	}

	public void setCuWPostcodeTx_N(String cuWPostcodeTx_N) {
		this.cuWPostcodeTx_N = cuWPostcodeTx_N;
	}

	public Integer getCuWStateID_N() {
		return cuWStateID_N;
	}

	public void setCuWStateID_N(Integer cuWStateID_N) {
		this.cuWStateID_N = cuWStateID_N;
	}

}
