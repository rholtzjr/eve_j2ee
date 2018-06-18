package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EmailAgentServiceItemsId generated by hbm2java
 */
@Embeddable
public class EmailAgentServiceItemsId implements java.io.Serializable {

	private String firstName;
	private String lastName;
	private String email;
	private int custId;
	private int equipmentId;
	private String stockType;
	private String manufacturer;
	private String serialNo;
	private String refNo;
	private String description;
	private String barcodeNo;
	private Date purchasedDate;
	private Date nextServiceDate;
	private Date equipmentCreationDate;
	private String size;
	private String secondaryColor;
	private String primaryColor;
	private Date actualStartDate;
	private Date actualEndDate;
	private Date pickedUpDate;
	private Integer technicianId;
	private String instructionsFault;
	private String actionTaken;
	private String pressureBefore;
	private String pressureAfter;
	private double estimateAmount;
	private double partsAmount;
	private double partsTaxAmount;
	private double laborAmount;
	private double laborTaxAmount;
	private double handlingAmount;
	private double handlingTaxAmount;
	private String sentForRepairTo;
	private Date sentDate;
	private Date dueBackDate;
	private Date actuallyBackDate;
	private String rmano;
	private Date serviceItemCreationDate;
	private String knownAs;
	private Date birthDate;
	private String homeAddress1;
	private String homeAddress2;
	private String homeAddress3;
	private String homeAddress4;
	private String homeState;
	private String homePostcode;
	private String homeCountry;
	private String telHome;
	private String telWork;
	private String telMobile;
	private Integer firstLanguageId;
	private Integer stateId;
	private Integer countryId;
	private int stockTypeId;
	private Integer manufacturerId;
	private Integer sizeId;
	private Integer primaryColorId;
	private Integer secondaryColorId;

	public EmailAgentServiceItemsId() {
	}

	public EmailAgentServiceItemsId(String firstName, String lastName, int custId, int equipmentId,
			String stockType, Date equipmentCreationDate, double estimateAmount, double partsAmount,
			double partsTaxAmount, double laborAmount, double laborTaxAmount, double handlingAmount,
			double handlingTaxAmount, Date serviceItemCreationDate, int stockTypeId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.custId = custId;
		this.equipmentId = equipmentId;
		this.stockType = stockType;
		this.equipmentCreationDate = equipmentCreationDate;
		this.estimateAmount = estimateAmount;
		this.partsAmount = partsAmount;
		this.partsTaxAmount = partsTaxAmount;
		this.laborAmount = laborAmount;
		this.laborTaxAmount = laborTaxAmount;
		this.handlingAmount = handlingAmount;
		this.handlingTaxAmount = handlingTaxAmount;
		this.serviceItemCreationDate = serviceItemCreationDate;
		this.stockTypeId = stockTypeId;
	}

