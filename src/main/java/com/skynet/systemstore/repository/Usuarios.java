package com.skynet.systemstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skynet.systemstore.model.Usuario;

public interface Usuarios extends JpaRepository<Usuario, Long> {

	public Usuario findByUsername(String username);

}
