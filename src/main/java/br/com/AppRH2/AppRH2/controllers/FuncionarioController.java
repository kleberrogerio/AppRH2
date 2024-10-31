package br.com.AppRH2.AppRH2.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.AppRH2.AppRH2.models.Dependentes;
import br.com.AppRH2.AppRH2.models.Funcionario;
import br.com.AppRH2.AppRH2.repository.DependentesRepository;
import br.com.AppRH2.AppRH2.repository.FuncionarioRepository;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository fr;
	
	@Autowired
	private DependentesRepository dr;
	
	@RequestMapping(value="/cadastrarFuncionario", method=RequestMethod.GET)
	public String form() {
		return "funcionario/formFuncionario";
	}
	
	@RequestMapping(value="/cadastrarFuncionario", method=RequestMethod.POST)
	public String form(@Valid Funcionario funcionario, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()){
			attributes.addFlashAttribute("mensagem","Verifique os campos");
			return "redirect:/cadastrarFuncionario";
		}
		
		fr.save(funcionario);
		attributes.addFlashAttribute("mensagem","Funcionário cadastrado com sucesso!");
		return "redirect:/cadastrarFuncionario";
	}


}
