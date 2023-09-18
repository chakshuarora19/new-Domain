package com.kronos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;

import com.kronos.api.rest.base.BaseAPIObject;
import com.kronos.api.rest.base.BaseRestParameter;
import com.kronos.api.rest.driver.APIDriver;
import com.kronos.api.rest.exception.KronosCoreAPIException;
import com.kronos.api.rest.json.Request;
import com.kronos.api.rest.operations.APIResponse;
import com.kronos.api.rest.operations.RestOperationUtils;
import com.kronos.context.ExecutionContext;
import com.kronos.exception.KronosCoreCommonException;
import com.kronos.testng.Configurator;
import com.kronos.tracking.Actions;
import com.kronos.tracking.CallingClassHelper;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
public class AuthObject extends BaseAPIObject{

	public AuthObject(APIDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public APIResponse getDisplayProfiles() throws KronosCoreAPIException {
		return driver.get("/wfc/restcall/v1/config/display_profiles/", params);
	}
	public APIResponse getOrganizations() throws KronosCoreAPIException{
		return driver.get("/api/v2/organizations",params);
	}
	
}

