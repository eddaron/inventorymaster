package com.controlInv.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "control_mp", schema = "public", catalog = "inventario")
public class ControlMp {
    private int controlmpId;
    private Integer materiaprimaId;
    private Boolean pruebaAcides;
    private BigDecimal pruebaDensidad;
    private Boolean higiene;
    private MateriaPrima materiaPrimaByMateriaprimaId;

    @Id
    @Column(name = "controlmp_id")
    public int getControlmpId() {
        return controlmpId;
    }

    public void setControlmpId(int controlmpId) {
        this.controlmpId = controlmpId;
    }

    @Basic
    @Column(name = "materiaprima_id")
    public Integer getMateriaprimaId() {
        return materiaprimaId;
    }

    public void setMateriaprimaId(Integer materiaprimaId) {
        this.materiaprimaId = materiaprimaId;
    }

    @Basic
    @Column(name = "prueba_acides")
    public Boolean getPruebaAcides() {
        return pruebaAcides;
    }

    public void setPruebaAcides(Boolean pruebaAcides) {
        this.pruebaAcides = pruebaAcides;
    }

    @Basic
    @Column(name = "prueba_densidad")
    public BigDecimal getPruebaDensidad() {
        return pruebaDensidad;
    }

    public void setPruebaDensidad(BigDecimal pruebaDensidad) {
        this.pruebaDensidad = pruebaDensidad;
    }

    @Basic
    @Column(name = "higiene")
    public Boolean getHigiene() {
        return higiene;
    }

    public void setHigiene(Boolean higiene) {
        this.higiene = higiene;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ControlMp controlMp = (ControlMp) o;

        if (controlmpId != controlMp.controlmpId) return false;
        if (materiaprimaId != null ? !materiaprimaId.equals(controlMp.materiaprimaId) : controlMp.materiaprimaId != null)
            return false;
        if (pruebaAcides != null ? !pruebaAcides.equals(controlMp.pruebaAcides) : controlMp.pruebaAcides != null)
            return false;
        if (pruebaDensidad != null ? !pruebaDensidad.equals(controlMp.pruebaDensidad) : controlMp.pruebaDensidad != null)
            return false;
        if (higiene != null ? !higiene.equals(controlMp.higiene) : controlMp.higiene != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = controlmpId;
        result = 31 * result + (materiaprimaId != null ? materiaprimaId.hashCode() : 0);
        result = 31 * result + (pruebaAcides != null ? pruebaAcides.hashCode() : 0);
        result = 31 * result + (pruebaDensidad != null ? pruebaDensidad.hashCode() : 0);
        result = 31 * result + (higiene != null ? higiene.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "materiaprima_id", referencedColumnName = "materiaprima_id")
    public MateriaPrima getMateriaPrimaByMateriaprimaId() {
        return materiaPrimaByMateriaprimaId;
    }

    public void setMateriaPrimaByMateriaprimaId(MateriaPrima materiaPrimaByMateriaprimaId) {
        this.materiaPrimaByMateriaprimaId = materiaPrimaByMateriaprimaId;
    }
}
