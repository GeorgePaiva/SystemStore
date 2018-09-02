package com.skynet.systemstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skynet.systemstore.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
