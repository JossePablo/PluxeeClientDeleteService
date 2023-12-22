package com.clientregistration.deleteservice.interfaces;

import com.clientregistration.deleteservice.entities.salesforce.Request;
import com.clientregistration.deleteservice.entities.salesforce.Response;

public interface IClientTarget {

	Response updateClientResponse();
	void updateClient(Request request);

}
