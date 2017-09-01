package org.holtz.eve.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VwNewCheck database table.
 * 
 */
@Entity
@NamedQuery(name="VwNewCheck.findAll", query="SELECT v FROM VwNewCheck v")
public class VwNewCheck implements Serializable {
	private static final long serialVersionUID = 1L;
@Id
	@Column(name="New_Id")
	private int new_Id;

	public VwNewCheck() {
	}

	public int getNew_Id() {
		return this.new_Id;
	}

	public void setNew_Id(int new_Id) {
		this.new_Id = new_Id;
	}

}