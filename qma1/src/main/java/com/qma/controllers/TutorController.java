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

@Controller
public class TutorController {
	
	@Autowired
	private TutorRepository tutorRepository;
	
	@GetMapping("/cadastrarTutor")
    public String greetingForm(Model model) {
        model.addAttribute("tutor", new Tutor());
        return "cadastrarTutor";
    }

    @PostMapping("/cadastrarTutor")
    public String greetingSubmit(@ModelAttribute Tutor tutor) {
    	tutorRepository.save(tutor);
        return "redirect:/cadastrarTutor";
    }
    
    @GetMapping(path="/todosTutores")
	public @ResponseBody Iterable<Tutor> getAllTutores() {
		// This returns a JSON or XML with the users
		return tutorRepository.findAll();
	}

}
