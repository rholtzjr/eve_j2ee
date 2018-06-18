package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EmailAgentEquipmentItemsId generated by hbm2java
 */
@Embeddable
public class EmailAgentEquipmentItemsId implements java.io.Serializable {

	private int equipmentId;
	private String equipment;
	private String stockType;
	private String refNo;
	private String serialNo;
	private String manufacturer;
	private String description;
	private String size;
	private String primaryColor;
	private String secondaryColor;
	private String barcodeNo;
	private Date nextServiceDate;
	private Date lastServiceDate;
	private Date purchasedDate;
	private Date manufacturedDate;
	private Date creationDate;
	private Date lastUpdatedDate;
	private double netWorth;
	private boolean package_;
	private boolean bypassDblBookingCheck;
	private String cylinderValveOther;
	private String cylinderTypeOther;
	private Boolean cylinderBoot;
	private Boolean cylinderBackpack;
	private String cylinderWorkPressure;
	private String cylinderLabno;
	private int cylinderMaterialId;
	private int cylinderValveId;
	private int cylinderTypeId;
	private String cylinderTestPressure;
	private String cylinderWaterCap;
	private Date cylinderHydroDate;
	private int custId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String knownAs;
	private Date birthDate;
	private Date nextBirthDay;
	private Date previousBirthDay;
	private Integer age;
	private String homeAddress1;
	private String homeAddress2;
	private String homeAddress3;
	private String homeAddress4;
	private String homeState;
	private String homePostcode;
	private String homeCountry;
	private String email;
	private String telHome;
	private String telMobile;
	private String telWork;
	private String telLocal;
	private int stockTypeId;
	private Integer manufacturerId;
	private Integer sizeId;
	private Integer primaryColorId;
	private Integer secondaryColorId;
	private Integer homeStateId;
	private Integer homeCountryId;
	private short storeId;

	public EmailAgentEquipmentItemsId() {
	}

	public EmailAgentEquipmentItemsId(int equipmentId, String equipment, String stockType,
			Date creationDate, Date lastUpdatedDate, double netWorth, boolean package_, boolean bypassDblBookingCheck,
			int cylinderMaterialId, int cylinderValveId, int cylinderTypeId, int custId, String firstName,
			String lastName, int stockTypeId, short storeId) {
		this.equipmentId = equipmentId;
		this.equipment = equipment;
		this.stockType = stockType;
		this.creationDate = creationDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.netWorth = netWorth;
		this.package_ = package_;
		this.bypassDblBookingCheck = bypassDblBookingCheck;
		this.cylinderMaterialId = cylinderMaterialId;
		this.cylinderValveId = cylinderValveId;
		this.cylinderTypeId = cylinderTypeId;
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.stockTypeId = stockTypeId;
		this.storeId = storeId;
	}

