package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * D01IcInventoryLocation generated by hbm2java
 */
@Entity
@Table(name = "d01_IcInventoryLocation")
public class D01IcInventoryLocation implements java.io.Serializable {

	private D01IcInventoryLocationId id;

	public D01IcInventoryLocation() {
	}

	public D01IcInventoryLocation(D01IcInventoryLocationId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "icInventoryLocationId", column = @Column(name = "IcInventoryLocationID", nullable = false)),
			@AttributeOverride(name = "icInventoryLocationTx", column = @Column(name = "IcInventoryLocationTx", nullable = false)),
			@AttributeOverride(name = "icUnavailableBl", column = @Column(name = "IcUnavailableBl", nullable = false)),
			@AttributeOverride(name = "icCreationDate", column = @Column(name = "IcCreationDate", nullable = false, length = 23)),
			@AttributeOverride(name = "icLastUpdatedDate", column = @Column(name = "IcLastUpdatedDate", nullable = false, length = 23)),
			@AttributeOverride(name = "icLocationId", column = @Column(name = "IcLocationID", nullable = false)),
			@AttributeOverride(name = "icRequiredBl", column = @Column(name = "IcRequiredBl", nullable = false)) })
	public D01IcInventoryLocationId getId() {
		return this.id;
	}

	public void setId(D01IcInventoryLocationId id) {
		this.id = id;
	}

}
