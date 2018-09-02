package com.skynet.systemstore.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.skynet.systemstore.util.model.BaseEntity;


@Entity
@Table(name = "cores")
@AttributeOverride(name = "id", column = @Column(name = "cor_cores_id",  
nullable = false, columnDefinition = "BIGINT UNSIGNED"))  
public class Cor extends BaseEntity {

}
