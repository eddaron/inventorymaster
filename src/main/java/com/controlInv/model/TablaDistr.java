package com.controlInv.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tabla_distr", schema = "public", catalog = "inventario")
public class TablaDistr {
    private int tabdisId;
    private Integer listagrupoId;
    private Date cantidadPeso;
    private Date fechaRecojo;
    private ListaGrupo listaGrupoByListagrupoId;

    @Id
    @Column(name = "tabdis_id")
    public int getTabdisId() {
        return tabdisId;
    }

    public void setTabdisId(int tabdisId) {
        this.tabdisId = tabdisId;
    }

    @Basic
    @Column(name = "listagrupo_id")
    public Integer getListagrupoId() {
        return listagrupoId;
    }

    public void setListagrupoId(Integer listagrupoId) {
        this.listagrupoId = listagrupoId;
    }

    @Basic
    @Column(name = "cantidad_peso")
    public Date getCantidadPeso() {
        return cantidadPeso;
    }

    public void setCantidadPeso(Date cantidadPeso) {
        this.cantidadPeso = cantidadPeso;
    }

    @Basic
    @Column(name = "fecha_recojo")
    public Date getFechaRecojo() {
        return fechaRecojo;
    }

    public void setFechaRecojo(Date fechaRecojo) {
        this.fechaRecojo = fechaRecojo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TablaDistr that = (TablaDistr) o;

        if (tabdisId != that.tabdisId) return false;
        if (listagrupoId != null ? !listagrupoId.equals(that.listagrupoId) : that.listagrupoId != null) return false;
        if (cantidadPeso != null ? !cantidadPeso.equals(that.cantidadPeso) : that.cantidadPeso != null) return false;
        if (fechaRecojo != null ? !fechaRecojo.equals(that.fechaRecojo) : that.fechaRecojo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tabdisId;
        result = 31 * result + (listagrupoId != null ? listagrupoId.hashCode() : 0);
        result = 31 * result + (cantidadPeso != null ? cantidadPeso.hashCode() : 0);
        result = 31 * result + (fechaRecojo != null ? fechaRecojo.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "listagrupo_id", referencedColumnName = "listagrupo_id")
    public ListaGrupo getListaGrupoByListagrupoId() {
        return listaGrupoByListagrupoId;
    }

    public void setListaGrupoByListagrupoId(ListaGrupo listaGrupoByListagrupoId) {
        this.listaGrupoByListagrupoId = listaGrupoByListagrupoId;
    }
}
