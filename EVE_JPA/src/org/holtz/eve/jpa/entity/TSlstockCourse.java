package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TSlstockCourse generated by hbm2java
 */
@Entity
@Table(name = "T_SLStockCourse")
public class TSlstockCourse implements java.io.Serializable {

	private TSlstockCourseId id;
	private TCsCourse TCsCourse;
	private TSistockItem TSistockItem;
	private int slDisplayOrderIn;

	public TSlstockCourse() {
	}

	public TSlstockCourse(TSlstockCourseId id, TCsCourse TCsCourse, TSistockItem TSistockItem, int slDisplayOrderIn) {
		this.id = id;
		this.TCsCourse = TCsCourse;
		this.TSistockItem = TSistockItem;
		this.slDisplayOrderIn = slDisplayOrderIn;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "slstockItemId", column = @Column(name = "SLStockItemId", nullable = false)),
			@AttributeOverride(name = "slcourseId", column = @Column(name = "SLCourseId", nullable = false)) })
	public TSlstockCourseId getId() {
		return this.id;
	}

	public void setId(TSlstockCourseId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SLCourseId", nullable = false, insertable = false, updatable = false)
	public TCsCourse getTCsCourse() {
		return this.TCsCourse;
	}

	public void setTCsCourse(TCsCourse TCsCourse) {
		this.TCsCourse = TCsCourse;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SLStockItemId", nullable = false, insertable = false, updatable = false)
	public TSistockItem getTSistockItem() {
		return this.TSistockItem;
	}

	public void setTSistockItem(TSistockItem TSistockItem) {
		this.TSistockItem = TSistockItem;
	}

	@Column(name = "SlDisplayOrderIn", nullable = false)
	public int getSlDisplayOrderIn() {
		return this.slDisplayOrderIn;
	}

	public void setSlDisplayOrderIn(int slDisplayOrderIn) {
		this.slDisplayOrderIn = slDisplayOrderIn;
	}

}
