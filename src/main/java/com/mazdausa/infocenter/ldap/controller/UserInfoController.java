package com.mazdausa.infocenter.ldap.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mazdausa.infocenter.ldap.domain.LDAPPerson;
import com.mazdausa.infocenter.ldap.domain.UserInformation;
import com.mazdausa.infocenter.ldap.service.LDAPServiceImpl;

@RestController
@RequestMapping(value="/userinfo")
public class UserInfoController {

	final static Logger logger = Logger.getLogger(UserInfoController.class);

	//http://localhost:8080/userinfo/skoora
	@RequestMapping(value = "{userWSLID}", method = RequestMethod.GET, headers="Accept=application/json")
	public UserInformation CheckUserLdapDetail(@PathVariable("userWSLID") String userWSLID)throws Exception
	{
		UserInformation userprofileInfo = new UserInformation();	
		LDAPPerson ldapPerson = LDAPServiceImpl.getInstance().findActiveUserByUserId(userWSLID);
		if(ldapPerson!=null){
			try
			{	
				userprofileInfo = new UserInformation();
				userprofileInfo.setFirstName(ldapPerson.getFirstName());
				userprofileInfo.setLastName(ldapPerson.getLastName());
				userprofileInfo.setDealername(ldapPerson.getDealerCmt());
				userprofileInfo.setContacNO(ldapPerson.getPhoneNo());
				userprofileInfo.setEmail(ldapPerson.getEmail());
				//userprofileInfo.setDealerCode(ldapPerson.getLoctnCd());
				userprofileInfo.setSrc_UserId(userWSLID);
				userprofileInfo.setDisplayName(ldapPerson.getFirstName() +" " +ldapPerson.getLastName() );
				userprofileInfo.setPrsnTypeCd(ldapPerson.getPrsnTypeCd());
				userprofileInfo.setLoctnCd(ldapPerson.getLoctnCd());
				//COMMENTED THE BELOW LINE FOR TSS3-1322 AND ADDED PrimJobCd.
				//userprofileInfo.setUserJobcode(ldapPerson.getJobCtgryCd());
				userprofileInfo.setUserJobcode(ldapPerson.getPrimJobCd());
				userprofileInfo.setType1cd(ldapPerson.getType1Cd());
				userprofileInfo.setType2cd(ldapPerson.getType2Cd());
				userprofileInfo.setType3cd(ldapPerson.getType3Cd());
				userprofileInfo.setLastUseridCd(ldapPerson.getLastUseridCd());
				userprofileInfo.setLdapUserId(ldapPerson.getUserid());
				userprofileInfo.setSecJobCd1(ldapPerson.getSecJobCd1());
				userprofileInfo.setSecJobCd2(ldapPerson.getSecJobCd2());
				userprofileInfo.setSecJobCd3(ldapPerson.getSecJobCd3());
				userprofileInfo.setPrimaryJobCode(ldapPerson.getPrimJobCd());
				userprofileInfo.setJobCatCode(ldapPerson.getJobCtgryCd());
				userprofileInfo.setEmployeeNumber(ldapPerson.getEmployeeNumber());
				userprofileInfo.setDealerEmpCd(ldapPerson.getDealerEmpCd());
				userprofileInfo.setCountry(ldapPerson.getCountry());
				userprofileInfo.setLanguage(ldapPerson.getLanguageCd());
				userprofileInfo.setUserDealerPerson(ldapPerson.isDealerPerson());
				userprofileInfo.setCountryCd(ldapPerson.getCountryCd());
				userprofileInfo.setCity(ldapPerson.getCity());

				userprofileInfo.setExecJobFlag(ldapPerson.getExecJobFlag());
				userprofileInfo.setExtnsnNo(ldapPerson.getExtnsnNo());
				userprofileInfo.setFaxNo(ldapPerson.getFaxNo());
				userprofileInfo.setHireCd(ldapPerson.getHireCd());
				userprofileInfo.setHireDt(ldapPerson.getHireDt());
				userprofileInfo.setHomePhone(ldapPerson.getHomePhone());
				userprofileInfo.setInitialNm(ldapPerson.getInitialNm());
				userprofileInfo.setJobCtgryNm(ldapPerson.getJobCtgryNm());
				userprofileInfo.setJobDescription(ldapPerson.getJobDescription(ldapPerson.getPrimJobCd()));
				userprofileInfo.setJobStartDt(ldapPerson.getJobStartDt());
				userprofileInfo.setLocationNm(ldapPerson.getLocationNm());
				userprofileInfo.setLastUpdtTm(ldapPerson.getLastUpdtTm());
				userprofileInfo.setLoctnStatusCd(ldapPerson.getLoctnStatusCd());
				userprofileInfo.setPersonalTitle(ldapPerson.getPersonalTitle());
				userprofileInfo.setPostalCd(ldapPerson.getPostalCd());
				userprofileInfo.setPrimJobCd(ldapPerson.getPrimJobCd());
				userprofileInfo.setPrsnStatusCd(ldapPerson.getPrsnStatusCd());
				userprofileInfo.setPrsnTypeCd(ldapPerson.getPrsnTypeCd());
				userprofileInfo.setRgnCd(ldapPerson.getRgnCd());
				userprofileInfo.setStCd(ldapPerson.getStCd());
				userprofileInfo.setStr1Ad(ldapPerson.getStr1Ad());
				userprofileInfo.setStr2Ad(ldapPerson.getStr2Ad());
				userprofileInfo.setStr3Ad(ldapPerson.getStr3Ad());
				userprofileInfo.setTitle(ldapPerson.getTitle());
				userprofileInfo.setTrmntnCd(ldapPerson.getTrmntnCd());
				userprofileInfo.setTrmntnD(ldapPerson.getTrmntnDt());
				userprofileInfo.setUserId(ldapPerson.getUserid());
				userprofileInfo.setVdsDlrCd(ldapPerson.getVdsDlrCd());

			}
			catch(Exception e ){

				logger.error("User Ldap Information exception :" +e);
			}
		}
		return userprofileInfo;	
	}
}
