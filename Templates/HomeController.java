package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/signin")
	public String signin() {
		return "signin";
	}
	
	@PostMapping("/process_login")
	public String process_login(HttpServletRequest request, Model model) {
		String usuario = request.getParameter( "usuario" );
		String senha   = request.getParameter( "senha" );
		System.out.println("Usuario: " + usuario);
		System.out.println("Senha..: " + senha);
		if ( senha.equals("12345678") ) {
			model.addAttribute( "nome", usuario);
			model.addAttribute( "descricao", "Programar");
			return "dashboard";	
		}
		else {
			model.addAttribute( "mensagem", "Senha Invalida");
			return "erro";
		}
	}
	
	@GetMapping("/dashboard")
	public String dashboard(HttpServletRequest request, Model model) {
		return "dashboard";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
	
	@GetMapping("/quemsou")
	public String quemsou() {

		return "quemsou";

	}
	
	@GetMapping("/cadastro_livro")
	public String cadastroLivro() {
		return "cadastro_livro";
	}

	@GetMapping("/cadastrado")
	public String cadastrado() {

		return "cadastrado";

	}
	
}
