package com.skynet.systemstore.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.skynet.systemstore.util.model.BaseEntity;

@Entity
@Table(name = "tamanhos")
@AttributeOverride(name = "id", column = @Column(name = "tam_tamanhos_id",  
nullable = false, columnDefinition = "BIGINT UNSIGNED"))  
public class Tamanho extends BaseEntity {

}
