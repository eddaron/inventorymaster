package com.controlInv.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;

@Entity
public class Grupo {
    private int grupoId;
    private Integer prodextraId;
    private BigDecimal cantLitros;
    private Date fechaEntrega;
    private String nombreGrupo;
    private BigDecimal pesoTotal;
    private Integer cantSocios;
    private ProdExtra prodExtraByProdextraId;
    private Collection<ListaGrupo> listaGruposByGrupoId;

    @Id
    @Column(name = "grupo_id")
    public int getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(int grupoId) {
        this.grupoId = grupoId;
    }

    @Basic
    @Column(name = "prodextra_id")
    public Integer getProdextraId() {
        return prodextraId;
    }

    public void setProdextraId(Integer prodextraId) {
        this.prodextraId = prodextraId;
    }

    @Basic
    @Column(name = "cant_litros")
    public BigDecimal getCantLitros() {
        return cantLitros;
    }

    public void setCantLitros(BigDecimal cantLitros) {
        this.cantLitros = cantLitros;
    }

    @Basic
    @Column(name = "fecha_entrega")
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Basic
    @Column(name = "nombre_grupo")
    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    @Basic
    @Column(name = "peso_total")
    public BigDecimal getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(BigDecimal pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    @Basic
    @Column(name = "cant_socios")
    public Integer getCantSocios() {
        return cantSocios;
    }

    public void setCantSocios(Integer cantSocios) {
        this.cantSocios = cantSocios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grupo grupo = (Grupo) o;

        if (grupoId != grupo.grupoId) return false;
        if (prodextraId != null ? !prodextraId.equals(grupo.prodextraId) : grupo.prodextraId != null) return false;
        if (cantLitros != null ? !cantLitros.equals(grupo.cantLitros) : grupo.cantLitros != null) return false;
        if (fechaEntrega != null ? !fechaEntrega.equals(grupo.fechaEntrega) : grupo.fechaEntrega != null) return false;
        if (nombreGrupo != null ? !nombreGrupo.equals(grupo.nombreGrupo) : grupo.nombreGrupo != null) return false;
        if (pesoTotal != null ? !pesoTotal.equals(grupo.pesoTotal) : grupo.pesoTotal != null) return false;
        if (cantSocios != null ? !cantSocios.equals(grupo.cantSocios) : grupo.cantSocios != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = grupoId;
        result = 31 * result + (prodextraId != null ? prodextraId.hashCode() : 0);
        result = 31 * result + (cantLitros != null ? cantLitros.hashCode() : 0);
        result = 31 * result + (fechaEntrega != null ? fechaEntrega.hashCode() : 0);
        result = 31 * result + (nombreGrupo != null ? nombreGrupo.hashCode() : 0);
        result = 31 * result + (pesoTotal != null ? pesoTotal.hashCode() : 0);
        result = 31 * result + (cantSocios != null ? cantSocios.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "prodextra_id", referencedColumnName = "prodextra_id")
    public ProdExtra getProdExtraByProdextraId() {
        return prodExtraByProdextraId;
    }

    public void setProdExtraByProdextraId(ProdExtra prodExtraByProdextraId) {
        this.prodExtraByProdextraId = prodExtraByProdextraId;
    }

    @OneToMany(mappedBy = "grupoByGrupoId")
    public Collection<ListaGrupo> getListaGruposByGrupoId() {
        return listaGruposByGrupoId;
    }

    public void setListaGruposByGrupoId(Collection<ListaGrupo> listaGruposByGrupoId) {
        this.listaGruposByGrupoId = listaGruposByGrupoId;
    }
}
