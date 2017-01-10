package org.sf.cloud.consul.discovery.web;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DiscoveryClientController {

	private static final String SERVICE_ID = "spring-cloud-consul-discovery-client-a";

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "/discoveryClient")
	public String discoveryClient() {
		StringBuilder stringBuilder = new StringBuilder();

		discoveryClient.getInstances(SERVICE_ID).forEach((ServiceInstance s) -> {
			URI serviceUri = s.getUri();

			String serviceResponse = new RestTemplate().getForObject(serviceUri.resolve("/ping"), String.class);

			stringBuilder.append("[")
				.append(serviceUri.toString())
				.append(" ::: ")
				.append(serviceResponse)
				.append("]");
		});

		return stringBuilder.toString();
	}

}
