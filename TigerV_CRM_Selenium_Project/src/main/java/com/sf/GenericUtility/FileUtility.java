package com.sf.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility
{
	/**
	 * @author SharmilaFahad
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readingDataFromProperties(String key) throws IOException
	{
		/**
		 * This method is used to read data from property files (commonData.properties)  
		 */
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/commonData.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String value = prop.getProperty(key);
		
		return value;
	
	}
}
