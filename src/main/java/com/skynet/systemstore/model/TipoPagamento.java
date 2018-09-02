package com.skynet.systemstore.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.skynet.systemstore.util.model.BaseEntity;


@Entity
@Table(name = "tipos_pagamento")
@AttributeOverride(name = "id", column = @Column(name = "tpg_tipos_pagamento_id",  
nullable = false, columnDefinition = "BIGINT UNSIGNED"))  
public class TipoPagamento extends BaseEntity {

}
