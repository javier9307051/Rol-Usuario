package com.mx.Usuario.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Usuario.Dao.UsuarioDao;
import com.mx.Usuario.Dominio.Usuario;

@Service
public class UsuarioServiceImp implements UsuarioService {

	@Autowired
	private UsuarioDao dao;

	@Override
	public Usuario guardar(Usuario usuario) {

		Usuario auxU = dao.save(usuario);

		return auxU;
	}

	@Override
	public Usuario editar(Usuario usuario) {
		Usuario auxU = dao.save(usuario);
		return auxU;
	}

	@Override
	public Usuario eliminar(Usuario usuario) {
		dao.delete(usuario);
		return usuario;
	}

	@Override
	public Usuario buscar(Usuario usuario) {

		return dao.findById(usuario.getIdUsuario()).orElse(null);
	}

	@Override
	public List<Usuario> listar() {
		return dao.findAll();
	}

}
