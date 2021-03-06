package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EmailAgentCertifications generated by hbm2java
 */
@Entity
@Table(name = "EmailAgent_Certifications")
public class EmailAgentCertifications implements java.io.Serializable {

	private EmailAgentCertificationsId id;

	public EmailAgentCertifications() {
	}

	public EmailAgentCertifications(EmailAgentCertificationsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "custCourseId", column = @Column(name = "CustCourseID", nullable = false)),
			@AttributeOverride(name = "courseType", column = @Column(name = "CourseType", nullable = false)),
			@AttributeOverride(name = "courseNo", column = @Column(name = "CourseNo")),
			@AttributeOverride(name = "courseStartDate", column = @Column(name = "CourseStartDate", length = 23)),
			@AttributeOverride(name = "custId", column = @Column(name = "CustID", nullable = false)),
			@AttributeOverride(name = "firstName", column = @Column(name = "FirstName", nullable = false)),
			@AttributeOverride(name = "middleInitial", column = @Column(name = "MiddleInitial")),
			@AttributeOverride(name = "lastName", column = @Column(name = "LastName", nullable = false)),
			@AttributeOverride(name = "knownAs", column = @Column(name = "KnownAs")),
			@AttributeOverride(name = "birthDate", column = @Column(name = "BirthDate", length = 23)),
			@AttributeOverride(name = "nextBirthDay", column = @Column(name = "NextBirthDay", length = 23)),
			@AttributeOverride(name = "previousBirthDay", column = @Column(name = "PreviousBirthDay", length = 23)),
			@AttributeOverride(name = "age", column = @Column(name = "Age")),
			@AttributeOverride(name = "homeAddress1", column = @Column(name = "HomeAddress1")),
			@AttributeOverride(name = "homeAddress2", column = @Column(name = "HomeAddress2")),
			@AttributeOverride(name = "homeAddress3", column = @Column(name = "HomeAddress3")),
			@AttributeOverride(name = "homeAddress4", column = @Column(name = "HomeAddress4")),
			@AttributeOverride(name = "homeState", column = @Column(name = "HomeState")),
			@AttributeOverride(name = "homePostcode", column = @Column(name = "HomePostcode")),
			@AttributeOverride(name = "homeCountry", column = @Column(name = "HomeCountry")),
			@AttributeOverride(name = "email", column = @Column(name = "EMail")),
			@AttributeOverride(name = "telHome", column = @Column(name = "TelHome")),
			@AttributeOverride(name = "telMobile", column = @Column(name = "TelMobile")),
			@AttributeOverride(name = "telWork", column = @Column(name = "TelWork")),
			@AttributeOverride(name = "telLocal", column = @Column(name = "TelLocal")),
			@AttributeOverride(name = "scubaTribeCode", column = @Column(name = "ScubaTribeCode")),
			@AttributeOverride(name = "certifyingInstructor", column = @Column(name = "CertifyingInstructor")),
			@AttributeOverride(name = "certificationNo", column = @Column(name = "CertificationNo")),
			@AttributeOverride(name = "certificationDate", column = @Column(name = "CertificationDate", length = 23)),
			@AttributeOverride(name = "picstatus", column = @Column(name = "PICStatus")),
			@AttributeOverride(name = "picsentDate", column = @Column(name = "PICSentDate", length = 23)),
			@AttributeOverride(name = "picreceivedDate", column = @Column(name = "PICReceivedDate", length = 23)),
			@AttributeOverride(name = "piccard", column = @Column(name = "PICCard")),
			@AttributeOverride(name = "returnCardTo", column = @Column(name = "ReturnCardTo")),
			@AttributeOverride(name = "picpickedUpDate", column = @Column(name = "PICPickedUpDate", length = 23)),
			@AttributeOverride(name = "picpickupMethod", column = @Column(name = "PICPickupMethod")),
			@AttributeOverride(name = "picprocessedBy", column = @Column(name = "PICProcessedBy")),
			@AttributeOverride(name = "creationDate", column = @Column(name = "CreationDate", nullable = false, length = 23)),
			@AttributeOverride(name = "lastUpdatedDate", column = @Column(name = "LastUpdatedDate", nullable = false, length = 23)),
			@AttributeOverride(name = "referral", column = @Column(name = "Referral", nullable = false)),
			@AttributeOverride(name = "referralStoreNo", column = @Column(name = "ReferralStoreNo")),
			@AttributeOverride(name = "preRegistration", column = @Column(name = "PreRegistration", nullable = false)),
			@AttributeOverride(name = "certNotes", column = @Column(name = "CertNotes")),
//			@AttributeOverride(name = "certType", column = @Column(name = "CertType")),
			@AttributeOverride(name = "qualifiedHere", column = @Column(name = "QualifiedHere", nullable = false)),
			@AttributeOverride(name = "fatherName", column = @Column(name = "FatherName")),
			@AttributeOverride(name = "courseTypeId", column = @Column(name = "CourseTypeID", nullable = false)),
			@AttributeOverride(name = "courseId", column = @Column(name = "CourseID")),
			@AttributeOverride(name = "instructorId", column = @Column(name = "InstructorID")),
			@AttributeOverride(name = "picstatusId", column = @Column(name = "PICStatusID", nullable = false)),
			@AttributeOverride(name = "piccardId", column = @Column(name = "PICCardID")),
			@AttributeOverride(name = "returnCardToId", column = @Column(name = "ReturnCardToID")),
			@AttributeOverride(name = "picprocessedById", column = @Column(name = "PICProcessedByID")),
			@AttributeOverride(name = "storeId", column = @Column(name = "StoreID", nullable = false)),
			@AttributeOverride(name = "homeStateId", column = @Column(name = "HomeStateID")),
			@AttributeOverride(name = "homeCountryId", column = @Column(name = "HomeCountryID")) })
	public EmailAgentCertificationsId getId() {
		return this.id;
	}

	public void setId(EmailAgentCertificationsId id) {
		this.id = id;
	}

}