	public EmailAgentServiceItemsId(String firstName, String lastName, String email, int custId,
			int equipmentId, String stockType, String manufacturer, String serialNo,
			String refNo, String description, String barcodeNo, Date purchasedDate,
			Date nextServiceDate, Date equipmentCreationDate, String size, String secondaryColor,
			String primaryColor, Date actualStartDate, Date actualEndDate, Date pickedUpDate,
			Integer technicianId, String instructionsFault, String actionTaken, String pressureBefore,
			String pressureAfter, double estimateAmount, double partsAmount, double partsTaxAmount,
			double laborAmount, double laborTaxAmount, double handlingAmount, double handlingTaxAmount,
			String sentForRepairTo, Date sentDate, Date dueBackDate, Date actuallyBackDate, String rmano,
			Date serviceItemCreationDate, String knownAs, Date birthDate, String homeAddress1,
			String homeAddress2, String homeAddress3, String homeAddress4, String homeState,
			String homePostcode, String homeCountry, String telHome, String telWork,
			String telMobile, Integer firstLanguageId, Integer stateId, Integer countryId, int stockTypeId,
			Integer manufacturerId, Integer sizeId, Integer primaryColorId, Integer secondaryColorId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.custId = custId;
		this.equipmentId = equipmentId;
		this.stockType = stockType;
		this.manufacturer = manufacturer;
		this.serialNo = serialNo;
		this.refNo = refNo;
		this.description = description;
		this.barcodeNo = barcodeNo;
		this.purchasedDate = purchasedDate;
		this.nextServiceDate = nextServiceDate;
		this.equipmentCreationDate = equipmentCreationDate;
		this.size = size;
		this.secondaryColor = secondaryColor;
		this.primaryColor = primaryColor;
		this.actualStartDate = actualStartDate;
		this.actualEndDate = actualEndDate;
		this.pickedUpDate = pickedUpDate;
		this.technicianId = technicianId;
		this.instructionsFault = instructionsFault;
		this.actionTaken = actionTaken;
		this.pressureBefore = pressureBefore;
		this.pressureAfter = pressureAfter;
		this.estimateAmount = estimateAmount;
		this.partsAmount = partsAmount;
		this.partsTaxAmount = partsTaxAmount;
		this.laborAmount = laborAmount;
		this.laborTaxAmount = laborTaxAmount;
		this.handlingAmount = handlingAmount;
		this.handlingTaxAmount = handlingTaxAmount;
		this.sentForRepairTo = sentForRepairTo;
		this.sentDate = sentDate;
		this.dueBackDate = dueBackDate;
		this.actuallyBackDate = actuallyBackDate;
		this.rmano = rmano;
		this.serviceItemCreationDate = serviceItemCreationDate;
		this.knownAs = knownAs;
		this.birthDate = birthDate;
		this.homeAddress1 = homeAddress1;
		this.homeAddress2 = homeAddress2;
		this.homeAddress3 = homeAddress3;
		this.homeAddress4 = homeAddress4;
		this.homeState = homeState;
		this.homePostcode = homePostcode;
		this.homeCountry = homeCountry;
		this.telHome = telHome;
		this.telWork = telWork;
		this.telMobile = telMobile;
		this.firstLanguageId = firstLanguageId;
		this.stateId = stateId;
		this.countryId = countryId;
		this.stockTypeId = stockTypeId;
		this.manufacturerId = manufacturerId;
		this.sizeId = sizeId;
		this.primaryColorId = primaryColorId;
		this.secondaryColorId = secondaryColorId;
	}

	@Column(name = "FirstName", nullable = false)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LastName", nullable = false)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "EMail")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "CustID", nullable = false)
	public int getCustId() {
		return this.custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	@Column(name = "EquipmentID", nullable = false)
	public int getEquipmentId() {
		return this.equipmentId;
	}

	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}

	@Column(name = "StockType", nullable = false)
	public String getStockType() {
		return this.stockType;
	}

	public void setStockType(String stockType) {
		this.stockType = stockType;
	}

	@Column(name = "Manufacturer")
	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Column(name = "SerialNo")
	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@Column(name = "RefNo")
	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	@Column(name = "Description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "BarcodeNo")
	public String getBarcodeNo() {
		return this.barcodeNo;
	}

	public void setBarcodeNo(String barcodeNo) {
		this.barcodeNo = barcodeNo;
	}

	@Column(name = "PurchasedDate", length = 23)
	public Date getPurchasedDate() {
		return this.purchasedDate;
	}

	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}

	@Column(name = "NextServiceDate", length = 23)
	public Date getNextServiceDate() {
		return this.nextServiceDate;
	}

	public void setNextServiceDate(Date nextServiceDate) {
		this.nextServiceDate = nextServiceDate;
	}

	@Column(name = "EquipmentCreationDate", nullable = false, length = 23)
	public Date getEquipmentCreationDate() {
		return this.equipmentCreationDate;
	}

	public void setEquipmentCreationDate(Date equipmentCreationDate) {
		this.equipmentCreationDate = equipmentCreationDate;
	}

