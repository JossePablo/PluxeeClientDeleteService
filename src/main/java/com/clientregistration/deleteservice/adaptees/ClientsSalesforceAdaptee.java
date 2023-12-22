package com.clientregistration.deleteservice.adaptees;

import com.clientregistration.deleteservice.entities.salesforce.Request;
import com.clientregistration.deleteservice.entities.salesforce.Response;
import com.clientregistration.deleteservice.interfaces.IClientProviderAdaptee;
import com.clientregistration.deleteservice.utilities.RequestAPI;


public class ClientsSalesforceAdaptee implements IClientProviderAdaptee{

	public ClientsSalesforceAdaptee() {}
	
	@Override
	public Response UpdateClient(Request request) {
		// TODO Auto-generated method stub
		RequestAPI requestAPI = new RequestAPI();
		return requestAPI.enviarPeticiónDelete(request);
	}

}
