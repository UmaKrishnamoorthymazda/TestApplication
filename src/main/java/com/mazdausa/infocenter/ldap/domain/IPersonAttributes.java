package com.mazdausa.infocenter.ldap.domain;

public interface IPersonAttributes
{
	public interface IAttrIdHandler
	{
		public void handle(String idName);
	}
	
    public String getField(String name) throws Exception;
    public String getFieldValue(String name) throws Exception;
    public void getAttrNames(IAttrIdHandler handler);
}
