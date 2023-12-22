package com.clientregistration.deleteservice.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clientregistration.deleteservice.adaptees.ClientsSalesforceAdaptee;
import com.clientregistration.deleteservice.adapters.ClientAdapter;
import com.clientregistration.deleteservice.entities.salesforce.Request;
import com.clientregistration.deleteservice.entities.salesforce.Response;

@RestController
public class ClientController {

	@DeleteMapping("/deleteClient")
	public Response updateClient(@RequestBody Request request) {
		ClientsSalesforceAdaptee clientSalesforceAdaptee = new ClientsSalesforceAdaptee();
		ClientAdapter clientAdapter = new ClientAdapter(clientSalesforceAdaptee);
		clientAdapter.updateClient(request);
		return clientAdapter.updateClientResponse();
	}
}