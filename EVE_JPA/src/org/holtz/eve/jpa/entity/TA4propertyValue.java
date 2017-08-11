package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TA4propertyValue generated by hbm2java
 */
@Entity
@Table(name = "T_A4PropertyValue")
public class TA4propertyValue implements java.io.Serializable {

	private int a4propertyValueId;
	private TA3propertyType TA3propertyType;
	private String a4propertyValueTx;
	private Set<TSistockItem> TSistockItems = new HashSet<TSistockItem>(0);

	public TA4propertyValue() {
	}

	public TA4propertyValue(int a4propertyValueId, TA3propertyType TA3propertyType, String a4propertyValueTx) {
		this.a4propertyValueId = a4propertyValueId;
		this.TA3propertyType = TA3propertyType;
		this.a4propertyValueTx = a4propertyValueTx;
	}

	public TA4propertyValue(int a4propertyValueId, TA3propertyType TA3propertyType, String a4propertyValueTx,
			Set<TSistockItem> TSistockItems) {
		this.a4propertyValueId = a4propertyValueId;
		this.TA3propertyType = TA3propertyType;
		this.a4propertyValueTx = a4propertyValueTx;
		this.TSistockItems = TSistockItems;
	}

	@Id

	@Column(name = "A4PropertyValueID", unique = true, nullable = false)
	public int getA4propertyValueId() {
		return this.a4propertyValueId;
	}

	public void setA4propertyValueId(int a4propertyValueId) {
		this.a4propertyValueId = a4propertyValueId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "A4PropertyTypeID", nullable = false)
	public TA3propertyType getTA3propertyType() {
		return this.TA3propertyType;
	}

	public void setTA3propertyType(TA3propertyType TA3propertyType) {
		this.TA3propertyType = TA3propertyType;
	}

	@Column(name = "A4PropertyValueTx", nullable = false)
	public String getA4propertyValueTx() {
		return this.a4propertyValueTx;
	}

	public void setA4propertyValueTx(String a4propertyValueTx) {
		this.a4propertyValueTx = a4propertyValueTx;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_A5StockItemPropertyValue", joinColumns = {
			@JoinColumn(name = "A5PropertyValueID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "A5StockItemID", nullable = false, updatable = false) })
	public Set<TSistockItem> getTSistockItems() {
		return this.TSistockItems;
	}

	public void setTSistockItems(Set<TSistockItem> TSistockItems) {
		this.TSistockItems = TSistockItems;
	}

}
