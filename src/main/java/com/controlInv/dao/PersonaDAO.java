package com.controlInv.dao;

import  com.controlInv.model.Persona;
import java.util.List;
public interface PersonaDAO {
    public void saveOrUpdate(Persona persona);

    public void delete(int personaId);

    public Persona get(int personaId);

    public List<Persona> list();
}