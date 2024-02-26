package fr.eni.demoSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {
	
	@GetMapping("formulaire")
	public String afficherFormulaire() {
		return"formulaire";
	}
	
	@GetMapping("accueil")
	public String afficherAccueil() {
		return"index";
	}
}
