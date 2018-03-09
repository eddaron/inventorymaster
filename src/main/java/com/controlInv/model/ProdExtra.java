package com.controlInv.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Entity
@Table(name = "prod_extra", schema = "public", catalog = "inventario")
public class ProdExtra {
    private int prodextraId;
    private Integer moduloId;
    private Integer productoId;
    private BigDecimal pesoTotal;
    private String nombreProveedor;
    private String placaVehiculo;
    private String fechaIngreso;
    private BigDecimal precioBase;
    private BigDecimal precioVenta;
    private Collection<Grupo> gruposByProdextraId;
    private Producto producto;

    @Id
    @Column(name = "prodextra_id")
    public int getProdextraId() {
        return prodextraId;
    }

    public void setProdextraId(int prodextraId) {
        this.prodextraId = prodextraId;
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
    @Column(name = "peso_total")
    public BigDecimal getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(BigDecimal pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    @Basic
    @Column(name = "nombre_proveedor")
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    @Basic
    @Column(name = "placa_vehiculo")
    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    @Basic
    @Column(name = "fecha_ingreso")
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Basic
    @Column(name = "precio_base")
    public BigDecimal getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(BigDecimal precioBase) {
        this.precioBase = precioBase;
    }

    @Basic
    @Column(name = "precio_venta")
    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProdExtra prodExtra = (ProdExtra) o;

        if (prodextraId != prodExtra.prodextraId) return false;
        if (moduloId != null ? !moduloId.equals(prodExtra.moduloId) : prodExtra.moduloId != null) return false;
        if (productoId != null ? !productoId.equals(prodExtra.productoId) : prodExtra.productoId != null) return false;
        if (pesoTotal != null ? !pesoTotal.equals(prodExtra.pesoTotal) : prodExtra.pesoTotal != null) return false;
        if (nombreProveedor != null ? !nombreProveedor.equals(prodExtra.nombreProveedor) : prodExtra.nombreProveedor != null)
            return false;
        if (placaVehiculo != null ? !placaVehiculo.equals(prodExtra.placaVehiculo) : prodExtra.placaVehiculo != null)
            return false;
        if (fechaIngreso != null ? !fechaIngreso.equals(prodExtra.fechaIngreso) : prodExtra.fechaIngreso != null)
            return false;
        if (precioBase != null ? !precioBase.equals(prodExtra.precioBase) : prodExtra.precioBase != null) return false;
        if (precioVenta != null ? !precioVenta.equals(prodExtra.precioVenta) : prodExtra.precioVenta != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prodextraId;
        result = 31 * result + (moduloId != null ? moduloId.hashCode() : 0);
        result = 31 * result + (productoId != null ? productoId.hashCode() : 0);
        result = 31 * result + (pesoTotal != null ? pesoTotal.hashCode() : 0);
        result = 31 * result + (nombreProveedor != null ? nombreProveedor.hashCode() : 0);
        result = 31 * result + (placaVehiculo != null ? placaVehiculo.hashCode() : 0);
        result = 31 * result + (fechaIngreso != null ? fechaIngreso.hashCode() : 0);
        result = 31 * result + (precioBase != null ? precioBase.hashCode() : 0);
        result = 31 * result + (precioVenta != null ? precioVenta.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "prodExtraByProdextraId")
    public Collection<Grupo> getGruposByProdextraId() {
        return gruposByProdextraId;
    }

    public void setGruposByProdextraId(Collection<Grupo> gruposByProdextraId) {
        this.gruposByProdextraId = gruposByProdextraId;
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
