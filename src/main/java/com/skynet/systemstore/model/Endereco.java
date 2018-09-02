package com.skynet.systemstore.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.skynet.systemstore.util.model.BaseEntity;

@Entity
@Table(name = "enderecos")
@AttributeOverride(name = "id", column = @Column(name = "end_enderecos_id",  
nullable = false, columnDefinition = "BIGINT UNSIGNED"))  
public class Endereco extends BaseEntity {

}
