package com.skynet.systemstore.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.skynet.systemstore.util.model.BaseEntity;

@Entity
@Table(name = "autorizacao")
@AttributeOverride(name = "id", column = @Column(name = "aut_autorizacao_id", nullable = false, columnDefinition = "BIGINT UNSIGNED"))
public class Autorizacao extends BaseEntity {

	@Column(name = "aut_descricao")
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
