package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * TVnVan generated by hbm2java
 */
@Entity
@Table(name = "T_VnVan", uniqueConstraints = @UniqueConstraint(columnNames = "VnVanNameTx"))
public class TVnVan implements java.io.Serializable {

	private int vnVanId;
	private String vnVanNameTx;
	private short vnCapacityIn;
	private boolean vnUnavailableBl;
	private Date vnCreationDate;
	private Date vnLastUpdatedDate;
	private boolean vnRequiredBl;
	private String vnPrefixTx;
	private String vnSeatConfigTxN;
	private String vnVanIconGraphicTxN;
	private String vnVanGraphicTxN;
	private int vnVanGraphicLeftIn;
	private int vnVanGraphicWidthIn;
	private int vnVanGraphicHeightIn;
	private int vnForeColorIn;
	private int vnBackColorIn;
	private Set<TSoStore> TSoStores = new HashSet<TSoStore>(0);
	private Set<TCpCustTrip> TCpCustTrips = new HashSet<TCpCustTrip>(0);
	private Set<TTpTrip> TTpTrips = new HashSet<TTpTrip>(0);

	public TVnVan() {
	}

	public TVnVan(int vnVanId, String vnVanNameTx, short vnCapacityIn, boolean vnUnavailableBl, Date vnCreationDate,
			Date vnLastUpdatedDate, boolean vnRequiredBl, String vnPrefixTx, int vnVanGraphicLeftIn,
			int vnVanGraphicWidthIn, int vnVanGraphicHeightIn, int vnForeColorIn, int vnBackColorIn) {
		this.vnVanId = vnVanId;
		this.vnVanNameTx = vnVanNameTx;
		this.vnCapacityIn = vnCapacityIn;
		this.vnUnavailableBl = vnUnavailableBl;
		this.vnCreationDate = vnCreationDate;
		this.vnLastUpdatedDate = vnLastUpdatedDate;
		this.vnRequiredBl = vnRequiredBl;
		this.vnPrefixTx = vnPrefixTx;
		this.vnVanGraphicLeftIn = vnVanGraphicLeftIn;
		this.vnVanGraphicWidthIn = vnVanGraphicWidthIn;
		this.vnVanGraphicHeightIn = vnVanGraphicHeightIn;
		this.vnForeColorIn = vnForeColorIn;
		this.vnBackColorIn = vnBackColorIn;
	}

	public TVnVan(int vnVanId, String vnVanNameTx, short vnCapacityIn, boolean vnUnavailableBl, Date vnCreationDate,
			Date vnLastUpdatedDate, boolean vnRequiredBl, String vnPrefixTx, String vnSeatConfigTxN,
			String vnVanIconGraphicTxN, String vnVanGraphicTxN, int vnVanGraphicLeftIn,
			int vnVanGraphicWidthIn, int vnVanGraphicHeightIn, int vnForeColorIn, int vnBackColorIn,
			Set<TSoStore> TSoStores, Set<TCpCustTrip> TCpCustTrips, Set<TTpTrip> TTpTrips) {
		this.vnVanId = vnVanId;
		this.vnVanNameTx = vnVanNameTx;
		this.vnCapacityIn = vnCapacityIn;
		this.vnUnavailableBl = vnUnavailableBl;
		this.vnCreationDate = vnCreationDate;
		this.vnLastUpdatedDate = vnLastUpdatedDate;
		this.vnRequiredBl = vnRequiredBl;
		this.vnPrefixTx = vnPrefixTx;
		this.vnSeatConfigTxN = vnSeatConfigTxN;
		this.vnVanIconGraphicTxN = vnVanIconGraphicTxN;
		this.vnVanGraphicTxN = vnVanGraphicTxN;
		this.vnVanGraphicLeftIn = vnVanGraphicLeftIn;
		this.vnVanGraphicWidthIn = vnVanGraphicWidthIn;
		this.vnVanGraphicHeightIn = vnVanGraphicHeightIn;
		this.vnForeColorIn = vnForeColorIn;
		this.vnBackColorIn = vnBackColorIn;
		this.TSoStores = TSoStores;
		this.TCpCustTrips = TCpCustTrips;
		this.TTpTrips = TTpTrips;
	}

	@Id

	@Column(name = "VnVanID", unique = true, nullable = false)
	public int getVnVanId() {
		return this.vnVanId;
	}

	public void setVnVanId(int vnVanId) {
		this.vnVanId = vnVanId;
	}

	@Column(name = "VnVanNameTx", unique = true, nullable = false, length = 30)
	public String getVnVanNameTx() {
		return this.vnVanNameTx;
	}

	public void setVnVanNameTx(String vnVanNameTx) {
		this.vnVanNameTx = vnVanNameTx;
	}

	@Column(name = "VnCapacityIn", nullable = false)
	public short getVnCapacityIn() {
		return this.vnCapacityIn;
	}

