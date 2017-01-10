package org.sf.cloud.consul.discovery.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "spring-cloud-consul-discovery-client-a")
public interface ServiceAClient {

	@RequestMapping(method = RequestMethod.GET, value = "/ping", consumes = MediaType.APPLICATION_JSON_VALUE)
	String ping();

}
