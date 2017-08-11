package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * D01RkRoomBookingId generated by hbm2java
 */
@Embeddable
public class D01RkRoomBookingId implements java.io.Serializable {

	private int rkRoomBookingId;
	private Integer rkHotelIdN;
	private Integer rkRoomIdN;
	private String rkRoomNoTxN;
	private int rkCustId;
	private int rkStatusId;
	private Date rkStartDate;
	private Date rkEndDate;
	private Date rkCheckedInDateN;
	private Date rkCheckedOutDateN;
	private String rkNotesTxN;
	private int rkEmpId;
	private Double rkRatePerNightMnN;
	private Integer rkGroupIdN;
	private String rkFlightNoInTxN;
	private String rkFlightNoOutTxN;
	private Date rkFlightArrivalDateN;
	private Date rkFlightDepartureDateN;
	private Date rkLastUpdatedDate;
	private Date rkCreationDate;
	private Integer rkInvoiceIdN;
	private short rkStoreId;
	private double rkRoomPriceMn;
	private double rkRoomTaxMn;
	private double rkPricePaidMn;
	private double rkTaxPaidMn;

	public D01RkRoomBookingId() {
	}

	public D01RkRoomBookingId(int rkRoomBookingId, int rkCustId, int rkStatusId, Date rkStartDate, Date rkEndDate,
			int rkEmpId, Date rkLastUpdatedDate, Date rkCreationDate, short rkStoreId, double rkRoomPriceMn,
			double rkRoomTaxMn, double rkPricePaidMn, double rkTaxPaidMn) {
		this.rkRoomBookingId = rkRoomBookingId;
		this.rkCustId = rkCustId;
		this.rkStatusId = rkStatusId;
		this.rkStartDate = rkStartDate;
		this.rkEndDate = rkEndDate;
		this.rkEmpId = rkEmpId;
		this.rkLastUpdatedDate = rkLastUpdatedDate;
		this.rkCreationDate = rkCreationDate;
		this.rkStoreId = rkStoreId;
		this.rkRoomPriceMn = rkRoomPriceMn;
		this.rkRoomTaxMn = rkRoomTaxMn;
		this.rkPricePaidMn = rkPricePaidMn;
		this.rkTaxPaidMn = rkTaxPaidMn;
	}

	public D01RkRoomBookingId(int rkRoomBookingId, Integer rkHotelIdN, Integer rkRoomIdN, String rkRoomNoTxN,
			int rkCustId, int rkStatusId, Date rkStartDate, Date rkEndDate, Date rkCheckedInDateN,
			Date rkCheckedOutDateN, String rkNotesTxN, int rkEmpId, Double rkRatePerNightMnN, Integer rkGroupIdN,
			String rkFlightNoInTxN, String rkFlightNoOutTxN, Date rkFlightArrivalDateN,
			Date rkFlightDepartureDateN, Date rkLastUpdatedDate, Date rkCreationDate, Integer rkInvoiceIdN,
			short rkStoreId, double rkRoomPriceMn, double rkRoomTaxMn, double rkPricePaidMn, double rkTaxPaidMn) {
		this.rkRoomBookingId = rkRoomBookingId;
		this.rkHotelIdN = rkHotelIdN;
		this.rkRoomIdN = rkRoomIdN;
		this.rkRoomNoTxN = rkRoomNoTxN;
		this.rkCustId = rkCustId;
		this.rkStatusId = rkStatusId;
		this.rkStartDate = rkStartDate;
		this.rkEndDate = rkEndDate;
		this.rkCheckedInDateN = rkCheckedInDateN;
		this.rkCheckedOutDateN = rkCheckedOutDateN;
		this.rkNotesTxN = rkNotesTxN;
		this.rkEmpId = rkEmpId;
		this.rkRatePerNightMnN = rkRatePerNightMnN;
		this.rkGroupIdN = rkGroupIdN;
		this.rkFlightNoInTxN = rkFlightNoInTxN;
		this.rkFlightNoOutTxN = rkFlightNoOutTxN;
		this.rkFlightArrivalDateN = rkFlightArrivalDateN;
		this.rkFlightDepartureDateN = rkFlightDepartureDateN;
		this.rkLastUpdatedDate = rkLastUpdatedDate;
		this.rkCreationDate = rkCreationDate;
		this.rkInvoiceIdN = rkInvoiceIdN;
		this.rkStoreId = rkStoreId;
		this.rkRoomPriceMn = rkRoomPriceMn;
		this.rkRoomTaxMn = rkRoomTaxMn;
		this.rkPricePaidMn = rkPricePaidMn;
		this.rkTaxPaidMn = rkTaxPaidMn;
	}

