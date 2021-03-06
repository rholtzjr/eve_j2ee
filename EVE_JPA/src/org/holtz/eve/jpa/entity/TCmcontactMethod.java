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
import javax.persistence.UniqueConstraint;

/**
 * TCmcontactMethod generated by hbm2java
 */
@Entity
@Table(name = "T_CMContactMethod", uniqueConstraints = @UniqueConstraint(columnNames = "CMContactMethodTx"))
public class TCmcontactMethod implements java.io.Serializable {

	private int cmcontactMethodId;
	private String cmcontactMethodTx;
	private boolean cmunavailableBl;
	private Date cmlastUpdatedDate;
	private boolean cmrequiredBl;
	private Date cmcreationDate;
	private int cmforeColorIn;
	private int cmbackColorIn;
	private Set<TC8custInterest> TC8custInterests = new HashSet<TC8custInterest>(0);
	private Set<TCdCustOrder> TCdCustOrders = new HashSet<TCdCustOrder>(0);
	private Set<TCnContact> TCnContacts = new HashSet<TCnContact>(0);

	public TCmcontactMethod() {
	}

	public TCmcontactMethod(int cmcontactMethodId, String cmcontactMethodTx, boolean cmunavailableBl,
			Date cmlastUpdatedDate, boolean cmrequiredBl, Date cmcreationDate, int cmforeColorIn, int cmbackColorIn) {
		this.cmcontactMethodId = cmcontactMethodId;
		this.cmcontactMethodTx = cmcontactMethodTx;
		this.cmunavailableBl = cmunavailableBl;
		this.cmlastUpdatedDate = cmlastUpdatedDate;
		this.cmrequiredBl = cmrequiredBl;
		this.cmcreationDate = cmcreationDate;
		this.cmforeColorIn = cmforeColorIn;
		this.cmbackColorIn = cmbackColorIn;
	}

	public TCmcontactMethod(int cmcontactMethodId, String cmcontactMethodTx, boolean cmunavailableBl,
			Date cmlastUpdatedDate, boolean cmrequiredBl, Date cmcreationDate, int cmforeColorIn, int cmbackColorIn,
			Set<TC8custInterest> TC8custInterests, Set<TCdCustOrder> TCdCustOrders, Set<TCnContact> TCnContacts) {
		this.cmcontactMethodId = cmcontactMethodId;
		this.cmcontactMethodTx = cmcontactMethodTx;
		this.cmunavailableBl = cmunavailableBl;
		this.cmlastUpdatedDate = cmlastUpdatedDate;
		this.cmrequiredBl = cmrequiredBl;
		this.cmcreationDate = cmcreationDate;
		this.cmforeColorIn = cmforeColorIn;
		this.cmbackColorIn = cmbackColorIn;
		this.TC8custInterests = TC8custInterests;
		this.TCdCustOrders = TCdCustOrders;
		this.TCnContacts = TCnContacts;
	}

	@Id

	@Column(name = "CMContactMethodID", unique = true, nullable = false)
	public int getCmcontactMethodId() {
		return this.cmcontactMethodId;
	}

	public void setCmcontactMethodId(int cmcontactMethodId) {
		this.cmcontactMethodId = cmcontactMethodId;
	}

	@Column(name = "CMContactMethodTx", unique = true, nullable = false)
	public String getCmcontactMethodTx() {
		return this.cmcontactMethodTx;
	}

	public void setCmcontactMethodTx(String cmcontactMethodTx) {
		this.cmcontactMethodTx = cmcontactMethodTx;
	}

	@Column(name = "CMUnavailableBl", nullable = false)
	public boolean isCmunavailableBl() {
		return this.cmunavailableBl;
	}

	public void setCmunavailableBl(boolean cmunavailableBl) {
		this.cmunavailableBl = cmunavailableBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CMLastUpdatedDate", nullable = false, length = 23)
	public Date getCmlastUpdatedDate() {
		return this.cmlastUpdatedDate;
	}

	public void setCmlastUpdatedDate(Date cmlastUpdatedDate) {
		this.cmlastUpdatedDate = cmlastUpdatedDate;
	}

	@Column(name = "CMRequiredBl", nullable = false)
	public boolean isCmrequiredBl() {
		return this.cmrequiredBl;
	}

	public void setCmrequiredBl(boolean cmrequiredBl) {
		this.cmrequiredBl = cmrequiredBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CMCreationDate", nullable = false, length = 23)
	public Date getCmcreationDate() {
		return this.cmcreationDate;
	}

	public void setCmcreationDate(Date cmcreationDate) {
		this.cmcreationDate = cmcreationDate;
	}

	@Column(name = "CMForeColorIn", nullable = false)
	public int getCmforeColorIn() {
		return this.cmforeColorIn;
	}

	public void setCmforeColorIn(int cmforeColorIn) {
		this.cmforeColorIn = cmforeColorIn;
	}

	@Column(name = "CMBackColorIn", nullable = false)
	public int getCmbackColorIn() {
		return this.cmbackColorIn;
	}

	public void setCmbackColorIn(int cmbackColorIn) {
		this.cmbackColorIn = cmbackColorIn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCmcontactMethod")
	public Set<TC8custInterest> getTC8custInterests() {
		return this.TC8custInterests;
	}

	public void setTC8custInterests(Set<TC8custInterest> TC8custInterests) {
		this.TC8custInterests = TC8custInterests;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCmcontactMethod")
	public Set<TCdCustOrder> getTCdCustOrders() {
		return this.TCdCustOrders;
	}

	public void setTCdCustOrders(Set<TCdCustOrder> TCdCustOrders) {
		this.TCdCustOrders = TCdCustOrders;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCmcontactMethod")
	public Set<TCnContact> getTCnContacts() {
		return this.TCnContacts;
	}

	public void setTCnContacts(Set<TCnContact> TCnContacts) {
		this.TCnContacts = TCnContacts;
	}

}
