package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TOtoptionType generated by hbm2java
 */
@Entity
@Table(name = "T_OTOptionType", uniqueConstraints = @UniqueConstraint(columnNames = "OTTypeTx"))
public class TOtoptionType implements java.io.Serializable {

	private String ottypeId;
	private String ottypeTx;

	public TOtoptionType() {
	}

	public TOtoptionType(String ottypeId) {
		this.ottypeId = ottypeId;
	}

	public TOtoptionType(String ottypeId, String ottypeTx) {
		this.ottypeId = ottypeId;
		this.ottypeTx = ottypeTx;
	}

	@Id

	@Column(name = "OTTypeID", unique = true, nullable = false)
	public String getOttypeId() {
		return this.ottypeId;
	}

	public void setOttypeId(String ottypeId) {
		this.ottypeId = ottypeId;
	}

	@Column(name = "OTTypeTx", unique = true)
	public String getOttypeTx() {
		return this.ottypeTx;
	}

	public void setOttypeTx(String ottypeTx) {
		this.ottypeTx = ottypeTx;
	}

}
