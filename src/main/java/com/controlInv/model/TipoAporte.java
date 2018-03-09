package com.controlInv.model;

import javax.persistence.*;

@Entity
@Table(name = "tipo_aporte", schema = "public", catalog = "inventario")
@IdClass(TipoAportePK.class)
public class TipoAporte {
    private int aportesId;
    private int tipoaporteId;
    private String tipoAporte;
    private Aportes aportesByAportesId;

    @Id
    @Column(name = "aportes_id")
    public int getAportesId() {
        return aportesId;
    }

    public void setAportesId(int aportesId) {
        this.aportesId = aportesId;
    }

    @Id
    @Column(name = "tipoaporte_id")
    public int getTipoaporteId() {
        return tipoaporteId;
    }

    public void setTipoaporteId(int tipoaporteId) {
        this.tipoaporteId = tipoaporteId;
    }

    @Basic
    @Column(name = "tipo_aporte")
    public String getTipoAporte() {
        return tipoAporte;
    }

    public void setTipoAporte(String tipoAporte) {
        this.tipoAporte = tipoAporte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoAporte that = (TipoAporte) o;

        if (aportesId != that.aportesId) return false;
        if (tipoaporteId != that.tipoaporteId) return false;
        if (tipoAporte != null ? !tipoAporte.equals(that.tipoAporte) : that.tipoAporte != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aportesId;
        result = 31 * result + tipoaporteId;
        result = 31 * result + (tipoAporte != null ? tipoAporte.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "aportes_id", referencedColumnName = "aportes_id", nullable = false)
    public Aportes getAportesByAportesId() {
        return aportesByAportesId;
    }

    public void setAportesByAportesId(Aportes aportesByAportesId) {
        this.aportesByAportesId = aportesByAportesId;
    }
}
