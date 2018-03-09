package com.controlInv.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;

@Entity
@IdClass(ProductoPK.class)
public class Producto {
    private int moduloId;
    private int productoId;
    private String descripcionProd;
    private BigDecimal precioCompra;
    private BigDecimal precioVenta;
    private Integer cantidadActual;
    private Integer cantidadMinima;
    private Date fechaRegistro;
    private Date fechaVencimiento;
    private BigDecimal peso;
    private Collection<ProdExtra> prodExtras;
    private Modulo moduloByModuloId;
    private Collection<Ventas> ventas;

    @Id
    @Column(name = "modulo_id")
    public int getModuloId() {
        return moduloId;
    }

    public void setModuloId(int moduloId) {
        this.moduloId = moduloId;
    }

    @Id
    @Column(name = "producto_id")
    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    @Basic
    @Column(name = "descripcion_prod")
    public String getDescripcionProd() {
        return descripcionProd;
    }

    public void setDescripcionProd(String descripcionProd) {
        this.descripcionProd = descripcionProd;
    }

    @Basic
    @Column(name = "precio_compra")
    public BigDecimal getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(BigDecimal precioCompra) {
        this.precioCompra = precioCompra;
    }

    @Basic
    @Column(name = "precio_venta")
    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Basic
    @Column(name = "cantidad_actual")
    public Integer getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(Integer cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Basic
    @Column(name = "cantidad_minima")
    public Integer getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(Integer cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    @Basic
    @Column(name = "fecha_registro")
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Basic
    @Column(name = "fecha_vencimiento")
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Basic
    @Column(name = "peso")
    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producto producto = (Producto) o;

        if (moduloId != producto.moduloId) return false;
        if (productoId != producto.productoId) return false;
        if (descripcionProd != null ? !descripcionProd.equals(producto.descripcionProd) : producto.descripcionProd != null)
            return false;
        if (precioCompra != null ? !precioCompra.equals(producto.precioCompra) : producto.precioCompra != null)
            return false;
        if (precioVenta != null ? !precioVenta.equals(producto.precioVenta) : producto.precioVenta != null)
            return false;
        if (cantidadActual != null ? !cantidadActual.equals(producto.cantidadActual) : producto.cantidadActual != null)
            return false;
        if (cantidadMinima != null ? !cantidadMinima.equals(producto.cantidadMinima) : producto.cantidadMinima != null)
            return false;
        if (fechaRegistro != null ? !fechaRegistro.equals(producto.fechaRegistro) : producto.fechaRegistro != null)
            return false;
        if (fechaVencimiento != null ? !fechaVencimiento.equals(producto.fechaVencimiento) : producto.fechaVencimiento != null)
            return false;
        if (peso != null ? !peso.equals(producto.peso) : producto.peso != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moduloId;
        result = 31 * result + productoId;
        result = 31 * result + (descripcionProd != null ? descripcionProd.hashCode() : 0);
        result = 31 * result + (precioCompra != null ? precioCompra.hashCode() : 0);
        result = 31 * result + (precioVenta != null ? precioVenta.hashCode() : 0);
        result = 31 * result + (cantidadActual != null ? cantidadActual.hashCode() : 0);
        result = 31 * result + (cantidadMinima != null ? cantidadMinima.hashCode() : 0);
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        result = 31 * result + (fechaVencimiento != null ? fechaVencimiento.hashCode() : 0);
        result = 31 * result + (peso != null ? peso.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "producto")
    public Collection<ProdExtra> getProdExtras() {
        return prodExtras;
    }

    public void setProdExtras(Collection<ProdExtra> prodExtras) {
        this.prodExtras = prodExtras;
    }

    @ManyToOne
    @JoinColumn(name = "modulo_id", referencedColumnName = "modulo_id", nullable = false)
    public Modulo getModuloByModuloId() {
        return moduloByModuloId;
    }

    public void setModuloByModuloId(Modulo moduloByModuloId) {
        this.moduloByModuloId = moduloByModuloId;
    }

    @OneToMany(mappedBy = "producto")
    public Collection<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(Collection<Ventas> ventas) {
        this.ventas = ventas;
    }
}
