package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TXswo generated by hbm2java
 */
@Entity
@Table(name = "T_XSWO")
public class TXswo implements java.io.Serializable {

	private String workOrderNumber;
	private String withPartsTotal;
	private String withoutPartsTotal;
	private String withoutPartsTax;
	private String warranty;
	private String unitPrice;
	private String unitDescription;
	private String transferFrom;
	private String today;
	private String tempTotal;
	private String tempTax;
	private String tempParts;
	private String tempLabor;
	private String snSelected;
	private String shopSupplies;
	private String shippingCost;
	private String serviceTechnician;
	private String serialNumbers;
	private String sentTo;
	private String salesTax;
	private String salesPerson;
	private String rushCharge;
	private String rgaNumber;
	private String repairPartDescription;
	private String recommendedRepairs;
	private String quantity;
	private String qtoday;
	private String promisedByDate;
	private String partNumber;
	private String partsTotal;
	private String originPoint;
	private String laborTotal;
	private String laborDescription;
	private String laborCharges;
	private String invoiceWarranty;
	private String invoicePickedUp;
	private String invoicePartsTotal;
	private String invoiceMiscTotal;
	private String instructions;
	private String handlingCost;
	private String descriptSerial;
	private String defaultShopSales;
	private String defaultRushCharge;
	private String dateSent;
	private String dateReturned;
	private String datePickedUpWindow;
	private String dateOfPickUp;
	private String dateNeeded;
	private String dateCompleted;
	private String customerNumber;
	private String customerName;
	private String customerData;
	private String cost;
	private String amount;

	public TXswo() {
	}

	public TXswo(String workOrderNumber) {
		this.workOrderNumber = workOrderNumber;
	}

	public TXswo(String workOrderNumber, String withPartsTotal, String withoutPartsTotal,
			String withoutPartsTax, String warranty, String unitPrice, String unitDescription,
			String transferFrom, String today, String tempTotal, String tempTax,
			String tempParts, String tempLabor, String snSelected, String shopSupplies,
			String shippingCost, String serviceTechnician, String serialNumbers, String sentTo,
			String salesTax, String salesPerson, String rushCharge, String rgaNumber,
			String repairPartDescription, String recommendedRepairs, String quantity,
			String qtoday, String promisedByDate, String partNumber, String partsTotal,
			String originPoint, String laborTotal, String laborDescription, String laborCharges,
			String invoiceWarranty, String invoicePickedUp, String invoicePartsTotal,
			String invoiceMiscTotal, String instructions, String handlingCost,
			String descriptSerial, String defaultShopSales, String defaultRushCharge,
			String dateSent, String dateReturned, String datePickedUpWindow,
			String dateOfPickUp, String dateNeeded, String dateCompleted, String customerNumber,
			String customerName, String customerData, String cost, String amount) {
		this.workOrderNumber = workOrderNumber;
		this.withPartsTotal = withPartsTotal;
		this.withoutPartsTotal = withoutPartsTotal;
		this.withoutPartsTax = withoutPartsTax;
		this.warranty = warranty;
		this.unitPrice = unitPrice;
		this.unitDescription = unitDescription;
		this.transferFrom = transferFrom;
		this.today = today;
		this.tempTotal = tempTotal;
		this.tempTax = tempTax;
		this.tempParts = tempParts;
		this.tempLabor = tempLabor;
		this.snSelected = snSelected;
		this.shopSupplies = shopSupplies;
		this.shippingCost = shippingCost;
		this.serviceTechnician = serviceTechnician;
		this.serialNumbers = serialNumbers;
		this.sentTo = sentTo;
		this.salesTax = salesTax;
		this.salesPerson = salesPerson;
		this.rushCharge = rushCharge;
		this.rgaNumber = rgaNumber;
		this.repairPartDescription = repairPartDescription;
		this.recommendedRepairs = recommendedRepairs;
		this.quantity = quantity;
		this.qtoday = qtoday;
		this.promisedByDate = promisedByDate;
		this.partNumber = partNumber;
		this.partsTotal = partsTotal;
		this.originPoint = originPoint;
		this.laborTotal = laborTotal;
		this.laborDescription = laborDescription;
		this.laborCharges = laborCharges;
		this.invoiceWarranty = invoiceWarranty;
		this.invoicePickedUp = invoicePickedUp;
		this.invoicePartsTotal = invoicePartsTotal;
		this.invoiceMiscTotal = invoiceMiscTotal;
		this.instructions = instructions;
		this.handlingCost = handlingCost;
		this.descriptSerial = descriptSerial;
		this.defaultShopSales = defaultShopSales;
		this.defaultRushCharge = defaultRushCharge;
		this.dateSent = dateSent;
		this.dateReturned = dateReturned;
		this.datePickedUpWindow = datePickedUpWindow;
		this.dateOfPickUp = dateOfPickUp;
		this.dateNeeded = dateNeeded;
		this.dateCompleted = dateCompleted;
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerData = customerData;
		this.cost = cost;
		this.amount = amount;
	}

	@Id

	@Column(name = "Work_Order_Number", unique = true, nullable = false)
	public String getWorkOrderNumber() {
		return this.workOrderNumber;
	}

