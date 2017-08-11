package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * D01E2emailQueue generated by hbm2java
 */
@Entity
@Table(name = "d01_E2EmailQueue")
public class D01E2emailQueue implements java.io.Serializable {

	private D01E2emailQueueId id;

	public D01E2emailQueue() {
	}

	public D01E2emailQueue(D01E2emailQueueId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "e2emailQueueId", column = @Column(name = "E2EmailQueueID", nullable = false)),
			@AttributeOverride(name = "e2subjectLineTx", column = @Column(name = "E2SubjectLineTx", nullable = false)),
			@AttributeOverride(name = "e2emailAddressTx", column = @Column(name = "E2EmailAddressTx", nullable = false)),
			@AttributeOverride(name = "e2mailMergeFieldsTxN", column = @Column(name = "E2MailMergeFieldsTx_N")),
			@AttributeOverride(name = "e2emailSentDateN", column = @Column(name = "E2EmailSentDate_N", length = 23)),
			@AttributeOverride(name = "e2emailExpDateN", column = @Column(name = "E2EmailExpDate_N", length = 23)),
			@AttributeOverride(name = "e2creationDate", column = @Column(name = "E2CreationDate", nullable = false, length = 23)),
			@AttributeOverride(name = "e2outlookFolderTx", column = @Column(name = "E2OutlookFolderTx", nullable = false)),
			@AttributeOverride(name = "e2confirmationRequiredBl", column = @Column(name = "E2ConfirmationRequiredBl", nullable = false)),
			@AttributeOverride(name = "e2emailSendDateN", column = @Column(name = "E2EmailSendDate_N", length = 23)),
			@AttributeOverride(name = "e2statusTxN", column = @Column(name = "E2StatusTx_N")),
			@AttributeOverride(name = "e2custId", column = @Column(name = "E2CustID", nullable = false)),
			@AttributeOverride(name = "e2priorityIn", column = @Column(name = "E2PriorityIn", nullable = false)),
			@AttributeOverride(name = "e2sendToNewsletterEngineBl", column = @Column(name = "E2SendToNewsletterEngineBl", nullable = false)),
			@AttributeOverride(name = "e2newsletterTemplateTxN", column = @Column(name = "E2NewsletterTemplateTx_N")),
			@AttributeOverride(name = "e2fromAccountTxN", column = @Column(name = "E2FromAccountTx_N")),
			@AttributeOverride(name = "e2storeId", column = @Column(name = "E2StoreID", nullable = false)),
			@AttributeOverride(name = "e2subJobTypeId", column = @Column(name = "E2SubJobTypeID", nullable = false)),
			@AttributeOverride(name = "e2listTxN", column = @Column(name = "E2ListTx_N")) })
	public D01E2emailQueueId getId() {
		return this.id;
	}

	public void setId(D01E2emailQueueId id) {
		this.id = id;
	}

}
