package com.example.ativ1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ativ1")
public class ativ1Controller {
	
	@GetMapping
	public String ativ1() {
		return "Usei persistência e atenção aos detalhes";
	}
}
