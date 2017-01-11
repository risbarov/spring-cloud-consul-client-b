package org.sf.cloud.consul.discovery.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.sf.cloud.consul.discovery.remote.PingClient;

@RestController
public class FeignClientController {

	@Autowired
	private PingClient pingClient;

	@RequestMapping(value = "/feignClient")
	public String feignClient() {
		return pingClient.ping();
	}

}