	public void setWorkOrderNumber(String workOrderNumber) {
		this.workOrderNumber = workOrderNumber;
	}

	@Column(name = "With_Parts_Total")
	public String getWithPartsTotal() {
		return this.withPartsTotal;
	}

	public void setWithPartsTotal(String withPartsTotal) {
		this.withPartsTotal = withPartsTotal;
	}

	@Column(name = "Without_Parts_Total")
	public String getWithoutPartsTotal() {
		return this.withoutPartsTotal;
	}

	public void setWithoutPartsTotal(String withoutPartsTotal) {
		this.withoutPartsTotal = withoutPartsTotal;
	}

	@Column(name = "Without_Parts_Tax")
	public String getWithoutPartsTax() {
		return this.withoutPartsTax;
	}

	public void setWithoutPartsTax(String withoutPartsTax) {
		this.withoutPartsTax = withoutPartsTax;
	}

	@Column(name = "Warranty")
	public String getWarranty() {
		return this.warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	@Column(name = "Unit_Price")
	public String getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Column(name = "Unit_Description")
	public String getUnitDescription() {
		return this.unitDescription;
	}

	public void setUnitDescription(String unitDescription) {
		this.unitDescription = unitDescription;
	}

	@Column(name = "Transfer_From")
	public String getTransferFrom() {
		return this.transferFrom;
	}

	public void setTransferFrom(String transferFrom) {
		this.transferFrom = transferFrom;
	}

	@Column(name = "Today")
	public String getToday() {
		return this.today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	@Column(name = "Temp_Total")
	public String getTempTotal() {
		return this.tempTotal;
	}

	public void setTempTotal(String tempTotal) {
		this.tempTotal = tempTotal;
	}

	@Column(name = "Temp_Tax")
	public String getTempTax() {
		return this.tempTax;
	}

	public void setTempTax(String tempTax) {
		this.tempTax = tempTax;
	}

	@Column(name = "Temp_Parts")
	public String getTempParts() {
		return this.tempParts;
	}

	public void setTempParts(String tempParts) {
		this.tempParts = tempParts;
	}

	@Column(name = "Temp_Labor")
	public String getTempLabor() {
		return this.tempLabor;
	}

	public void setTempLabor(String tempLabor) {
		this.tempLabor = tempLabor;
	}

	@Column(name = "SN_Selected")
	public String getSnSelected() {
		return this.snSelected;
	}

	public void setSnSelected(String snSelected) {
		this.snSelected = snSelected;
	}

	@Column(name = "Shop_Supplies")
	public String getShopSupplies() {
		return this.shopSupplies;
	}

	public void setShopSupplies(String shopSupplies) {
		this.shopSupplies = shopSupplies;
	}

	@Column(name = "Shipping_Cost")
	public String getShippingCost() {
		return this.shippingCost;
	}

	public void setShippingCost(String shippingCost) {
		this.shippingCost = shippingCost;
	}

	@Column(name = "Service_Technician")
	public String getServiceTechnician() {
		return this.serviceTechnician;
	}

	public void setServiceTechnician(String serviceTechnician) {
		this.serviceTechnician = serviceTechnician;
	}

	@Column(name = "Serial_Numbers")
	public String getSerialNumbers() {
		return this.serialNumbers;
	}

	public void setSerialNumbers(String serialNumbers) {
		this.serialNumbers = serialNumbers;
	}

	@Column(name = "Sent_To")
	public String getSentTo() {
		return this.sentTo;
	}

	public void setSentTo(String sentTo) {
		this.sentTo = sentTo;
	}

	@Column(name = "Sales_Tax")
	public String getSalesTax() {
		return this.salesTax;
	}

	public void setSalesTax(String salesTax) {
		this.salesTax = salesTax;
	}

	@Column(name = "Sales_Person")
	public String getSalesPerson() {
		return this.salesPerson;
	}

	public void setSalesPerson(String salesPerson) {
		this.salesPerson = salesPerson;
	}

	@Column(name = "Rush_Charge")
	public String getRushCharge() {
		return this.rushCharge;
	}

	public void setRushCharge(String rushCharge) {
		this.rushCharge = rushCharge;
	}

	@Column(name = "RGA_Number")
	public String getRgaNumber() {
		return this.rgaNumber;
	}

	public void setRgaNumber(String rgaNumber) {
		this.rgaNumber = rgaNumber;
	}

	@Column(name = "Repair_Part_Description")
	public String getRepairPartDescription() {
		return this.repairPartDescription;
	}

	public void setRepairPartDescription(String repairPartDescription) {
		this.repairPartDescription = repairPartDescription;
	}

	@Column(name = "Recommended_Repairs")
	public String getRecommendedRepairs() {
		return this.recommendedRepairs;
	}

	public void setRecommendedRepairs(String recommendedRepairs) {
		this.recommendedRepairs = recommendedRepairs;
	}

	@Column(name = "Quantity")
	public String getQuantity() {
		return this.quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Column(name = "QToday")
	public String getQtoday() {
		return this.qtoday;
	}

	public void setQtoday(String qtoday) {
		this.qtoday = qtoday;
	}

	@Column(name = "Promised_By_Date")
	public String getPromisedByDate() {
		return this.promisedByDate;
	}

	public void setPromisedByDate(String promisedByDate) {
		this.promisedByDate = promisedByDate;
	}

	@Column(name = "Part_Number")
	public String getPartNumber() {
		return this.partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	@Column(name = "Parts_Total")
	public String getPartsTotal() {
		return this.partsTotal;
	}

	public void setPartsTotal(String partsTotal) {
		this.partsTotal = partsTotal;
	}

	@Column(name = "Origin_Point")
	public String getOriginPoint() {
		return this.originPoint;
	}

	public void setOriginPoint(String originPoint) {
		this.originPoint = originPoint;
	}

	@Column(name = "Labor_Total")
	public String getLaborTotal() {
		return this.laborTotal;
	}

	public void setLaborTotal(String laborTotal) {
		this.laborTotal = laborTotal;
	}

	@Column(name = "Labor_Description")
	public String getLaborDescription() {
		return this.laborDescription;
	}

	public void setLaborDescription(String laborDescription) {
		this.laborDescription = laborDescription;
	}

	@Column(name = "Labor_Charges")
	public String getLaborCharges() {
		return this.laborCharges;
	}

	public void setLaborCharges(String laborCharges) {
		this.laborCharges = laborCharges;
	}

	@Column(name = "Invoice_Warranty")
	public String getInvoiceWarranty() {
		return this.invoiceWarranty;
	}

	public void setInvoiceWarranty(String invoiceWarranty) {
		this.invoiceWarranty = invoiceWarranty;
	}

	@Column(name = "Invoice_Picked_Up")
	public String getInvoicePickedUp() {
		return this.invoicePickedUp;
	}

	public void setInvoicePickedUp(String invoicePickedUp) {
		this.invoicePickedUp = invoicePickedUp;
	}

	@Column(name = "Invoice_Parts_Total")
	public String getInvoicePartsTotal() {
		return this.invoicePartsTotal;
	}

	public void setInvoicePartsTotal(String invoicePartsTotal) {
		this.invoicePartsTotal = invoicePartsTotal;
	}

	@Column(name = "Invoice_Misc_Total")
	public String getInvoiceMiscTotal() {
		return this.invoiceMiscTotal;
	}

	public void setInvoiceMiscTotal(String invoiceMiscTotal) {
		this.invoiceMiscTotal = invoiceMiscTotal;
	}

	@Column(name = "Instructions")
	public String getInstructions() {
		return this.instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	@Column(name = "Handling_Cost")
	public String getHandlingCost() {
		return this.handlingCost;
	}

	public void setHandlingCost(String handlingCost) {
		this.handlingCost = handlingCost;
	}

	@Column(name = "Descript_Serial")
	public String getDescriptSerial() {
		return this.descriptSerial;
	}

	public void setDescriptSerial(String descriptSerial) {
		this.descriptSerial = descriptSerial;
	}

	@Column(name = "Default_Shop_Sales")
	public String getDefaultShopSales() {
		return this.defaultShopSales;
	}

	public void setDefaultShopSales(String defaultShopSales) {
		this.defaultShopSales = defaultShopSales;
	}

	@Column(name = "Default_Rush_Charge")
	public String getDefaultRushCharge() {
		return this.defaultRushCharge;
	}

	public void setDefaultRushCharge(String defaultRushCharge) {
		this.defaultRushCharge = defaultRushCharge;
	}

	@Column(name = "Date_Sent")
	public String getDateSent() {
		return this.dateSent;
	}

	public void setDateSent(String dateSent) {
		this.dateSent = dateSent;
	}

	@Column(name = "Date_Returned")
	public String getDateReturned() {
		return this.dateReturned;
	}

	public void setDateReturned(String dateReturned) {
		this.dateReturned = dateReturned;
	}

	@Column(name = "Date_Picked_Up_Window")
	public String getDatePickedUpWindow() {
		return this.datePickedUpWindow;
	}

	public void setDatePickedUpWindow(String datePickedUpWindow) {
		this.datePickedUpWindow = datePickedUpWindow;
	}

	@Column(name = "Date_Of_Pick_Up")
	public String getDateOfPickUp() {
		return this.dateOfPickUp;
	}

	public void setDateOfPickUp(String dateOfPickUp) {
		this.dateOfPickUp = dateOfPickUp;
	}

	@Column(name = "Date_Needed")
	public String getDateNeeded() {
		return this.dateNeeded;
	}

	public void setDateNeeded(String dateNeeded) {
		this.dateNeeded = dateNeeded;
	}

	@Column(name = "Date_Completed")
	public String getDateCompleted() {
		return this.dateCompleted;
	}

	public void setDateCompleted(String dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	@Column(name = "Customer_Number")
	public String getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Column(name = "Customer_Name")
	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Column(name = "Customer_Data")
	public String getCustomerData() {
		return this.customerData;
	}

	public void setCustomerData(String customerData) {
		this.customerData = customerData;
	}

	@Column(name = "Cost")
	public String getCost() {
		return this.cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Column(name = "Amount")
	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
