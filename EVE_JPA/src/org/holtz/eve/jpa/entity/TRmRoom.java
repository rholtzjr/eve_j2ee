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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * TRmRoom generated by hbm2java
 */
@Entity
@Table(name = "T_RmRoom", uniqueConstraints = @UniqueConstraint(columnNames = { "RmRoomNoTx", "RmHotelID" }))
public class TRmRoom implements java.io.Serializable {

	private int rmRoomId;
	private THtHotel THtHotel;
	private TReRoomType TReRoomType;
	private String rmRoomNoTx;
	private boolean rmUnavailableBl;
	private Date rmCreationDate;
	private Date rmLastUpdatedDate;
	private double rmRatePerNightMn;
	private Set<TRkRoomBooking> TRkRoomBookings = new HashSet<TRkRoomBooking>(0);

	public TRmRoom() {
	}

	public TRmRoom(int rmRoomId, THtHotel THtHotel, TReRoomType TReRoomType, String rmRoomNoTx,
			boolean rmUnavailableBl, Date rmCreationDate, Date rmLastUpdatedDate, double rmRatePerNightMn) {
		this.rmRoomId = rmRoomId;
		this.THtHotel = THtHotel;
		this.TReRoomType = TReRoomType;
		this.rmRoomNoTx = rmRoomNoTx;
		this.rmUnavailableBl = rmUnavailableBl;
		this.rmCreationDate = rmCreationDate;
		this.rmLastUpdatedDate = rmLastUpdatedDate;
		this.rmRatePerNightMn = rmRatePerNightMn;
	}

	public TRmRoom(int rmRoomId, THtHotel THtHotel, TReRoomType TReRoomType, String rmRoomNoTx,
			boolean rmUnavailableBl, Date rmCreationDate, Date rmLastUpdatedDate, double rmRatePerNightMn,
			Set<TRkRoomBooking> TRkRoomBookings) {
		this.rmRoomId = rmRoomId;
		this.THtHotel = THtHotel;
		this.TReRoomType = TReRoomType;
		this.rmRoomNoTx = rmRoomNoTx;
		this.rmUnavailableBl = rmUnavailableBl;
		this.rmCreationDate = rmCreationDate;
		this.rmLastUpdatedDate = rmLastUpdatedDate;
		this.rmRatePerNightMn = rmRatePerNightMn;
		this.TRkRoomBookings = TRkRoomBookings;
	}

	@Id

	@Column(name = "RmRoomID", unique = true, nullable = false)
	public int getRmRoomId() {
		return this.rmRoomId;
	}

	public void setRmRoomId(int rmRoomId) {
		this.rmRoomId = rmRoomId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RmHotelID", nullable = false)
	public THtHotel getTHtHotel() {
		return this.THtHotel;
	}

	public void setTHtHotel(THtHotel THtHotel) {
		this.THtHotel = THtHotel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RmRoomTypeID", nullable = false)
	public TReRoomType getTReRoomType() {
		return this.TReRoomType;
	}

	public void setTReRoomType(TReRoomType TReRoomType) {
		this.TReRoomType = TReRoomType;
	}

	@Column(name = "RmRoomNoTx", nullable = false)
	public String getRmRoomNoTx() {
		return this.rmRoomNoTx;
	}

	public void setRmRoomNoTx(String rmRoomNoTx) {
		this.rmRoomNoTx = rmRoomNoTx;
	}

	@Column(name = "RmUnavailableBl", nullable = false)
	public boolean isRmUnavailableBl() {
		return this.rmUnavailableBl;
	}

	public void setRmUnavailableBl(boolean rmUnavailableBl) {
		this.rmUnavailableBl = rmUnavailableBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RmCreationDate", nullable = false, length = 23)
	public Date getRmCreationDate() {
		return this.rmCreationDate;
	}

	public void setRmCreationDate(Date rmCreationDate) {
		this.rmCreationDate = rmCreationDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RmLastUpdatedDate", nullable = false, length = 23)
	public Date getRmLastUpdatedDate() {
		return this.rmLastUpdatedDate;
	}

	public void setRmLastUpdatedDate(Date rmLastUpdatedDate) {
		this.rmLastUpdatedDate = rmLastUpdatedDate;
	}

	@Column(name = "RmRatePerNightMn", nullable = false, precision = 53, scale = 0)
	public double getRmRatePerNightMn() {
		return this.rmRatePerNightMn;
	}

	public void setRmRatePerNightMn(double rmRatePerNightMn) {
		this.rmRatePerNightMn = rmRatePerNightMn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TRmRoom")
	public Set<TRkRoomBooking> getTRkRoomBookings() {
		return this.TRkRoomBookings;
	}

	public void setTRkRoomBookings(Set<TRkRoomBooking> TRkRoomBookings) {
		this.TRkRoomBookings = TRkRoomBookings;
	}

}
