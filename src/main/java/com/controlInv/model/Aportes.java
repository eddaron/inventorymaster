package com.controlInv.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;

@Entity
public class Aportes {
    private int aportesId;
    private Integer socioId;
    private Date fechaAp;
    private BigDecimal monto;
    private Boolean estado;
    private Date fichaFin;
    private Socio socioBySocioId;
    private Collection<TipoAporte> tipoAportesByAportesId;
    private Collection<TipoPago> tipoPagosByAportesId;

    @Id
    @Column(name = "aportes_id")
    public int getAportesId() {
        return aportesId;
    }

    public void setAportesId(int aportesId) {
        this.aportesId = aportesId;
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
    @Column(name = "fecha_ap")
    public Date getFechaAp() {
        return fechaAp;
    }

    public void setFechaAp(Date fechaAp) {
        this.fechaAp = fechaAp;
    }

    @Basic
    @Column(name = "monto")
    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    @Basic
    @Column(name = "estado")
    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "ficha_fin")
    public Date getFichaFin() {
        return fichaFin;
    }

    public void setFichaFin(Date fichaFin) {
        this.fichaFin = fichaFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aportes aportes = (Aportes) o;

        if (aportesId != aportes.aportesId) return false;
        if (socioId != null ? !socioId.equals(aportes.socioId) : aportes.socioId != null) return false;
        if (fechaAp != null ? !fechaAp.equals(aportes.fechaAp) : aportes.fechaAp != null) return false;
        if (monto != null ? !monto.equals(aportes.monto) : aportes.monto != null) return false;
        if (estado != null ? !estado.equals(aportes.estado) : aportes.estado != null) return false;
        if (fichaFin != null ? !fichaFin.equals(aportes.fichaFin) : aportes.fichaFin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aportesId;
        result = 31 * result + (socioId != null ? socioId.hashCode() : 0);
        result = 31 * result + (fechaAp != null ? fechaAp.hashCode() : 0);
        result = 31 * result + (monto != null ? monto.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (fichaFin != null ? fichaFin.hashCode() : 0);
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

    @OneToMany(mappedBy = "aportesByAportesId")
    public Collection<TipoAporte> getTipoAportesByAportesId() {
        return tipoAportesByAportesId;
    }

    public void setTipoAportesByAportesId(Collection<TipoAporte> tipoAportesByAportesId) {
        this.tipoAportesByAportesId = tipoAportesByAportesId;
    }

    @OneToMany(mappedBy = "aportesByAportesId")
    public Collection<TipoPago> getTipoPagosByAportesId() {
        return tipoPagosByAportesId;
    }

    public void setTipoPagosByAportesId(Collection<TipoPago> tipoPagosByAportesId) {
        this.tipoPagosByAportesId = tipoPagosByAportesId;
    }
}
