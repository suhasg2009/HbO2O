package com.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Customer;
import com.model.TransactionDetails;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TransactionDetails ts=new TransactionDetails();	
		ts.setTxId(2);
		ts.setTxName("Drive");
		
		//TransactionDetails ts1=new TransactionDetails();	
		//ts1.setTxId(2);
		//ts1.setTxName("HardDrive");
		
		
		
		Customer cs=new Customer();
		cs.setcId(401);
		cs.setcName("Ram");

		ts.setCustomer(cs);
		//cs.getTs().add(ts);
		//cs.getTs().add(ts1);
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(cs);
		session.save(ts);
		//session.save(ts1);
		tx.commit();
		
		session.close();
		factory.close();
		
		
	}

}
