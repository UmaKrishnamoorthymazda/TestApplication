package com.mazdausa.infocenter.ldap.domain;


public class LDAPUserAttributeImpl implements LDAPUserAttribute 
{

	private java.lang.String employeeNumber;
	private java.lang.String dealerEmpCd;
	private java.lang.String c;
	private java.lang.String uid;
	private java.lang.String loctnCd;
	private java.lang.String l;
	private java.lang.String cntryCd;
	private java.lang.String mail;
	private java.lang.String organizationalStatus;
	private java.lang.String extnsnNo;
	private java.lang.String faxNo;
	private java.lang.String cn;
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
	private java.lang.String sn;
	private java.lang.String lastUpdtTm;
	private java.lang.String lastUseridCd;
	private java.lang.String loctnNm;
	private java.lang.String initials;
	private java.lang.String telephoneNumber;
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
	private java.lang.String postalCode;
	private java.lang.String dealerComments;
	private java.lang.String vdsdlrcd;
	private java.lang.String languageCd;
	private javax.naming.directory.BasicAttributes attributes;
	/**
	 * LDAPUserAttributeImpl constructor comment.
	 */
	public LDAPUserAttributeImpl() {
		this.setAttributes(new javax.naming.directory.BasicAttributes());
		// super();
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 11:06:52 AM)
	 * @return javax.naming.directory.BasicAttributes
	 */
	private javax.naming.directory.BasicAttributes getAttributes() {
		return attributes;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:42:46 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getC() {
		return c;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:45:47 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getCn() {
		return cn;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:44:13 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getCntryCd() {
		return cntryCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 11:06:12 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getDealerComments() {
		return dealerComments;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:42:30 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getDealerEmpCd() {
		return dealerEmpCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:56:16 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getDstrctCd() {
		return dstrctCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:42:08 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getEmployeeNumber() {
		return employeeNumber;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:44:51 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getExtnsnNo() {
		return extnsnNo;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:45:07 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getFaxNo() {
		return faxNo;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:46:37 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getHireCd() {
		return hireCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:51:38 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getHireDt() {
		return hireDt;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:51:57 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getHomePhone() {
		return homePhone;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:55:05 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getInitials() {
		return initials;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:53:34 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getJobCtgryCd() {
		return jobCtgryCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:53:46 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getJobCtgryNm() {
		return jobCtgryNm;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:52:28 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getJobStartDt() {
		return jobStartDt;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:43:58 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getL() {
		return l;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:54:10 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getLastUpdtTm() {
		return lastUpdtTm;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:54:35 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getLastUseridCd() {
		return lastUseridCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:43:44 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getLoctnCd() {
		return loctnCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:54:50 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getLoctnNm() {
		return loctnNm;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:57:05 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getLoctnStatusCd() {
		return loctnStatusCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:44:25 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getMail() {
		return mail;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:44:37 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getOrganizationalStatus() {
		return organizationalStatus;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:55:32 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getPersonalTitle() {
		return personalTitle;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 11:06:01 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getPostalCode() {
		return postalCode;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:52:40 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getPrimJobCd() {
		return primJobCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:56:48 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getPrsnStatusCd() {
		return prsnStatusCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:55:52 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getPrsnTypeCd() {
		return prsnTypeCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:56:03 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getRgnCd() {
		return rgnCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:52:53 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getSecJobCd1() {
		return secJobCd1;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:53:06 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getSecJobCd2() {
		return secJobCd2;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:53:18 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getSecJobCd3() {
		return secJobCd3;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:53:55 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getSn() {
		return sn;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:56:29 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getStCd() {
		return stCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:57:20 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getStr1Ad() {
		return str1Ad;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:57:34 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getStr2Ad() {
		return str2Ad;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:57:58 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getStr3Ad() {
		return str3Ad;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:55:19 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getTelephoneNumber() {
		return telephoneNumber;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:52:16 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getTitle() {
		return title;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 11:05:01 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getTrmntnCd() {
		return trmntnCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 11:05:14 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getTrmntnDt() {
		return trmntnDt;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 11:05:26 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getType1Cd() {
		return type1Cd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 11:05:37 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getType2Cd() {
		return type2Cd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 11:05:48 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getType3Cd() {
		return type3Cd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 10:43:01 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getUid() {
		return uid;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (8/16/2002 11:06:23 AM)
	 * @return java.lang.String
	 */
	public java.lang.String getVdsdlrcd() {
		return vdsdlrcd;
	}
	public String getLanguageCd() {
		return languageCd;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (3/14/2001 10:52:27 AM)
	 * @param newAttributes javax.naming.directory.BasicAttributes
	 */
	public void setAttributes(javax.naming.directory.BasicAttributes newAttributes) {
		attributes = newAttributes;
		try {
			employeeNumber = ((null != attributes.get("employeeNumber")) ? attributes.get("employeeNumber").get().toString().trim() : "");
			dealerEmpCd = ((null != attributes.get("dealerEmpCd")) ? attributes.get("dealerEmpCd").get().toString().trim() : "");
			c = ((null != attributes.get("c")) ? attributes.get("c").get().toString() : "");
			uid = ((null != attributes.get("uid")) ? attributes.get("uid").get().toString().trim() : "");
			loctnCd = ((null != attributes.get("loctnCd")) ? attributes.get("loctnCd").get().toString().trim() : "");
			l = ((null != attributes.get("l")) ? attributes.get("l").get().toString() : "");
			cntryCd = ((null != attributes.get("cntryCd")) ? attributes.get("cntryCd").get().toString() : "");
			mail = ((null != attributes.get("mail")) ? attributes.get("mail").get().toString().trim() : "");
			organizationalStatus = ((null != attributes.get("organizationalStatus")) ? attributes.get("organizationalStatus").get().toString() : "");
			extnsnNo = ((null != attributes.get("extnsnNo")) ? attributes.get("extnsnNo").get().toString() : "");
			faxNo = ((null != attributes.get("faxNo")) ? attributes.get("faxNo").get().toString() : "");
			cn = ((null != attributes.get("cn")) ? attributes.get("cn").get().toString() : "");
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
			sn = ((null != attributes.get("sn")) ? attributes.get("sn").get().toString() : "");
			lastUpdtTm = ((null != attributes.get("lastUpdtTm")) ? attributes.get("lastUpdtTm").get().toString() : "");
			lastUseridCd = ((null != attributes.get("lastUseridCd")) ? attributes.get("lastUseridCd").get().toString().trim() : "");
			loctnNm = ((null != attributes.get("loctnNm")) ? attributes.get("loctnNm").get().toString() : "");
			initials = ((null != attributes.get("initials")) ? attributes.get("initials").get().toString() : "");
			telephoneNumber = ((null != attributes.get("telephoneNumber")) ? attributes.get("telephoneNumber").get().toString() : "");
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
			postalCode = ((null != attributes.get("postalCode")) ? attributes.get("postalCode").get().toString() : "");
			dealerComments = ((null != attributes.get("dealerComments")) ? attributes.get("dealerComments").get().toString() : "");
			vdsdlrcd = ((null != attributes.get("vdsdlrcd")) ? attributes.get("vdsdlrcd").get().toString() : "");
			languageCd = ((null != attributes.get("languagecode")) ? attributes.get("languagecode").get().toString() : "");
		} catch (javax.naming.NamingException ex) {
			//log.error("Attribute name can not be found. " + ex.getMessage());
		}
	}
}