	@Column(name = "RkRoomBookingID", nullable = false)
	public int getRkRoomBookingId() {
		return this.rkRoomBookingId;
	}

	public void setRkRoomBookingId(int rkRoomBookingId) {
		this.rkRoomBookingId = rkRoomBookingId;
	}

	@Column(name = "RkHotelID_N")
	public Integer getRkHotelIdN() {
		return this.rkHotelIdN;
	}

	public void setRkHotelIdN(Integer rkHotelIdN) {
		this.rkHotelIdN = rkHotelIdN;
	}

	@Column(name = "RkRoomID_N")
	public Integer getRkRoomIdN() {
		return this.rkRoomIdN;
	}

	public void setRkRoomIdN(Integer rkRoomIdN) {
		this.rkRoomIdN = rkRoomIdN;
	}

	@Column(name = "RkRoomNoTx_N")
	public String getRkRoomNoTxN() {
		return this.rkRoomNoTxN;
	}

	public void setRkRoomNoTxN(String rkRoomNoTxN) {
		this.rkRoomNoTxN = rkRoomNoTxN;
	}

	@Column(name = "RkCustID", nullable = false)
	public int getRkCustId() {
		return this.rkCustId;
	}

	public void setRkCustId(int rkCustId) {
		this.rkCustId = rkCustId;
	}

	@Column(name = "RkStatusID", nullable = false)
	public int getRkStatusId() {
		return this.rkStatusId;
	}

	public void setRkStatusId(int rkStatusId) {
		this.rkStatusId = rkStatusId;
	}

	@Column(name = "RkStartDate", nullable = false, length = 23)
	public Date getRkStartDate() {
		return this.rkStartDate;
	}

	public void setRkStartDate(Date rkStartDate) {
		this.rkStartDate = rkStartDate;
	}

	@Column(name = "RkEndDate", nullable = false, length = 23)
	public Date getRkEndDate() {
		return this.rkEndDate;
	}

	public void setRkEndDate(Date rkEndDate) {
		this.rkEndDate = rkEndDate;
	}

	@Column(name = "RkCheckedInDate_N", length = 23)
	public Date getRkCheckedInDateN() {
		return this.rkCheckedInDateN;
	}

	public void setRkCheckedInDateN(Date rkCheckedInDateN) {
		this.rkCheckedInDateN = rkCheckedInDateN;
	}

	@Column(name = "RkCheckedOutDate_N", length = 23)
	public Date getRkCheckedOutDateN() {
		return this.rkCheckedOutDateN;
	}

	public void setRkCheckedOutDateN(Date rkCheckedOutDateN) {
		this.rkCheckedOutDateN = rkCheckedOutDateN;
	}

	@Column(name = "RkNotesTx_N")
	public String getRkNotesTxN() {
		return this.rkNotesTxN;
	}

	public void setRkNotesTxN(String rkNotesTxN) {
		this.rkNotesTxN = rkNotesTxN;
	}

	@Column(name = "RkEmpID", nullable = false)
	public int getRkEmpId() {
		return this.rkEmpId;
	}

	public void setRkEmpId(int rkEmpId) {
		this.rkEmpId = rkEmpId;
	}

	@Column(name = "RkRatePerNightMn_N", precision = 53, scale = 0)
	public Double getRkRatePerNightMnN() {
		return this.rkRatePerNightMnN;
	}

	public void setRkRatePerNightMnN(Double rkRatePerNightMnN) {
		this.rkRatePerNightMnN = rkRatePerNightMnN;
	}

