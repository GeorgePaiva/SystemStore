package com.skynet.systemstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skynet.systemstore.model.Usuario;
import com.skynet.systemstore.repository.Usuarios;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private Usuarios usuarios;

	@Override
	public Usuario findByUsername(String username) {
		return this.usuarios.findByUsername(username);
	}

}
