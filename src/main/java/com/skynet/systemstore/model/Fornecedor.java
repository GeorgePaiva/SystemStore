package com.skynet.systemstore.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.skynet.systemstore.util.model.BaseEntity;

@Entity
@Table(name ="fornecedores")
@AttributeOverride(name = "id", column = @Column(name = "for_fornecedores_id",  
nullable = false, columnDefinition = "BIGINT UNSIGNED"))  
public class Fornecedor extends BaseEntity{

}
