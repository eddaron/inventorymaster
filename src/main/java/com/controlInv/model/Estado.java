package com.controlInv.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Estado {
    private int estadoId;
    private int socioId;
    private Date fechaIni;
    private Date fechaFin;
    private Socio socioBySocioId;

    @Id
    @Column(name = "estado_id")
    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }

    @Basic
    @Column(name = "socio_id")
    public int getSocioId() {
        return socioId;
    }

    public void setSocioId(int socioId) {
        this.socioId = socioId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Estado estado = (Estado) o;

        if (estadoId != estado.estadoId) return false;
        if (socioId != estado.socioId) return false;
        if (fechaIni != null ? !fechaIni.equals(estado.fechaIni) : estado.fechaIni != null) return false;
        if (fechaFin != null ? !fechaFin.equals(estado.fechaFin) : estado.fechaFin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = estadoId;
        result = 31 * result + socioId;
        result = 31 * result + (fechaIni != null ? fechaIni.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
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
