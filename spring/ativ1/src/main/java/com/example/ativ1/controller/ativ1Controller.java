package com.example.ativ1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ativ1Controller {
	
	@GetMapping("/acesse1")
	public String ativ1() {
		return "Usei persistência e atenção aos detalhes";
	}
}
