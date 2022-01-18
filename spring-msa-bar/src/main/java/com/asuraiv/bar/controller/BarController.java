package com.asuraiv.bar.controller;

import com.asuraiv.bar.adapter.FooAAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BarController {

	@Autowired
	private FooAAdapter fooAdapter;

	@GetMapping("/bar/receive-a-greet")
	public String receiveAGreet() {

		log.info("Bar server receive-a-greet handler is called.");

		return "Thank you. Foo";
	}

	@GetMapping("/bar/greet-to-foo")
	public String greetToFoo() {

		log.info("Bar server delegate to foo server.");

		return fooAdapter.greetToFoo();
	}
}
