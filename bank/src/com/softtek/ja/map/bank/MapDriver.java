package com.softtek.ja.map.bank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDriver {
	static  ArrayList a1 = new ArrayList();
		public static void main(String[] args) {
			Map BankMap = new HashMap();
			
		
		BankCustomer c1 = new BankCustomer( "sushanth",15000,MapHelper.displayCurrentDate(),"Credit",100000);
		BankCustomer c2 = new BankCustomer("sushanth", MapHelper.customerTransactions(c1.getCurrentBalance(),c1.getTransactionType(),c1.getTransactionAmount()),MapHelper.displayCurrentDate(),"Debit",100);
		BankCustomer c3 = new BankCustomer("sushanth", MapHelper.customerTransactions(c2.getCurrentBalance(),c2.getTransactionType(),c2.getTransactionAmount()),MapHelper.displayCurrentDate(),"Debit",100);
		BankCustomer c4 = new BankCustomer("sushanth", MapHelper.customerTransactions(c3.getCurrentBalance(),c3.getTransactionType(),c3.getTransactionAmount()),MapHelper.displayCurrentDate(),"Debit",100);
		
		
		BankCustomer n1 = new BankCustomer( "nandi",15000,MapHelper.displayCurrentDate(),"Credit",100000);
		BankCustomer n2 = new BankCustomer("sushanth", MapHelper.customerTransactions(n1.getCurrentBalance(),n1.getTransactionType(),n1.getTransactionAmount()),MapHelper.displayCurrentDate(),"Debit",100);
		BankCustomer n3 = new BankCustomer("sushanth", MapHelper.customerTransactions(n2.getCurrentBalance(),n2.getTransactionType(),n2.getTransactionAmount()),MapHelper.displayCurrentDate(),"Debit",100);
		BankCustomer n4 = new BankCustomer("sushanth", MapHelper.customerTransactions(n3.getCurrentBalance(),n3.getTransactionType(),n3.getTransactionAmount()),MapHelper.displayCurrentDate(),"Debit",100);
	
		
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		a1.add(c4);
		
		
		BankMap.put(1111,a1);
		System.out.println(a1.toString());
	}
}

