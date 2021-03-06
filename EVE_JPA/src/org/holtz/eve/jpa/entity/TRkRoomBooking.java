package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TRkRoomBooking generated by hbm2java
 */
@Entity
@Table(name = "T_RkRoomBooking")
public class TRkRoomBooking implements java.io.Serializable {

	private int rkRoomBookingId;
	private TInInvoice TInInvoice;
	private TEmEmp TEmEmp;
	private THtHotel THtHotel;
	private TRmRoom TRmRoom;
	private TSoStore TSoStore;
	private TCuCust TCuCust;
	private String rkRoomNoTxN;
	private int rkStatusId;
	private Date rkStartDate;
	private Date rkEndDate;
	private Date rkCheckedInDateN;
	private Date rkCheckedOutDateN;
	private String rkNotesTxN;
	private Double rkRatePerNightMnN;
	private Integer rkGroupIdN;
	private String rkFlightNoInTxN;
	private String rkFlightNoOutTxN;
	private Date rkFlightArrivalDateN;
	private Date rkFlightDepartureDateN;
	private Date rkLastUpdatedDate;
	private Date rkCreationDate;
	private double rkRoomPriceMn;
	private double rkRoomTaxMn;
	private double rkPricePaidMn;
	private double rkTaxPaidMn;
	private Set<TIiinvoiceItem> TIiinvoiceItems = new HashSet<TIiinvoiceItem>(0);
	private Set<TQiquoteItem> TQiquoteItems = new HashSet<TQiquoteItem>(0);
	private Set<TVivoucherItem> TVivoucherItems = new HashSet<TVivoucherItem>(0);

	public TRkRoomBooking() {
	}

	public TRkRoomBooking(int rkRoomBookingId, TEmEmp TEmEmp, TSoStore TSoStore, TCuCust TCuCust, int rkStatusId,
			Date rkStartDate, Date rkEndDate, Date rkLastUpdatedDate, Date rkCreationDate, double rkRoomPriceMn,
			double rkRoomTaxMn, double rkPricePaidMn, double rkTaxPaidMn) {
		this.rkRoomBookingId = rkRoomBookingId;
		this.TEmEmp = TEmEmp;
		this.TSoStore = TSoStore;
		this.TCuCust = TCuCust;
		this.rkStatusId = rkStatusId;
		this.rkStartDate = rkStartDate;
		this.rkEndDate = rkEndDate;
		this.rkLastUpdatedDate = rkLastUpdatedDate;
		this.rkCreationDate = rkCreationDate;
		this.rkRoomPriceMn = rkRoomPriceMn;
		this.rkRoomTaxMn = rkRoomTaxMn;
		this.rkPricePaidMn = rkPricePaidMn;
		this.rkTaxPaidMn = rkTaxPaidMn;
	}

	public TRkRoomBooking(int rkRoomBookingId, TInInvoice TInInvoice, TEmEmp TEmEmp, THtHotel THtHotel, TRmRoom TRmRoom,
			TSoStore TSoStore, TCuCust TCuCust, String rkRoomNoTxN, int rkStatusId, Date rkStartDate,
			Date rkEndDate, Date rkCheckedInDateN, Date rkCheckedOutDateN, String rkNotesTxN,
			Double rkRatePerNightMnN, Integer rkGroupIdN, String rkFlightNoInTxN, String rkFlightNoOutTxN,
			Date rkFlightArrivalDateN, Date rkFlightDepartureDateN, Date rkLastUpdatedDate, Date rkCreationDate,
			double rkRoomPriceMn, double rkRoomTaxMn, double rkPricePaidMn, double rkTaxPaidMn,
			Set<TIiinvoiceItem> TIiinvoiceItems, Set<TQiquoteItem> TQiquoteItems, Set<TVivoucherItem> TVivoucherItems) {
		this.rkRoomBookingId = rkRoomBookingId;
		this.TInInvoice = TInInvoice;
		this.TEmEmp = TEmEmp;
		this.THtHotel = THtHotel;
		this.TRmRoom = TRmRoom;
		this.TSoStore = TSoStore;
		this.TCuCust = TCuCust;
		this.rkRoomNoTxN = rkRoomNoTxN;
		this.rkStatusId = rkStatusId;
		this.rkStartDate = rkStartDate;
		this.rkEndDate = rkEndDate;
		this.rkCheckedInDateN = rkCheckedInDateN;
		this.rkCheckedOutDateN = rkCheckedOutDateN;
		this.rkNotesTxN = rkNotesTxN;
		this.rkRatePerNightMnN = rkRatePerNightMnN;
		this.rkGroupIdN = rkGroupIdN;
		this.rkFlightNoInTxN = rkFlightNoInTxN;
		this.rkFlightNoOutTxN = rkFlightNoOutTxN;
		this.rkFlightArrivalDateN = rkFlightArrivalDateN;
		this.rkFlightDepartureDateN = rkFlightDepartureDateN;
		this.rkLastUpdatedDate = rkLastUpdatedDate;
		this.rkCreationDate = rkCreationDate;
		this.rkRoomPriceMn = rkRoomPriceMn;
		this.rkRoomTaxMn = rkRoomTaxMn;
		this.rkPricePaidMn = rkPricePaidMn;
		this.rkTaxPaidMn = rkTaxPaidMn;
		this.TIiinvoiceItems = TIiinvoiceItems;
		this.TQiquoteItems = TQiquoteItems;
		this.TVivoucherItems = TVivoucherItems;
	}

