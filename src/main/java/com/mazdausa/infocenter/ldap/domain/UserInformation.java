package com.mazdausa.infocenter.ldap.domain;

import java.util.Date;

public class UserInformation {

	private long id;
	private String displayImageApproved;
	private String socialBio;
	private String username = "";
	private String dealername = "";
	private String adddate;
	private String imageShow;
	private String src_UserId;
	private String displayImageUrl;
	private String url;
	private String contacNO;
	private String status;
	private Date convertDate;
	private String createdDate;
	private String email;
	private String displayName;
	private String facebookId;
	private String twitterId;
	private String linkedinId;
	private String dealerCode;
	private String userJobcode;
	private String firstName;
	private String lastName;
	private String prsnTypeCd;
	private String loctnCd;
	private String nickname;
	private String alternateContactNo;
	private String type1cd;
	private String type2cd;
	private String lastModifiedDate;
	private String locale;
	private String city;
	private String countryCd;
	private String lastUseridCd,ldapUserId,secJobCd1,secJobCd2,secJobCd3,primaryJobCode,
	jobCatCode,employeeNumber,dealerEmpCd,districtCd,execJobFlag,extnsnNo,faxNo,hireCd,hireDt,homePhone,initialNm,
	jobCtgryNm,jobStartDt,lastUpdtTm,loctnStatusCd,personalTitle,phoneNo,postalCd,primJobCd,prsnStatusCd,
	rgnCd,stCd,str1Ad,str2Ad,str3Ad,title,trmntnCd,trmntnD,type1Cd,type2Cd,type3Cd,dDealerCmt,locationNm,vdsDlrCd,
	languageCd,jobDescription;
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	private boolean isactive;


	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	private String photoUploadFlag;	

