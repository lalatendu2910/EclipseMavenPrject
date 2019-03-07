package com.wipro.test;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static final Logger logger = Logger.getLogger(App.class);
	
	public  String printDescriptioon() {
		 logger.info( "inside printDescriptioon" );
		 return "hello world";
	}
	
   
}
