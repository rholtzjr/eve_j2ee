package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TGtgiftCardType generated by hbm2java
 */
@Entity
@Table(name = "T_GTGiftCardType")
public class TGtgiftCardType implements java.io.Serializable {

	private int gtgiftCardTypeId;
	private String gtgiftCardTypeTx;
	private Date gtcreationDate;
	private Date gtlastUpdatedDate;
	private boolean gtrequiredBl;
	private boolean gtunavailableBl;
	private Set<TGdGiftCard> TGdGiftCards = new HashSet<TGdGiftCard>(0);
	private Set<TGigiftTypeAllowedItem> TGigiftTypeAllowedItems = new HashSet<TGigiftTypeAllowedItem>(0);
	private Set<TGcgiftCert> TGcgiftCerts = new HashSet<TGcgiftCert>(0);

	public TGtgiftCardType() {
	}

	public TGtgiftCardType(int gtgiftCardTypeId, String gtgiftCardTypeTx, Date gtcreationDate,
			Date gtlastUpdatedDate, boolean gtrequiredBl, boolean gtunavailableBl) {
		this.gtgiftCardTypeId = gtgiftCardTypeId;
		this.gtgiftCardTypeTx = gtgiftCardTypeTx;
		this.gtcreationDate = gtcreationDate;
		this.gtlastUpdatedDate = gtlastUpdatedDate;
		this.gtrequiredBl = gtrequiredBl;
		this.gtunavailableBl = gtunavailableBl;
	}

	public TGtgiftCardType(int gtgiftCardTypeId, String gtgiftCardTypeTx, Date gtcreationDate,
			Date gtlastUpdatedDate, boolean gtrequiredBl, boolean gtunavailableBl, Set<TGdGiftCard> TGdGiftCards,
			Set<TGigiftTypeAllowedItem> TGigiftTypeAllowedItems, Set<TGcgiftCert> TGcgiftCerts) {
		this.gtgiftCardTypeId = gtgiftCardTypeId;
		this.gtgiftCardTypeTx = gtgiftCardTypeTx;
		this.gtcreationDate = gtcreationDate;
		this.gtlastUpdatedDate = gtlastUpdatedDate;
		this.gtrequiredBl = gtrequiredBl;
		this.gtunavailableBl = gtunavailableBl;
		this.TGdGiftCards = TGdGiftCards;
		this.TGigiftTypeAllowedItems = TGigiftTypeAllowedItems;
		this.TGcgiftCerts = TGcgiftCerts;
	}

	@Id

	@Column(name = "GTGiftCardTypeID", unique = true, nullable = false)
	public int getGtgiftCardTypeId() {
		return this.gtgiftCardTypeId;
	}

	public void setGtgiftCardTypeId(int gtgiftCardTypeId) {
		this.gtgiftCardTypeId = gtgiftCardTypeId;
	}

	@Column(name = "GTGiftCardTypeTx", nullable = false)
	public String getGtgiftCardTypeTx() {
		return this.gtgiftCardTypeTx;
	}

	public void setGtgiftCardTypeTx(String gtgiftCardTypeTx) {
		this.gtgiftCardTypeTx = gtgiftCardTypeTx;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "GTCreationDate", nullable = false, length = 23)
	public Date getGtcreationDate() {
		return this.gtcreationDate;
	}

	public void setGtcreationDate(Date gtcreationDate) {
		this.gtcreationDate = gtcreationDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "GTLastUpdatedDate", nullable = false, length = 23)
	public Date getGtlastUpdatedDate() {
		return this.gtlastUpdatedDate;
	}

	public void setGtlastUpdatedDate(Date gtlastUpdatedDate) {
		this.gtlastUpdatedDate = gtlastUpdatedDate;
	}

	@Column(name = "GTRequiredBl", nullable = false)
	public boolean isGtrequiredBl() {
		return this.gtrequiredBl;
	}

	public void setGtrequiredBl(boolean gtrequiredBl) {
		this.gtrequiredBl = gtrequiredBl;
	}

	@Column(name = "GTUnavailableBl", nullable = false)
	public boolean isGtunavailableBl() {
		return this.gtunavailableBl;
	}

	public void setGtunavailableBl(boolean gtunavailableBl) {
		this.gtunavailableBl = gtunavailableBl;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TGtgiftCardType")
	public Set<TGdGiftCard> getTGdGiftCards() {
		return this.TGdGiftCards;
	}

	public void setTGdGiftCards(Set<TGdGiftCard> TGdGiftCards) {
		this.TGdGiftCards = TGdGiftCards;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TGtgiftCardType")
	public Set<TGigiftTypeAllowedItem> getTGigiftTypeAllowedItems() {
		return this.TGigiftTypeAllowedItems;
	}

	public void setTGigiftTypeAllowedItems(Set<TGigiftTypeAllowedItem> TGigiftTypeAllowedItems) {
		this.TGigiftTypeAllowedItems = TGigiftTypeAllowedItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TGtgiftCardType")
	public Set<TGcgiftCert> getTGcgiftCerts() {
		return this.TGcgiftCerts;
	}

	public void setTGcgiftCerts(Set<TGcgiftCert> TGcgiftCerts) {
		this.TGcgiftCerts = TGcgiftCerts;
	}

}
