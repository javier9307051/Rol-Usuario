package com.mx.Usuario.Service;

import java.util.List;

import com.mx.Usuario.Dominio.Usuario;

public interface UsuarioService {
	public Usuario guardar(Usuario usuario);
	
	public Usuario editar(Usuario usuario);
	
	public Usuario eliminar(Usuario usuario);
	
	public Usuario buscar(Usuario usuario);
	
	public List<Usuario> listar();
}
