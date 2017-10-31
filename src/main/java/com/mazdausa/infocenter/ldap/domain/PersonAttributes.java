package com.mazdausa.infocenter.ldap.domain;

import javax.naming.NamingEnumeration;
import javax.naming.directory.BasicAttributes;

public class PersonAttributes implements IPersonAttributes
{
	

    private BasicAttributes attrs;
    /**
     * 
     */
    public PersonAttributes(BasicAttributes attrs)
    {
        super();
        this.attrs = attrs;
    }

    /**
     * Return null if not found
     */
    public String getFieldValue(String name) throws Exception
    {
        return (null != attrs.get(name)) ? ((String) attrs.get(name).get().toString()).trim() : null;
    }
    
    public String getField(String name) throws Exception
    {
        return (null != attrs.get(name)) ? ((String) attrs.get(name).get().toString()).trim() : "";
    }
    
    public void getAttrNames(IPersonAttributes.IAttrIdHandler handler)
    {
    	NamingEnumeration<String> idEnum =   attrs.getIDs();
    	try
    	{
	    	while(idEnum.hasMore())
	    	{
	    		handler.handle(idEnum.next());
	    	}
    	}
    	catch(Exception e)
    	{
    		
   
    	}
    }
    
    
}
