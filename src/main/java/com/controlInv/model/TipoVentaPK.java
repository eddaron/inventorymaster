package com.controlInv.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TipoVentaPK implements Serializable {
    private int ventasId;
    private int tipoventaId;

    @Column(name = "ventas_id")
    @Id
    public int getVentasId() {
        return ventasId;
    }

    public void setVentasId(int ventasId) {
        this.ventasId = ventasId;
    }

    @Column(name = "tipoventa_id")
    @Id
    public int getTipoventaId() {
        return tipoventaId;
    }

    public void setTipoventaId(int tipoventaId) {
        this.tipoventaId = tipoventaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoVentaPK that = (TipoVentaPK) o;

        if (ventasId != that.ventasId) return false;
        if (tipoventaId != that.tipoventaId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ventasId;
        result = 31 * result + tipoventaId;
        return result;
    }
}
