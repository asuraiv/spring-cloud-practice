package com.asuraiv.foo.controller;

import com.asuraiv.foo.adapter.BarAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class FooController {

	@Autowired
	private BarAdapter barAdapter;

	@GetMapping("/foo/receive-a-greet")
	public String receiveAGreet() {

		log.info("Foo server receive-a-greet handler is called.");

		return "Thank you. Bar";
	}

	@GetMapping("/foo/greet-to-bar")
	public String greeting() {

		log.info("Foo server greeting handler is called.");

		return barAdapter.receiveAGreet();
	}
}