	public EmailAgentEquipmentItemsId(int equipmentId, String equipment, String stockType,
			String refNo, String serialNo, String manufacturer, String description,
			String size, String primaryColor, String secondaryColor, String barcodeNo,
			Date nextServiceDate, Date lastServiceDate, Date purchasedDate, Date manufacturedDate, Date creationDate,
			Date lastUpdatedDate, double netWorth, boolean package_, boolean bypassDblBookingCheck,
			String cylinderValveOther, String cylinderTypeOther, Boolean cylinderBoot,
			Boolean cylinderBackpack, String cylinderWorkPressure, String cylinderLabno,
			int cylinderMaterialId, int cylinderValveId, int cylinderTypeId, String cylinderTestPressure,
			String cylinderWaterCap, Date cylinderHydroDate, int custId, String firstName,
			String middleInitial, String lastName, String knownAs, Date birthDate, Date nextBirthDay,
			Date previousBirthDay, Integer age, String homeAddress1, String homeAddress2,
			String homeAddress3, String homeAddress4, String homeState, String homePostcode,
			String homeCountry, String email, String telHome, String telMobile,
			String telWork, String telLocal, int stockTypeId, Integer manufacturerId, Integer sizeId,
			Integer primaryColorId, Integer secondaryColorId, Integer homeStateId, Integer homeCountryId,
			short storeId) {
		this.equipmentId = equipmentId;
		this.equipment = equipment;
		this.stockType = stockType;
		this.refNo = refNo;
		this.serialNo = serialNo;
		this.manufacturer = manufacturer;
		this.description = description;
		this.size = size;
		this.primaryColor = primaryColor;
		this.secondaryColor = secondaryColor;
		this.barcodeNo = barcodeNo;
		this.nextServiceDate = nextServiceDate;
		this.lastServiceDate = lastServiceDate;
		this.purchasedDate = purchasedDate;
		this.manufacturedDate = manufacturedDate;
		this.creationDate = creationDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.netWorth = netWorth;
		this.package_ = package_;
		this.bypassDblBookingCheck = bypassDblBookingCheck;
		this.cylinderValveOther = cylinderValveOther;
		this.cylinderTypeOther = cylinderTypeOther;
		this.cylinderBoot = cylinderBoot;
		this.cylinderBackpack = cylinderBackpack;
		this.cylinderWorkPressure = cylinderWorkPressure;
		this.cylinderLabno = cylinderLabno;
		this.cylinderMaterialId = cylinderMaterialId;
		this.cylinderValveId = cylinderValveId;
		this.cylinderTypeId = cylinderTypeId;
		this.cylinderTestPressure = cylinderTestPressure;
		this.cylinderWaterCap = cylinderWaterCap;
		this.cylinderHydroDate = cylinderHydroDate;
		this.custId = custId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.knownAs = knownAs;
		this.birthDate = birthDate;
		this.nextBirthDay = nextBirthDay;
		this.previousBirthDay = previousBirthDay;
		this.age = age;
		this.homeAddress1 = homeAddress1;
		this.homeAddress2 = homeAddress2;
		this.homeAddress3 = homeAddress3;
		this.homeAddress4 = homeAddress4;
		this.homeState = homeState;
		this.homePostcode = homePostcode;
		this.homeCountry = homeCountry;
		this.email = email;
		this.telHome = telHome;
		this.telMobile = telMobile;
		this.telWork = telWork;
		this.telLocal = telLocal;
		this.stockTypeId = stockTypeId;
		this.manufacturerId = manufacturerId;
		this.sizeId = sizeId;
		this.primaryColorId = primaryColorId;
		this.secondaryColorId = secondaryColorId;
		this.homeStateId = homeStateId;
		this.homeCountryId = homeCountryId;
		this.storeId = storeId;
	}

