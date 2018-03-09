package com.controlInv.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Socio {
    private int socioId;
    private Integer personaId;
    private String codSocio;
    private Integer cupoBasico;
    private Integer cupoExtra;
    private Integer pago;
    private Boolean activo;
    private Collection<Aportes> aportesBySocioId;
    private Collection<Estado> estadosBySocioId;
    private Collection<ListaGrupo> listaGruposBySocioId;
    private Collection<MateriaPrima> materiaPrimasBySocioId;
    private Collection<Multas> multasBySocioId;
    private Collection<Recepcionistas> recepcionistasBySocioId;
    private Persona personaByPersonaId;

    @Id
    @Column(name = "socio_id")
    public int getSocioId() {
        return socioId;
    }

    public void setSocioId(int socioId) {
        this.socioId = socioId;
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
    @Column(name = "cod_socio")
    public String getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(String codSocio) {
        this.codSocio = codSocio;
    }

    @Basic
    @Column(name = "cupo_basico")
    public Integer getCupoBasico() {
        return cupoBasico;
    }

    public void setCupoBasico(Integer cupoBasico) {
        this.cupoBasico = cupoBasico;
    }

    @Basic
    @Column(name = "cupo_extra")
    public Integer getCupoExtra() {
        return cupoExtra;
    }

    public void setCupoExtra(Integer cupoExtra) {
        this.cupoExtra = cupoExtra;
    }

    @Basic
    @Column(name = "pago")
    public Integer getPago() {
        return pago;
    }

    public void setPago(Integer pago) {
        this.pago = pago;
    }

    @Basic
    @Column(name = "activo")
    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Socio socio = (Socio) o;

        if (socioId != socio.socioId) return false;
        if (personaId != null ? !personaId.equals(socio.personaId) : socio.personaId != null) return false;
        if (codSocio != null ? !codSocio.equals(socio.codSocio) : socio.codSocio != null) return false;
        if (cupoBasico != null ? !cupoBasico.equals(socio.cupoBasico) : socio.cupoBasico != null) return false;
        if (cupoExtra != null ? !cupoExtra.equals(socio.cupoExtra) : socio.cupoExtra != null) return false;
        if (pago != null ? !pago.equals(socio.pago) : socio.pago != null) return false;
        if (activo != null ? !activo.equals(socio.activo) : socio.activo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = socioId;
        result = 31 * result + (personaId != null ? personaId.hashCode() : 0);
        result = 31 * result + (codSocio != null ? codSocio.hashCode() : 0);
        result = 31 * result + (cupoBasico != null ? cupoBasico.hashCode() : 0);
        result = 31 * result + (cupoExtra != null ? cupoExtra.hashCode() : 0);
        result = 31 * result + (pago != null ? pago.hashCode() : 0);
        result = 31 * result + (activo != null ? activo.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "socioBySocioId")
    public Collection<Aportes> getAportesBySocioId() {
        return aportesBySocioId;
    }

    public void setAportesBySocioId(Collection<Aportes> aportesBySocioId) {
        this.aportesBySocioId = aportesBySocioId;
    }

    @OneToMany(mappedBy = "socioBySocioId")
    public Collection<Estado> getEstadosBySocioId() {
        return estadosBySocioId;
    }

    public void setEstadosBySocioId(Collection<Estado> estadosBySocioId) {
        this.estadosBySocioId = estadosBySocioId;
    }

    @OneToMany(mappedBy = "socioBySocioId")
    public Collection<ListaGrupo> getListaGruposBySocioId() {
        return listaGruposBySocioId;
    }

    public void setListaGruposBySocioId(Collection<ListaGrupo> listaGruposBySocioId) {
        this.listaGruposBySocioId = listaGruposBySocioId;
    }

    @OneToMany(mappedBy = "socioBySocioId")
    public Collection<MateriaPrima> getMateriaPrimasBySocioId() {
        return materiaPrimasBySocioId;
    }

    public void setMateriaPrimasBySocioId(Collection<MateriaPrima> materiaPrimasBySocioId) {
        this.materiaPrimasBySocioId = materiaPrimasBySocioId;
    }

    @OneToMany(mappedBy = "socioBySocioId")
    public Collection<Multas> getMultasBySocioId() {
        return multasBySocioId;
    }

    public void setMultasBySocioId(Collection<Multas> multasBySocioId) {
        this.multasBySocioId = multasBySocioId;
    }

    @OneToMany(mappedBy = "socioBySocioId")
    public Collection<Recepcionistas> getRecepcionistasBySocioId() {
        return recepcionistasBySocioId;
    }

    public void setRecepcionistasBySocioId(Collection<Recepcionistas> recepcionistasBySocioId) {
        this.recepcionistasBySocioId = recepcionistasBySocioId;
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
