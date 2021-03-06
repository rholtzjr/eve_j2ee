package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * D01DnDenomination generated by hbm2java
 */
@Entity
@Table(name = "d01_DnDenomination")
public class D01DnDenomination implements java.io.Serializable {

	private D01DnDenominationId id;

	public D01DnDenomination() {
	}

	public D01DnDenomination(D01DnDenominationId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "dnDenominationId", column = @Column(name = "DnDenominationID", nullable = false)),
			@AttributeOverride(name = "dnValueMn", column = @Column(name = "DnValueMn", nullable = false, precision = 53, scale = 0)),
			@AttributeOverride(name = "dnDescriptionTx", column = @Column(name = "DnDescriptionTx", nullable = false)),
			@AttributeOverride(name = "dnUnavailableBl", column = @Column(name = "DnUnavailableBl", nullable = false)),
			@AttributeOverride(name = "dnCreationDate", column = @Column(name = "DnCreationDate", nullable = false, length = 23)),
			@AttributeOverride(name = "dnLastUpdatedDate", column = @Column(name = "DnLastUpdatedDate", nullable = false, length = 23)),
			@AttributeOverride(name = "dnSortOrderIn", column = @Column(name = "DnSortOrderIn", nullable = false)),
			@AttributeOverride(name = "dnRequiredBl", column = @Column(name = "DnRequiredBl", nullable = false)) })
	public D01DnDenominationId getId() {
		return this.id;
	}

	public void setId(D01DnDenominationId id) {
		this.id = id;
	}

}
