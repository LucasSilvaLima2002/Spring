package com.algaworks.algafood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MeuPrimeiroController {

	@GetMapping(value = "/hello")
	@ResponseBody
	public String hello() {
		return "Hello!";
	}
	
}