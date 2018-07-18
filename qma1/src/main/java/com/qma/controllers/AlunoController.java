package com.qma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.qma.models.Aluno;
import com.qma.repository.AlunoRepository;
import com.qma.services.AlunoServiceImpl;

@Controller
//@RestController
public class AlunoController {
	
	@Autowired
	private AlunoServiceImpl as;
	
	@GetMapping("/aluno")
    public String greetingForm(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "cadastrarAluno";
    }
	
	//Create - POST
	@PostMapping("/aluno")
    public String cadastrarAluno(@ModelAttribute Aluno aluno) {
    	as.cadastraAluno(aluno);
        return "redirect:/aluno";
    }
	
	//Read - GET ALL
	@GetMapping(path="/alunos")
	public @ResponseBody Iterable<Aluno> getAllAlunos() {
		// This returns a JSON or XML with the users
		return as.findAllAluno();
	}
	
	//Read - GET MATRICULA
	/*
    //so funciona com RestController
	@RequestMapping("/getAlunoMatricula")
    public Aluno getAlunoMatricula(@RequestParam(value="matricula") String matricula) {
    	return alunoRepository.findByMatricula(matricula);
    }*/
	
	@GetMapping("aluno/{matricula}")
	public Aluno buscarAlunoMatricula(@PathVariable("matricula") String matricula){
		return as.findByMatricula(matricula);
	}
	
	/*@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping(path="/todosAlunos")
	public @ResponseBody Iterable<Aluno> getAllAlunos() {
		// This returns a JSON or XML with the users
		return alunoRepository.findAll();
	}
	
	@GetMapping("/cadastrarAluno")
    public String greetingForm(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "cadastrarAluno";
    }

    @PostMapping("/cadastrarAluno")
    public String greetingSubmit(@ModelAttribute Aluno aluno) {
    	alunoRepository.save(aluno);
        return "redirect:/cadastrarAluno";
    }
    
    @GetMapping("/alunos")
    public ModelAndView ListaAlunos() {
    	ModelAndView mv = new ModelAndView("alunos");
    	Iterable<Aluno> alunos = alunoRepository.findAll();
    	mv.addObject("alunos", alunos);
    	return mv;
    }
    
    
	/*@RequestMapping("/")
	public Aluno findA(@RequestParam(value="matricula") String matricula) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		Aluno aluno = alunoRepository.findByMatricula(matricula);
    	//mv.addObject(aluno);
    	return aluno;
	}
	
	@GetMapping(path="/{matricula}")
	public Aluno getAlunoMatricula(@PathVariable("matricula") String matricula) {
		// This returns a JSON or XML with the users
		return alunoRepository.findByMatricula(matricula);
	}*/
	
	/*
    //so funciona com RestController
	@RequestMapping("/getAlunoMatricula")
    public Aluno getAlunoMatricula(@RequestParam(value="matricula") String matricula) {
    	return alunoRepository.findByMatricula(matricula);
    }*/
	
	
    /*
    @GetMapping("/{matricula}")
    public String detalhesAluno(@PathVariable("matricula") String matricula) {
    	//ModelAndView mv = new ModelAndView("alunos");
    	Aluno aluno = alunoRepository.findByMatricula(matricula);
    	//mv.addObject(aluno);
    	return aluno.getMatricula();
    }*/

}
