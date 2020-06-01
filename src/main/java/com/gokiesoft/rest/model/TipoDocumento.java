package com.gokiesoft.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_documento")
public class TipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "documento_descripcion", nullable = false)
    private String documentoDescripcion;
    @Column(name = "codigo_sunat", nullable = false)
    private String codigoSunat;
    @Column(name = "estado", nullable = false)
    private Integer estado;
}