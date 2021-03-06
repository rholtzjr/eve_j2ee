package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * TS0stockClub generated by hbm2java
 */
@Entity
@Table(name = "T_S0StockClub", uniqueConstraints = @UniqueConstraint(columnNames = { "S0StockItemID", "S0ClubID",
		"S0MembershipTypeID" }))
public class TS0stockClub implements java.io.Serializable {

	private int s0stockItemId;
	private TCbClub TCbClub;
	private TMmMembershipType TMmMembershipType;
	private TSistockItem TSistockItem;

	public TS0stockClub() {
	}

	public TS0stockClub(TCbClub TCbClub, TSistockItem TSistockItem) {
		this.TCbClub = TCbClub;
		this.TSistockItem = TSistockItem;
	}

	public TS0stockClub(TCbClub TCbClub, TMmMembershipType TMmMembershipType, TSistockItem TSistockItem) {
		this.TCbClub = TCbClub;
		this.TMmMembershipType = TMmMembershipType;
		this.TSistockItem = TSistockItem;
	}

	@GenericGenerator(name = "ts0StockClubgenerator", strategy = "foreign", parameters = @Parameter(name = "property", value = "TSistockItem"))
	@Id
	@GeneratedValue(generator = "ts0StockClubgenerator")

	@Column(name = "S0StockItemID", unique = true, nullable = false)
	public int getS0stockItemId() {
		return this.s0stockItemId;
	}

	public void setS0stockItemId(int s0stockItemId) {
		this.s0stockItemId = s0stockItemId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "S0ClubID", nullable = false)
	public TCbClub getTCbClub() {
		return this.TCbClub;
	}

	public void setTCbClub(TCbClub TCbClub) {
		this.TCbClub = TCbClub;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "S0MembershipTypeID")
	public TMmMembershipType getTMmMembershipType() {
		return this.TMmMembershipType;
	}

	public void setTMmMembershipType(TMmMembershipType TMmMembershipType) {
		this.TMmMembershipType = TMmMembershipType;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public TSistockItem getTSistockItem() {
		return this.TSistockItem;
	}

	public void setTSistockItem(TSistockItem TSistockItem) {
		this.TSistockItem = TSistockItem;
	}

}
