package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * THtHotel generated by hbm2java
 */
@Entity
@Table(name = "T_HtHotel", uniqueConstraints = @UniqueConstraint(columnNames = "HtHotelTx"))
public class THtHotel implements java.io.Serializable {

	private int htHotelId;
	private TRnRegion TRnRegion;
	private String htHotelTx;
	private String htTel1txN;
	private String htTel2txN;
	private String htFaxTxN;
	private String htEmailTxN;
	private String htAddress1txN;
	private String htAddress2txN;
	private String htAddress3txN;
	private String htAddress4txN;
	private String htPostcodeTxN;
	private String htCountryTxN;
	private String htRatesTxN;
	private boolean htUnavailableBl;
	private Date htLastUpdatedDate;
	private Date htCreationDate;
	private int htForeColorIn;
	private int htBackColorIn;
	private String htWebTxN;
	private boolean htPredefinedRoomsBl;
	private String htCheckInTxN;
	private String htCheckOutTxN;
	private boolean htRequiredBl;
	private Set<TRmRoom> TRmRooms = new HashSet<TRmRoom>(0);
	private Set<TSoStore> TSoStores = new HashSet<TSoStore>(0);
	private Set<TRkRoomBooking> TRkRoomBookings = new HashSet<TRkRoomBooking>(0);
	private Set<TSvStockRoom> TSvStockRooms = new HashSet<TSvStockRoom>(0);

	public THtHotel() {
	}

	public THtHotel(int htHotelId, String htHotelTx, boolean htUnavailableBl, Date htLastUpdatedDate,
			Date htCreationDate, int htForeColorIn, int htBackColorIn, boolean htPredefinedRoomsBl,
			boolean htRequiredBl) {
		this.htHotelId = htHotelId;
		this.htHotelTx = htHotelTx;
		this.htUnavailableBl = htUnavailableBl;
		this.htLastUpdatedDate = htLastUpdatedDate;
		this.htCreationDate = htCreationDate;
		this.htForeColorIn = htForeColorIn;
		this.htBackColorIn = htBackColorIn;
		this.htPredefinedRoomsBl = htPredefinedRoomsBl;
		this.htRequiredBl = htRequiredBl;
	}

	public THtHotel(int htHotelId, TRnRegion TRnRegion, String htHotelTx, String htTel1txN,
			String htTel2txN, String htFaxTxN, String htEmailTxN, String htAddress1txN,
			String htAddress2txN, String htAddress3txN, String htAddress4txN,
			String htPostcodeTxN, String htCountryTxN, String htRatesTxN, boolean htUnavailableBl,
			Date htLastUpdatedDate, Date htCreationDate, int htForeColorIn, int htBackColorIn, String htWebTxN,
			boolean htPredefinedRoomsBl, String htCheckInTxN, String htCheckOutTxN, boolean htRequiredBl,
			Set<TRmRoom> TRmRooms, Set<TSoStore> TSoStores, Set<TRkRoomBooking> TRkRoomBookings,
			Set<TSvStockRoom> TSvStockRooms) {
		this.htHotelId = htHotelId;
		this.TRnRegion = TRnRegion;
		this.htHotelTx = htHotelTx;
		this.htTel1txN = htTel1txN;
		this.htTel2txN = htTel2txN;
		this.htFaxTxN = htFaxTxN;
		this.htEmailTxN = htEmailTxN;
		this.htAddress1txN = htAddress1txN;
		this.htAddress2txN = htAddress2txN;
		this.htAddress3txN = htAddress3txN;
		this.htAddress4txN = htAddress4txN;
		this.htPostcodeTxN = htPostcodeTxN;
		this.htCountryTxN = htCountryTxN;
		this.htRatesTxN = htRatesTxN;
		this.htUnavailableBl = htUnavailableBl;
		this.htLastUpdatedDate = htLastUpdatedDate;
		this.htCreationDate = htCreationDate;
		this.htForeColorIn = htForeColorIn;
		this.htBackColorIn = htBackColorIn;
		this.htWebTxN = htWebTxN;
		this.htPredefinedRoomsBl = htPredefinedRoomsBl;
		this.htCheckInTxN = htCheckInTxN;
		this.htCheckOutTxN = htCheckOutTxN;
		this.htRequiredBl = htRequiredBl;
		this.TRmRooms = TRmRooms;
		this.TSoStores = TSoStores;
		this.TRkRoomBookings = TRkRoomBookings;
		this.TSvStockRooms = TSvStockRooms;
	}

