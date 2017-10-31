package com.mazdausa.infocenter.ldap.dao;

import java.io.FileReader;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.mazdausa.infocenter.ldap.util.PropertiesUtil;


public class LDAPConfigImpl
{

	final static Logger logger = Logger.getLogger(LDAPConfigImpl.class);

	private static LDAPConfigImpl instance = new LDAPConfigImpl();
	private boolean initialized;
	private Properties configProp;
	/**
	 * Created:Nov 2, 2005
	 * Author:Mike Vu
	 * Method description:
	 * 
	 * @return
	 */
	public static LDAPConfigImpl getInstance()
	{
		return instance;
	}

	public void setConfig(String configFile)
	{
		//Loading the config file
	}

	public Properties getConfigProp()
	{
		//Initit the LDAP Environment
		Properties prop = new Properties();
		try
		{
			//ResourceBundle bundle = ResourceBundle.getBundle("ldap");

			final String factoryInitial = PropertiesUtil.getCustomProperty("java.naming.factory.initial");
			final String factoryUrl= PropertiesUtil.getCustomProperty("java.naming.provider.url");
			final String factoryVersion= PropertiesUtil.getCustomProperty("java.naming.ldap.version");
			final String factoryAuth= PropertiesUtil.getCustomProperty("java.naming.security.authentication");
			final String factoryPrincipal= PropertiesUtil.getCustomProperty("java.naming.security.principal");
			final String factorycredentials=PropertiesUtil.getCustomProperty("java.naming.security.credentials");

			logger.error(factoryInitial);
			logger.error(factoryUrl);
			logger.error(factoryVersion);
			logger.error(factoryAuth);
			logger.error(factoryPrincipal);
			logger.error(factorycredentials);


			prop.put("java.naming.factory.initial", factoryInitial);
			prop.put("java.naming.provider.url",factoryUrl);
			prop.put("java.naming.ldap.version",factoryVersion);
			prop.put("java.naming.security.authentication", factoryAuth);
			prop.put("java.naming.security.principal",factoryPrincipal);
			prop.put("java.naming.security.credentials", factorycredentials);
			//prop.load(new FileReader("C:/Emazda/emdcs_config/common/system_config/ldap.properties"));

			return prop;
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			logger.error("Exception encountered when setting up the LDAP Environment. "+e);
			return null;
		}
	}
}
