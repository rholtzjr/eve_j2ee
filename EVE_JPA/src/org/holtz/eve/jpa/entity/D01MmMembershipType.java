package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * D01MmMembershipType generated by hbm2java
 */
@Entity
@Table(name = "d01_MmMembershipType")
public class D01MmMembershipType implements java.io.Serializable {

	private D01MmMembershipTypeId id;

	public D01MmMembershipType() {
	}

	public D01MmMembershipType(D01MmMembershipTypeId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "mmMembershipTypeId", column = @Column(name = "MmMembershipTypeID", nullable = false)),
			@AttributeOverride(name = "mmMembershipTypeTx", column = @Column(name = "MmMembershipTypeTx", nullable = false)),
			@AttributeOverride(name = "mmUnavailableBl", column = @Column(name = "MmUnavailableBl", nullable = false)),
			@AttributeOverride(name = "mmLastUpdatedDate", column = @Column(name = "MmLastUpdatedDate", nullable = false, length = 23)),
			@AttributeOverride(name = "mmRequiredBl", column = @Column(name = "MmRequiredBl", nullable = false)),
			@AttributeOverride(name = "mmCreationDate", column = @Column(name = "MmCreationDate", nullable = false, length = 23)) })
	public D01MmMembershipTypeId getId() {
		return this.id;
	}

	public void setId(D01MmMembershipTypeId id) {
		this.id = id;
	}

}