	@Column(name = "RkGroupID_N")
	public Integer getRkGroupIdN() {
		return this.rkGroupIdN;
	}

	public void setRkGroupIdN(Integer rkGroupIdN) {
		this.rkGroupIdN = rkGroupIdN;
	}

	@Column(name = "RkFlightNoInTx_N")
	public String getRkFlightNoInTxN() {
		return this.rkFlightNoInTxN;
	}

	public void setRkFlightNoInTxN(String rkFlightNoInTxN) {
		this.rkFlightNoInTxN = rkFlightNoInTxN;
	}

	@Column(name = "RkFlightNoOutTx_N")
	public String getRkFlightNoOutTxN() {
		return this.rkFlightNoOutTxN;
	}

	public void setRkFlightNoOutTxN(String rkFlightNoOutTxN) {
		this.rkFlightNoOutTxN = rkFlightNoOutTxN;
	}

	@Column(name = "RkFlightArrivalDate_N", length = 23)
	public Date getRkFlightArrivalDateN() {
		return this.rkFlightArrivalDateN;
	}

	public void setRkFlightArrivalDateN(Date rkFlightArrivalDateN) {
		this.rkFlightArrivalDateN = rkFlightArrivalDateN;
	}

	@Column(name = "RkFlightDepartureDate_N", length = 23)
	public Date getRkFlightDepartureDateN() {
		return this.rkFlightDepartureDateN;
	}

	public void setRkFlightDepartureDateN(Date rkFlightDepartureDateN) {
		this.rkFlightDepartureDateN = rkFlightDepartureDateN;
	}

	@Column(name = "RkLastUpdatedDate", nullable = false, length = 23)
	public Date getRkLastUpdatedDate() {
		return this.rkLastUpdatedDate;
	}

	public void setRkLastUpdatedDate(Date rkLastUpdatedDate) {
		this.rkLastUpdatedDate = rkLastUpdatedDate;
	}

	@Column(name = "RkCreationDate", nullable = false, length = 23)
	public Date getRkCreationDate() {
		return this.rkCreationDate;
	}

	public void setRkCreationDate(Date rkCreationDate) {
		this.rkCreationDate = rkCreationDate;
	}

	@Column(name = "RkInvoiceID_N")
	public Integer getRkInvoiceIdN() {
		return this.rkInvoiceIdN;
	}

	public void setRkInvoiceIdN(Integer rkInvoiceIdN) {
		this.rkInvoiceIdN = rkInvoiceIdN;
	}

	@Column(name = "RkStoreID", nullable = false)
	public short getRkStoreId() {
		return this.rkStoreId;
	}

	public void setRkStoreId(short rkStoreId) {
		this.rkStoreId = rkStoreId;
	}

	@Column(name = "RkRoomPriceMn", nullable = false, precision = 53, scale = 0)
	public double getRkRoomPriceMn() {
		return this.rkRoomPriceMn;
	}

	public void setRkRoomPriceMn(double rkRoomPriceMn) {
		this.rkRoomPriceMn = rkRoomPriceMn;
	}

	@Column(name = "RkRoomTaxMn", nullable = false, precision = 53, scale = 0)
	public double getRkRoomTaxMn() {
		return this.rkRoomTaxMn;
	}

	public void setRkRoomTaxMn(double rkRoomTaxMn) {
		this.rkRoomTaxMn = rkRoomTaxMn;
	}

	@Column(name = "RkPricePaidMn", nullable = false, precision = 53, scale = 0)
	public double getRkPricePaidMn() {
		return this.rkPricePaidMn;
	}

	public void setRkPricePaidMn(double rkPricePaidMn) {
		this.rkPricePaidMn = rkPricePaidMn;
	}

	@Column(name = "RkTaxPaidMn", nullable = false, precision = 53, scale = 0)
	public double getRkTaxPaidMn() {
		return this.rkTaxPaidMn;
	}

