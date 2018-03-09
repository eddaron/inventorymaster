package com.controlInv.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
public class Ventas {
    private int ventasId;
    private Integer moduloId;
    private Integer productoId;
    private Date fechaVenta;
    private Integer cantidad;
    private Integer total;
    private Collection<Factura> facturasByVentasId;
    private Collection<TipoVenta> tipoVentasByVentasId;
    private Producto producto;

    @Id
    @Column(name = "ventas_id")
    public int getVentasId() {
        return ventasId;
    }

    public void setVentasId(int ventasId) {
        this.ventasId = ventasId;
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
    @Column(name = "producto_id")
    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    @Basic
    @Column(name = "fecha_venta")
    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Basic
    @Column(name = "cantidad")
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Basic
    @Column(name = "total")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ventas ventas = (Ventas) o;

        if (ventasId != ventas.ventasId) return false;
        if (moduloId != null ? !moduloId.equals(ventas.moduloId) : ventas.moduloId != null) return false;
        if (productoId != null ? !productoId.equals(ventas.productoId) : ventas.productoId != null) return false;
        if (fechaVenta != null ? !fechaVenta.equals(ventas.fechaVenta) : ventas.fechaVenta != null) return false;
        if (cantidad != null ? !cantidad.equals(ventas.cantidad) : ventas.cantidad != null) return false;
        if (total != null ? !total.equals(ventas.total) : ventas.total != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ventasId;
        result = 31 * result + (moduloId != null ? moduloId.hashCode() : 0);
        result = 31 * result + (productoId != null ? productoId.hashCode() : 0);
        result = 31 * result + (fechaVenta != null ? fechaVenta.hashCode() : 0);
        result = 31 * result + (cantidad != null ? cantidad.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "ventasByVentasId")
    public Collection<Factura> getFacturasByVentasId() {
        return facturasByVentasId;
    }

    public void setFacturasByVentasId(Collection<Factura> facturasByVentasId) {
        this.facturasByVentasId = facturasByVentasId;
    }

    @OneToMany(mappedBy = "ventasByVentasId")
    public Collection<TipoVenta> getTipoVentasByVentasId() {
        return tipoVentasByVentasId;
    }

    public void setTipoVentasByVentasId(Collection<TipoVenta> tipoVentasByVentasId) {
        this.tipoVentasByVentasId = tipoVentasByVentasId;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "modulo_id", referencedColumnName = "modulo_id"), @JoinColumn(name = "producto_id", referencedColumnName = "producto_id")})
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
