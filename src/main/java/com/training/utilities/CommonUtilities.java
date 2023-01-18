package com.training.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import static com.training.utilities.Constants.USER_DIR;
import static com.training.utilities.Constants.FILE_SEPARATOR;
import static com.training.utilities.Constants.APPLICATION_PROPERTIES;

public class CommonUtilities {
	
	public String getproperty(String key) throws IOException {
		
		//filepath
		//C:\\Users\\k_man\\eclipse-workspace\\TestNGSalesforceFrameWork2\\
		//String spath = "properties\\application.properties";
		
		String spath=USER_DIR+FILE_SEPARATOR+APPLICATION_PROPERTIES;
		//fileInputStream
		FileInputStream fileput = new FileInputStream(spath);
		Properties prop = new Properties();
		prop.load(fileput);
		String value = prop.getProperty(key);
		return value;
	}

}
