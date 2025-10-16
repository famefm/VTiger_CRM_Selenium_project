package com.sf.GenericUtility;

import java.time.LocalDateTime;
import java.util.Random;
/**
 * @author SharmilaFahad
 */
public class JavaUtility 
{		
		/**
		 * This methods are used to perform few Java Operations
		 * @return
		 */
		public String getSystemTime()
		{
			return LocalDateTime.now().toString().replace(":", "-");
		}
		
		
		public int gettingRandomNumber()
		{
			Random ran = new Random();
			return ran.nextInt(1000);
		}
		
}

