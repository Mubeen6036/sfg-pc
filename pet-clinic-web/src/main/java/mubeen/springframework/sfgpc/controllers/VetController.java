package mubeen.springframework.sfgpc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mubeen.springframework.sfgpc.services.VetService;

@Controller
public class VetController {
	
	private final VetService vetService;
	
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}



	@RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
	public String listsVets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}

}
