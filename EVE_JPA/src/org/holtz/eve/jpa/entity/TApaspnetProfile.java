package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * TApaspnetProfile generated by hbm2java
 */
@Entity
@Table(name = "T_APAspnet_Profile")
public class TApaspnetProfile implements java.io.Serializable {

	private int apUserId;
	private TCuCust TCuCust;
	private String apPropertyNames;
	private String apPropertyValuesString;
	private byte[] apPropertyValuesBinary;
	private Date apLastUpdatedDate;

	public TApaspnetProfile() {
	}

	public TApaspnetProfile(TCuCust TCuCust, String apPropertyNames, String apPropertyValuesString,
			byte[] apPropertyValuesBinary, Date apLastUpdatedDate) {
		this.TCuCust = TCuCust;
		this.apPropertyNames = apPropertyNames;
		this.apPropertyValuesString = apPropertyValuesString;
		this.apPropertyValuesBinary = apPropertyValuesBinary;
		this.apLastUpdatedDate = apLastUpdatedDate;
	}

	@GenericGenerator(name = "tapAspNetgenerator", strategy = "foreign", parameters = @Parameter(name = "property", value = "TCuCust"))
	@Id
	@GeneratedValue(generator = "tapAspNetgenerator")

	@Column(name = "ApUserId", unique = true, nullable = false)
	public int getApUserId() {
		return this.apUserId;
	}

	public void setApUserId(int apUserId) {
		this.apUserId = apUserId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public TCuCust getTCuCust() {
		return this.TCuCust;
	}

	public void setTCuCust(TCuCust TCuCust) {
		this.TCuCust = TCuCust;
	}

	@Column(name = "ApPropertyNames", nullable = false)
	public String getApPropertyNames() {
		return this.apPropertyNames;
	}

	public void setApPropertyNames(String apPropertyNames) {
		this.apPropertyNames = apPropertyNames;
	}

	@Column(name = "ApPropertyValuesString", nullable = false)
	public String getApPropertyValuesString() {
		return this.apPropertyValuesString;
	}

	public void setApPropertyValuesString(String apPropertyValuesString) {
		this.apPropertyValuesString = apPropertyValuesString;
	}

	@Column(name = "ApPropertyValuesBinary", nullable = false)
	public byte[] getApPropertyValuesBinary() {
		return this.apPropertyValuesBinary;
	}

	public void setApPropertyValuesBinary(byte[] apPropertyValuesBinary) {
		this.apPropertyValuesBinary = apPropertyValuesBinary;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ApLastUpdatedDate", nullable = false, length = 23)
	public Date getApLastUpdatedDate() {
		return this.apLastUpdatedDate;
	}

	public void setApLastUpdatedDate(Date apLastUpdatedDate) {
		this.apLastUpdatedDate = apLastUpdatedDate;
	}

}
