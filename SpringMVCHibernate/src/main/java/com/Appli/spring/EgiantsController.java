package com.vishal.spring;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;


import com.journaldev.spring.model.Person;

import com.journaldev.spring.service.PersonService;


@Controller
public class EgiantsController {
	

	private EgiantsService eginatsService;
	

	@Autowired(required=true)

	@Qualifier(value="egiantsService")

	public void setEgiantsService(EginatsService ps){
	
	this.egiantsService = es;
	
}
	
	
@RequestMapping(value = "/egiants", method = RequestMethod.GET)

	public String listEgiants(Model model) {
	
	model.addAttribute("egiants", new Egiants());
		
model.addAttribute("listegiants", this.giantsService.listEgiants());

		return "egiants";
	
}
	

	
@RequestMapping(value= "/egiants/a1", method = RequestMethod.POST)

	public String addegiants(@ModelAttribute("egiants") Egiants e){

		
		if(e.getId() == 0){
			

this.egiantsService.addEgiants(e);

		}
else{
	
	
this.egiantsService.updateEgiants(e);
	
	}

		
		return "redirect:/persons";
		

	}
	


	
}
