package br.ifba.teste.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ifba.teste.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	// Atributo de classe com o tipo UsuarioRepository
	
	@GetMapping
	public String ping() {
		
		return "Testando rota de usuario";
		
		
	}
	
	
	
	
	
}
