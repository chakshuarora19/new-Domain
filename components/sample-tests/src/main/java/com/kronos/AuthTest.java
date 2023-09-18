package com.kronos;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kronos.api.rest.base.BaseAPITest;
import com.kronos.api.rest.base.BaseRestParameter;
import com.kronos.api.rest.exception.KronosCoreAPIException;
import com.kronos.api.rest.operations.APIResponse;
import com.kronos.exception.KronosCoreCommonException;

public class AuthTest extends BaseAPITest{
//	
	@Test(groups= {"bothFlows"})
	public void runTestWithAuthAndOpenAM() throws KronosCoreAPIException {
		AuthObject auth=new AuthObject(apiDriver);
		apiDriver.login("cxsysadmin","Pr0mensi0ns@UKG");
		APIResponse response1=auth.getDisplayProfiles();
		System.out.println(response1.getResponseAsString());
		apiDriver.logout();
		
	}
	
	@Test(groups= {"existing"})
	public void runTestWithExisting() throws KronosCoreAPIException {
		AuthObject auth=new AuthObject(apiDriver);
		apiDriver.login("cxsysadmin","Pr0mensi0ns@UKG");
		APIResponse response=auth.getOrganizations();
		System.out.println(response.getResponseAsString());
	}
	
	
	

}
