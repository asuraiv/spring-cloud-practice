package com.asuraiv.bar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarController {

	@GetMapping("/bar")
	public String bar() {
		return "bar";
	}
}
