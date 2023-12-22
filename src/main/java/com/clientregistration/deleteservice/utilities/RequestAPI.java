package com.clientregistration.deleteservice.utilities;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import com.clientregistration.deleteservice.entities.salesforce.Request;
import com.clientregistration.deleteservice.entities.salesforce.Response;


public class RequestAPI {

	RestTemplate restTemplate;
	
	public Response enviarPeticiónDelete(Request request) {
		
		
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity <Request> entity = new HttpEntity<Request>(request, headers);
	    //return (Future<ResponseSalesforce>) restTemplate.exchange("http://localhost:8080/products", HttpMethod.PUT, entity, ResponseSalesforce.class).getBody();
	    Response response = new Response();
	    response.setMessage("Successful");
	    response.setStatus("200");
	    response.setStatusCode("200");
	    
	    return response;
	}
}