	@Column(name = "Size")
	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "SecondaryColor")
	public String getSecondaryColor() {
		return this.secondaryColor;
	}

	public void setSecondaryColor(String secondaryColor) {
		this.secondaryColor = secondaryColor;
	}

	@Column(name = "PrimaryColor")
	public String getPrimaryColor() {
		return this.primaryColor;
	}

	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}

	@Column(name = "ActualStartDate", length = 23)
	public Date getActualStartDate() {
		return this.actualStartDate;
	}

	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	@Column(name = "ActualEndDate", length = 23)
	public Date getActualEndDate() {
		return this.actualEndDate;
	}

	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	@Column(name = "PickedUpDate", length = 23)
	public Date getPickedUpDate() {
		return this.pickedUpDate;
	}

	public void setPickedUpDate(Date pickedUpDate) {
		this.pickedUpDate = pickedUpDate;
	}

	@Column(name = "TechnicianID")
	public Integer getTechnicianId() {
		return this.technicianId;
	}

	public void setTechnicianId(Integer technicianId) {
		this.technicianId = technicianId;
	}

	@Column(name = "Instructions_Fault")
	public String getInstructionsFault() {
		return this.instructionsFault;
	}

	public void setInstructionsFault(String instructionsFault) {
		this.instructionsFault = instructionsFault;
	}

	@Column(name = "ActionTaken")
	public String getActionTaken() {
		return this.actionTaken;
	}

	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}

	@Column(name = "PressureBefore")
	public String getPressureBefore() {
		return this.pressureBefore;
	}

	public void setPressureBefore(String pressureBefore) {
		this.pressureBefore = pressureBefore;
	}

	@Column(name = "PressureAfter")
	public String getPressureAfter() {
		return this.pressureAfter;
	}

	public void setPressureAfter(String pressureAfter) {
		this.pressureAfter = pressureAfter;
	}

	@Column(name = "EstimateAmount", nullable = false, precision = 53, scale = 0)
	public double getEstimateAmount() {
		return this.estimateAmount;
	}

	public void setEstimateAmount(double estimateAmount) {
		this.estimateAmount = estimateAmount;
	}

	@Column(name = "PartsAmount", nullable = false, precision = 53, scale = 0)
	public double getPartsAmount() {
		return this.partsAmount;
	}

	public void setPartsAmount(double partsAmount) {
		this.partsAmount = partsAmount;
	}

	@Column(name = "PartsTaxAmount", nullable = false, precision = 53, scale = 0)
	public double getPartsTaxAmount() {
		return this.partsTaxAmount;
	}

	public void setPartsTaxAmount(double partsTaxAmount) {
		this.partsTaxAmount = partsTaxAmount;
	}

	@Column(name = "LaborAmount", nullable = false, precision = 53, scale = 0)
	public double getLaborAmount() {
		return this.laborAmount;
	}

	public void setLaborAmount(double laborAmount) {
		this.laborAmount = laborAmount;
	}

	@Column(name = "LaborTaxAmount", nullable = false, precision = 53, scale = 0)
	public double getLaborTaxAmount() {
		return this.laborTaxAmount;
	}

	public void setLaborTaxAmount(double laborTaxAmount) {
		this.laborTaxAmount = laborTaxAmount;
	}

	@Column(name = "HandlingAmount", nullable = false, precision = 53, scale = 0)
	public double getHandlingAmount() {
		return this.handlingAmount;
	}

	public void setHandlingAmount(double handlingAmount) {
		this.handlingAmount = handlingAmount;
	}

	@Column(name = "HandlingTaxAmount", nullable = false, precision = 53, scale = 0)
	public double getHandlingTaxAmount() {
		return this.handlingTaxAmount;
	}

	public void setHandlingTaxAmount(double handlingTaxAmount) {
		this.handlingTaxAmount = handlingTaxAmount;
	}

	@Column(name = "SentForRepairTo")
	public String getSentForRepairTo() {
		return this.sentForRepairTo;
	}

	public void setSentForRepairTo(String sentForRepairTo) {
		this.sentForRepairTo = sentForRepairTo;
	}

	@Column(name = "SentDate", length = 23)
	public Date getSentDate() {
		return this.sentDate;
	}

	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}

	@Column(name = "DueBackDate", length = 23)
	public Date getDueBackDate() {
		return this.dueBackDate;
	}

	public void setDueBackDate(Date dueBackDate) {
		this.dueBackDate = dueBackDate;
	}

	@Column(name = "ActuallyBackDate", length = 23)
	public Date getActuallyBackDate() {
		return this.actuallyBackDate;
	}

	public void setActuallyBackDate(Date actuallyBackDate) {
		this.actuallyBackDate = actuallyBackDate;
	}

	@Column(name = "RMANo")
	public String getRmano() {
		return this.rmano;
	}

	public void setRmano(String rmano) {
		this.rmano = rmano;
	}

	@Column(name = "ServiceItemCreationDate", nullable = false, length = 23)
	public Date getServiceItemCreationDate() {
		return this.serviceItemCreationDate;
	}

	public void setServiceItemCreationDate(Date serviceItemCreationDate) {
		this.serviceItemCreationDate = serviceItemCreationDate;
	}

	@Column(name = "KnownAs")
	public String getKnownAs() {
		return this.knownAs;
	}

	public void setKnownAs(String knownAs) {
		this.knownAs = knownAs;
	}

	@Column(name = "BirthDate", length = 23)
	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Column(name = "HomeAddress1")
	public String getHomeAddress1() {
		return this.homeAddress1;
	}

	public void setHomeAddress1(String homeAddress1) {
		this.homeAddress1 = homeAddress1;
	}

	@Column(name = "HomeAddress2")
	public String getHomeAddress2() {
		return this.homeAddress2;
	}

	public void setHomeAddress2(String homeAddress2) {
		this.homeAddress2 = homeAddress2;
	}

	@Column(name = "HomeAddress3")
	public String getHomeAddress3() {
		return this.homeAddress3;
	}

	public void setHomeAddress3(String homeAddress3) {
		this.homeAddress3 = homeAddress3;
	}

	@Column(name = "HomeAddress4")
	public String getHomeAddress4() {
		return this.homeAddress4;
	}

	public void setHomeAddress4(String homeAddress4) {
		this.homeAddress4 = homeAddress4;
	}

	@Column(name = "HomeState")
	public String getHomeState() {
		return this.homeState;
	}

	public void setHomeState(String homeState) {
		this.homeState = homeState;
	}

	@Column(name = "HomePostcode")
	public String getHomePostcode() {
		return this.homePostcode;
	}

	public void setHomePostcode(String homePostcode) {
		this.homePostcode = homePostcode;
	}

	@Column(name = "HomeCountry")
	public String getHomeCountry() {
		return this.homeCountry;
	}

	public void setHomeCountry(String homeCountry) {
		this.homeCountry = homeCountry;
	}

	@Column(name = "TelHome")
	public String getTelHome() {
		return this.telHome;
	}

	public void setTelHome(String telHome) {
		this.telHome = telHome;
	}

	@Column(name = "TelWork")
	public String getTelWork() {
		return this.telWork;
	}

	public void setTelWork(String telWork) {
		this.telWork = telWork;
	}

	@Column(name = "TelMobile")
	public String getTelMobile() {
		return this.telMobile;
	}

	public void setTelMobile(String telMobile) {
		this.telMobile = telMobile;
	}

	@Column(name = "FirstLanguageID")
	public Integer getFirstLanguageId() {
		return this.firstLanguageId;
	}

	public void setFirstLanguageId(Integer firstLanguageId) {
		this.firstLanguageId = firstLanguageId;
	}

	@Column(name = "StateID")
	public Integer getStateId() {
		return this.stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	@Column(name = "CountryID")
	public Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	@Column(name = "StockTypeID", nullable = false)
	public int getStockTypeId() {
		return this.stockTypeId;
	}

	public void setStockTypeId(int stockTypeId) {
		this.stockTypeId = stockTypeId;
	}

	@Column(name = "ManufacturerID")
	public Integer getManufacturerId() {
		return this.manufacturerId;
	}

	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	@Column(name = "SizeID")
	public Integer getSizeId() {
		return this.sizeId;
	}

	public void setSizeId(Integer sizeId) {
		this.sizeId = sizeId;
	}

	@Column(name = "PrimaryColorID")
	public Integer getPrimaryColorId() {
		return this.primaryColorId;
	}

	public void setPrimaryColorId(Integer primaryColorId) {
		this.primaryColorId = primaryColorId;
	}

	@Column(name = "SecondaryColorID")
	public Integer getSecondaryColorId() {
		return this.secondaryColorId;
	}

	public void setSecondaryColorId(Integer secondaryColorId) {
		this.secondaryColorId = secondaryColorId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EmailAgentServiceItemsId))
			return false;
		EmailAgentServiceItemsId castOther = (EmailAgentServiceItemsId) other;

		return ((this.getFirstName() == castOther.getFirstName()) || (this.getFirstName() != null
				&& castOther.getFirstName() != null && this.getFirstName().equals(castOther.getFirstName())))
				&& ((this.getLastName() == castOther.getLastName()) || (this.getLastName() != null
						&& castOther.getLastName() != null && this.getLastName().equals(castOther.getLastName())))
				&& ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null
						&& castOther.getEmail() != null && this.getEmail().equals(castOther.getEmail())))
				&& (this.getCustId() == castOther.getCustId()) && (this.getEquipmentId() == castOther.getEquipmentId())
				&& ((this.getStockType() == castOther.getStockType()) || (this.getStockType() != null
						&& castOther.getStockType() != null && this.getStockType().equals(castOther.getStockType())))
				&& ((this.getManufacturer() == castOther.getManufacturer())
						|| (this.getManufacturer() != null && castOther.getManufacturer() != null
								&& this.getManufacturer().equals(castOther.getManufacturer())))
				&& ((this.getSerialNo() == castOther.getSerialNo()) || (this.getSerialNo() != null
						&& castOther.getSerialNo() != null && this.getSerialNo().equals(castOther.getSerialNo())))
				&& ((this.getRefNo() == castOther.getRefNo()) || (this.getRefNo() != null
						&& castOther.getRefNo() != null && this.getRefNo().equals(castOther.getRefNo())))
				&& ((this.getDescription() == castOther.getDescription())
						|| (this.getDescription() != null && castOther.getDescription() != null
								&& this.getDescription().equals(castOther.getDescription())))
				&& ((this.getBarcodeNo() == castOther.getBarcodeNo()) || (this.getBarcodeNo() != null
						&& castOther.getBarcodeNo() != null && this.getBarcodeNo().equals(castOther.getBarcodeNo())))
				&& ((this.getPurchasedDate() == castOther.getPurchasedDate())
						|| (this.getPurchasedDate() != null && castOther.getPurchasedDate() != null
								&& this.getPurchasedDate().equals(castOther.getPurchasedDate())))
				&& ((this.getNextServiceDate() == castOther.getNextServiceDate())
						|| (this.getNextServiceDate() != null && castOther.getNextServiceDate() != null
								&& this.getNextServiceDate().equals(castOther.getNextServiceDate())))
				&& ((this.getEquipmentCreationDate() == castOther.getEquipmentCreationDate())
						|| (this.getEquipmentCreationDate() != null && castOther.getEquipmentCreationDate() != null
								&& this.getEquipmentCreationDate().equals(castOther.getEquipmentCreationDate())))
				&& ((this.getSize() == castOther.getSize()) || (this.getSize() != null && castOther.getSize() != null
						&& this.getSize().equals(castOther.getSize())))
				&& ((this.getSecondaryColor() == castOther.getSecondaryColor())
						|| (this.getSecondaryColor() != null && castOther.getSecondaryColor() != null
								&& this.getSecondaryColor().equals(castOther.getSecondaryColor())))
				&& ((this.getPrimaryColor() == castOther.getPrimaryColor())
						|| (this.getPrimaryColor() != null && castOther.getPrimaryColor() != null
								&& this.getPrimaryColor().equals(castOther.getPrimaryColor())))
				&& ((this.getActualStartDate() == castOther.getActualStartDate())
						|| (this.getActualStartDate() != null && castOther.getActualStartDate() != null
								&& this.getActualStartDate().equals(castOther.getActualStartDate())))
				&& ((this.getActualEndDate() == castOther.getActualEndDate())
						|| (this.getActualEndDate() != null && castOther.getActualEndDate() != null
								&& this.getActualEndDate().equals(castOther.getActualEndDate())))
				&& ((this.getPickedUpDate() == castOther.getPickedUpDate())
						|| (this.getPickedUpDate() != null && castOther.getPickedUpDate() != null
								&& this.getPickedUpDate().equals(castOther.getPickedUpDate())))
				&& ((this.getTechnicianId() == castOther.getTechnicianId())
						|| (this.getTechnicianId() != null && castOther.getTechnicianId() != null
								&& this.getTechnicianId().equals(castOther.getTechnicianId())))
				&& ((this.getInstructionsFault() == castOther.getInstructionsFault())
						|| (this.getInstructionsFault() != null && castOther.getInstructionsFault() != null
								&& this.getInstructionsFault().equals(castOther.getInstructionsFault())))
				&& ((this.getActionTaken() == castOther.getActionTaken())
						|| (this.getActionTaken() != null && castOther.getActionTaken() != null
								&& this.getActionTaken().equals(castOther.getActionTaken())))
				&& ((this.getPressureBefore() == castOther.getPressureBefore())
						|| (this.getPressureBefore() != null && castOther.getPressureBefore() != null
								&& this.getPressureBefore().equals(castOther.getPressureBefore())))
				&& ((this.getPressureAfter() == castOther.getPressureAfter())
						|| (this.getPressureAfter() != null && castOther.getPressureAfter() != null
								&& this.getPressureAfter().equals(castOther.getPressureAfter())))
				&& (this.getEstimateAmount() == castOther.getEstimateAmount())
				&& (this.getPartsAmount() == castOther.getPartsAmount())
				&& (this.getPartsTaxAmount() == castOther.getPartsTaxAmount())
				&& (this.getLaborAmount() == castOther.getLaborAmount())
				&& (this.getLaborTaxAmount() == castOther.getLaborTaxAmount())
				&& (this.getHandlingAmount() == castOther.getHandlingAmount())
				&& (this.getHandlingTaxAmount() == castOther.getHandlingTaxAmount())
				&& ((this.getSentForRepairTo() == castOther.getSentForRepairTo())
						|| (this.getSentForRepairTo() != null && castOther.getSentForRepairTo() != null
								&& this.getSentForRepairTo().equals(castOther.getSentForRepairTo())))
				&& ((this.getSentDate() == castOther.getSentDate()) || (this.getSentDate() != null
						&& castOther.getSentDate() != null && this.getSentDate().equals(castOther.getSentDate())))
				&& ((this.getDueBackDate() == castOther.getDueBackDate())
						|| (this.getDueBackDate() != null && castOther.getDueBackDate() != null
								&& this.getDueBackDate().equals(castOther.getDueBackDate())))
				&& ((this.getActuallyBackDate() == castOther.getActuallyBackDate())
						|| (this.getActuallyBackDate() != null && castOther.getActuallyBackDate() != null
								&& this.getActuallyBackDate().equals(castOther.getActuallyBackDate())))
				&& ((this.getRmano() == castOther.getRmano()) || (this.getRmano() != null
						&& castOther.getRmano() != null && this.getRmano().equals(castOther.getRmano())))
				&& ((this.getServiceItemCreationDate() == castOther.getServiceItemCreationDate())
						|| (this.getServiceItemCreationDate() != null && castOther.getServiceItemCreationDate() != null
								&& this.getServiceItemCreationDate().equals(castOther.getServiceItemCreationDate())))
				&& ((this.getKnownAs() == castOther.getKnownAs()) || (this.getKnownAs() != null
						&& castOther.getKnownAs() != null && this.getKnownAs().equals(castOther.getKnownAs())))
				&& ((this.getBirthDate() == castOther.getBirthDate()) || (this.getBirthDate() != null
						&& castOther.getBirthDate() != null && this.getBirthDate().equals(castOther.getBirthDate())))
				&& ((this.getHomeAddress1() == castOther.getHomeAddress1())
						|| (this.getHomeAddress1() != null && castOther.getHomeAddress1() != null
								&& this.getHomeAddress1().equals(castOther.getHomeAddress1())))
				&& ((this.getHomeAddress2() == castOther.getHomeAddress2())
						|| (this.getHomeAddress2() != null && castOther.getHomeAddress2() != null
								&& this.getHomeAddress2().equals(castOther.getHomeAddress2())))
				&& ((this.getHomeAddress3() == castOther.getHomeAddress3())
						|| (this.getHomeAddress3() != null && castOther.getHomeAddress3() != null
								&& this.getHomeAddress3().equals(castOther.getHomeAddress3())))
				&& ((this.getHomeAddress4() == castOther.getHomeAddress4())
						|| (this.getHomeAddress4() != null && castOther.getHomeAddress4() != null
								&& this.getHomeAddress4().equals(castOther.getHomeAddress4())))
				&& ((this.getHomeState() == castOther.getHomeState()) || (this.getHomeState() != null
						&& castOther.getHomeState() != null && this.getHomeState().equals(castOther.getHomeState())))
				&& ((this.getHomePostcode() == castOther.getHomePostcode())
						|| (this.getHomePostcode() != null && castOther.getHomePostcode() != null
								&& this.getHomePostcode().equals(castOther.getHomePostcode())))
				&& ((this.getHomeCountry() == castOther.getHomeCountry())
						|| (this.getHomeCountry() != null && castOther.getHomeCountry() != null
								&& this.getHomeCountry().equals(castOther.getHomeCountry())))
				&& ((this.getTelHome() == castOther.getTelHome()) || (this.getTelHome() != null
						&& castOther.getTelHome() != null && this.getTelHome().equals(castOther.getTelHome())))
				&& ((this.getTelWork() == castOther.getTelWork()) || (this.getTelWork() != null
						&& castOther.getTelWork() != null && this.getTelWork().equals(castOther.getTelWork())))
				&& ((this.getTelMobile() == castOther.getTelMobile()) || (this.getTelMobile() != null
						&& castOther.getTelMobile() != null && this.getTelMobile().equals(castOther.getTelMobile())))
				&& ((this.getFirstLanguageId() == castOther.getFirstLanguageId())
						|| (this.getFirstLanguageId() != null && castOther.getFirstLanguageId() != null
								&& this.getFirstLanguageId().equals(castOther.getFirstLanguageId())))
				&& ((this.getStateId() == castOther.getStateId()) || (this.getStateId() != null
						&& castOther.getStateId() != null && this.getStateId().equals(castOther.getStateId())))
				&& ((this.getCountryId() == castOther.getCountryId()) || (this.getCountryId() != null
						&& castOther.getCountryId() != null && this.getCountryId().equals(castOther.getCountryId())))
				&& (this.getStockTypeId() == castOther.getStockTypeId())
				&& ((this.getManufacturerId() == castOther.getManufacturerId())
						|| (this.getManufacturerId() != null && castOther.getManufacturerId() != null
								&& this.getManufacturerId().equals(castOther.getManufacturerId())))
				&& ((this.getSizeId() == castOther.getSizeId()) || (this.getSizeId() != null
						&& castOther.getSizeId() != null && this.getSizeId().equals(castOther.getSizeId())))
				&& ((this.getPrimaryColorId() == castOther.getPrimaryColorId())
						|| (this.getPrimaryColorId() != null && castOther.getPrimaryColorId() != null
								&& this.getPrimaryColorId().equals(castOther.getPrimaryColorId())))
				&& ((this.getSecondaryColorId() == castOther.getSecondaryColorId())
						|| (this.getSecondaryColorId() != null && castOther.getSecondaryColorId() != null
								&& this.getSecondaryColorId().equals(castOther.getSecondaryColorId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getFirstName() == null ? 0 : this.getFirstName().hashCode());
		result = 37 * result + (getLastName() == null ? 0 : this.getLastName().hashCode());
		result = 37 * result + (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result + this.getCustId();
		result = 37 * result + this.getEquipmentId();
		result = 37 * result + (getStockType() == null ? 0 : this.getStockType().hashCode());
		result = 37 * result + (getManufacturer() == null ? 0 : this.getManufacturer().hashCode());
		result = 37 * result + (getSerialNo() == null ? 0 : this.getSerialNo().hashCode());
		result = 37 * result + (getRefNo() == null ? 0 : this.getRefNo().hashCode());
		result = 37 * result + (getDescription() == null ? 0 : this.getDescription().hashCode());
		result = 37 * result + (getBarcodeNo() == null ? 0 : this.getBarcodeNo().hashCode());
		result = 37 * result + (getPurchasedDate() == null ? 0 : this.getPurchasedDate().hashCode());
		result = 37 * result + (getNextServiceDate() == null ? 0 : this.getNextServiceDate().hashCode());
		result = 37 * result + (getEquipmentCreationDate() == null ? 0 : this.getEquipmentCreationDate().hashCode());
		result = 37 * result + (getSize() == null ? 0 : this.getSize().hashCode());
		result = 37 * result + (getSecondaryColor() == null ? 0 : this.getSecondaryColor().hashCode());
		result = 37 * result + (getPrimaryColor() == null ? 0 : this.getPrimaryColor().hashCode());
		result = 37 * result + (getActualStartDate() == null ? 0 : this.getActualStartDate().hashCode());
		result = 37 * result + (getActualEndDate() == null ? 0 : this.getActualEndDate().hashCode());
		result = 37 * result + (getPickedUpDate() == null ? 0 : this.getPickedUpDate().hashCode());
		result = 37 * result + (getTechnicianId() == null ? 0 : this.getTechnicianId().hashCode());
		result = 37 * result + (getInstructionsFault() == null ? 0 : this.getInstructionsFault().hashCode());
		result = 37 * result + (getActionTaken() == null ? 0 : this.getActionTaken().hashCode());
		result = 37 * result + (getPressureBefore() == null ? 0 : this.getPressureBefore().hashCode());
		result = 37 * result + (getPressureAfter() == null ? 0 : this.getPressureAfter().hashCode());
		result = 37 * result + (int) this.getEstimateAmount();
		result = 37 * result + (int) this.getPartsAmount();
		result = 37 * result + (int) this.getPartsTaxAmount();
		result = 37 * result + (int) this.getLaborAmount();
		result = 37 * result + (int) this.getLaborTaxAmount();
		result = 37 * result + (int) this.getHandlingAmount();
		result = 37 * result + (int) this.getHandlingTaxAmount();
		result = 37 * result + (getSentForRepairTo() == null ? 0 : this.getSentForRepairTo().hashCode());
		result = 37 * result + (getSentDate() == null ? 0 : this.getSentDate().hashCode());
		result = 37 * result + (getDueBackDate() == null ? 0 : this.getDueBackDate().hashCode());
		result = 37 * result + (getActuallyBackDate() == null ? 0 : this.getActuallyBackDate().hashCode());
		result = 37 * result + (getRmano() == null ? 0 : this.getRmano().hashCode());
		result = 37 * result
				+ (getServiceItemCreationDate() == null ? 0 : this.getServiceItemCreationDate().hashCode());
		result = 37 * result + (getKnownAs() == null ? 0 : this.getKnownAs().hashCode());
		result = 37 * result + (getBirthDate() == null ? 0 : this.getBirthDate().hashCode());
		result = 37 * result + (getHomeAddress1() == null ? 0 : this.getHomeAddress1().hashCode());
		result = 37 * result + (getHomeAddress2() == null ? 0 : this.getHomeAddress2().hashCode());
		result = 37 * result + (getHomeAddress3() == null ? 0 : this.getHomeAddress3().hashCode());
		result = 37 * result + (getHomeAddress4() == null ? 0 : this.getHomeAddress4().hashCode());
		result = 37 * result + (getHomeState() == null ? 0 : this.getHomeState().hashCode());
		result = 37 * result + (getHomePostcode() == null ? 0 : this.getHomePostcode().hashCode());
		result = 37 * result + (getHomeCountry() == null ? 0 : this.getHomeCountry().hashCode());
		result = 37 * result + (getTelHome() == null ? 0 : this.getTelHome().hashCode());
		result = 37 * result + (getTelWork() == null ? 0 : this.getTelWork().hashCode());
		result = 37 * result + (getTelMobile() == null ? 0 : this.getTelMobile().hashCode());
		result = 37 * result + (getFirstLanguageId() == null ? 0 : this.getFirstLanguageId().hashCode());
		result = 37 * result + (getStateId() == null ? 0 : this.getStateId().hashCode());
		result = 37 * result + (getCountryId() == null ? 0 : this.getCountryId().hashCode());
		result = 37 * result + this.getStockTypeId();
		result = 37 * result + (getManufacturerId() == null ? 0 : this.getManufacturerId().hashCode());
		result = 37 * result + (getSizeId() == null ? 0 : this.getSizeId().hashCode());
		result = 37 * result + (getPrimaryColorId() == null ? 0 : this.getPrimaryColorId().hashCode());
		result = 37 * result + (getSecondaryColorId() == null ? 0 : this.getSecondaryColorId().hashCode());
		return result;
	}

}
