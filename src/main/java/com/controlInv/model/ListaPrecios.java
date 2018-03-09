package com.controlInv.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "lista_precios", schema = "public", catalog = "inventario")
public class ListaPrecios {
    private int listaprecioId;
    private Integer moduloId;
    private BigDecimal preciobase;
    private BigDecimal precioExcedente;
    private Modulo moduloByModuloId;

    @Id
    @Column(name = "listaprecio_id")
    public int getListaprecioId() {
        return listaprecioId;
    }

    public void setListaprecioId(int listaprecioId) {
        this.listaprecioId = listaprecioId;
    }

    @Basic
    @Column(name = "modulo_id")
    public Integer getModuloId() {
        return moduloId;
    }

    public void setModuloId(Integer moduloId) {
        this.moduloId = moduloId;
    }

    @Basic
    @Column(name = "preciobase")
    public BigDecimal getPreciobase() {
        return preciobase;
    }

    public void setPreciobase(BigDecimal preciobase) {
        this.preciobase = preciobase;
    }

    @Basic
    @Column(name = "precio_excedente")
    public BigDecimal getPrecioExcedente() {
        return precioExcedente;
    }

    public void setPrecioExcedente(BigDecimal precioExcedente) {
        this.precioExcedente = precioExcedente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListaPrecios that = (ListaPrecios) o;

        if (listaprecioId != that.listaprecioId) return false;
        if (moduloId != null ? !moduloId.equals(that.moduloId) : that.moduloId != null) return false;
        if (preciobase != null ? !preciobase.equals(that.preciobase) : that.preciobase != null) return false;
        if (precioExcedente != null ? !precioExcedente.equals(that.precioExcedente) : that.precioExcedente != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = listaprecioId;
        result = 31 * result + (moduloId != null ? moduloId.hashCode() : 0);
        result = 31 * result + (preciobase != null ? preciobase.hashCode() : 0);
        result = 31 * result + (precioExcedente != null ? precioExcedente.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "modulo_id", referencedColumnName = "modulo_id")
    public Modulo getModuloByModuloId() {
        return moduloByModuloId;
    }

    public void setModuloByModuloId(Modulo moduloByModuloId) {
        this.moduloByModuloId = moduloByModuloId;
    }
}
