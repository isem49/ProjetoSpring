package br.ifba.teste.api.dto;

import java.util.ArrayList;
import java.util.List;
import br.ifba.teste.api.model.UsuarioModel;

public class UsuarioDTO {

	private long id_usuario;
	private String login;
	private String senha;
	
	public static UsuarioDTO converter(UsuarioModel usuarioModel) {
		var usuario = new UsuarioDTO();
		usuario.setId_usuario( usuarioModel.getId_usuario() );
		usuario.setLogin( usuarioModel.getLogin() );
		usuario.setSenha( usuarioModel.getSenha() );
		return usuario;
	}
	
	public static List<UsuarioDTO> converter(List<UsuarioModel> usuarios) {
		List<UsuarioDTO> list=new ArrayList<UsuarioDTO>();
		for (UsuarioModel model : usuarios) {
			list.add( UsuarioDTO.converter(model)) ;
		}
		return list;
		// return clientes.stream().map( Cliente :: converter).collect(Collectors.toList());
	}
	
	
	public UsuarioDTO() {
		super();
	}
	
	
	
	public UsuarioDTO(long id_usuario, String login, String senha) {
		super();
		this.id_usuario = id_usuario;
		this.login = login;
		this.senha = senha;
	}
	
	public long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
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
