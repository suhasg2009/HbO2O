package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Transaction_Details")
public class TransactionDetails {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int txId;

@OneToOne
private Customer customer;

public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public int getTxId() {
	return txId;
}
public void setTxId(int txId) {
	this.txId = txId;
}
public String getTxName() {
	return txName;
}
public void setTxName(String txName) {
	this.txName = txName;
}
private String txName;




	

}
