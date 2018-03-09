package com.controlInv.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TipoAportePK implements Serializable {
    private int aportesId;
    private int tipoaporteId;

    @Column(name = "aportes_id")
    @Id
    public int getAportesId() {
        return aportesId;
    }

    public void setAportesId(int aportesId) {
        this.aportesId = aportesId;
    }

    @Column(name = "tipoaporte_id")
    @Id
    public int getTipoaporteId() {
        return tipoaporteId;
    }

    public void setTipoaporteId(int tipoaporteId) {
        this.tipoaporteId = tipoaporteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoAportePK that = (TipoAportePK) o;

        if (aportesId != that.aportesId) return false;
        if (tipoaporteId != that.tipoaporteId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aportesId;
        result = 31 * result + tipoaporteId;
        return result;
    }
}
