package com.gokiesoft.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "documento")
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "documento_serie", nullable = false)
    private String documentoSerie;
    @Column(name = "documento_correlativo", nullable = false)
    private String documentoCorrelativo;
    @Column(name = "documento_estado", nullable = false)
    private Integer documentoEstado;
    @ManyToOne
    @JoinColumn(name = "id_tipodocumento", nullable = false)
    private TipoDocumento tipoDocumento;
    @ManyToOne
    @JoinColumn(name = "sede_id", nullable = false)
    private Sede sede;

    public Documento() {}
    
    public Documento(String documentoSerie, String documentoCorrelativo, Integer documentoEstado,
            TipoDocumento tipoDocumento, Sede sede) {
        this.documentoSerie = documentoSerie;
        this.documentoCorrelativo = documentoCorrelativo;
        this.documentoEstado = documentoEstado;
        this.tipoDocumento = tipoDocumento;
        this.sede = sede;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentoSerie() {
        return documentoSerie;
    }

    public void setDocumentoSerie(String documentoSerie) {
        this.documentoSerie = documentoSerie;
    }

    public String getDocumentoCorrelativo() {
        return documentoCorrelativo;
    }

    public void setDocumentoCorrelativo(String documentoCorrelativo) {
        this.documentoCorrelativo = documentoCorrelativo;
    }

    public Integer getDocumentoEstado() {
        return documentoEstado;
    }

    public void setDocumentoEstado(Integer documentoEstado) {
        this.documentoEstado = documentoEstado;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Documento [documentoCorrelativo=" + documentoCorrelativo + ", documentoEstado=" + documentoEstado
                + ", documentoSerie=" + documentoSerie + ", id=" + id + ", sede=" + sede + ", tipoDocumento="
                + tipoDocumento + "]";
    }
}