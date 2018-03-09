package com.controlInv.model;

import javax.persistence.*;

@Entity
public class Cargo {
    private int idCargo;
    private Integer personaId;
    private String cargo;
    private Persona personaByPersonaId;

    @Id
    @Column(name = "id_cargo")
    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "persona_id")
    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    @Basic
    @Column(name = "cargo")
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cargo cargo1 = (Cargo) o;

        if (idCargo != cargo1.idCargo) return false;
        if (personaId != null ? !personaId.equals(cargo1.personaId) : cargo1.personaId != null) return false;
        if (cargo != null ? !cargo.equals(cargo1.cargo) : cargo1.cargo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargo;
        result = 31 * result + (personaId != null ? personaId.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        return result;
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
