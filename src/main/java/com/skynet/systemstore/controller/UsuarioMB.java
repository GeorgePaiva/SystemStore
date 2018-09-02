package com.skynet.systemstore.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import com.skynet.systemstore.model.Usuario;
import com.skynet.systemstore.service.UsuarioService;

@Controller
@Scope("session")
public class UsuarioMB {

	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	@Autowired
	private UsuarioService usuarioService;

	@PostConstruct
	public void init() {

		this.usuario = new Usuario();

		SecurityContext context = SecurityContextHolder.getContext();

		if (context instanceof SecurityContext) {

			Authentication authentication = context.getAuthentication();

			if (authentication instanceof Authentication) {
				this.usuario = this.usuarioService.findByUsername(authentication.getName());
			}
		}
	}

	public Usuario findByUsername(String username) {
		return usuarioService.findByUsername(username);
	}

}
