package com.asuraiv.baz.controller;

import com.asuraiv.baz.adapter.BarAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Slf4j
@RestController
public class BazController {

	@Autowired
	private BarAdapter barAdapter;

	@GetMapping("/baz/receive-a-greet")
	public String receiveAGreet() {

		log.info("Baz server receive-a-greet handler is called.");

		if(new Random().nextInt(3) == 2) {
			throw new RuntimeException("Unexpected exception.");
		}

		return "Thank you.";
	}

	@GetMapping("/baz/greet-to-bar")
	public String greeting() {

		log.info("Baz server greeting handler is called.");

		return barAdapter.receiveAGreet();
	}
}
