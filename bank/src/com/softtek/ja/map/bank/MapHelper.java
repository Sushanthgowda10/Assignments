package com.softtek.ja.map.bank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MapHelper {
	
	public static String displayCurrentDate() {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Calendar cal = Calendar.getInstance();
	return (dateFormat.format(cal.getTime()).toString());
	
}
 public static double customerTransactions(double currentBalance,String transactionType,double transactionAmount)
 {
	 if (transactionType.equals("Credit")) {
	      currentBalance += transactionAmount;
	 }
	 else if (transactionType.equals("Debit")) {
		 currentBalance -= transactionAmount;
	 }
	 return currentBalance;
 }
	 
	 
	

}
