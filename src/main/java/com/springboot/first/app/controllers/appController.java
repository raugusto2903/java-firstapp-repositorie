package com.springboot.first.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class appController {
	@GetMapping
	public String helloworld() {
		return "!hello world¡";
	}
}
