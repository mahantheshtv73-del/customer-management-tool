package com.customer.vtiger.genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class projectmethods {
	
	public String m(String key) throws IOException {
		FileInputStream f = new FileInputStream(ipathconstrains.path);
		Properties p = new Properties();
		p.load(f);
		
		String data = p.getProperty(key);
		return data ;
	}


}
