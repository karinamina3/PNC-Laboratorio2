package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {

	String user = "coronavirus";
	String password = "covid19";
	
	@GetMapping("/login")
		public String enviarForm(Usuario usuario) {
			return "login";
	}
	
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {	
		if (usuario.getUser().equals(user) && usuario.getPassword().equals(password)) return "MostrarMensajeV";
		else  return "MostrarMensajeF"; 
	}
}