	@Id

	@Column(name = "HtHotelID", unique = true, nullable = false)
	public int getHtHotelId() {
		return this.htHotelId;
	}

	public void setHtHotelId(int htHotelId) {
		this.htHotelId = htHotelId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HtRegionID_N")
	public TRnRegion getTRnRegion() {
		return this.TRnRegion;
	}

	public void setTRnRegion(TRnRegion TRnRegion) {
		this.TRnRegion = TRnRegion;
	}

	@Column(name = "HtHotelTx", unique = true, nullable = false)
	public String getHtHotelTx() {
		return this.htHotelTx;
	}

	public void setHtHotelTx(String htHotelTx) {
		this.htHotelTx = htHotelTx;
	}

	@Column(name = "HtTel1Tx_N")
	public String getHtTel1txN() {
		return this.htTel1txN;
	}

	public void setHtTel1txN(String htTel1txN) {
		this.htTel1txN = htTel1txN;
	}

	@Column(name = "HtTel2Tx_N")
	public String getHtTel2txN() {
		return this.htTel2txN;
	}

	public void setHtTel2txN(String htTel2txN) {
		this.htTel2txN = htTel2txN;
	}

	@Column(name = "HtFaxTx_N")
	public String getHtFaxTxN() {
		return this.htFaxTxN;
	}

	public void setHtFaxTxN(String htFaxTxN) {
		this.htFaxTxN = htFaxTxN;
	}

	@Column(name = "HtEMailTx_N")
	public String getHtEmailTxN() {
		return this.htEmailTxN;
	}

	public void setHtEmailTxN(String htEmailTxN) {
		this.htEmailTxN = htEmailTxN;
	}

	@Column(name = "HtAddress1Tx_N")
	public String getHtAddress1txN() {
		return this.htAddress1txN;
	}

	public void setHtAddress1txN(String htAddress1txN) {
		this.htAddress1txN = htAddress1txN;
	}

	@Column(name = "HtAddress2Tx_N")
	public String getHtAddress2txN() {
		return this.htAddress2txN;
	}

	public void setHtAddress2txN(String htAddress2txN) {
		this.htAddress2txN = htAddress2txN;
	}

	@Column(name = "HtAddress3Tx_N")
	public String getHtAddress3txN() {
		return this.htAddress3txN;
	}

	public void setHtAddress3txN(String htAddress3txN) {
		this.htAddress3txN = htAddress3txN;
	}

	@Column(name = "HtAddress4Tx_N")
	public String getHtAddress4txN() {
		return this.htAddress4txN;
	}

	public void setHtAddress4txN(String htAddress4txN) {
		this.htAddress4txN = htAddress4txN;
	}

	@Column(name = "HtPostcodeTx_N")
	public String getHtPostcodeTxN() {
		return this.htPostcodeTxN;
	}

	public void setHtPostcodeTxN(String htPostcodeTxN) {
		this.htPostcodeTxN = htPostcodeTxN;
	}

	@Column(name = "HtCountryTx_N")
	public String getHtCountryTxN() {
		return this.htCountryTxN;
	}

	public void setHtCountryTxN(String htCountryTxN) {
		this.htCountryTxN = htCountryTxN;
	}

	@Column(name = "HtRatesTx_N")
	public String getHtRatesTxN() {
		return this.htRatesTxN;
	}

	public void setHtRatesTxN(String htRatesTxN) {
		this.htRatesTxN = htRatesTxN;
	}

	@Column(name = "HtUnavailableBl", nullable = false)
	public boolean isHtUnavailableBl() {
		return this.htUnavailableBl;
	}

	public void setHtUnavailableBl(boolean htUnavailableBl) {
		this.htUnavailableBl = htUnavailableBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HtLastUpdatedDate", nullable = false, length = 23)
	public Date getHtLastUpdatedDate() {
		return this.htLastUpdatedDate;
	}

	public void setHtLastUpdatedDate(Date htLastUpdatedDate) {
		this.htLastUpdatedDate = htLastUpdatedDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HtCreationDate", nullable = false, length = 23)
	public Date getHtCreationDate() {
		return this.htCreationDate;
	}

	public void setHtCreationDate(Date htCreationDate) {
		this.htCreationDate = htCreationDate;
	}

	@Column(name = "HtForeColorIn", nullable = false)
	public int getHtForeColorIn() {
		return this.htForeColorIn;
	}

	public void setHtForeColorIn(int htForeColorIn) {
		this.htForeColorIn = htForeColorIn;
	}

	@Column(name = "HtBackColorIn", nullable = false)
	public int getHtBackColorIn() {
		return this.htBackColorIn;
	}

	public void setHtBackColorIn(int htBackColorIn) {
		this.htBackColorIn = htBackColorIn;
	}

	@Column(name = "HtWebTx_N")
	public String getHtWebTxN() {
		return this.htWebTxN;
	}

	public void setHtWebTxN(String htWebTxN) {
		this.htWebTxN = htWebTxN;
	}

	@Column(name = "HtPredefinedRoomsBl", nullable = false)
	public boolean isHtPredefinedRoomsBl() {
		return this.htPredefinedRoomsBl;
	}

	public void setHtPredefinedRoomsBl(boolean htPredefinedRoomsBl) {
		this.htPredefinedRoomsBl = htPredefinedRoomsBl;
	}

	@Column(name = "HtCheckInTx_N")
	public String getHtCheckInTxN() {
		return this.htCheckInTxN;
	}

	public void setHtCheckInTxN(String htCheckInTxN) {
		this.htCheckInTxN = htCheckInTxN;
	}

	@Column(name = "HtCheckOutTx_N")
	public String getHtCheckOutTxN() {
		return this.htCheckOutTxN;
	}

	public void setHtCheckOutTxN(String htCheckOutTxN) {
		this.htCheckOutTxN = htCheckOutTxN;
	}

	@Column(name = "HtRequiredBl", nullable = false)
	public boolean isHtRequiredBl() {
		return this.htRequiredBl;
	}

	public void setHtRequiredBl(boolean htRequiredBl) {
		this.htRequiredBl = htRequiredBl;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "THtHotel")
	public Set<TRmRoom> getTRmRooms() {
		return this.TRmRooms;
	}

	public void setTRmRooms(Set<TRmRoom> TRmRooms) {
		this.TRmRooms = TRmRooms;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_ZdStoreHotel", joinColumns = {
			@JoinColumn(name = "ZdHotelID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "ZdStoreID", nullable = false, updatable = false) })
	public Set<TSoStore> getTSoStores() {
		return this.TSoStores;
	}

	public void setTSoStores(Set<TSoStore> TSoStores) {
		this.TSoStores = TSoStores;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "THtHotel")
	public Set<TRkRoomBooking> getTRkRoomBookings() {
		return this.TRkRoomBookings;
	}

	public void setTRkRoomBookings(Set<TRkRoomBooking> TRkRoomBookings) {
		this.TRkRoomBookings = TRkRoomBookings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "THtHotel")
	public Set<TSvStockRoom> getTSvStockRooms() {
		return this.TSvStockRooms;
	}

	public void setTSvStockRooms(Set<TSvStockRoom> TSvStockRooms) {
		this.TSvStockRooms = TSvStockRooms;
	}

}
