package com.asuraiv.bar.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BarController {

	@GetMapping("/bar/receive-a-greet")
	public String greeting() {

		log.info("Bar server greeting handler is called.");

		return "Thank you. Foo";
	}
}
