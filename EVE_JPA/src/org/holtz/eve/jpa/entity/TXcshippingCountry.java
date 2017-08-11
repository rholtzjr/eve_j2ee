package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TXcshippingCountry generated by hbm2java
 */
@Entity
@Table(name = "T_XCShippingCountry")
public class TXcshippingCountry implements java.io.Serializable {

	private int xcshippingCountryId;
	private TXzshippingZone TXzshippingZone;
	private TSeState TSeState;
	private TCyCountry TCyCountry;

	public TXcshippingCountry() {
	}

	public TXcshippingCountry(int xcshippingCountryId, TXzshippingZone TXzshippingZone, TCyCountry TCyCountry) {
		this.xcshippingCountryId = xcshippingCountryId;
		this.TXzshippingZone = TXzshippingZone;
		this.TCyCountry = TCyCountry;
	}

	public TXcshippingCountry(int xcshippingCountryId, TXzshippingZone TXzshippingZone, TSeState TSeState,
			TCyCountry TCyCountry) {
		this.xcshippingCountryId = xcshippingCountryId;
		this.TXzshippingZone = TXzshippingZone;
		this.TSeState = TSeState;
		this.TCyCountry = TCyCountry;
	}

	@Id

	@Column(name = "XCShippingCountryID", unique = true, nullable = false)
	public int getXcshippingCountryId() {
		return this.xcshippingCountryId;
	}

	public void setXcshippingCountryId(int xcshippingCountryId) {
		this.xcshippingCountryId = xcshippingCountryId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "XCShippingZoneID", nullable = false)
	public TXzshippingZone getTXzshippingZone() {
		return this.TXzshippingZone;
	}

	public void setTXzshippingZone(TXzshippingZone TXzshippingZone) {
		this.TXzshippingZone = TXzshippingZone;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "XCStateID_N")
	public TSeState getTSeState() {
		return this.TSeState;
	}

	public void setTSeState(TSeState TSeState) {
		this.TSeState = TSeState;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "XCCountryID", nullable = false)
	public TCyCountry getTCyCountry() {
		return this.TCyCountry;
	}

	public void setTCyCountry(TCyCountry TCyCountry) {
		this.TCyCountry = TCyCountry;
	}

}