	@Column(name = "EquipmentID", nullable = false)
	public int getEquipmentId() {
		return this.equipmentId;
	}

	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}

	@Column(name = "Equipment", nullable = false)
	public String getEquipment() {
		return this.equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	@Column(name = "StockType", nullable = false)
	public String getStockType() {
		return this.stockType;
	}

	public void setStockType(String stockType) {
		this.stockType = stockType;
	}

	@Column(name = "RefNo")
	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	@Column(name = "SerialNo")
	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@Column(name = "Manufacturer")
	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Column(name = "Description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "Size")
	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "PrimaryColor")
	public String getPrimaryColor() {
		return this.primaryColor;
	}

	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}

	@Column(name = "SecondaryColor")
	public String getSecondaryColor() {
		return this.secondaryColor;
	}

	public void setSecondaryColor(String secondaryColor) {
		this.secondaryColor = secondaryColor;
	}

	@Column(name = "BarcodeNo")
	public String getBarcodeNo() {
		return this.barcodeNo;
	}

	public void setBarcodeNo(String barcodeNo) {
		this.barcodeNo = barcodeNo;
	}

	@Column(name = "NextServiceDate", length = 23)
	public Date getNextServiceDate() {
		return this.nextServiceDate;
	}

	public void setNextServiceDate(Date nextServiceDate) {
		this.nextServiceDate = nextServiceDate;
	}

	@Column(name = "LastServiceDate", length = 23)
	public Date getLastServiceDate() {
		return this.lastServiceDate;
	}

	public void setLastServiceDate(Date lastServiceDate) {
		this.lastServiceDate = lastServiceDate;
	}

	@Column(name = "PurchasedDate", length = 23)
	public Date getPurchasedDate() {
		return this.purchasedDate;
	}

	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}

	@Column(name = "ManufacturedDate", length = 23)
	public Date getManufacturedDate() {
		return this.manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	@Column(name = "CreationDate", nullable = false, length = 23)
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Column(name = "LastUpdatedDate", nullable = false, length = 23)
	public Date getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	@Column(name = "NetWorth", nullable = false, precision = 53, scale = 0)
	public double getNetWorth() {
		return this.netWorth;
	}

	public void setNetWorth(double netWorth) {
		this.netWorth = netWorth;
	}

	@Column(name = "Package", nullable = false)
	public boolean isPackage_() {
		return this.package_;
	}

	public void setPackage_(boolean package_) {
		this.package_ = package_;
	}

	@Column(name = "BypassDblBookingCheck", nullable = false)
	public boolean isBypassDblBookingCheck() {
		return this.bypassDblBookingCheck;
	}

	public void setBypassDblBookingCheck(boolean bypassDblBookingCheck) {
		this.bypassDblBookingCheck = bypassDblBookingCheck;
	}

	@Column(name = "CylinderValveOther")
	public String getCylinderValveOther() {
		return this.cylinderValveOther;
	}

	public void setCylinderValveOther(String cylinderValveOther) {
		this.cylinderValveOther = cylinderValveOther;
	}

	@Column(name = "CylinderTypeOther")
	public String getCylinderTypeOther() {
		return this.cylinderTypeOther;
	}

	public void setCylinderTypeOther(String cylinderTypeOther) {
		this.cylinderTypeOther = cylinderTypeOther;
	}

	@Column(name = "CylinderBoot")
	public Boolean getCylinderBoot() {
		return this.cylinderBoot;
	}

	public void setCylinderBoot(Boolean cylinderBoot) {
		this.cylinderBoot = cylinderBoot;
	}

	@Column(name = "CylinderBackpack")
	public Boolean getCylinderBackpack() {
		return this.cylinderBackpack;
	}

	public void setCylinderBackpack(Boolean cylinderBackpack) {
		this.cylinderBackpack = cylinderBackpack;
	}

	@Column(name = "CylinderWorkPressure")
	public String getCylinderWorkPressure() {
		return this.cylinderWorkPressure;
	}

	public void setCylinderWorkPressure(String cylinderWorkPressure) {
		this.cylinderWorkPressure = cylinderWorkPressure;
	}

	@Column(name = "CylinderLABNo")
	public String getCylinderLabno() {
		return this.cylinderLabno;
	}

	public void setCylinderLabno(String cylinderLabno) {
		this.cylinderLabno = cylinderLabno;
	}

	@Column(name = "CylinderMaterialID", nullable = false)
	public int getCylinderMaterialId() {
		return this.cylinderMaterialId;
	}

	public void setCylinderMaterialId(int cylinderMaterialId) {
		this.cylinderMaterialId = cylinderMaterialId;
	}

	@Column(name = "CylinderValveID", nullable = false)
	public int getCylinderValveId() {
		return this.cylinderValveId;
	}

	public void setCylinderValveId(int cylinderValveId) {
		this.cylinderValveId = cylinderValveId;
	}

	@Column(name = "CylinderTypeID", nullable = false)
	public int getCylinderTypeId() {
		return this.cylinderTypeId;
	}

	public void setCylinderTypeId(int cylinderTypeId) {
		this.cylinderTypeId = cylinderTypeId;
	}

	@Column(name = "CylinderTestPressure")
	public String getCylinderTestPressure() {
		return this.cylinderTestPressure;
	}

	public void setCylinderTestPressure(String cylinderTestPressure) {
		this.cylinderTestPressure = cylinderTestPressure;
	}

	@Column(name = "CylinderWaterCap")
	public String getCylinderWaterCap() {
		return this.cylinderWaterCap;
	}

	public void setCylinderWaterCap(String cylinderWaterCap) {
		this.cylinderWaterCap = cylinderWaterCap;
	}

	@Column(name = "CylinderHydroDate", length = 23)
	public Date getCylinderHydroDate() {
		return this.cylinderHydroDate;
	}

	public void setCylinderHydroDate(Date cylinderHydroDate) {
		this.cylinderHydroDate = cylinderHydroDate;
	}

	@Column(name = "CustID", nullable = false)
	public int getCustId() {
		return this.custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	@Column(name = "FirstName", nullable = false)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "MiddleInitial")
	public String getMiddleInitial() {
		return this.middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	@Column(name = "LastName", nullable = false)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	@Column(name = "NextBirthDay", length = 23)
	public Date getNextBirthDay() {
		return this.nextBirthDay;
	}

	public void setNextBirthDay(Date nextBirthDay) {
		this.nextBirthDay = nextBirthDay;
	}

	@Column(name = "PreviousBirthDay", length = 23)
	public Date getPreviousBirthDay() {
		return this.previousBirthDay;
	}

	public void setPreviousBirthDay(Date previousBirthDay) {
		this.previousBirthDay = previousBirthDay;
	}

	@Column(name = "Age")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
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

	@Column(name = "EMail")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "TelHome")
	public String getTelHome() {
		return this.telHome;
	}

	public void setTelHome(String telHome) {
		this.telHome = telHome;
	}

	@Column(name = "TelMobile")
	public String getTelMobile() {
		return this.telMobile;
	}

	public void setTelMobile(String telMobile) {
		this.telMobile = telMobile;
	}

	@Column(name = "TelWork")
	public String getTelWork() {
		return this.telWork;
	}

	public void setTelWork(String telWork) {
		this.telWork = telWork;
	}

	@Column(name = "TelLocal")
	public String getTelLocal() {
		return this.telLocal;
	}

	public void setTelLocal(String telLocal) {
		this.telLocal = telLocal;
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

	@Column(name = "HomeStateID")
	public Integer getHomeStateId() {
		return this.homeStateId;
	}

	public void setHomeStateId(Integer homeStateId) {
		this.homeStateId = homeStateId;
	}

	@Column(name = "HomeCountryID")
	public Integer getHomeCountryId() {
		return this.homeCountryId;
	}

	public void setHomeCountryId(Integer homeCountryId) {
		this.homeCountryId = homeCountryId;
	}

	@Column(name = "StoreID", nullable = false)
	public short getStoreId() {
		return this.storeId;
	}

	public void setStoreId(short storeId) {
		this.storeId = storeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EmailAgentEquipmentItemsId))
			return false;
		EmailAgentEquipmentItemsId castOther = (EmailAgentEquipmentItemsId) other;

		return (this.getEquipmentId() == castOther.getEquipmentId())
				&& ((this.getEquipment() == castOther.getEquipment()) || (this.getEquipment() != null
						&& castOther.getEquipment() != null && this.getEquipment().equals(castOther.getEquipment())))
				&& ((this.getStockType() == castOther.getStockType()) || (this.getStockType() != null
						&& castOther.getStockType() != null && this.getStockType().equals(castOther.getStockType())))
				&& ((this.getRefNo() == castOther.getRefNo()) || (this.getRefNo() != null
						&& castOther.getRefNo() != null && this.getRefNo().equals(castOther.getRefNo())))
				&& ((this.getSerialNo() == castOther.getSerialNo()) || (this.getSerialNo() != null
						&& castOther.getSerialNo() != null && this.getSerialNo().equals(castOther.getSerialNo())))
				&& ((this.getManufacturer() == castOther.getManufacturer())
						|| (this.getManufacturer() != null && castOther.getManufacturer() != null
								&& this.getManufacturer().equals(castOther.getManufacturer())))
				&& ((this.getDescription() == castOther.getDescription())
						|| (this.getDescription() != null && castOther.getDescription() != null
								&& this.getDescription().equals(castOther.getDescription())))
				&& ((this.getSize() == castOther.getSize()) || (this.getSize() != null && castOther.getSize() != null
						&& this.getSize().equals(castOther.getSize())))
				&& ((this.getPrimaryColor() == castOther.getPrimaryColor())
						|| (this.getPrimaryColor() != null && castOther.getPrimaryColor() != null
								&& this.getPrimaryColor().equals(castOther.getPrimaryColor())))
				&& ((this.getSecondaryColor() == castOther.getSecondaryColor())
						|| (this.getSecondaryColor() != null && castOther.getSecondaryColor() != null
								&& this.getSecondaryColor().equals(castOther.getSecondaryColor())))
				&& ((this.getBarcodeNo() == castOther.getBarcodeNo()) || (this.getBarcodeNo() != null
						&& castOther.getBarcodeNo() != null && this.getBarcodeNo().equals(castOther.getBarcodeNo())))
				&& ((this.getNextServiceDate() == castOther.getNextServiceDate())
						|| (this.getNextServiceDate() != null && castOther.getNextServiceDate() != null
								&& this.getNextServiceDate().equals(castOther.getNextServiceDate())))
				&& ((this.getLastServiceDate() == castOther.getLastServiceDate())
						|| (this.getLastServiceDate() != null && castOther.getLastServiceDate() != null
								&& this.getLastServiceDate().equals(castOther.getLastServiceDate())))
				&& ((this.getPurchasedDate() == castOther.getPurchasedDate())
						|| (this.getPurchasedDate() != null && castOther.getPurchasedDate() != null
								&& this.getPurchasedDate().equals(castOther.getPurchasedDate())))
				&& ((this.getManufacturedDate() == castOther.getManufacturedDate())
						|| (this.getManufacturedDate() != null && castOther.getManufacturedDate() != null
								&& this.getManufacturedDate().equals(castOther.getManufacturedDate())))
				&& ((this.getCreationDate() == castOther.getCreationDate())
						|| (this.getCreationDate() != null && castOther.getCreationDate() != null
								&& this.getCreationDate().equals(castOther.getCreationDate())))
				&& ((this.getLastUpdatedDate() == castOther.getLastUpdatedDate())
						|| (this.getLastUpdatedDate() != null && castOther.getLastUpdatedDate() != null
								&& this.getLastUpdatedDate().equals(castOther.getLastUpdatedDate())))
				&& (this.getNetWorth() == castOther.getNetWorth()) && (this.isPackage_() == castOther.isPackage_())
				&& (this.isBypassDblBookingCheck() == castOther.isBypassDblBookingCheck())
				&& ((this.getCylinderValveOther() == castOther.getCylinderValveOther())
						|| (this.getCylinderValveOther() != null && castOther.getCylinderValveOther() != null
								&& this.getCylinderValveOther().equals(castOther.getCylinderValveOther())))
				&& ((this.getCylinderTypeOther() == castOther.getCylinderTypeOther())
						|| (this.getCylinderTypeOther() != null && castOther.getCylinderTypeOther() != null
								&& this.getCylinderTypeOther().equals(castOther.getCylinderTypeOther())))
				&& ((this.getCylinderBoot() == castOther.getCylinderBoot())
						|| (this.getCylinderBoot() != null && castOther.getCylinderBoot() != null
								&& this.getCylinderBoot().equals(castOther.getCylinderBoot())))
				&& ((this.getCylinderBackpack() == castOther.getCylinderBackpack())
						|| (this.getCylinderBackpack() != null && castOther.getCylinderBackpack() != null
								&& this.getCylinderBackpack().equals(castOther.getCylinderBackpack())))
				&& ((this.getCylinderWorkPressure() == castOther.getCylinderWorkPressure())
						|| (this.getCylinderWorkPressure() != null && castOther.getCylinderWorkPressure() != null
								&& this.getCylinderWorkPressure().equals(castOther.getCylinderWorkPressure())))
				&& ((this.getCylinderLabno() == castOther.getCylinderLabno())
						|| (this.getCylinderLabno() != null && castOther.getCylinderLabno() != null
								&& this.getCylinderLabno().equals(castOther.getCylinderLabno())))
				&& (this.getCylinderMaterialId() == castOther.getCylinderMaterialId())
				&& (this.getCylinderValveId() == castOther.getCylinderValveId())
				&& (this.getCylinderTypeId() == castOther.getCylinderTypeId())
				&& ((this.getCylinderTestPressure() == castOther.getCylinderTestPressure())
						|| (this.getCylinderTestPressure() != null && castOther.getCylinderTestPressure() != null
								&& this.getCylinderTestPressure().equals(castOther.getCylinderTestPressure())))
				&& ((this.getCylinderWaterCap() == castOther.getCylinderWaterCap())
						|| (this.getCylinderWaterCap() != null && castOther.getCylinderWaterCap() != null
								&& this.getCylinderWaterCap().equals(castOther.getCylinderWaterCap())))
				&& ((this.getCylinderHydroDate() == castOther.getCylinderHydroDate())
						|| (this.getCylinderHydroDate() != null && castOther.getCylinderHydroDate() != null
								&& this.getCylinderHydroDate().equals(castOther.getCylinderHydroDate())))
				&& (this.getCustId() == castOther.getCustId())
				&& ((this.getFirstName() == castOther.getFirstName()) || (this.getFirstName() != null
						&& castOther.getFirstName() != null && this.getFirstName().equals(castOther.getFirstName())))
				&& ((this.getMiddleInitial() == castOther.getMiddleInitial())
						|| (this.getMiddleInitial() != null && castOther.getMiddleInitial() != null
								&& this.getMiddleInitial().equals(castOther.getMiddleInitial())))
				&& ((this.getLastName() == castOther.getLastName()) || (this.getLastName() != null
						&& castOther.getLastName() != null && this.getLastName().equals(castOther.getLastName())))
				&& ((this.getKnownAs() == castOther.getKnownAs()) || (this.getKnownAs() != null
						&& castOther.getKnownAs() != null && this.getKnownAs().equals(castOther.getKnownAs())))
				&& ((this.getBirthDate() == castOther.getBirthDate()) || (this.getBirthDate() != null
						&& castOther.getBirthDate() != null && this.getBirthDate().equals(castOther.getBirthDate())))
				&& ((this.getNextBirthDay() == castOther.getNextBirthDay())
						|| (this.getNextBirthDay() != null && castOther.getNextBirthDay() != null
								&& this.getNextBirthDay().equals(castOther.getNextBirthDay())))
				&& ((this.getPreviousBirthDay() == castOther.getPreviousBirthDay())
						|| (this.getPreviousBirthDay() != null && castOther.getPreviousBirthDay() != null
								&& this.getPreviousBirthDay().equals(castOther.getPreviousBirthDay())))
				&& ((this.getAge() == castOther.getAge()) || (this.getAge() != null && castOther.getAge() != null
						&& this.getAge().equals(castOther.getAge())))
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
				&& ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null
						&& castOther.getEmail() != null && this.getEmail().equals(castOther.getEmail())))
				&& ((this.getTelHome() == castOther.getTelHome()) || (this.getTelHome() != null
						&& castOther.getTelHome() != null && this.getTelHome().equals(castOther.getTelHome())))
				&& ((this.getTelMobile() == castOther.getTelMobile()) || (this.getTelMobile() != null
						&& castOther.getTelMobile() != null && this.getTelMobile().equals(castOther.getTelMobile())))
				&& ((this.getTelWork() == castOther.getTelWork()) || (this.getTelWork() != null
						&& castOther.getTelWork() != null && this.getTelWork().equals(castOther.getTelWork())))
				&& ((this.getTelLocal() == castOther.getTelLocal()) || (this.getTelLocal() != null
						&& castOther.getTelLocal() != null && this.getTelLocal().equals(castOther.getTelLocal())))
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
								&& this.getSecondaryColorId().equals(castOther.getSecondaryColorId())))
				&& ((this.getHomeStateId() == castOther.getHomeStateId())
						|| (this.getHomeStateId() != null && castOther.getHomeStateId() != null
								&& this.getHomeStateId().equals(castOther.getHomeStateId())))
				&& ((this.getHomeCountryId() == castOther.getHomeCountryId())
						|| (this.getHomeCountryId() != null && castOther.getHomeCountryId() != null
								&& this.getHomeCountryId().equals(castOther.getHomeCountryId())))
				&& (this.getStoreId() == castOther.getStoreId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEquipmentId();
		result = 37 * result + (getEquipment() == null ? 0 : this.getEquipment().hashCode());
		result = 37 * result + (getStockType() == null ? 0 : this.getStockType().hashCode());
		result = 37 * result + (getRefNo() == null ? 0 : this.getRefNo().hashCode());
		result = 37 * result + (getSerialNo() == null ? 0 : this.getSerialNo().hashCode());
		result = 37 * result + (getManufacturer() == null ? 0 : this.getManufacturer().hashCode());
		result = 37 * result + (getDescription() == null ? 0 : this.getDescription().hashCode());
		result = 37 * result + (getSize() == null ? 0 : this.getSize().hashCode());
		result = 37 * result + (getPrimaryColor() == null ? 0 : this.getPrimaryColor().hashCode());
		result = 37 * result + (getSecondaryColor() == null ? 0 : this.getSecondaryColor().hashCode());
		result = 37 * result + (getBarcodeNo() == null ? 0 : this.getBarcodeNo().hashCode());
		result = 37 * result + (getNextServiceDate() == null ? 0 : this.getNextServiceDate().hashCode());
		result = 37 * result + (getLastServiceDate() == null ? 0 : this.getLastServiceDate().hashCode());
		result = 37 * result + (getPurchasedDate() == null ? 0 : this.getPurchasedDate().hashCode());
		result = 37 * result + (getManufacturedDate() == null ? 0 : this.getManufacturedDate().hashCode());
		result = 37 * result + (getCreationDate() == null ? 0 : this.getCreationDate().hashCode());
		result = 37 * result + (getLastUpdatedDate() == null ? 0 : this.getLastUpdatedDate().hashCode());
		result = 37 * result + (int) this.getNetWorth();
		result = 37 * result + (this.isPackage_() ? 1 : 0);
		result = 37 * result + (this.isBypassDblBookingCheck() ? 1 : 0);
		result = 37 * result + (getCylinderValveOther() == null ? 0 : this.getCylinderValveOther().hashCode());
		result = 37 * result + (getCylinderTypeOther() == null ? 0 : this.getCylinderTypeOther().hashCode());
		result = 37 * result + (getCylinderBoot() == null ? 0 : this.getCylinderBoot().hashCode());
		result = 37 * result + (getCylinderBackpack() == null ? 0 : this.getCylinderBackpack().hashCode());
		result = 37 * result + (getCylinderWorkPressure() == null ? 0 : this.getCylinderWorkPressure().hashCode());
		result = 37 * result + (getCylinderLabno() == null ? 0 : this.getCylinderLabno().hashCode());
		result = 37 * result + this.getCylinderMaterialId();
		result = 37 * result + this.getCylinderValveId();
		result = 37 * result + this.getCylinderTypeId();
		result = 37 * result + (getCylinderTestPressure() == null ? 0 : this.getCylinderTestPressure().hashCode());
		result = 37 * result + (getCylinderWaterCap() == null ? 0 : this.getCylinderWaterCap().hashCode());
		result = 37 * result + (getCylinderHydroDate() == null ? 0 : this.getCylinderHydroDate().hashCode());
		result = 37 * result + this.getCustId();
		result = 37 * result + (getFirstName() == null ? 0 : this.getFirstName().hashCode());
		result = 37 * result + (getMiddleInitial() == null ? 0 : this.getMiddleInitial().hashCode());
		result = 37 * result + (getLastName() == null ? 0 : this.getLastName().hashCode());
		result = 37 * result + (getKnownAs() == null ? 0 : this.getKnownAs().hashCode());
		result = 37 * result + (getBirthDate() == null ? 0 : this.getBirthDate().hashCode());
		result = 37 * result + (getNextBirthDay() == null ? 0 : this.getNextBirthDay().hashCode());
		result = 37 * result + (getPreviousBirthDay() == null ? 0 : this.getPreviousBirthDay().hashCode());
		result = 37 * result + (getAge() == null ? 0 : this.getAge().hashCode());
		result = 37 * result + (getHomeAddress1() == null ? 0 : this.getHomeAddress1().hashCode());
		result = 37 * result + (getHomeAddress2() == null ? 0 : this.getHomeAddress2().hashCode());
		result = 37 * result + (getHomeAddress3() == null ? 0 : this.getHomeAddress3().hashCode());
		result = 37 * result + (getHomeAddress4() == null ? 0 : this.getHomeAddress4().hashCode());
		result = 37 * result + (getHomeState() == null ? 0 : this.getHomeState().hashCode());
		result = 37 * result + (getHomePostcode() == null ? 0 : this.getHomePostcode().hashCode());
		result = 37 * result + (getHomeCountry() == null ? 0 : this.getHomeCountry().hashCode());
		result = 37 * result + (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result + (getTelHome() == null ? 0 : this.getTelHome().hashCode());
		result = 37 * result + (getTelMobile() == null ? 0 : this.getTelMobile().hashCode());
		result = 37 * result + (getTelWork() == null ? 0 : this.getTelWork().hashCode());
		result = 37 * result + (getTelLocal() == null ? 0 : this.getTelLocal().hashCode());
		result = 37 * result + this.getStockTypeId();
		result = 37 * result + (getManufacturerId() == null ? 0 : this.getManufacturerId().hashCode());
		result = 37 * result + (getSizeId() == null ? 0 : this.getSizeId().hashCode());
		result = 37 * result + (getPrimaryColorId() == null ? 0 : this.getPrimaryColorId().hashCode());
		result = 37 * result + (getSecondaryColorId() == null ? 0 : this.getSecondaryColorId().hashCode());
		result = 37 * result + (getHomeStateId() == null ? 0 : this.getHomeStateId().hashCode());
		result = 37 * result + (getHomeCountryId() == null ? 0 : this.getHomeCountryId().hashCode());
		result = 37 * result + this.getStoreId();
		return result;
	}

}
