package com.controlInv.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class RecepcionistasPK implements Serializable {
    private int socioId;
    private int registrorecId;

    @Column(name = "socio_id")
    @Id
    public int getSocioId() {
        return socioId;
    }

    public void setSocioId(int socioId) {
        this.socioId = socioId;
    }

    @Column(name = "registrorec_id")
    @Id
    public int getRegistrorecId() {
        return registrorecId;
    }

    public void setRegistrorecId(int registrorecId) {
        this.registrorecId = registrorecId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecepcionistasPK that = (RecepcionistasPK) o;

        if (socioId != that.socioId) return false;
        if (registrorecId != that.registrorecId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = socioId;
        result = 31 * result + registrorecId;
        return result;
    }
}