	@Id

	@Column(name = "RkRoomBookingID", unique = true, nullable = false)
	public int getRkRoomBookingId() {
		return this.rkRoomBookingId;
	}

	public void setRkRoomBookingId(int rkRoomBookingId) {
		this.rkRoomBookingId = rkRoomBookingId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RkInvoiceID_N")
	public TInInvoice getTInInvoice() {
		return this.TInInvoice;
	}

	public void setTInInvoice(TInInvoice TInInvoice) {
		this.TInInvoice = TInInvoice;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RkEmpID", nullable = false)
	public TEmEmp getTEmEmp() {
		return this.TEmEmp;
	}

	public void setTEmEmp(TEmEmp TEmEmp) {
		this.TEmEmp = TEmEmp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RkHotelID_N")
	public THtHotel getTHtHotel() {
		return this.THtHotel;
	}

	public void setTHtHotel(THtHotel THtHotel) {
		this.THtHotel = THtHotel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RkRoomID_N")
	public TRmRoom getTRmRoom() {
		return this.TRmRoom;
	}

	public void setTRmRoom(TRmRoom TRmRoom) {
		this.TRmRoom = TRmRoom;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RkStoreID", nullable = false)
	public TSoStore getTSoStore() {
		return this.TSoStore;
	}

	public void setTSoStore(TSoStore TSoStore) {
		this.TSoStore = TSoStore;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RkCustID", nullable = false)
	public TCuCust getTCuCust() {
		return this.TCuCust;
	}

	public void setTCuCust(TCuCust TCuCust) {
		this.TCuCust = TCuCust;
	}

	@Column(name = "RkRoomNoTx_N")
	public String getRkRoomNoTxN() {
		return this.rkRoomNoTxN;
	}

	public void setRkRoomNoTxN(String rkRoomNoTxN) {
		this.rkRoomNoTxN = rkRoomNoTxN;
	}

	@Column(name = "RkStatusID", nullable = false)
	public int getRkStatusId() {
		return this.rkStatusId;
	}

	public void setRkStatusId(int rkStatusId) {
		this.rkStatusId = rkStatusId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RkStartDate", nullable = false, length = 23)
	public Date getRkStartDate() {
		return this.rkStartDate;
	}

	public void setRkStartDate(Date rkStartDate) {
		this.rkStartDate = rkStartDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RkEndDate", nullable = false, length = 23)
	public Date getRkEndDate() {
		return this.rkEndDate;
	}

	public void setRkEndDate(Date rkEndDate) {
		this.rkEndDate = rkEndDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RkCheckedInDate_N", length = 23)
	public Date getRkCheckedInDateN() {
		return this.rkCheckedInDateN;
	}

	public void setRkCheckedInDateN(Date rkCheckedInDateN) {
		this.rkCheckedInDateN = rkCheckedInDateN;
	}

	@Temporal(TemporalType.TIMESTAMP)
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RkFlightArrivalDate_N", length = 23)
	public Date getRkFlightArrivalDateN() {
		return this.rkFlightArrivalDateN;
	}

	public void setRkFlightArrivalDateN(Date rkFlightArrivalDateN) {
		this.rkFlightArrivalDateN = rkFlightArrivalDateN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RkFlightDepartureDate_N", length = 23)
	public Date getRkFlightDepartureDateN() {
		return this.rkFlightDepartureDateN;
	}

	public void setRkFlightDepartureDateN(Date rkFlightDepartureDateN) {
		this.rkFlightDepartureDateN = rkFlightDepartureDateN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RkLastUpdatedDate", nullable = false, length = 23)
	public Date getRkLastUpdatedDate() {
		return this.rkLastUpdatedDate;
	}

	public void setRkLastUpdatedDate(Date rkLastUpdatedDate) {
		this.rkLastUpdatedDate = rkLastUpdatedDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RkCreationDate", nullable = false, length = 23)
	public Date getRkCreationDate() {
		return this.rkCreationDate;
	}

	public void setRkCreationDate(Date rkCreationDate) {
		this.rkCreationDate = rkCreationDate;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TRkRoomBooking")
	public Set<TIiinvoiceItem> getTIiinvoiceItems() {
		return this.TIiinvoiceItems;
	}

	public void setTIiinvoiceItems(Set<TIiinvoiceItem> TIiinvoiceItems) {
		this.TIiinvoiceItems = TIiinvoiceItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TRkRoomBooking")
	public Set<TQiquoteItem> getTQiquoteItems() {
		return this.TQiquoteItems;
	}

	public void setTQiquoteItems(Set<TQiquoteItem> TQiquoteItems) {
		this.TQiquoteItems = TQiquoteItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TRkRoomBooking")
	public Set<TVivoucherItem> getTVivoucherItems() {
		return this.TVivoucherItems;
	}

	public void setTVivoucherItems(Set<TVivoucherItem> TVivoucherItems) {
		this.TVivoucherItems = TVivoucherItems;
	}

}
