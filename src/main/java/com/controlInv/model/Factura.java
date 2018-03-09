package com.controlInv.model;

import javax.persistence.*;

@Entity
public class Factura {
    private int facturaId;
    private Integer ventasId;
    private Integer personaId;
    private Ventas ventasByVentasId;
    private Persona personaByPersonaId;

    @Id
    @Column(name = "factura_id")
    public int getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(int facturaId) {
        this.facturaId = facturaId;
    }

    @Basic
    @Column(name = "ventas_id")
    public Integer getVentasId() {
        return ventasId;
    }

    public void setVentasId(Integer ventasId) {
        this.ventasId = ventasId;
    }

    @Basic
    @Column(name = "persona_id")
    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Factura factura = (Factura) o;

        if (facturaId != factura.facturaId) return false;
        if (ventasId != null ? !ventasId.equals(factura.ventasId) : factura.ventasId != null) return false;
        if (personaId != null ? !personaId.equals(factura.personaId) : factura.personaId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = facturaId;
        result = 31 * result + (ventasId != null ? ventasId.hashCode() : 0);
        result = 31 * result + (personaId != null ? personaId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ventas_id", referencedColumnName = "ventas_id")
    public Ventas getVentasByVentasId() {
        return ventasByVentasId;
    }

    public void setVentasByVentasId(Ventas ventasByVentasId) {
        this.ventasByVentasId = ventasByVentasId;
    }

    @ManyToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "persona_id")
    public Persona getPersonaByPersonaId() {
        return personaByPersonaId;
    }

    public void setPersonaByPersonaId(Persona personaByPersonaId) {
        this.personaByPersonaId = personaByPersonaId;
    }
}
