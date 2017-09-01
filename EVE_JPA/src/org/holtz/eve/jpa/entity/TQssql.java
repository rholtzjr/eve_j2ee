package org.holtz.eve.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the T_QSSQL database table.
 * 
 */
@Entity
@Table(name="T_QSSQL")
@NamedQuery(name="TQssql.findAll", query="SELECT t FROM TQssql t")
public class TQssql implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String QSSQLNameTx;

	private String QSSQLTx;

	public TQssql() {
	}

	public String getQSSQLNameTx() {
		return this.QSSQLNameTx;
	}

	public void setQSSQLNameTx(String QSSQLNameTx) {
		this.QSSQLNameTx = QSSQLNameTx;
	}

	public String getQSSQLTx() {
		return this.QSSQLTx;
	}

	public void setQSSQLTx(String QSSQLTx) {
		this.QSSQLTx = QSSQLTx;
	}

}