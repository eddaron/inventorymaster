package com.controlInv.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@IdClass(RecepcionistasPK.class)
public class Recepcionistas {
    private int socioId;
    private int registrorecId;
    private Date fechaIni;
    private Date fechaFin;
    private Boolean ejecutado;
    private Socio socioBySocioId;

    @Id
    @Column(name = "socio_id")
    public int getSocioId() {
        return socioId;
    }

    public void setSocioId(int socioId) {
        this.socioId = socioId;
    }

    @Id
    @Column(name = "registrorec_id")
    public int getRegistrorecId() {
        return registrorecId;
    }

    public void setRegistrorecId(int registrorecId) {
        this.registrorecId = registrorecId;
    }

    @Basic
    @Column(name = "fecha_ini")
    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    @Basic
    @Column(name = "fecha_fin")
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Basic
    @Column(name = "ejecutado")
    public Boolean getEjecutado() {
        return ejecutado;
    }

    public void setEjecutado(Boolean ejecutado) {
        this.ejecutado = ejecutado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Recepcionistas that = (Recepcionistas) o;

        if (socioId != that.socioId) return false;
        if (registrorecId != that.registrorecId) return false;
        if (fechaIni != null ? !fechaIni.equals(that.fechaIni) : that.fechaIni != null) return false;
        if (fechaFin != null ? !fechaFin.equals(that.fechaFin) : that.fechaFin != null) return false;
        if (ejecutado != null ? !ejecutado.equals(that.ejecutado) : that.ejecutado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = socioId;
        result = 31 * result + registrorecId;
        result = 31 * result + (fechaIni != null ? fechaIni.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        result = 31 * result + (ejecutado != null ? ejecutado.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "socio_id", referencedColumnName = "socio_id", nullable = false)
    public Socio getSocioBySocioId() {
        return socioBySocioId;
    }

    public void setSocioBySocioId(Socio socioBySocioId) {
        this.socioBySocioId = socioBySocioId;
    }
}
