package com.controlInv.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@IdClass(GastosPK.class)
public class Gastos {
    private int moduloId;
    private int gastosId;
    private BigDecimal cantidadGastos;
    private Date fechaGastos;
    private String detalle;
    private Modulo moduloByModuloId;

    @Id
    @Column(name = "modulo_id")
    public int getModuloId() {
        return moduloId;
    }

    public void setModuloId(int moduloId) {
        this.moduloId = moduloId;
    }

    @Id
    @Column(name = "gastos_id")
    public int getGastosId() {
        return gastosId;
    }

    public void setGastosId(int gastosId) {
        this.gastosId = gastosId;
    }

    @Basic
    @Column(name = "cantidad_gastos")
    public BigDecimal getCantidadGastos() {
        return cantidadGastos;
    }

    public void setCantidadGastos(BigDecimal cantidadGastos) {
        this.cantidadGastos = cantidadGastos;
    }

    @Basic
    @Column(name = "fecha_gastos")
    public Date getFechaGastos() {
        return fechaGastos;
    }

    public void setFechaGastos(Date fechaGastos) {
        this.fechaGastos = fechaGastos;
    }

    @Basic
    @Column(name = "detalle")
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gastos gastos = (Gastos) o;

        if (moduloId != gastos.moduloId) return false;
        if (gastosId != gastos.gastosId) return false;
        if (cantidadGastos != null ? !cantidadGastos.equals(gastos.cantidadGastos) : gastos.cantidadGastos != null)
            return false;
        if (fechaGastos != null ? !fechaGastos.equals(gastos.fechaGastos) : gastos.fechaGastos != null) return false;
        if (detalle != null ? !detalle.equals(gastos.detalle) : gastos.detalle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moduloId;
        result = 31 * result + gastosId;
        result = 31 * result + (cantidadGastos != null ? cantidadGastos.hashCode() : 0);
        result = 31 * result + (fechaGastos != null ? fechaGastos.hashCode() : 0);
        result = 31 * result + (detalle != null ? detalle.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "modulo_id", referencedColumnName = "modulo_id", nullable = false)
    public Modulo getModuloByModuloId() {
        return moduloByModuloId;
    }

    public void setModuloByModuloId(Modulo moduloByModuloId) {
        this.moduloByModuloId = moduloByModuloId;
    }
}
