package com.controlInv.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "lista_grupo", schema = "public", catalog = "inventario")
public class ListaGrupo {
    private int listagrupoId;
    private Integer socioId;
    private Integer grupoId;
    private Socio socioBySocioId;
    private Grupo grupoByGrupoId;
    private Collection<TablaDistr> tablaDistrsByListagrupoId;

    @Id
    @Column(name = "listagrupo_id")
    public int getListagrupoId() {
        return listagrupoId;
    }

    public void setListagrupoId(int listagrupoId) {
        this.listagrupoId = listagrupoId;
    }

    @Basic
    @Column(name = "socio_id")
    public Integer getSocioId() {
        return socioId;
    }

    public void setSocioId(Integer socioId) {
        this.socioId = socioId;
    }

    @Basic
    @Column(name = "grupo_id")
    public Integer getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(Integer grupoId) {
        this.grupoId = grupoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListaGrupo that = (ListaGrupo) o;

        if (listagrupoId != that.listagrupoId) return false;
        if (socioId != null ? !socioId.equals(that.socioId) : that.socioId != null) return false;
        if (grupoId != null ? !grupoId.equals(that.grupoId) : that.grupoId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = listagrupoId;
        result = 31 * result + (socioId != null ? socioId.hashCode() : 0);
        result = 31 * result + (grupoId != null ? grupoId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "socio_id", referencedColumnName = "socio_id")
    public Socio getSocioBySocioId() {
        return socioBySocioId;
    }

    public void setSocioBySocioId(Socio socioBySocioId) {
        this.socioBySocioId = socioBySocioId;
    }

    @ManyToOne
    @JoinColumn(name = "grupo_id", referencedColumnName = "grupo_id")
    public Grupo getGrupoByGrupoId() {
        return grupoByGrupoId;
    }

    public void setGrupoByGrupoId(Grupo grupoByGrupoId) {
        this.grupoByGrupoId = grupoByGrupoId;
    }

    @OneToMany(mappedBy = "listaGrupoByListagrupoId")
    public Collection<TablaDistr> getTablaDistrsByListagrupoId() {
        return tablaDistrsByListagrupoId;
    }

    public void setTablaDistrsByListagrupoId(Collection<TablaDistr> tablaDistrsByListagrupoId) {
        this.tablaDistrsByListagrupoId = tablaDistrsByListagrupoId;
    }
}
