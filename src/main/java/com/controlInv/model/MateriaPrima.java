package com.controlInv.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "materia_prima", schema = "public", catalog = "inventario")
public class MateriaPrima {
    private int materiaprimaId;
    private int socioId;
    private Integer cantidadDia;
    private Integer cantidadNoche;
    private Integer total;
    private Date fechaReg;
    private Collection<ControlMp> controlMpsByMateriaprimaId;
    private Socio socioBySocioId;

    @Id
    @Column(name = "materiaprima_id")
    public int getMateriaprimaId() {
        return materiaprimaId;
    }

    public void setMateriaprimaId(int materiaprimaId) {
        this.materiaprimaId = materiaprimaId;
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
    @Column(name = "cantidad_dia")
    public Integer getCantidadDia() {
        return cantidadDia;
    }

    public void setCantidadDia(Integer cantidadDia) {
        this.cantidadDia = cantidadDia;
    }

    @Basic
    @Column(name = "cantidad_noche")
    public Integer getCantidadNoche() {
        return cantidadNoche;
    }

    public void setCantidadNoche(Integer cantidadNoche) {
        this.cantidadNoche = cantidadNoche;
    }

    @Basic
    @Column(name = "total")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Basic
    @Column(name = "fecha_reg")
    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MateriaPrima that = (MateriaPrima) o;

        if (materiaprimaId != that.materiaprimaId) return false;
        if (socioId != that.socioId) return false;
        if (cantidadDia != null ? !cantidadDia.equals(that.cantidadDia) : that.cantidadDia != null) return false;
        if (cantidadNoche != null ? !cantidadNoche.equals(that.cantidadNoche) : that.cantidadNoche != null)
            return false;
        if (total != null ? !total.equals(that.total) : that.total != null) return false;
        if (fechaReg != null ? !fechaReg.equals(that.fechaReg) : that.fechaReg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materiaprimaId;
        result = 31 * result + socioId;
        result = 31 * result + (cantidadDia != null ? cantidadDia.hashCode() : 0);
        result = 31 * result + (cantidadNoche != null ? cantidadNoche.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        result = 31 * result + (fechaReg != null ? fechaReg.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "materiaPrimaByMateriaprimaId")
    public Collection<ControlMp> getControlMpsByMateriaprimaId() {
        return controlMpsByMateriaprimaId;
    }

    public void setControlMpsByMateriaprimaId(Collection<ControlMp> controlMpsByMateriaprimaId) {
        this.controlMpsByMateriaprimaId = controlMpsByMateriaprimaId;
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
