package com.clientregistration.deleteservice.adapters;

import com.clientregistration.deleteservice.entities.salesforce.Request;
import com.clientregistration.deleteservice.entities.salesforce.Response;
import com.clientregistration.deleteservice.interfaces.IClientProviderAdaptee;
import com.clientregistration.deleteservice.interfaces.IClientTarget;

public class ClientAdapter implements IClientTarget{

	private IClientProviderAdaptee _clientAdaptee;
	private Response responseSalesforce;
	
	public ClientAdapter(IClientProviderAdaptee adaptee) {
		this._clientAdaptee = adaptee;
	}
	
	@Override
	public void updateClient(Request request) {
		this.responseSalesforce = this._clientAdaptee.UpdateClient(request);
	}

	@Override
	public Response updateClientResponse() {
		return this.responseSalesforce;
	}


}
