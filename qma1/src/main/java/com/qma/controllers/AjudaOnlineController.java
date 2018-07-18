package com.qma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qma.models.AjudaOnline;
import com.qma.repository.AjudaOnlineRepository;
import com.qma.services.AjudaOnlineServiceImpl;

@Controller
public class AjudaOnlineController {
	
	@Autowired
	private AjudaOnlineServiceImpl ajudaOnlineRepository;
	
	@GetMapping("/ajudaonline")
    public String greetingForm(Model model) {
        model.addAttribute("ajudaonline", new AjudaOnline());
        return "cadastrarAjudaOnline";
    }

    @PostMapping("/ajudaonline")
    public String greetingSubmit(@ModelAttribute AjudaOnline ajuda) {
    	ajudaOnlineRepository.cadastraAjudaOnline(ajuda);
        return "redirect:/ajudaonline";
    }
    
    @GetMapping(path="/ajudasonline")
	public @ResponseBody Iterable<AjudaOnline> getAllTutores() {
		// This returns a JSON or XML with the users
		return ajudaOnlineRepository.findAllAjudaOnline();
	}

}
