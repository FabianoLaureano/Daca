package com.qma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qma.models.Tutor;
import com.qma.repository.TutorRepository;
import com.qma.services.TutorServiceImpl;

@Controller
public class TutorController {
	
	@Autowired
	private TutorServiceImpl tutorRepository;
	
	@GetMapping("/tutor")
    public String greetingForm(Model model) {
        model.addAttribute("tutor", new Tutor());
        return "cadastrarTutor";
    }

    @PostMapping("/tutor")
    public String cadastrarTutor(@ModelAttribute Tutor tutor) {
    	tutorRepository.cadastraTutor(tutor);
        return "redirect:/tutor";
    }
    
    @GetMapping(path="/tutores")
	public @ResponseBody Iterable<Tutor> getAllTutores() {
		// This returns a JSON or XML with the users
		return tutorRepository.findAllTutor();
	}

}
