package com.mazdausa.infocenter.ldap.util;

import java.util.Date;

public class ConvertUtil {
	/**
     * ConvertPerson constructor comment.
     */
    public ConvertUtil()
    {
        super();
    }

    /**
     * 
     * This method will convert Date obj to String format as: MM/dd/yyyy
     * 
     * Insert the method's description here. Creation date: (3/20/2001 2:15:09 PM)
     * 
     * @return java.lang.String
     * @param aDate
     *            java.util.Date
     */
    public String dateToString(Date aDate)
    {
        if (aDate == null)
            aDate = new Date();
        return new java.text.SimpleDateFormat("yyyy-MM-dd").format(aDate);
    }

    /**
     * This method will convert String to Date input String format: mm/dd/yyyy output Date format: Date Obj. new java.util.Date(yyyy, mm.dd);
     * 
     * Creation date: (3/20/2001 2:15:51 PM)
     * 
     * @return java.util.Date
     * @param str
     *            java.lang.String
     */
    public Date stringToDate(String str)
    {
        Date date = new Date();
        if (null != str && str != "")
        {
            try
            {
                date = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(str);
            } catch (java.text.ParseException ex)
            {
                //log.error("Common LDAP ConvertUtil.stringToDate method can not parse string to Date object." + ex.toString());
            }
        }
        return date;
    }

    /**
     * Insert the method's description here. Creation date: (11/2/2001 9:45:24 AM)
     * 
     * @return boolean
     * @param str
     *            java.lang.String
     */
    private boolean isString(Object str)
    {
        try
        {
            String testStr = (String) str;
            return true;
        } catch (ClassCastException ex)
        {
        	ex.printStackTrace();
            return false;
        }
    }
}
