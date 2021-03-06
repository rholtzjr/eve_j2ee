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
 * TDcDocument generated by hbm2java
 */
@Entity
@Table(name = "T_DcDocument")
public class TDcDocument implements java.io.Serializable {

	private int dcDocumentId;
	private String dcDocumentPathTx;
	private String dcDescriptionTx;
	private Date dcLastUpdatedDate;
	private boolean dcRequiredBl;
	private Date dcCreationDate;
	private boolean dcUnavailableBl;
	private Integer dcDocumentTypeId;
	private boolean dcShowInEvebl;
	private boolean dcShowInEolbl;
	private boolean dcMandatoryInEolbl;
	private Set<TDldocumentLink> TDldocumentLinks = new HashSet<TDldocumentLink>(0);

	public TDcDocument() {
	}

	public TDcDocument(int dcDocumentId, String dcDocumentPathTx, String dcDescriptionTx,
			Date dcLastUpdatedDate, boolean dcRequiredBl, Date dcCreationDate, boolean dcUnavailableBl,
			boolean dcShowInEvebl, boolean dcShowInEolbl, boolean dcMandatoryInEolbl) {
		this.dcDocumentId = dcDocumentId;
		this.dcDocumentPathTx = dcDocumentPathTx;
		this.dcDescriptionTx = dcDescriptionTx;
		this.dcLastUpdatedDate = dcLastUpdatedDate;
		this.dcRequiredBl = dcRequiredBl;
		this.dcCreationDate = dcCreationDate;
		this.dcUnavailableBl = dcUnavailableBl;
		this.dcShowInEvebl = dcShowInEvebl;
		this.dcShowInEolbl = dcShowInEolbl;
		this.dcMandatoryInEolbl = dcMandatoryInEolbl;
	}

	public TDcDocument(int dcDocumentId, String dcDocumentPathTx, String dcDescriptionTx,
			Date dcLastUpdatedDate, boolean dcRequiredBl, Date dcCreationDate, boolean dcUnavailableBl,
			Integer dcDocumentTypeId, boolean dcShowInEvebl, boolean dcShowInEolbl, boolean dcMandatoryInEolbl,
			Set<TDldocumentLink> TDldocumentLinks) {
		this.dcDocumentId = dcDocumentId;
		this.dcDocumentPathTx = dcDocumentPathTx;
		this.dcDescriptionTx = dcDescriptionTx;
		this.dcLastUpdatedDate = dcLastUpdatedDate;
		this.dcRequiredBl = dcRequiredBl;
		this.dcCreationDate = dcCreationDate;
		this.dcUnavailableBl = dcUnavailableBl;
		this.dcDocumentTypeId = dcDocumentTypeId;
		this.dcShowInEvebl = dcShowInEvebl;
		this.dcShowInEolbl = dcShowInEolbl;
		this.dcMandatoryInEolbl = dcMandatoryInEolbl;
		this.TDldocumentLinks = TDldocumentLinks;
	}

	@Id

	@Column(name = "DcDocumentID", unique = true, nullable = false)
	public int getDcDocumentId() {
		return this.dcDocumentId;
	}

	public void setDcDocumentId(int dcDocumentId) {
		this.dcDocumentId = dcDocumentId;
	}

	@Column(name = "DcDocumentPathTx", nullable = false)
	public String getDcDocumentPathTx() {
		return this.dcDocumentPathTx;
	}

	public void setDcDocumentPathTx(String dcDocumentPathTx) {
		this.dcDocumentPathTx = dcDocumentPathTx;
	}

	@Column(name = "DcDescriptionTx", nullable = false)
	public String getDcDescriptionTx() {
		return this.dcDescriptionTx;
	}

	public void setDcDescriptionTx(String dcDescriptionTx) {
		this.dcDescriptionTx = dcDescriptionTx;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DcLastUpdatedDate", nullable = false, length = 23)
	public Date getDcLastUpdatedDate() {
		return this.dcLastUpdatedDate;
	}

	public void setDcLastUpdatedDate(Date dcLastUpdatedDate) {
		this.dcLastUpdatedDate = dcLastUpdatedDate;
	}

	@Column(name = "DcRequiredBl", nullable = false)
	public boolean isDcRequiredBl() {
		return this.dcRequiredBl;
	}

	public void setDcRequiredBl(boolean dcRequiredBl) {
		this.dcRequiredBl = dcRequiredBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DcCreationDate", nullable = false, length = 23)
	public Date getDcCreationDate() {
		return this.dcCreationDate;
	}

	public void setDcCreationDate(Date dcCreationDate) {
		this.dcCreationDate = dcCreationDate;
	}

	@Column(name = "DcUnavailableBl", nullable = false)
	public boolean isDcUnavailableBl() {
		return this.dcUnavailableBl;
	}

	public void setDcUnavailableBl(boolean dcUnavailableBl) {
		this.dcUnavailableBl = dcUnavailableBl;
	}

	@Column(name = "DcDocumentTypeID")
	public Integer getDcDocumentTypeId() {
		return this.dcDocumentTypeId;
	}

	public void setDcDocumentTypeId(Integer dcDocumentTypeId) {
		this.dcDocumentTypeId = dcDocumentTypeId;
	}

	@Column(name = "DcShowInEVEBl", nullable = false)
	public boolean isDcShowInEvebl() {
		return this.dcShowInEvebl;
	}

	public void setDcShowInEvebl(boolean dcShowInEvebl) {
		this.dcShowInEvebl = dcShowInEvebl;
	}

	@Column(name = "DcShowInEOLBl", nullable = false)
	public boolean isDcShowInEolbl() {
		return this.dcShowInEolbl;
	}

	public void setDcShowInEolbl(boolean dcShowInEolbl) {
		this.dcShowInEolbl = dcShowInEolbl;
	}

	@Column(name = "DcMandatoryInEOLBl", nullable = false)
	public boolean isDcMandatoryInEolbl() {
		return this.dcMandatoryInEolbl;
	}

	public void setDcMandatoryInEolbl(boolean dcMandatoryInEolbl) {
		this.dcMandatoryInEolbl = dcMandatoryInEolbl;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TDcDocument")
	public Set<TDldocumentLink> getTDldocumentLinks() {
		return this.TDldocumentLinks;
	}

	public void setTDldocumentLinks(Set<TDldocumentLink> TDldocumentLinks) {
		this.TDldocumentLinks = TDldocumentLinks;
	}

}