	public void setVnCapacityIn(short vnCapacityIn) {
		this.vnCapacityIn = vnCapacityIn;
	}

	@Column(name = "VnUnavailableBl", nullable = false)
	public boolean isVnUnavailableBl() {
		return this.vnUnavailableBl;
	}

	public void setVnUnavailableBl(boolean vnUnavailableBl) {
		this.vnUnavailableBl = vnUnavailableBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "VnCreationDate", nullable = false, length = 23)
	public Date getVnCreationDate() {
		return this.vnCreationDate;
	}

	public void setVnCreationDate(Date vnCreationDate) {
		this.vnCreationDate = vnCreationDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "VnLastUpdatedDate", nullable = false, length = 23)
	public Date getVnLastUpdatedDate() {
		return this.vnLastUpdatedDate;
	}

	public void setVnLastUpdatedDate(Date vnLastUpdatedDate) {
		this.vnLastUpdatedDate = vnLastUpdatedDate;
	}

	@Column(name = "VnRequiredBl", nullable = false)
	public boolean isVnRequiredBl() {
		return this.vnRequiredBl;
	}

	public void setVnRequiredBl(boolean vnRequiredBl) {
		this.vnRequiredBl = vnRequiredBl;
	}

	@Column(name = "VnPrefixTx", nullable = false)
	public String getVnPrefixTx() {
		return this.vnPrefixTx;
	}

	public void setVnPrefixTx(String vnPrefixTx) {
		this.vnPrefixTx = vnPrefixTx;
	}

	@Column(name = "VnSeatConfigTx_N")
	public String getVnSeatConfigTxN() {
		return this.vnSeatConfigTxN;
	}

	public void setVnSeatConfigTxN(String vnSeatConfigTxN) {
		this.vnSeatConfigTxN = vnSeatConfigTxN;
	}

	@Column(name = "VnVanIconGraphicTx_N")
	public String getVnVanIconGraphicTxN() {
		return this.vnVanIconGraphicTxN;
	}

	public void setVnVanIconGraphicTxN(String vnVanIconGraphicTxN) {
		this.vnVanIconGraphicTxN = vnVanIconGraphicTxN;
	}

	@Column(name = "VnVanGraphicTx_N")
	public String getVnVanGraphicTxN() {
		return this.vnVanGraphicTxN;
	}

	public void setVnVanGraphicTxN(String vnVanGraphicTxN) {
		this.vnVanGraphicTxN = vnVanGraphicTxN;
	}

	@Column(name = "VnVanGraphicLeftIn", nullable = false)
	public int getVnVanGraphicLeftIn() {
		return this.vnVanGraphicLeftIn;
	}

	public void setVnVanGraphicLeftIn(int vnVanGraphicLeftIn) {
		this.vnVanGraphicLeftIn = vnVanGraphicLeftIn;
	}

	@Column(name = "VnVanGraphicWidthIn", nullable = false)
	public int getVnVanGraphicWidthIn() {
		return this.vnVanGraphicWidthIn;
	}

	public void setVnVanGraphicWidthIn(int vnVanGraphicWidthIn) {
		this.vnVanGraphicWidthIn = vnVanGraphicWidthIn;
	}

	@Column(name = "VnVanGraphicHeightIn", nullable = false)
	public int getVnVanGraphicHeightIn() {
		return this.vnVanGraphicHeightIn;
	}

	public void setVnVanGraphicHeightIn(int vnVanGraphicHeightIn) {
		this.vnVanGraphicHeightIn = vnVanGraphicHeightIn;
	}

	@Column(name = "VnForeColorIn", nullable = false)
	public int getVnForeColorIn() {
		return this.vnForeColorIn;
	}

	public void setVnForeColorIn(int vnForeColorIn) {
		this.vnForeColorIn = vnForeColorIn;
	}

	@Column(name = "VnBackColorIn", nullable = false)
	public int getVnBackColorIn() {
		return this.vnBackColorIn;
	}

	public void setVnBackColorIn(int vnBackColorIn) {
		this.vnBackColorIn = vnBackColorIn;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_ZVStoreVan", joinColumns = {
			@JoinColumn(name = "ZVVanID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "ZVStoreID", nullable = false, updatable = false) })
	public Set<TSoStore> getTSoStores() {
		return this.TSoStores;
	}

	public void setTSoStores(Set<TSoStore> TSoStores) {
		this.TSoStores = TSoStores;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TVnVan")
	public Set<TCpCustTrip> getTCpCustTrips() {
		return this.TCpCustTrips;
	}

	public void setTCpCustTrips(Set<TCpCustTrip> TCpCustTrips) {
		this.TCpCustTrips = TCpCustTrips;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TVnVan")
	public Set<TTpTrip> getTTpTrips() {
		return this.TTpTrips;
	}

	public void setTTpTrips(Set<TTpTrip> TTpTrips) {
		this.TTpTrips = TTpTrips;
	}

}
