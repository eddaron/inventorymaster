package com.controlInv.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tipo_venta", schema = "public", catalog = "inventario")
@IdClass(TipoVentaPK.class)
public class TipoVenta {
    private int ventasId;
    private int tipoventaId;
    private Boolean efectivo;
    private Integer nroCuotas;
    private BigDecimal cuotaActual;
    private BigDecimal cuotaRes;
    private BigDecimal saldoPagar;
    private Ventas ventasByVentasId;

    @Id
    @Column(name = "ventas_id")
    public int getVentasId() {
        return ventasId;
    }

    public void setVentasId(int ventasId) {
        this.ventasId = ventasId;
    }

    @Id
    @Column(name = "tipoventa_id")
    public int getTipoventaId() {
        return tipoventaId;
    }

    public void setTipoventaId(int tipoventaId) {
        this.tipoventaId = tipoventaId;
    }

    @Basic
    @Column(name = "efectivo")
    public Boolean getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(Boolean efectivo) {
        this.efectivo = efectivo;
    }

    @Basic
    @Column(name = "nro_cuotas")
    public Integer getNroCuotas() {
        return nroCuotas;
    }

    public void setNroCuotas(Integer nroCuotas) {
        this.nroCuotas = nroCuotas;
    }

    @Basic
    @Column(name = "cuota_actual")
    public BigDecimal getCuotaActual() {
        return cuotaActual;
    }

    public void setCuotaActual(BigDecimal cuotaActual) {
        this.cuotaActual = cuotaActual;
    }

    @Basic
    @Column(name = "cuota_res")
    public BigDecimal getCuotaRes() {
        return cuotaRes;
    }

    public void setCuotaRes(BigDecimal cuotaRes) {
        this.cuotaRes = cuotaRes;
    }

    @Basic
    @Column(name = "saldo_pagar")
    public BigDecimal getSaldoPagar() {
        return saldoPagar;
    }

    public void setSaldoPagar(BigDecimal saldoPagar) {
        this.saldoPagar = saldoPagar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoVenta tipoVenta = (TipoVenta) o;

        if (ventasId != tipoVenta.ventasId) return false;
        if (tipoventaId != tipoVenta.tipoventaId) return false;
        if (efectivo != null ? !efectivo.equals(tipoVenta.efectivo) : tipoVenta.efectivo != null) return false;
        if (nroCuotas != null ? !nroCuotas.equals(tipoVenta.nroCuotas) : tipoVenta.nroCuotas != null) return false;
        if (cuotaActual != null ? !cuotaActual.equals(tipoVenta.cuotaActual) : tipoVenta.cuotaActual != null)
            return false;
        if (cuotaRes != null ? !cuotaRes.equals(tipoVenta.cuotaRes) : tipoVenta.cuotaRes != null) return false;
        if (saldoPagar != null ? !saldoPagar.equals(tipoVenta.saldoPagar) : tipoVenta.saldoPagar != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ventasId;
        result = 31 * result + tipoventaId;
        result = 31 * result + (efectivo != null ? efectivo.hashCode() : 0);
        result = 31 * result + (nroCuotas != null ? nroCuotas.hashCode() : 0);
        result = 31 * result + (cuotaActual != null ? cuotaActual.hashCode() : 0);
        result = 31 * result + (cuotaRes != null ? cuotaRes.hashCode() : 0);
        result = 31 * result + (saldoPagar != null ? saldoPagar.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ventas_id", referencedColumnName = "ventas_id", nullable = false)
    public Ventas getVentasByVentasId() {
        return ventasByVentasId;
    }

    public void setVentasByVentasId(Ventas ventasByVentasId) {
        this.ventasByVentasId = ventasByVentasId;
    }
}
