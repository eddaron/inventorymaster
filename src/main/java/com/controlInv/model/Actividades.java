package com.controlInv.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@IdClass(ActividadesPK.class)
public class Actividades {
    private int moduloId;
    private int actividadId;
    private Date fechaIni;
    private Date fechaFin;
    private String descripcion;
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
    @Column(name = "actividad_id")
    public int getActividadId() {
        return actividadId;
    }

    public void setActividadId(int actividadId) {
        this.actividadId = actividadId;
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
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actividades that = (Actividades) o;

        if (moduloId != that.moduloId) return false;
        if (actividadId != that.actividadId) return false;
        if (fechaIni != null ? !fechaIni.equals(that.fechaIni) : that.fechaIni != null) return false;
        if (fechaFin != null ? !fechaFin.equals(that.fechaFin) : that.fechaFin != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moduloId;
        result = 31 * result + actividadId;
        result = 31 * result + (fechaIni != null ? fechaIni.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
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
