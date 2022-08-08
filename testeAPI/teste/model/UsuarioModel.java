package br.ifba.teste.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class UsuarioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "idusuario")	
	private long idUsuario; 
	
	@Column(name = "login", nullable = false, unique = true)	
    private String login;
	
	@Column(name = "senha", nullable = false)	
    private String senha;
    
	public UsuarioModel() {
		
	}


	public UsuarioModel(long idUsuario, String login, String senha) {
		this.idUsuario = idUsuario;
		this.login = login;
		this.senha = senha;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	
	
    
    
    
    
    
}
