package com.mazdausa.infocenter.ldap.domain;

/**
 * Insert the type's description here.
 * Creation date: (3/13/2001 9:04:00 AM)
 * @author: Daniel Liang
 */
import javax.naming.directory.*;

public class LDAPPersonImpl implements LDAPPerson 
{

	private BasicAttributes attributes;
	private java.lang.String employeeNumber;
	private java.lang.String dealerEmpCd;
	private java.lang.String country;
	private java.lang.String userid;
	private java.lang.String loctnCd;
	private java.lang.String city;
	private java.lang.String countryCd;
	private java.lang.String email;
	private java.lang.String execJobFlag;
	private java.lang.String extnsnNo;
	private java.lang.String faxNo;
	private java.lang.String firstName;
	private java.lang.String hireCd;
	private java.lang.String hireDt;
	private java.lang.String homePhone;
	private java.lang.String title;
	private java.lang.String jobStartDt;
	private java.lang.String primJobCd;
	private java.lang.String secJobCd1;
	private java.lang.String secJobCd2;
	private java.lang.String secJobCd3;
	private java.lang.String jobCtgryCd;
	private java.lang.String jobCtgryNm;
	private java.lang.String lastName;
	private java.lang.String lastUpdtTm;
	private java.lang.String initialNm;
	private java.lang.String phoneNo;
	private java.lang.String personalTitle;
	private java.lang.String prsnTypeCd;
	private java.lang.String rgnCd;
	private java.lang.String dstrctCd;
	private java.lang.String stCd;
	private java.lang.String prsnStatusCd;
	private java.lang.String loctnStatusCd;
	private java.lang.String str1Ad;
	private java.lang.String str2Ad;
	private java.lang.String str3Ad;
	private java.lang.String trmntnCd;
	private java.lang.String trmntnDt;
	private java.lang.String type1Cd;
	private java.lang.String type2Cd;
	private java.lang.String type3Cd;
	private java.lang.String postalCd;
	private java.lang.String dealerCmt;
	private java.lang.String lastUseridCd;
	private java.lang.String locationNm;
	private java.lang.String languageCd;
	private java.lang.String vdsDlrCd;

