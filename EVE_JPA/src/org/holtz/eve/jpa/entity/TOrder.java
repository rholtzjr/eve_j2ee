package org.holtz.eve.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the T_ORDER database table.
 * 
 */
@Entity
@Table(name="T_ORDER")
public class TOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String customer;

	public TOrder() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomer() {
		return this.customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

}