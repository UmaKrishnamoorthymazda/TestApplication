package com.mazdausa.infocenter.ldap.util;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	/**
	 * 
	 */
	private static Properties props;


	/**
	 * 
	 */
	private static PropertiesUtil propsUtil;

	/**
	 * PropertiesUtilSingleton cons.
	 */
	private PropertiesUtil(){
		try{
			if(null == props){
				props = new Properties();

				InputStream in = getClass().getResourceAsStream("/ldap.properties");
				props.load(in);
				in.close();

			}
		}
		catch(FileNotFoundException _exe) {

		}
		catch(Exception _exe) {

		}
	}

	/**
	 * 
	 */
	public static String getCustomProperty(final String propertyName){
		String propertyValue = "";
		try{
			if(null == propsUtil){
				propsUtil = new PropertiesUtil();
			}
			propertyValue = props.getProperty(propertyName);
		}
		catch(Exception _exe){

		}
		return propertyValue;
	}

}
