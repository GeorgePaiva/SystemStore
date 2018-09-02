package com.skynet.systemstore.service;

import com.skynet.systemstore.model.Usuario;

public interface UsuarioService {
	
	public Usuario findByUsername(String username);

}
