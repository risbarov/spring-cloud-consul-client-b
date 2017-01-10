package org.sf.cloud.consul.discovery.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.sf.cloud.consul.discovery.client.ServiceAClient;

@RestController
public class FeignClientController {

	@Autowired
	private ServiceAClient serviceAClient;

	@RequestMapping(value = "/feignClient")
	public String feignClient() {
		return serviceAClient.ping();
	}

}
