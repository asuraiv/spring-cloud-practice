package com.asuraiv.bar.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class FooAdapter {

	@Autowired
	private RestTemplate restTemplate;

	public String greetToFoo() {

		ResponseEntity<String> response = restTemplate.getForEntity("http://foo-app/foo/receive-a-greet", String.class);

		if(!HttpStatus.OK.equals(response.getStatusCode())) {
			throw new RuntimeException("Error occur during greeting to foo");
		}

		return response.getBody();
	}
}
