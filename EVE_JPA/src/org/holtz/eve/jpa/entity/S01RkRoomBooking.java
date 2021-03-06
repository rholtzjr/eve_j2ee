package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * S01RkRoomBooking generated by hbm2java
 */
@Entity
@Table(name = "s01_RkRoomBooking")
public class S01RkRoomBooking implements java.io.Serializable {

	private S01RkRoomBookingId id;

	public S01RkRoomBooking() {
	}

	public S01RkRoomBooking(S01RkRoomBookingId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "rkRoomBookingId", column = @Column(name = "RkRoomBookingID", nullable = false)),
			@AttributeOverride(name = "rkHotelIdN", column = @Column(name = "RkHotelID_N")),
			@AttributeOverride(name = "rkRoomIdN", column = @Column(name = "RkRoomID_N")),
			@AttributeOverride(name = "rkRoomNoTxN", column = @Column(name = "RkRoomNoTx_N")),
			@AttributeOverride(name = "rkCustId", column = @Column(name = "RkCustID", nullable = false)),
			@AttributeOverride(name = "rkStatusId", column = @Column(name = "RkStatusID", nullable = false)),
			@AttributeOverride(name = "rkStartDate", column = @Column(name = "RkStartDate", nullable = false, length = 23)),
			@AttributeOverride(name = "rkEndDate", column = @Column(name = "RkEndDate", nullable = false, length = 23)),
			@AttributeOverride(name = "rkCheckedInDateN", column = @Column(name = "RkCheckedInDate_N", length = 23)),
			@AttributeOverride(name = "rkCheckedOutDateN", column = @Column(name = "RkCheckedOutDate_N", length = 23)),
			@AttributeOverride(name = "rkNotesTxN", column = @Column(name = "RkNotesTx_N")),
			@AttributeOverride(name = "rkEmpId", column = @Column(name = "RkEmpID", nullable = false)),
			@AttributeOverride(name = "rkRatePerNightMnN", column = @Column(name = "RkRatePerNightMn_N", precision = 53, scale = 0)),
			@AttributeOverride(name = "rkGroupIdN", column = @Column(name = "RkGroupID_N")),
			@AttributeOverride(name = "rkFlightNoInTxN", column = @Column(name = "RkFlightNoInTx_N")),
			@AttributeOverride(name = "rkFlightNoOutTxN", column = @Column(name = "RkFlightNoOutTx_N")),
			@AttributeOverride(name = "rkFlightArrivalDateN", column = @Column(name = "RkFlightArrivalDate_N", length = 23)),
			@AttributeOverride(name = "rkFlightDepartureDateN", column = @Column(name = "RkFlightDepartureDate_N", length = 23)),
			@AttributeOverride(name = "rkLastUpdatedDate", column = @Column(name = "RkLastUpdatedDate", nullable = false, length = 23)),
			@AttributeOverride(name = "rkCreationDate", column = @Column(name = "RkCreationDate", nullable = false, length = 23)),
			@AttributeOverride(name = "rkInvoiceIdN", column = @Column(name = "RkInvoiceID_N")),
			@AttributeOverride(name = "rkStoreId", column = @Column(name = "RkStoreID", nullable = false)),
			@AttributeOverride(name = "rkRoomPriceMn", column = @Column(name = "RkRoomPriceMn", nullable = false, precision = 53, scale = 0)),
			@AttributeOverride(name = "rkRoomTaxMn", column = @Column(name = "RkRoomTaxMn", nullable = false, precision = 53, scale = 0)),
			@AttributeOverride(name = "rkPricePaidMn", column = @Column(name = "RkPricePaidMn", nullable = false, precision = 53, scale = 0)),
			@AttributeOverride(name = "rkTaxPaidMn", column = @Column(name = "RkTaxPaidMn", nullable = false, precision = 53, scale = 0)) })
	public S01RkRoomBookingId getId() {
		return this.id;
	}

	public void setId(S01RkRoomBookingId id) {
		this.id = id;
	}

}
