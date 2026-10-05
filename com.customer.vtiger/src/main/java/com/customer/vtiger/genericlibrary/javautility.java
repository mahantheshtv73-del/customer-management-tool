package com.customer.vtiger.genericlibrary;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class javautility {
	
	public String getdataandtime( String pattern ) {
		Calendar c = Calendar.getInstance();
		java.util.Date d = c.getTime();
		SimpleDateFormat sfd = new SimpleDateFormat(pattern);
		String data = sfd.format(d);
		  return data;
	}
	public int generaterandomnumber(int number) {
		Random r = new Random();
		int data = r.nextInt(number);
		return data;
	}

}
