package com.skynet.systemstore.model;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.skynet.systemstore.util.model.BaseEntity;

@Entity
@Table(name = "usuarios")
@AttributeOverride(name = "id", column = @Column(name = "usu_usuarios_id", nullable = false, columnDefinition = "BIGINT UNSIGNED"))
public class Usuario extends BaseEntity {

	@Column(name = "usu_username")
	private String username;
	@Column(name = "usu_password")
	private String password;
	@Column(name = "usu_ativo")
	private Integer ativo;
	@ManyToMany
	@JoinTable(name = "usuarios_autorizacao", joinColumns = @JoinColumn(name = "uat_usu_usuarios_id"), inverseJoinColumns = @JoinColumn(name = "uat_aut_autorizacao_id"))
	private List<Autorizacao> autorizacoes;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public List<Autorizacao> getAutorizacoes() {
		return autorizacoes;
	}

	public void setAutorizacoes(List<Autorizacao> autorizacoes) {
		this.autorizacoes = autorizacoes;
	}

}
