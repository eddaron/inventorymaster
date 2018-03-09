package com.controlInv.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ActividadesPK implements Serializable {
    private int moduloId;
    private int actividadId;

    @Column(name = "modulo_id")
    @Id
    public int getModuloId() {
        return moduloId;
    }

    public void setModuloId(int moduloId) {
        this.moduloId = moduloId;
    }

    @Column(name = "actividad_id")
    @Id
    public int getActividadId() {
        return actividadId;
    }

    public void setActividadId(int actividadId) {
        this.actividadId = actividadId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActividadesPK that = (ActividadesPK) o;

        if (moduloId != that.moduloId) return false;
        if (actividadId != that.actividadId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moduloId;
        result = 31 * result + actividadId;
        return result;
    }
}
