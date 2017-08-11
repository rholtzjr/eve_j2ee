package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EolCourseItem generated by hbm2java
 */
@Entity
@Table(name = "eol_CourseItem")
public class EolCourseItem implements java.io.Serializable {

	private EolCourseItemId id;

	public EolCourseItem() {
	}

	public EolCourseItem(EolCourseItemId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "csCourseId", column = @Column(name = "CsCourseID", nullable = false)),
			@AttributeOverride(name = "soStoreId", column = @Column(name = "SoStoreID", nullable = false)),
			@AttributeOverride(name = "ctcourseTypeId", column = @Column(name = "CTCourseTypeID", nullable = false)),
			@AttributeOverride(name = "csTypeNameTx", column = @Column(name = "CsTypeNameTx", nullable = false)),
			@AttributeOverride(name = "csNumberTx", column = @Column(name = "CsNumberTx", nullable = false)),
			@AttributeOverride(name = "csStartDate", column = @Column(name = "CsStartDate", nullable = false, length = 23)),
			@AttributeOverride(name = "csEndDate", column = @Column(name = "CsEndDate", nullable = false, length = 23)),
			@AttributeOverride(name = "cturltxN", column = @Column(name = "CTURLTx_N")),
			@AttributeOverride(name = "csCourseStatusId", column = @Column(name = "CsCourseStatusID")),
			@AttributeOverride(name = "csMinPlacesIn", column = @Column(name = "CsMinPlacesIn", nullable = false)),
			@AttributeOverride(name = "csMaxPlacesIn", column = @Column(name = "CsMaxPlacesIn", nullable = false)),
			@AttributeOverride(name = "csPlacesAvailableIn", column = @Column(name = "CsPlacesAvailableIn")),
			@AttributeOverride(name = "sistockItemId", column = @Column(name = "SIStockItemID", nullable = false)),
			@AttributeOverride(name = "lcLocationId", column = @Column(name = "LcLocationID")) })
	public EolCourseItemId getId() {
		return this.id;
	}

	public void setId(EolCourseItemId id) {
		this.id = id;
	}

}
