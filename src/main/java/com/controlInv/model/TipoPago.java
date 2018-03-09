package com.controlInv.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tipo_pago", schema = "public", catalog = "inventario")
public class TipoPago {
    private int tipopagoId;
    private int aportesId;
    private Integer numeroCuotas;
    private BigDecimal cuotaActual;
    private BigDecimal cuotaPagar;
    private BigDecimal saldo;
    private Aportes aportesByAportesId;

    @Id
    @Column(name = "tipopago_id")
    public int getTipopagoId() {
        return tipopagoId;
    }

    public void setTipopagoId(int tipopagoId) {
        this.tipopagoId = tipopagoId;
    }

    @Basic
    @Column(name = "aportes_id")
    public int getAportesId() {
        return aportesId;
    }

    public void setAportesId(int aportesId) {
        this.aportesId = aportesId;
    }

    @Basic
    @Column(name = "numero_cuotas")
    public Integer getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(Integer numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
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
    @Column(name = "cuota_pagar")
    public BigDecimal getCuotaPagar() {
        return cuotaPagar;
    }

    public void setCuotaPagar(BigDecimal cuotaPagar) {
        this.cuotaPagar = cuotaPagar;
    }

    @Basic
    @Column(name = "saldo")
    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoPago tipoPago = (TipoPago) o;

        if (tipopagoId != tipoPago.tipopagoId) return false;
        if (aportesId != tipoPago.aportesId) return false;
        if (numeroCuotas != null ? !numeroCuotas.equals(tipoPago.numeroCuotas) : tipoPago.numeroCuotas != null)
            return false;
        if (cuotaActual != null ? !cuotaActual.equals(tipoPago.cuotaActual) : tipoPago.cuotaActual != null)
            return false;
        if (cuotaPagar != null ? !cuotaPagar.equals(tipoPago.cuotaPagar) : tipoPago.cuotaPagar != null) return false;
        if (saldo != null ? !saldo.equals(tipoPago.saldo) : tipoPago.saldo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tipopagoId;
        result = 31 * result + aportesId;
        result = 31 * result + (numeroCuotas != null ? numeroCuotas.hashCode() : 0);
        result = 31 * result + (cuotaActual != null ? cuotaActual.hashCode() : 0);
        result = 31 * result + (cuotaPagar != null ? cuotaPagar.hashCode() : 0);
        result = 31 * result + (saldo != null ? saldo.hashCode() : 0);
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
