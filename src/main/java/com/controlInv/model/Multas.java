package com.controlInv.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class Multas {
    private int multasId;
    private Integer socioId;
    private BigDecimal monto;
    private String detalle;
    private Boolean estado;
    private Date fechaMulta;
    private Socio socioBySocioId;

    @Id
    @Column(name = "multas_id")
    public int getMultasId() {
        return multasId;
    }

    public void setMultasId(int multasId) {
        this.multasId = multasId;
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
    @Column(name = "monto")
    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    @Basic
    @Column(name = "detalle")
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
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
    @Column(name = "fecha_multa")
    public Date getFechaMulta() {
        return fechaMulta;
    }

    public void setFechaMulta(Date fechaMulta) {
        this.fechaMulta = fechaMulta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Multas multas = (Multas) o;

        if (multasId != multas.multasId) return false;
        if (socioId != null ? !socioId.equals(multas.socioId) : multas.socioId != null) return false;
        if (monto != null ? !monto.equals(multas.monto) : multas.monto != null) return false;
        if (detalle != null ? !detalle.equals(multas.detalle) : multas.detalle != null) return false;
        if (estado != null ? !estado.equals(multas.estado) : multas.estado != null) return false;
        if (fechaMulta != null ? !fechaMulta.equals(multas.fechaMulta) : multas.fechaMulta != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = multasId;
        result = 31 * result + (socioId != null ? socioId.hashCode() : 0);
        result = 31 * result + (monto != null ? monto.hashCode() : 0);
        result = 31 * result + (detalle != null ? detalle.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (fechaMulta != null ? fechaMulta.hashCode() : 0);
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
}
