package com.example.ativ2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ativ2Controller {

		@GetMapping("/acesse2")
	public String ativ2() {
			return "Os objetivos dessa semana serão aprender SpringBoot e suas funções";
		}
}
