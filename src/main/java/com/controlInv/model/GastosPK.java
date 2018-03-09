package com.controlInv.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class GastosPK implements Serializable {
    private int moduloId;
    private int gastosId;

    @Column(name = "modulo_id")
    @Id
    public int getModuloId() {
        return moduloId;
    }

    public void setModuloId(int moduloId) {
        this.moduloId = moduloId;
    }

    @Column(name = "gastos_id")
    @Id
    public int getGastosId() {
        return gastosId;
    }

    public void setGastosId(int gastosId) {
        this.gastosId = gastosId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GastosPK gastosPK = (GastosPK) o;

        if (moduloId != gastosPK.moduloId) return false;
        if (gastosId != gastosPK.gastosId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moduloId;
        result = 31 * result + gastosId;
        return result;
    }
}
