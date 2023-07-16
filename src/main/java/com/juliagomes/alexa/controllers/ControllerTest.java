package com.juliagomes.alexa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ControllerTest {
	
	@GetMapping
	public String testeAlexa() {
		return "ooooooi";
	}

	
}
