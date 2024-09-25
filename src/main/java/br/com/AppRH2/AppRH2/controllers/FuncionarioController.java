package br.com.AppRH2.AppRH2.controllers;

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
	
	

}
