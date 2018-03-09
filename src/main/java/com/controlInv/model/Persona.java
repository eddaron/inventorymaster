package com.controlInv.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Persona {
    private int personaId;
    private Integer moduloId;
    private String nombre;
    private String apellidop;
    private String apellidom;
    private String direccion;
    private Integer telefono;
    private Integer celular;
    private String sexo;
    private String ci;
    private String attribute122;
    private Collection<Cargo> cargosByPersonaId;
    private Collection<Factura> facturasByPersonaId;
    private Modulo moduloByModuloId;
    private Collection<Socio> sociosByPersonaId;

    @Id
    @Column(name = "persona_id")
    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
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
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "apellidop")
    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    @Basic
    @Column(name = "apellidom")
    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    @Basic
    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "telefono")
    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "celular")
    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    @Basic
    @Column(name = "sexo")
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Basic
    @Column(name = "ci")
    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Basic
    @Column(name = "attribute_122")
    public String getAttribute122() {
        return attribute122;
    }

    public void setAttribute122(String attribute122) {
        this.attribute122 = attribute122;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (personaId != persona.personaId) return false;
        if (moduloId != null ? !moduloId.equals(persona.moduloId) : persona.moduloId != null) return false;
        if (nombre != null ? !nombre.equals(persona.nombre) : persona.nombre != null) return false;
        if (apellidop != null ? !apellidop.equals(persona.apellidop) : persona.apellidop != null) return false;
        if (apellidom != null ? !apellidom.equals(persona.apellidom) : persona.apellidom != null) return false;
        if (direccion != null ? !direccion.equals(persona.direccion) : persona.direccion != null) return false;
        if (telefono != null ? !telefono.equals(persona.telefono) : persona.telefono != null) return false;
        if (celular != null ? !celular.equals(persona.celular) : persona.celular != null) return false;
        if (sexo != null ? !sexo.equals(persona.sexo) : persona.sexo != null) return false;
        if (ci != null ? !ci.equals(persona.ci) : persona.ci != null) return false;
        if (attribute122 != null ? !attribute122.equals(persona.attribute122) : persona.attribute122 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personaId;
        result = 31 * result + (moduloId != null ? moduloId.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellidop != null ? apellidop.hashCode() : 0);
        result = 31 * result + (apellidom != null ? apellidom.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        result = 31 * result + (sexo != null ? sexo.hashCode() : 0);
        result = 31 * result + (ci != null ? ci.hashCode() : 0);
        result = 31 * result + (attribute122 != null ? attribute122.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "personaByPersonaId")
    public Collection<Cargo> getCargosByPersonaId() {
        return cargosByPersonaId;
    }

    public void setCargosByPersonaId(Collection<Cargo> cargosByPersonaId) {
        this.cargosByPersonaId = cargosByPersonaId;
    }

    @OneToMany(mappedBy = "personaByPersonaId")
    public Collection<Factura> getFacturasByPersonaId() {
        return facturasByPersonaId;
    }

    public void setFacturasByPersonaId(Collection<Factura> facturasByPersonaId) {
        this.facturasByPersonaId = facturasByPersonaId;
    }

    @ManyToOne
    @JoinColumn(name = "modulo_id", referencedColumnName = "modulo_id")
    public Modulo getModuloByModuloId() {
        return moduloByModuloId;
    }

    public void setModuloByModuloId(Modulo moduloByModuloId) {
        this.moduloByModuloId = moduloByModuloId;
    }

    @OneToMany(mappedBy = "personaByPersonaId")
    public Collection<Socio> getSociosByPersonaId() {
        return sociosByPersonaId;
    }

    public void setSociosByPersonaId(Collection<Socio> sociosByPersonaId) {
        this.sociosByPersonaId = sociosByPersonaId;
    }
}
