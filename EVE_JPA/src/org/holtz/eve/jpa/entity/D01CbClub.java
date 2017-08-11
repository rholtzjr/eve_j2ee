package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * D01CbClub generated by hbm2java
 */
@Entity
@Table(name = "d01_CbClub")
public class D01CbClub implements java.io.Serializable {

	private D01CbClubId id;

	public D01CbClub() {
	}

	public D01CbClub(D01CbClubId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "cbClubId", column = @Column(name = "CbClubID", nullable = false)),
			@AttributeOverride(name = "cbClubNameTx", column = @Column(name = "CbClubNameTx", nullable = false)),
			@AttributeOverride(name = "cbRegionId", column = @Column(name = "CbRegionID", nullable = false)),
			@AttributeOverride(name = "cbPoolTimeTxN", column = @Column(name = "CbPoolTimeTx_N")),
			@AttributeOverride(name = "cbPoolLocationTxN", column = @Column(name = "CbPoolLocationTx_N")),
			@AttributeOverride(name = "cbDryTimeTxN", column = @Column(name = "CbDryTimeTx_N")),
			@AttributeOverride(name = "cbDryLocationTxN", column = @Column(name = "CbDryLocationTx_N")),
			@AttributeOverride(name = "cbYearPaidInN", column = @Column(name = "CbYearPaidIn_N")),
			@AttributeOverride(name = "cbClubOpenTxN", column = @Column(name = "CbClubOpenTx_N")),
			@AttributeOverride(name = "cbNotesTxN", column = @Column(name = "CbNotesTx_N")),
			@AttributeOverride(name = "cbUnavailableBl", column = @Column(name = "CbUnavailableBl", nullable = false)),
			@AttributeOverride(name = "cbCertificatePrintedDate", column = @Column(name = "CbCertificatePrintedDate", nullable = false, length = 23)),
			@AttributeOverride(name = "cbLastUpdatedDate", column = @Column(name = "CbLastUpdatedDate", nullable = false, length = 23)),
			@AttributeOverride(name = "cbRequiredBl", column = @Column(name = "CbRequiredBl", nullable = false)),
			@AttributeOverride(name = "cbCreationDate", column = @Column(name = "CbCreationDate", nullable = false, length = 23)),
			@AttributeOverride(name = "cbNextMemberNoIn", column = @Column(name = "CbNextMemberNoIn", nullable = false)),
			@AttributeOverride(name = "cbEolclubBl", column = @Column(name = "CbEOLClubBl", nullable = false)) })
	public D01CbClubId getId() {
		return this.id;
	}

	public void setId(D01CbClubId id) {
		this.id = id;
	}

}
