package com.controlInv.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ProductoPK implements Serializable {
    private int moduloId;
    private int productoId;

    @Column(name = "modulo_id")
    @Id
    public int getModuloId() {
        return moduloId;
    }

    public void setModuloId(int moduloId) {
        this.moduloId = moduloId;
    }

    @Column(name = "producto_id")
    @Id
    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductoPK that = (ProductoPK) o;

        if (moduloId != that.moduloId) return false;
        if (productoId != that.productoId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moduloId;
        result = 31 * result + productoId;
        return result;
    }
}
