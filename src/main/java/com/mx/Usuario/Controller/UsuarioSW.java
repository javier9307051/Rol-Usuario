package com.mx.Usuario.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Usuario.Dominio.Usuario;
import com.mx.Usuario.Service.UsuarioServiceImp;

@RestController
@RequestMapping(path="/Usuario")
@CrossOrigin("*")
public class UsuarioSW {
	
	@Autowired
	private UsuarioServiceImp servicio;
	
	@GetMapping("listar")
	public ResponseEntity<?> listar() {
		List<Usuario> listaU=servicio.listar();
		if(listaU.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(listaU);
	}
	

}
