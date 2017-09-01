package org.holtz.eve.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the T_XSWO database table.
 * 
 */
@Entity
@Table(name="T_XSWO")
@NamedQuery(name="TXswo.findAll", query="SELECT t FROM TXswo t")
public class TXswo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Work_Order_Number")
	private String work_Order_Number;

	@Column(name="Amount")
	private String amount;

	@Column(name="Cost")
	private String cost;

	@Column(name="Customer_Data")
	private String customer_Data;

	@Column(name="Customer_Name")
	private Short customer_Name;

	@Column(name="Customer_Number")
	private String customer_Number;

	@Column(name="Date_Completed")
	private short date_Completed;

	@Column(name="Date_Needed")
	private String date_Needed;

	@Column(name="Date_Of_Pick_Up")
	private String date_Of_Pick_Up;

	@Column(name="Date_Picked_Up_Window")
	private String date_Picked_Up_Window;

	@Column(name="Date_Returned")
	private String date_Returned;

	@Column(name="Date_Sent")
	private String date_Sent;

	@Column(name="Default_Rush_Charge")
	private String default_Rush_Charge;

	@Column(name="Default_Shop_Sales")
	private String default_Shop_Sales;

	@Column(name="Descript_Serial")
	private String descript_Serial;

	@Column(name="Handling_Cost")
	private String handling_Cost;

	@Column(name="Instructions")
	private String instructions;

	@Column(name="Invoice_Misc_Total")
	private String invoice_Misc_Total;

	@Column(name="Invoice_Parts_Total")
	private String invoice_Parts_Total;

	@Column(name="Invoice_Picked_Up")
	private String invoice_Picked_Up;

	@Column(name="Invoice_Warranty")
	private String invoice_Warranty;

	@Column(name="Labor_Charges")
	private String labor_Charges;

	@Column(name="Labor_Description")
	private String labor_Description;

	@Column(name="Labor_Total")
	private String labor_Total;

	@Column(name="Origin_Point")
	private String origin_Point;

	@Column(name="Part_Number")
	private String part_Number;

	@Column(name="Parts_Total")
	private String parts_Total;

	@Column(name="Promised_By_Date")
	private String promised_By_Date;

	private String QToday;

	@Column(name="Quantity")
	private String quantity;

	@Column(name="Recommended_Repairs")
	private String recommended_Repairs;

	@Column(name="Repair_Part_Description")
	private String repair_Part_Description;

	private String RGA_Number;

	@Column(name="Rush_Charge")
	private String rush_Charge;

	@Column(name="Sales_Person")
	private String sales_Person;

	@Column(name="Sales_Tax")
	private String sales_Tax;

	@Column(name="Sent_To")
	private String sent_To;

	@Column(name="Serial_Numbers")
	private String serial_Numbers;

	@Column(name="Service_Technician")
	private String service_Technician;

	@Column(name="Shipping_Cost")
	private String shipping_Cost;

	@Column(name="Shop_Supplies")
	private String shop_Supplies;

	private String SN_Selected;

	@Column(name="Temp_Labor")
	private String temp_Labor;

	@Column(name="Temp_Parts")
	private String temp_Parts;

	@Column(name="Temp_Tax")
	private String temp_Tax;

	@Column(name="Temp_Total")
	private String temp_Total;

	@Column(name="Today")
	private String today;

	@Column(name="Transfer_From")
	private String transfer_From;

	@Column(name="Unit_Description")
	private String unit_Description;

	@Column(name="Unit_Price")
	private String unit_Price;

	@Column(name="Warranty")
	private String warranty;

	@Column(name="With_Parts_Total")
	private String with_Parts_Total;

	@Column(name="Without_Parts_Tax")
	private String without_Parts_Tax;

	@Column(name="Without_Parts_Total")
	private String without_Parts_Total;

	public TXswo() {
	}

	public String getWork_Order_Number() {
		return this.work_Order_Number;
	}

	public void setWork_Order_Number(String work_Order_Number) {
		this.work_Order_Number = work_Order_Number;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCost() {
		return this.cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getCustomer_Data() {
		return this.customer_Data;
	}

	public void setCustomer_Data(String customer_Data) {
		this.customer_Data = customer_Data;
	}

	public Short getCustomer_Name() {
		return this.customer_Name;
	}

	public void setCustomer_Name(Short customer_Name) {
		this.customer_Name = customer_Name;
	}

	public String getCustomer_Number() {
		return this.customer_Number;
	}

	public void setCustomer_Number(String customer_Number) {
		this.customer_Number = customer_Number;
	}

	public short getDate_Completed() {
		return this.date_Completed;
	}

	public void setDate_Completed(short date_Completed) {
		this.date_Completed = date_Completed;
	}

	public String getDate_Needed() {
		return this.date_Needed;
	}

	public void setDate_Needed(String date_Needed) {
		this.date_Needed = date_Needed;
	}

	public String getDate_Of_Pick_Up() {
		return this.date_Of_Pick_Up;
	}

	public void setDate_Of_Pick_Up(String date_Of_Pick_Up) {
		this.date_Of_Pick_Up = date_Of_Pick_Up;
	}

	public String getDate_Picked_Up_Window() {
		return this.date_Picked_Up_Window;
	}

	public void setDate_Picked_Up_Window(String date_Picked_Up_Window) {
		this.date_Picked_Up_Window = date_Picked_Up_Window;
	}

	public String getDate_Returned() {
		return this.date_Returned;
	}

	public void setDate_Returned(String date_Returned) {
		this.date_Returned = date_Returned;
	}

	public String getDate_Sent() {
		return this.date_Sent;
	}

	public void setDate_Sent(String date_Sent) {
		this.date_Sent = date_Sent;
	}

	public String getDefault_Rush_Charge() {
		return this.default_Rush_Charge;
	}

	public void setDefault_Rush_Charge(String default_Rush_Charge) {
		this.default_Rush_Charge = default_Rush_Charge;
	}

	public String getDefault_Shop_Sales() {
		return this.default_Shop_Sales;
	}

	public void setDefault_Shop_Sales(String default_Shop_Sales) {
		this.default_Shop_Sales = default_Shop_Sales;
	}

	public String getDescript_Serial() {
		return this.descript_Serial;
	}

	public void setDescript_Serial(String descript_Serial) {
		this.descript_Serial = descript_Serial;
	}

	public String getHandling_Cost() {
		return this.handling_Cost;
	}

	public void setHandling_Cost(String handling_Cost) {
		this.handling_Cost = handling_Cost;
	}

	public String getInstructions() {
		return this.instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getInvoice_Misc_Total() {
		return this.invoice_Misc_Total;
	}

	public void setInvoice_Misc_Total(String invoice_Misc_Total) {
		this.invoice_Misc_Total = invoice_Misc_Total;
	}

	public String getInvoice_Parts_Total() {
		return this.invoice_Parts_Total;
	}

	public void setInvoice_Parts_Total(String invoice_Parts_Total) {
		this.invoice_Parts_Total = invoice_Parts_Total;
	}

	public String getInvoice_Picked_Up() {
		return this.invoice_Picked_Up;
	}

	public void setInvoice_Picked_Up(String invoice_Picked_Up) {
		this.invoice_Picked_Up = invoice_Picked_Up;
	}

	public String getInvoice_Warranty() {
		return this.invoice_Warranty;
	}

	public void setInvoice_Warranty(String invoice_Warranty) {
		this.invoice_Warranty = invoice_Warranty;
	}

	public String getLabor_Charges() {
		return this.labor_Charges;
	}

	public void setLabor_Charges(String labor_Charges) {
		this.labor_Charges = labor_Charges;
	}

	public String getLabor_Description() {
		return this.labor_Description;
	}

	public void setLabor_Description(String labor_Description) {
		this.labor_Description = labor_Description;
	}

	public String getLabor_Total() {
		return this.labor_Total;
	}

	public void setLabor_Total(String labor_Total) {
		this.labor_Total = labor_Total;
	}

	public String getOrigin_Point() {
		return this.origin_Point;
	}

	public void setOrigin_Point(String origin_Point) {
		this.origin_Point = origin_Point;
	}

	public String getPart_Number() {
		return this.part_Number;
	}

	public void setPart_Number(String part_Number) {
		this.part_Number = part_Number;
	}

	public String getParts_Total() {
		return this.parts_Total;
	}

	public void setParts_Total(String parts_Total) {
		this.parts_Total = parts_Total;
	}

	public String getPromised_By_Date() {
		return this.promised_By_Date;
	}

	public void setPromised_By_Date(String promised_By_Date) {
		this.promised_By_Date = promised_By_Date;
	}

	public String getQToday() {
		return this.QToday;
	}

	public void setQToday(String QToday) {
		this.QToday = QToday;
	}

	public String getQuantity() {
		return this.quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRecommended_Repairs() {
		return this.recommended_Repairs;
	}

	public void setRecommended_Repairs(String recommended_Repairs) {
		this.recommended_Repairs = recommended_Repairs;
	}

	public String getRepair_Part_Description() {
		return this.repair_Part_Description;
	}

	public void setRepair_Part_Description(String repair_Part_Description) {
		this.repair_Part_Description = repair_Part_Description;
	}

	public String getRGA_Number() {
		return this.RGA_Number;
	}

	public void setRGA_Number(String RGA_Number) {
		this.RGA_Number = RGA_Number;
	}

	public String getRush_Charge() {
		return this.rush_Charge;
	}

	public void setRush_Charge(String rush_Charge) {
		this.rush_Charge = rush_Charge;
	}

	public String getSales_Person() {
		return this.sales_Person;
	}

	public void setSales_Person(String sales_Person) {
		this.sales_Person = sales_Person;
	}

	public String getSales_Tax() {
		return this.sales_Tax;
	}

	public void setSales_Tax(String sales_Tax) {
		this.sales_Tax = sales_Tax;
	}

	public String getSent_To() {
		return this.sent_To;
	}

	public void setSent_To(String sent_To) {
		this.sent_To = sent_To;
	}

	public String getSerial_Numbers() {
		return this.serial_Numbers;
	}

	public void setSerial_Numbers(String serial_Numbers) {
		this.serial_Numbers = serial_Numbers;
	}

	public String getService_Technician() {
		return this.service_Technician;
	}

	public void setService_Technician(String service_Technician) {
		this.service_Technician = service_Technician;
	}

	public String getShipping_Cost() {
		return this.shipping_Cost;
	}

	public void setShipping_Cost(String shipping_Cost) {
		this.shipping_Cost = shipping_Cost;
	}

	public String getShop_Supplies() {
		return this.shop_Supplies;
	}

	public void setShop_Supplies(String shop_Supplies) {
		this.shop_Supplies = shop_Supplies;
	}

	public String getSN_Selected() {
		return this.SN_Selected;
	}

	public void setSN_Selected(String SN_Selected) {
		this.SN_Selected = SN_Selected;
	}

	public String getTemp_Labor() {
		return this.temp_Labor;
	}

	public void setTemp_Labor(String temp_Labor) {
		this.temp_Labor = temp_Labor;
	}

	public String getTemp_Parts() {
		return this.temp_Parts;
	}

	public void setTemp_Parts(String temp_Parts) {
		this.temp_Parts = temp_Parts;
	}

	public String getTemp_Tax() {
		return this.temp_Tax;
	}

	public void setTemp_Tax(String temp_Tax) {
		this.temp_Tax = temp_Tax;
	}

	public String getTemp_Total() {
		return this.temp_Total;
	}

	public void setTemp_Total(String temp_Total) {
		this.temp_Total = temp_Total;
	}

	public String getToday() {
		return this.today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public String getTransfer_From() {
		return this.transfer_From;
	}

	public void setTransfer_From(String transfer_From) {
		this.transfer_From = transfer_From;
	}

	public String getUnit_Description() {
		return this.unit_Description;
	}

	public void setUnit_Description(String unit_Description) {
		this.unit_Description = unit_Description;
	}

	public String getUnit_Price() {
		return this.unit_Price;
	}

	public void setUnit_Price(String unit_Price) {
		this.unit_Price = unit_Price;
	}

	public String getWarranty() {
		return this.warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getWith_Parts_Total() {
		return this.with_Parts_Total;
	}

	public void setWith_Parts_Total(String with_Parts_Total) {
		this.with_Parts_Total = with_Parts_Total;
	}

	public String getWithout_Parts_Tax() {
		return this.without_Parts_Tax;
	}

	public void setWithout_Parts_Tax(String without_Parts_Tax) {
		this.without_Parts_Tax = without_Parts_Tax;
	}

	public String getWithout_Parts_Total() {
		return this.without_Parts_Total;
	}

	public void setWithout_Parts_Total(String without_Parts_Total) {
		this.without_Parts_Total = without_Parts_Total;
	}

}