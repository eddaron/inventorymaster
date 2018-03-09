package com.controlInv.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Modulo {
    private int moduloId;
    private String nombreModulo;
    private String direccionModulo;
    private Integer telefonoModulo;
    private String codRegistroModulo;
    private Collection<Actividades> actividadesByModuloId;
    private Collection<Gastos> gastosByModuloId;
    private Collection<ListaPrecios> listaPreciosByModuloId;
    private Collection<Persona> personasByModuloId;
    private Collection<Producto> productosByModuloId;

    @Id
    @Column(name = "modulo_id")
    public int getModuloId() {
        return moduloId;
    }

    public void setModuloId(int moduloId) {
        this.moduloId = moduloId;
    }

    @Basic
    @Column(name = "nombre_modulo")
    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    @Basic
    @Column(name = "direccion_modulo")
    public String getDireccionModulo() {
        return direccionModulo;
    }

    public void setDireccionModulo(String direccionModulo) {
        this.direccionModulo = direccionModulo;
    }

    @Basic
    @Column(name = "telefono_modulo")
    public Integer getTelefonoModulo() {
        return telefonoModulo;
    }

    public void setTelefonoModulo(Integer telefonoModulo) {
        this.telefonoModulo = telefonoModulo;
    }

    @Basic
    @Column(name = "cod_registro_modulo")
    public String getCodRegistroModulo() {
        return codRegistroModulo;
    }

    public void setCodRegistroModulo(String codRegistroModulo) {
        this.codRegistroModulo = codRegistroModulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Modulo modulo = (Modulo) o;

        if (moduloId != modulo.moduloId) return false;
        if (nombreModulo != null ? !nombreModulo.equals(modulo.nombreModulo) : modulo.nombreModulo != null)
            return false;
        if (direccionModulo != null ? !direccionModulo.equals(modulo.direccionModulo) : modulo.direccionModulo != null)
            return false;
        if (telefonoModulo != null ? !telefonoModulo.equals(modulo.telefonoModulo) : modulo.telefonoModulo != null)
            return false;
        if (codRegistroModulo != null ? !codRegistroModulo.equals(modulo.codRegistroModulo) : modulo.codRegistroModulo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moduloId;
        result = 31 * result + (nombreModulo != null ? nombreModulo.hashCode() : 0);
        result = 31 * result + (direccionModulo != null ? direccionModulo.hashCode() : 0);
        result = 31 * result + (telefonoModulo != null ? telefonoModulo.hashCode() : 0);
        result = 31 * result + (codRegistroModulo != null ? codRegistroModulo.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "moduloByModuloId")
    public Collection<Actividades> getActividadesByModuloId() {
        return actividadesByModuloId;
    }

    public void setActividadesByModuloId(Collection<Actividades> actividadesByModuloId) {
        this.actividadesByModuloId = actividadesByModuloId;
    }

    @OneToMany(mappedBy = "moduloByModuloId")
    public Collection<Gastos> getGastosByModuloId() {
        return gastosByModuloId;
    }

    public void setGastosByModuloId(Collection<Gastos> gastosByModuloId) {
        this.gastosByModuloId = gastosByModuloId;
    }

    @OneToMany(mappedBy = "moduloByModuloId")
    public Collection<ListaPrecios> getListaPreciosByModuloId() {
        return listaPreciosByModuloId;
    }

    public void setListaPreciosByModuloId(Collection<ListaPrecios> listaPreciosByModuloId) {
        this.listaPreciosByModuloId = listaPreciosByModuloId;
    }

    @OneToMany(mappedBy = "moduloByModuloId")
    public Collection<Persona> getPersonasByModuloId() {
        return personasByModuloId;
    }

    public void setPersonasByModuloId(Collection<Persona> personasByModuloId) {
        this.personasByModuloId = personasByModuloId;
    }

    @OneToMany(mappedBy = "moduloByModuloId")
    public Collection<Producto> getProductosByModuloId() {
        return productosByModuloId;
    }

    public void setProductosByModuloId(Collection<Producto> productosByModuloId) {
        this.productosByModuloId = productosByModuloId;
    }
}
