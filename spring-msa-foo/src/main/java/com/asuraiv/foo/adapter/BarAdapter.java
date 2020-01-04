package com.asuraiv.foo.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BarAdapter {

	@Autowired
	private RestTemplate restTemplate;

	public String receiveAGreet() {

		ResponseEntity<String> response = restTemplate.getForEntity("http://127.0.0.1:20082/bar/receive-a-greet", String.class);

		if(!HttpStatus.OK.equals(response.getStatusCode())) {
			throw new RuntimeException("Error occur during greeting to bar");
		}

		return response.getBody();
	}
}