	private boolean isUserDealerPerson;
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryCd() {
		return countryCd;
	}

	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}

	public String getDistrictCd() {
		return districtCd;
	}

	public void setDistrictCd(String districtCd) {
		this.districtCd = districtCd;
	}

	public String getExecJobFlag() {
		return execJobFlag;
	}

	public void setExecJobFlag(String execJobFlag) {
		this.execJobFlag = execJobFlag;
	}

	public String getExtnsnNo() {
		return extnsnNo;
	}

	public void setExtnsnNo(String extnsnNo) {
		this.extnsnNo = extnsnNo;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getHireCd() {
		return hireCd;
	}

	public void setHireCd(String hireCd) {
		this.hireCd = hireCd;
	}

	public String getHireDt() {
		return hireDt;
	}

	public void setHireDt(String hireDt) {
		this.hireDt = hireDt;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getInitialNm() {
		return initialNm;
	}

	public void setInitialNm(String initialNm) {
		this.initialNm = initialNm;
	}

	public String getJobCtgryNm() {
		return jobCtgryNm;
	}

	public void setJobCtgryNm(String jobCtgryNm) {
		this.jobCtgryNm = jobCtgryNm;
	}

	public String getJobStartDt() {
		return jobStartDt;
	}

	public void setJobStartDt(String jobStartDt) {
		this.jobStartDt = jobStartDt;
	}

	public String getLastUpdtTm() {
		return lastUpdtTm;
	}

	public void setLastUpdtTm(String lastUpdtTm) {
		this.lastUpdtTm = lastUpdtTm;
	}

	public String getLoctnStatusCd() {
		return loctnStatusCd;
	}

	public void setLoctnStatusCd(String loctnStatusCd) {
		this.loctnStatusCd = loctnStatusCd;
	}

	public String getPersonalTitle() {
		return personalTitle;
	}

	public void setPersonalTitle(String personalTitle) {
		this.personalTitle = personalTitle;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPostalCd() {
		return postalCd;
	}

	public void setPostalCd(String postalCd) {
		this.postalCd = postalCd;
	}

	public String getPrimJobCd() {
		return primJobCd;
	}

	public void setPrimJobCd(String primJobCd) {
		this.primJobCd = primJobCd;
	}

	public String getPrsnStatusCd() {
		return prsnStatusCd;
	}

	public void setPrsnStatusCd(String prsnStatusCd) {
		this.prsnStatusCd = prsnStatusCd;
	}

	public String getRgnCd() {
		return rgnCd;
	}

	public void setRgnCd(String rgnCd) {
		this.rgnCd = rgnCd;
	}

	public String getStCd() {
		return stCd;
	}

	public void setStCd(String stCd) {
		this.stCd = stCd;
	}

	public String getStr1Ad() {
		return str1Ad;
	}

	public void setStr1Ad(String str1Ad) {
		this.str1Ad = str1Ad;
	}

	public String getStr2Ad() {
		return str2Ad;
	}

	public void setStr2Ad(String str2Ad) {
		this.str2Ad = str2Ad;
	}

	public String getStr3Ad() {
		return str3Ad;
	}

	public void setStr3Ad(String str3Ad) {
		this.str3Ad = str3Ad;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTrmntnCd() {
		return trmntnCd;
	}

	public void setTrmntnCd(String trmntnCd) {
		this.trmntnCd = trmntnCd;
	}

	public String getTrmntnD() {
		return trmntnD;
	}

	public void setTrmntnD(String trmntnD) {
		this.trmntnD = trmntnD;
	}

	public String getType1Cd() {
		return type1Cd;
	}

	public void setType1Cd(String type1Cd) {
		this.type1Cd = type1Cd;
	}

	public String getType2Cd() {
		return type2Cd;
	}

	public void setType2Cd(String type2Cd) {
		this.type2Cd = type2Cd;
	}

	public String getType3Cd() {
		return type3Cd;
	}

	public void setType3Cd(String type3Cd) {
		this.type3Cd = type3Cd;
	}

	public String getdDealerCmt() {
		return dDealerCmt;
	}

	public void setdDealerCmt(String dDealerCmt) {
		this.dDealerCmt = dDealerCmt;
	}

	public String getLocationNm() {
		return locationNm;
	}

	public void setLocationNm(String locationNm) {
		this.locationNm = locationNm;
	}

	public String getVdsDlrCd() {
		return vdsDlrCd;
	}

	public void setVdsDlrCd(String vdsDlrCd) {
		this.vdsDlrCd = vdsDlrCd;
	}

	public String getLanguageCd() {
		return languageCd;
	}

	public void setLanguageCd(String languageCd) {
		this.languageCd = languageCd;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}








	public boolean isUserDealerPerson() {
		return isUserDealerPerson;
	}

	public void setUserDealerPerson(boolean isUserDealerPerson) {
		this.isUserDealerPerson = isUserDealerPerson;
	}

	public String getPhotoUploadFlag() {
		return photoUploadFlag;
	}

	public void setPhotoUploadFlag(String photoUploadFlag) {
		this.photoUploadFlag = photoUploadFlag;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	private String country;
	private String language;

	public String getLastUseridCd() {
		return lastUseridCd;
	}

	public void setLastUseridCd(String lastUseridCd) {
		this.lastUseridCd = lastUseridCd;
	}

	public String getLdapUserId() {
		return ldapUserId;
	}

	public void setLdapUserId(String ldapUserId) {
		this.ldapUserId = ldapUserId;
	}

	public String getSecJobCd1() {
		return secJobCd1;
	}

	public void setSecJobCd1(String secJobCd1) {
		this.secJobCd1 = secJobCd1;
	}

	public String getSecJobCd2() {
		return secJobCd2;
	}

	public void setSecJobCd2(String secJobCd2) {
		this.secJobCd2 = secJobCd2;
	}

	public String getSecJobCd3() {
		return secJobCd3;
	}

	public void setSecJobCd3(String secJobCd3) {
		this.secJobCd3 = secJobCd3;
	}

	public String getPrimaryJobCode() {
		return primaryJobCode;
	}

	public void setPrimaryJobCode(String primaryJobCode) {
		this.primaryJobCode = primaryJobCode;
	}

	public String getJobCatCode() {
		return jobCatCode;
	}

	public void setJobCatCode(String jobCatCode) {
		this.jobCatCode = jobCatCode;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getDealerEmpCd() {
		return dealerEmpCd;
	}

	public void setDealerEmpCd(String dealerEmpCd) {
		this.dealerEmpCd = dealerEmpCd;
	}

	public String getLocale() {
		if(locale==null){
			locale="en_US";
		}
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getNickname() {

		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAlternateContactNo() {
		return alternateContactNo;
	}

	public void setAlternateContactNo(String alternateContactNo) {
		this.alternateContactNo = alternateContactNo;
	}

	public String getType1cd() {
		return type1cd;
	}

	public void setType1cd(String type1cd) {
		this.type1cd = type1cd;
	}

	public String getType2cd() {
		return type2cd;
	}

	public void setType2cd(String type2cd) {
		this.type2cd = type2cd;
	}

	public String getType3cd() {
		return type3cd;
	}

	public void setType3cd(String type3cd) {
		this.type3cd = type3cd;
	}

	private String type3cd;

	public String getLoctnCd() {
		return nullCheck(loctnCd);
	}

	public void setLoctnCd(String loctnCd) {
		this.loctnCd = loctnCd;
	}

	public String getDisplayName() {
		return nullCheck(displayName);
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFacebookId() {
		return nullCheck(facebookId);
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	public String getTwitterId() {
		return nullCheck(twitterId);
	}

	public void setTwitterId(String twitterId) {
		this.twitterId = twitterId;
	}

	public String getLinkedinId() {
		return nullCheck(linkedinId);
	}

	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}

	public String getDealerCode() {
		return dealerCode;
	}

	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}

	public String getUserJobcode() {
		return nullCheck(userJobcode);
	}

	public void setUserJobcode(String userJobcode) {
		this.userJobcode = userJobcode;
	}

	public String getFirstName() {
		return nullCheck(firstName);
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return nullCheck(lastName);
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPrsnTypeCd() {
		return nullCheck(prsnTypeCd);
	}

	public void setPrsnTypeCd(String prsnTypeCd) {
		this.prsnTypeCd = prsnTypeCd;
	}

	public String getEmail() {
		return nullCheck(email);
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreatedDate() {
		return nullCheck(createdDate);
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public Date getConvertDate() {
		return convertDate;
	}

	public void setConvertDate(Date convertDate) {
		this.convertDate = convertDate;
	}

	public String getStatus() {
		return nullCheck(status);
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSocialBio() {
		return nullCheck(socialBio);
	}

	public void setSocialBio(String socialBio) {
		this.socialBio = socialBio;
	}

	public String getContacNO() {
		return nullCheck(contacNO);
	}

	public void setContacNO(String contacNO) {
		this.contacNO = contacNO;
	}

	public String getDisplayImageApproved() {
		return nullCheck(displayImageApproved);
	}

	public void setDisplayImageApproved(String displayImageApproved) {
		this.displayImageApproved = displayImageApproved;
	}

	public String getUsername() {
		return nullCheck(username);
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDealername() {
		return nullCheck(dealername);
	}

	public void setDealername(String dealername) {
		this.dealername = dealername;
	}

	public String getAdddate() {
		return nullCheck(adddate);
	}

	public void setAdddate(String adddate) {
		this.adddate = adddate;
	}

	public String getImageShow() {
		return nullCheck(imageShow);
	}

	public void setImageShow(String imageShow) {
		this.imageShow = imageShow;
	}

	public String getUrl() {
		return nullCheck(url);
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSrc_UserId() {
		return nullCheck(src_UserId);
	}

	public void setSrc_UserId(String src_UserId) {
		this.src_UserId = src_UserId;
	}

	public String getDisplayImageUrl() {
		return nullCheck(displayImageUrl);
	}

	public void setDisplayImageUrl(String displayImageUrl) {
		this.displayImageUrl = displayImageUrl;
	}

	public String nullCheck(String str) {
		if (str == null) {
			return "";

		}
		return str;
	}

	public boolean isDealerPerson() {
		if ("D".equalsIgnoreCase(this.prsnTypeCd)
				|| "DL".equalsIgnoreCase(type1cd)
				|| "DL".equalsIgnoreCase(type2cd)
				|| "DL".equalsIgnoreCase(type3cd))
			return true;
		else
			return false;
	}

	public boolean isRegionPerson() {
		if ("RG".equalsIgnoreCase(type1cd) || "RG".equalsIgnoreCase(type2cd)
				|| "RG".equalsIgnoreCase(type3cd)
				|| "RD".equalsIgnoreCase(type1cd)
				|| "RD".equalsIgnoreCase(type2cd)
				|| "RD".equalsIgnoreCase(type3cd))
			return true;
		else
			return false;
	}

	public boolean isDistrictPerson() {
		if ("BD".equalsIgnoreCase(type1cd) || "BD".equalsIgnoreCase(type2cd)
				|| "BD".equalsIgnoreCase(type3cd)
				|| "PD".equalsIgnoreCase(type1cd)
				|| "PD".equalsIgnoreCase(type2cd)
				|| "PD".equalsIgnoreCase(type3cd)
				|| "SD".equalsIgnoreCase(type1cd)
				|| "SD".equalsIgnoreCase(type2cd)
				|| "SD".equalsIgnoreCase(type3cd)
				|| "VD".equalsIgnoreCase(type1cd)
				|| "VD".equalsIgnoreCase(type2cd)
				|| "VD".equalsIgnoreCase(type3cd)
				|| "OD".equalsIgnoreCase(type1cd)
				|| "OD".equalsIgnoreCase(type2cd)
				|| "OD".equalsIgnoreCase(type3cd))
			return true;
		else
			return false;
	}

	public boolean isCorporatePerson() {
		if ("MH".equalsIgnoreCase(this.prsnTypeCd)
				|| "MD".equalsIgnoreCase(this.prsnTypeCd))
			return true;
		else
			return false;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
