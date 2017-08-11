package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * S01S7specialInterest generated by hbm2java
 */
@Entity
@Table(name = "s01_S7SpecialInterest")
public class S01S7specialInterest implements java.io.Serializable {

	private S01S7specialInterestId id;

	public S01S7specialInterest() {
	}

	public S01S7specialInterest(S01S7specialInterestId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "s7specialInterestId", column = @Column(name = "S7SpecialInterestID", nullable = false)),
			@AttributeOverride(name = "s7specialInterestTx", column = @Column(name = "S7SpecialInterestTx", nullable = false)),
			@AttributeOverride(name = "s7unavailableBl", column = @Column(name = "S7UnavailableBl", nullable = false)),
			@AttributeOverride(name = "s7lastUpdatedDate", column = @Column(name = "S7LastUpdatedDate", nullable = false, length = 23)),
			@AttributeOverride(name = "s7requiredBl", column = @Column(name = "S7RequiredBl", nullable = false)),
			@AttributeOverride(name = "s7creationDate", column = @Column(name = "S7CreationDate", nullable = false, length = 23)) })
	public S01S7specialInterestId getId() {
		return this.id;
	}

	public void setId(S01S7specialInterestId id) {
		this.id = id;
	}

}
