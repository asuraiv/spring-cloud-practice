package com.asuraiv.bar.controller;

import com.asuraiv.bar.adapter.FooAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BarController {

	@Autowired
	private FooAdapter fooAdapter;

	@GetMapping("/bar/receive-a-greet")
	public String receiveAGreet() {

		log.info("Bar server receive-a-greet handler is called.");

		return "Thank you. Foo";
	}

	@GetMapping("/bar/greet-to-foo")
	public String greetToFoo() {

		return fooAdapter.greetToFoo();
	}
}
