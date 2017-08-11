package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * Dtproperties generated by hbm2java
 */
@Entity
@Table(name = "dtproperties")
public class Dtproperties implements java.io.Serializable {

	private DtpropertiesId id;
	private int version;
	private Integer objectid;
	private String value;
	private String uvalue;
	private byte[] lvalue;

	public Dtproperties() {
	}

	public Dtproperties(DtpropertiesId id) {
		this.id = id;
	}

	public Dtproperties(DtpropertiesId id, Integer objectid, String value, String uvalue, byte[] lvalue) {
		this.id = id;
		this.objectid = objectid;
		this.value = value;
		this.uvalue = uvalue;
		this.lvalue = lvalue;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "property", column = @Column(name = "property", nullable = false, length = 64)) })
	public DtpropertiesId getId() {
		return this.id;
	}

	public void setId(DtpropertiesId id) {
		this.id = id;
	}

	@Version
	@Column(name = "version", nullable = false)
	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Column(name = "objectid")
	public Integer getObjectid() {
		return this.objectid;
	}

	public void setObjectid(Integer objectid) {
		this.objectid = objectid;
	}

	@Column(name = "value")
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "uvalue")
	public String getUvalue() {
		return this.uvalue;
	}

	public void setUvalue(String uvalue) {
		this.uvalue = uvalue;
	}

	@Column(name = "lvalue")
	public byte[] getLvalue() {
		return this.lvalue;
	}

	public void setLvalue(byte[] lvalue) {
		this.lvalue = lvalue;
	}

}
