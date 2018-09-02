package com.skynet.systemstore.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.skynet.systemstore.util.model.BaseEntity;

@Entity
@Table(name = "tipos_produto")
@AttributeOverride(name = "id", column = @Column(name = "tpr_tipos_produto_id",  
nullable = false, columnDefinition = "BIGINT UNSIGNED"))  
public class TipoProduto extends BaseEntity {

}
