package com.corsojava.helloapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utenti")
public class UtentiController {
	
	@GetMapping("/nuovo")		//GET localhost:8080/utenti/nuovo
	public String nuovo() {
		//codice per creare un nuovo utente
		return "nuovo utente";
	}
	
	@GetMapping("/elenco")		//GET localhost:8080/utenti/elenco
	public String elenco() {
		//codice per recuperare l'elenco degli utenti
		return "elenco utenti";
	}

}
