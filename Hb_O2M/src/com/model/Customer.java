package com.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@Column(name="cid")
	//@OneToMany
	//private Collection<TransactionDetails> ts=new ArrayList<TransactionDetails>();
	
	
	//public Collection<TransactionDetails> getTs() {
		//return ts;
	//}

	//public void setTs(Collection<TransactionDetails> ts) {
		//this.ts = ts;
	//}

	private long cId;

	public long getcId() {
		return cId;
	}

	public void setcId(long cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Column(name="cName")
	private String cName;

}
