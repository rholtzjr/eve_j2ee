package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * S01LcLocation generated by hbm2java
 */
@Entity
@Table(name = "s01_LcLocation")
public class S01LcLocation implements java.io.Serializable {

	private S01LcLocationId id;

	public S01LcLocation() {
	}

	public S01LcLocation(S01LcLocationId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "lcLocationId", column = @Column(name = "LcLocationID", nullable = false)),
			@AttributeOverride(name = "lcLocationTx", column = @Column(name = "LcLocationTx", nullable = false)),
			@AttributeOverride(name = "lcUnavailableBl", column = @Column(name = "LcUnavailableBl", nullable = false)),
			@AttributeOverride(name = "lcLastUpdatedDate", column = @Column(name = "LcLastUpdatedDate", nullable = false, length = 23)),
			@AttributeOverride(name = "lcRequiredBl", column = @Column(name = "LcRequiredBl", nullable = false)),
			@AttributeOverride(name = "lcDoubleBookingCountIn", column = @Column(name = "LcDoubleBookingCountIn", nullable = false)),
			@AttributeOverride(name = "lcCreationDate", column = @Column(name = "LcCreationDate", nullable = false, length = 23)),
			@AttributeOverride(name = "lcForeColorIn", column = @Column(name = "LcForeColorIn", nullable = false)),
			@AttributeOverride(name = "lcBackColorIn", column = @Column(name = "LcBackColorIn", nullable = false)),
			@AttributeOverride(name = "lcUrltxN", column = @Column(name = "LcURLTx_N")),
			@AttributeOverride(name = "lcAddress1txN", column = @Column(name = "LcAddress1Tx_N")),
			@AttributeOverride(name = "lcAddress2txN", column = @Column(name = "LcAddress2Tx_N")),
			@AttributeOverride(name = "lcAddress3txN", column = @Column(name = "LcAddress3Tx_N")),
			@AttributeOverride(name = "lcAddress4txN", column = @Column(name = "LcAddress4Tx_N")),
			@AttributeOverride(name = "lcStateIdN", column = @Column(name = "LcStateID_N")),
			@AttributeOverride(name = "lcPostCodeTxN", column = @Column(name = "LcPostCodeTx_N")),
			@AttributeOverride(name = "lcCountryIdN", column = @Column(name = "LcCountryID_N")),
			@AttributeOverride(name = "lcWaitingListCapacityIn", column = @Column(name = "LcWaitingListCapacityIn", nullable = false)) })
	public S01LcLocationId getId() {
		return this.id;
	}

	public void setId(S01LcLocationId id) {
		this.id = id;
	}

}
