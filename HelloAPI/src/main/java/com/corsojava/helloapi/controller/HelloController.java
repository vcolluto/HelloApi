package com.corsojava.helloapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.helloapi.model.Saluto;

@RestController
@RequestMapping("/hello")		//le richieste gestite saranno /hello/*
public class HelloController {
	
	@GetMapping("/test")		//localhost:8080/hello/test
	@ResponseBody
	public String test() {
		return "<html><head><title>Saluto</title></head><body>Ciao!!</body></html>";
	}
	
	@GetMapping("/salutami")	//localhost:8080/hello/salutami?utente=Enzo
	public Saluto salutami(@RequestParam(name = "utente", required = false) String utente) {
		if (utente==null)
			return new Saluto(); 
		else
			return new Saluto(utente); 
	}

}
