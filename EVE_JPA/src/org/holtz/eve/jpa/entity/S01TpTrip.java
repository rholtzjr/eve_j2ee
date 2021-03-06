package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * S01TpTrip generated by hbm2java
 */
@Entity
@Table(name = "s01_TpTrip")
public class S01TpTrip implements java.io.Serializable {

	private S01TpTripId id;

	public S01TpTrip() {
	}

	public S01TpTrip(S01TpTripId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "tpTripId", column = @Column(name = "TpTripID", nullable = false)),
			@AttributeOverride(name = "tpTripNoTx", column = @Column(name = "TpTripNoTx", nullable = false)),
			@AttributeOverride(name = "tpDestinationIdN", column = @Column(name = "TpDestinationID_N")),
			@AttributeOverride(name = "tpBoatIdN", column = @Column(name = "TpBoatID_N")),
			@AttributeOverride(name = "tpStartDateN", column = @Column(name = "TpStartDate_N", length = 23)),
			@AttributeOverride(name = "tpEndDateN", column = @Column(name = "TpEndDate_N", length = 23)),
			@AttributeOverride(name = "tpNotesTxN", column = @Column(name = "TpNotesTx_N")),
			@AttributeOverride(name = "tpMinNoIn", column = @Column(name = "TpMinNoIn", nullable = false)),
			@AttributeOverride(name = "tpMaxNoIn", column = @Column(name = "TpMaxNoIn", nullable = false)),
			@AttributeOverride(name = "tpParentTripIdN", column = @Column(name = "TpParentTripID_N")),
			@AttributeOverride(name = "tpStoreId", column = @Column(name = "TpStoreID", nullable = false)),
			@AttributeOverride(name = "tpCreationDate", column = @Column(name = "TpCreationDate", nullable = false, length = 23)),
			@AttributeOverride(name = "tpWaiverRequiredBl", column = @Column(name = "TpWaiverRequiredBl", nullable = false)),
			@AttributeOverride(name = "tpMeetingPointTxN", column = @Column(name = "TpMeetingPointTx_N")),
			@AttributeOverride(name = "tpPassportRequiredBl", column = @Column(name = "TpPassportRequiredBl", nullable = false)),
			@AttributeOverride(name = "tpTripStatusId", column = @Column(name = "TpTripStatusID", nullable = false)),
			@AttributeOverride(name = "tpLastUpdatedDate", column = @Column(name = "TpLastUpdatedDate", length = 23)),
			@AttributeOverride(name = "tpTripTypeId", column = @Column(name = "TpTripTypeID", nullable = false)),
			@AttributeOverride(name = "tpArrivalMinsIn", column = @Column(name = "TpArrivalMinsIn", nullable = false)),
			@AttributeOverride(name = "tpNoOfDivesInN", column = @Column(name = "TpNoOfDivesIn_N")),
			@AttributeOverride(name = "tpRentalBookingIdN", column = @Column(name = "TpRentalBookingID_N")),
			@AttributeOverride(name = "tpCertPriorityInN", column = @Column(name = "TpCertPriorityIn_N")),
			@AttributeOverride(name = "tpPrivateNotesTxN", column = @Column(name = "TpPrivateNotesTx_N")),
			@AttributeOverride(name = "tpPlacesAvailableIn", column = @Column(name = "TpPlacesAvailableIn", nullable = false)),
			@AttributeOverride(name = "tpMoreInfoTxN", column = @Column(name = "TpMoreInfoTx_N")),
			@AttributeOverride(name = "tpVanIdN", column = @Column(name = "TpVanID_N")) })
	public S01TpTripId getId() {
		return this.id;
	}

	public void setId(S01TpTripId id) {
		this.id = id;
	}

}