	/**
	 * LDAPUser constructor comment.
	 */
	public LDAPPersonImpl() {
		this.setAttributes(new BasicAttributes());
		//super();
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (3/14/2001 10:52:27 AM)
	 * @return javax.naming.directory.BasicAttributes
	 */
	public BasicAttributes getAttributes() {
		return attributes;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:24:44 AM)
	 * @return int
	 */
	public String getCity() {
		return city;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:27:30 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getCountry() {
		return country;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:22:13 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getCountryCd() {
		return countryCd;
	}

	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:21:28 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getDealerEmpCd() {
		return dealerEmpCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:15:33 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getDstrctCd() {
		return dstrctCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:27:57 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getEmail() {
		return email;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:20:03 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getEmployeeNumber() {
		return employeeNumber;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:37:06 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getExecJobFlag() {
		return execJobFlag;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:54:31 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getExtnsnNo() {
		return extnsnNo;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:54:53 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getFaxNo() {
		return faxNo;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:55:18 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getFirstName() {
		return firstName;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:56:23 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getHireCd() {
		return hireCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:56:44 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getHireDt() {
		return hireDt;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:56:59 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getHomePhone() {
		return homePhone;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:13:05 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getInitialNm() {
		return initialNm;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 11:01:36 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getJobCtgryCd() {
		return jobCtgryCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:02:26 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getJobCtgryNm() {
		return jobCtgryNm;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:59:07 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getJobStartDt() {
		return jobStartDt;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:02:46 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getLastName() {
		return lastName;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:03:44 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getLastUpdtTm() {
		return lastUpdtTm;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:26:37 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getLoctnCd() {
		return loctnCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:16:22 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getLoctnStatusCd() {
		return loctnStatusCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:14:33 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getPersonalTitle() {
		return personalTitle;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:13:19 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getPhoneNo() {
		return phoneNo;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:22:20 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getPostalCd() {
		return postalCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:59:31 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getPrimJobCd() {
		return primJobCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:16:05 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getPrsnStatusCd() {
		return prsnStatusCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:14:51 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getPrsnTypeCd() {
		return prsnTypeCd;
	}

	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:15:09 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getRgnCd() {
		return rgnCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:59:53 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getSecJobCd1() {
		return secJobCd1;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 11:00:09 AM)
	 * @return int
	 */
	public java.lang.String getSecJobCd2() {
		return secJobCd2;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 11:01:11 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getSecJobCd3() {
		return secJobCd3;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:15:48 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getStCd() {
		return stCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:17:38 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getStr1Ad() {
		return str1Ad;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:17:52 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getStr2Ad() {
		return str2Ad;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:18:23 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getStr3Ad() {
		return str3Ad;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:58:47 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getTitle() {
		return title;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:18:48 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getTrmntnCd() {
		return trmntnCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:19:02 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getTrmntnDt() {
		return trmntnDt;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:20:32 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getType1Cd() {
		return type1Cd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:21:01 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getType2Cd() {
		return type2Cd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:21:22 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getType3Cd() {
		return type3Cd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 10:26:01 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getUserid() {
		return userid;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (3/14/2001 10:52:27 AM)
	 * @param newAttributes javax.naming.directory.BasicAttributes
	 */
	public void setAttributes(BasicAttributes newAttributes) {
		attributes = newAttributes;
		try {
			employeeNumber = ((null != attributes.get("employeeNumber")) ? attributes.get("employeeNumber").get().toString().trim() : "");
			dealerEmpCd = ((null != attributes.get("dealerEmpCd")) ? attributes.get("dealerEmpCd").get().toString().trim() : "");
			country = ((null != attributes.get("c")) ? attributes.get("c").get().toString() : "");
			userid = ((null != attributes.get("uid")) ? attributes.get("uid").get().toString().trim() : "");
			loctnCd = ((null != attributes.get("loctnCd")) ? attributes.get("loctnCd").get().toString().trim() : "");
			city = ((null != attributes.get("l")) ? attributes.get("l").get().toString() : "");
			countryCd = ((null != attributes.get("cntryCd")) ? attributes.get("cntryCd").get().toString() : "");
			email = ((null != attributes.get("mail")) ? attributes.get("mail").get().toString().trim() : "");
			execJobFlag = ((null != attributes.get("organizationalStatus")) ? attributes.get("organizationalStatus").get().toString() : "");
			extnsnNo = ((null != attributes.get("extnsnNo")) ? attributes.get("extnsnNo").get().toString() : "");
			faxNo = ((null != attributes.get("faxNo")) ? attributes.get("faxNo").get().toString() : "");
			firstName = ((null != attributes.get("cn")) ? attributes.get("cn").get().toString() : "");
			hireCd = ((null != attributes.get("hireCd")) ? attributes.get("hireCd").get().toString() : "");
			hireDt = ((null != attributes.get("hireDt")) ? attributes.get("hireDt").get().toString() : "");
			homePhone = ((null != attributes.get("homePhone")) ? attributes.get("homePhone").get().toString() : "");
			title = ((null != attributes.get("title")) ? attributes.get("title").get().toString() : "");
			jobStartDt = ((null != attributes.get("jobStartDt")) ? attributes.get("jobStartDt").get().toString() : "");
			primJobCd = ((null != attributes.get("primJobCd")) ? attributes.get("primJobCd").get().toString() : "");
			secJobCd1 = ((null != attributes.get("secJobCd1")) ? attributes.get("secJobCd1").get().toString() : "");
			secJobCd2 = ((null != attributes.get("secJobCd2")) ? attributes.get("secJobCd2").get().toString() : "");
			secJobCd3 = ((null != attributes.get("secJobCd3")) ? attributes.get("secJobCd3").get().toString() : "");
			jobCtgryCd = ((null != attributes.get("jobCtgryCd")) ? attributes.get("jobCtgryCd").get().toString().trim() : "");
			jobCtgryNm = ((null != attributes.get("jobCtgryNm")) ? attributes.get("jobCtgryNm").get().toString().trim() : "");
			lastName = ((null != attributes.get("sn")) ? attributes.get("sn").get().toString() : "");
			lastUpdtTm = ((null != attributes.get("lastUpdtTm")) ? attributes.get("lastUpdtTm").get().toString() : "");
			lastUseridCd = ((null != attributes.get("lastUseridCd")) ? attributes.get("lastUseridCd").get().toString().trim() : "");
			locationNm = ((null != attributes.get("loctnNm")) ? attributes.get("loctnNm").get().toString() : "");
			initialNm = ((null != attributes.get("initials")) ? attributes.get("initials").get().toString() : "");
			phoneNo = ((null != attributes.get("telephoneNumber")) ? attributes.get("telephoneNumber").get().toString() : "");
			personalTitle = ((null != attributes.get("personalTitle")) ? attributes.get("personalTitle").get().toString() : "");
			prsnTypeCd = ((null != attributes.get("prsnTypeCd")) ? attributes.get("prsnTypeCd").get().toString().trim() : "");
			rgnCd = ((null != attributes.get("rgnCd")) ? attributes.get("rgnCd").get().toString().trim() : "");
			dstrctCd = ((null != attributes.get("dstrctCd")) ? attributes.get("dstrctCd").get().toString().trim() : "");
			stCd = ((null != attributes.get("stCd")) ? attributes.get("stCd").get().toString().trim() : "");
			prsnStatusCd = ((null != attributes.get("prsnStatusCd")) ? attributes.get("prsnStatusCd").get().toString().trim() : "I");
			loctnStatusCd = ((null != attributes.get("loctnStatusCd")) ? attributes.get("loctnStatusCd").get().toString() : "");
			str1Ad = ((null != attributes.get("str1Ad")) ? attributes.get("str1Ad").get().toString() : "");
			str2Ad = ((null != attributes.get("str2Ad")) ? attributes.get("str2Ad").get().toString() : "");
			str3Ad = ((null != attributes.get("str3Ad")) ? attributes.get("str3Ad").get().toString() : "");
			trmntnCd = ((null != attributes.get("trmntnCd")) ? attributes.get("trmntnCd").get().toString() : "");
			trmntnDt = ((null != attributes.get("trmntnDt")) ? attributes.get("trmntnDt").get().toString() : "");
			type1Cd = ((null != attributes.get("type1Cd")) ? attributes.get("type1Cd").get().toString() : "");
			type2Cd = ((null != attributes.get("type2Cd")) ? attributes.get("type2Cd").get().toString() : "");
			type3Cd = ((null != attributes.get("type3Cd")) ? attributes.get("type3Cd").get().toString() : "");
			postalCd = ((null != attributes.get("postalCode")) ? attributes.get("postalCode").get().toString() : "");
			dealerCmt = ((null != attributes.get("dealerComments")) ? attributes.get("dealerComments").get().toString() : "");
			vdsDlrCd = ((null != attributes.get("vdsdlrcd")) ? attributes.get("vdsdlrcd").get().toString() : "");
			languageCd = ((null != attributes.get("languagecode")) ? attributes.get("languagecode").get().toString() : "");
		} catch (javax.naming.NamingException ex) {
			//log.error("Attribute name can not be found. " + ex.getMessage());
		}
	}

	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 1:22:49 PM)
	 * @return int
	 */
	public String getDealerCmt() {
		return dealerCmt;
	}

	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 9:00:25 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getLastUseridCd() {
		return lastUseridCd;
	}

	/**
	 * Insert the method's description here.
	 * Creation date: (1/17/2002 9:00:53 PM)
	 * @return java.lang.String
	 */
	public java.lang.String getLocationNm() {
		return locationNm;
	}

	/**
	 * Insert the method's description here.
	 * Creation date: (1/18/2002 8:23:07 AM)
	 * @return boolean
	 */
	public boolean isActive() {
		if ("I".equalsIgnoreCase(this.prsnStatusCd))
			return false;
		else
			return true;
	}

	/**
	 * Insert the method's description here.
	 * Creation date: (1/18/2002 8:10:31 AM)
	 * @return boolean
	 */
	public boolean isDealerPerson() {
		if ("D".equalsIgnoreCase(this.prsnTypeCd))
			return true;
		else
			return false;
	}

	/**
	 * Lookup Mazda Job Properties file for job description
	 *
	 * Creation date: (3/19/2002 11:04:18 AM)
	 * @return Mazda Job:  Description java.lang.String
	 * @param Mazda Job:   Code java.lang.String
	 */
	public String getJobDescription(String jobCode) 
	{
		return "";
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (6/24/2002 7:53:24 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getVdsDlrCd() {
		return vdsDlrCd;
	}

	/**
	 * Insert the method's description here.
	 * Creation date: (2/7/2003 8:21:37 AM)
	 * @param newEmail java.lang.String
	 */
	public void setEmail(String newEmail) {
		email = newEmail;
	}

	public String getLanguageCd() {
		return languageCd;
	}

}