	public void setRkTaxPaidMn(double rkTaxPaidMn) {
		this.rkTaxPaidMn = rkTaxPaidMn;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof D01RkRoomBookingId))
			return false;
		D01RkRoomBookingId castOther = (D01RkRoomBookingId) other;

		return (this.getRkRoomBookingId() == castOther.getRkRoomBookingId())
				&& ((this.getRkHotelIdN() == castOther.getRkHotelIdN()) || (this.getRkHotelIdN() != null
						&& castOther.getRkHotelIdN() != null && this.getRkHotelIdN().equals(castOther.getRkHotelIdN())))
				&& ((this.getRkRoomIdN() == castOther.getRkRoomIdN()) || (this.getRkRoomIdN() != null
						&& castOther.getRkRoomIdN() != null && this.getRkRoomIdN().equals(castOther.getRkRoomIdN())))
				&& ((this.getRkRoomNoTxN() == castOther.getRkRoomNoTxN())
						|| (this.getRkRoomNoTxN() != null && castOther.getRkRoomNoTxN() != null
								&& this.getRkRoomNoTxN().equals(castOther.getRkRoomNoTxN())))
				&& (this.getRkCustId() == castOther.getRkCustId())
				&& (this.getRkStatusId() == castOther.getRkStatusId())
				&& ((this.getRkStartDate() == castOther.getRkStartDate())
						|| (this.getRkStartDate() != null && castOther.getRkStartDate() != null
								&& this.getRkStartDate().equals(castOther.getRkStartDate())))
				&& ((this.getRkEndDate() == castOther.getRkEndDate()) || (this.getRkEndDate() != null
						&& castOther.getRkEndDate() != null && this.getRkEndDate().equals(castOther.getRkEndDate())))
				&& ((this.getRkCheckedInDateN() == castOther.getRkCheckedInDateN())
						|| (this.getRkCheckedInDateN() != null && castOther.getRkCheckedInDateN() != null
								&& this.getRkCheckedInDateN().equals(castOther.getRkCheckedInDateN())))
				&& ((this.getRkCheckedOutDateN() == castOther.getRkCheckedOutDateN())
						|| (this.getRkCheckedOutDateN() != null && castOther.getRkCheckedOutDateN() != null
								&& this.getRkCheckedOutDateN().equals(castOther.getRkCheckedOutDateN())))
				&& ((this.getRkNotesTxN() == castOther.getRkNotesTxN()) || (this.getRkNotesTxN() != null
						&& castOther.getRkNotesTxN() != null && this.getRkNotesTxN().equals(castOther.getRkNotesTxN())))
				&& (this.getRkEmpId() == castOther.getRkEmpId())
				&& ((this.getRkRatePerNightMnN() == castOther.getRkRatePerNightMnN())
						|| (this.getRkRatePerNightMnN() != null && castOther.getRkRatePerNightMnN() != null
								&& this.getRkRatePerNightMnN().equals(castOther.getRkRatePerNightMnN())))
				&& ((this.getRkGroupIdN() == castOther.getRkGroupIdN()) || (this.getRkGroupIdN() != null
						&& castOther.getRkGroupIdN() != null && this.getRkGroupIdN().equals(castOther.getRkGroupIdN())))
				&& ((this.getRkFlightNoInTxN() == castOther.getRkFlightNoInTxN())
						|| (this.getRkFlightNoInTxN() != null && castOther.getRkFlightNoInTxN() != null
								&& this.getRkFlightNoInTxN().equals(castOther.getRkFlightNoInTxN())))
				&& ((this.getRkFlightNoOutTxN() == castOther.getRkFlightNoOutTxN())
						|| (this.getRkFlightNoOutTxN() != null && castOther.getRkFlightNoOutTxN() != null
								&& this.getRkFlightNoOutTxN().equals(castOther.getRkFlightNoOutTxN())))
				&& ((this.getRkFlightArrivalDateN() == castOther.getRkFlightArrivalDateN())
						|| (this.getRkFlightArrivalDateN() != null && castOther.getRkFlightArrivalDateN() != null
								&& this.getRkFlightArrivalDateN().equals(castOther.getRkFlightArrivalDateN())))
				&& ((this.getRkFlightDepartureDateN() == castOther.getRkFlightDepartureDateN())
						|| (this.getRkFlightDepartureDateN() != null && castOther.getRkFlightDepartureDateN() != null
								&& this.getRkFlightDepartureDateN().equals(castOther.getRkFlightDepartureDateN())))
				&& ((this.getRkLastUpdatedDate() == castOther.getRkLastUpdatedDate())
						|| (this.getRkLastUpdatedDate() != null && castOther.getRkLastUpdatedDate() != null
								&& this.getRkLastUpdatedDate().equals(castOther.getRkLastUpdatedDate())))
				&& ((this.getRkCreationDate() == castOther.getRkCreationDate())
						|| (this.getRkCreationDate() != null && castOther.getRkCreationDate() != null
								&& this.getRkCreationDate().equals(castOther.getRkCreationDate())))
				&& ((this.getRkInvoiceIdN() == castOther.getRkInvoiceIdN())
						|| (this.getRkInvoiceIdN() != null && castOther.getRkInvoiceIdN() != null
								&& this.getRkInvoiceIdN().equals(castOther.getRkInvoiceIdN())))
				&& (this.getRkStoreId() == castOther.getRkStoreId())
				&& (this.getRkRoomPriceMn() == castOther.getRkRoomPriceMn())
				&& (this.getRkRoomTaxMn() == castOther.getRkRoomTaxMn())
				&& (this.getRkPricePaidMn() == castOther.getRkPricePaidMn())
				&& (this.getRkTaxPaidMn() == castOther.getRkTaxPaidMn());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRkRoomBookingId();
		result = 37 * result + (getRkHotelIdN() == null ? 0 : this.getRkHotelIdN().hashCode());
		result = 37 * result + (getRkRoomIdN() == null ? 0 : this.getRkRoomIdN().hashCode());
		result = 37 * result + (getRkRoomNoTxN() == null ? 0 : this.getRkRoomNoTxN().hashCode());
		result = 37 * result + this.getRkCustId();
		result = 37 * result + this.getRkStatusId();
		result = 37 * result + (getRkStartDate() == null ? 0 : this.getRkStartDate().hashCode());
		result = 37 * result + (getRkEndDate() == null ? 0 : this.getRkEndDate().hashCode());
		result = 37 * result + (getRkCheckedInDateN() == null ? 0 : this.getRkCheckedInDateN().hashCode());
		result = 37 * result + (getRkCheckedOutDateN() == null ? 0 : this.getRkCheckedOutDateN().hashCode());
		result = 37 * result + (getRkNotesTxN() == null ? 0 : this.getRkNotesTxN().hashCode());
		result = 37 * result + this.getRkEmpId();
		result = 37 * result + (getRkRatePerNightMnN() == null ? 0 : this.getRkRatePerNightMnN().hashCode());
		result = 37 * result + (getRkGroupIdN() == null ? 0 : this.getRkGroupIdN().hashCode());
		result = 37 * result + (getRkFlightNoInTxN() == null ? 0 : this.getRkFlightNoInTxN().hashCode());
		result = 37 * result + (getRkFlightNoOutTxN() == null ? 0 : this.getRkFlightNoOutTxN().hashCode());
		result = 37 * result + (getRkFlightArrivalDateN() == null ? 0 : this.getRkFlightArrivalDateN().hashCode());
		result = 37 * result + (getRkFlightDepartureDateN() == null ? 0 : this.getRkFlightDepartureDateN().hashCode());
		result = 37 * result + (getRkLastUpdatedDate() == null ? 0 : this.getRkLastUpdatedDate().hashCode());
		result = 37 * result + (getRkCreationDate() == null ? 0 : this.getRkCreationDate().hashCode());
		result = 37 * result + (getRkInvoiceIdN() == null ? 0 : this.getRkInvoiceIdN().hashCode());
		result = 37 * result + this.getRkStoreId();
		result = 37 * result + (int) this.getRkRoomPriceMn();
		result = 37 * result + (int) this.getRkRoomTaxMn();
		result = 37 * result + (int) this.getRkPricePaidMn();
		result = 37 * result + (int) this.getRkTaxPaidMn();
		return result;
	}

}
