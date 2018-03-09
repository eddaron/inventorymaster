package com.controlInv.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.controlInv.model.Persona;
import com.controlInv.dao.PersonaDAO;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
public class PersonaDAOImpl implements PersonaDAO{
    private JdbcTemplate jdbcTemplate;

    public PersonaDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void saveOrUpdate(Persona persona) {
        if (persona.getPersonaId() > 0) {
            // update
            String sql = "UPDATE persona SET nombre=?, apellidop=?, apellidom,  direccion=?, telefono=?, celular=?, sexo=?,"
                    + "ci=? WHERE persona_id=?";
            jdbcTemplate.update(sql, persona.getNombre(),persona.getApellidop(),persona.getApellidom(),persona.getDireccion(), persona.getTelefono(),
                    persona.getCelular(), persona.getSexo(), persona.getCi(), persona.getPersonaId(), persona.getModuloId());
        } else {
            // insert
            String sql = "INSERT INTO persona (nombre,apellidop, apellidom, direccion, telefono, celular, sexo, ci)"
                    + " VALUES (?, ?, ?, ?,?,?,?,?)";
            jdbcTemplate.update(sql, persona.getNombre(),persona.getApellidop(),persona.getApellidom(),persona.getDireccion(), persona.getTelefono(),
                    persona.getCelular(), persona.getSexo(), persona.getCi(), persona.getModuloId());
        }
    }

    @Override
    public void delete(int personaId) {
        String sql = "DELETE FROM persona WHERE persona_id=?";
        jdbcTemplate.update(sql, personaId);
    }

    @Override
    public Persona get(int personaId) {
        String sql = "SELECT * FROM persona WHERE persona_id=" + personaId;
        return jdbcTemplate.query(sql, new ResultSetExtractor<Persona>() {

            @Override
            public Persona extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
                    Persona contact = new Persona();
                    contact.setPersonaId(rs.getInt("persona_id"));
                    contact.setNombre(rs.getString("nombre"));
                    contact.setApellidop(rs.getString("apellidop"));
                    contact.setApellidom(rs.getString("apellidom"));
                    contact.setDireccion(rs.getString("direccion"));
                    contact.setTelefono(rs.getInt("telefono"));
                    contact.setCelular(rs.getInt("celular"));
                    contact.setSexo(rs.getNString("sexo"));
                    contact.setCi(rs.getString("ci"));
                    return contact;
                }

                return null;
            }

        });
    }

    @Override
    public List<Persona> list() {
        String sql = "SELECT * FROM persona";
        List<Persona> listpersona = jdbcTemplate.query(sql, new RowMapper<Persona>() {

            @Override
            public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
                Persona contact = new Persona();

                contact.setPersonaId(rs.getInt("persona_id"));
                contact.setNombre(rs.getString("nombre"));
                contact.setApellidop(rs.getString("apellidop"));
                contact.setApellidom(rs.getString("apellidom"));
                contact.setDireccion(rs.getString("direccion"));
                contact.setTelefono(rs.getInt("telefono"));
                contact.setCelular(rs.getInt("celular"));
                contact.setSexo(rs.getNString("sexo"));
                contact.setCi(rs.getString("ci"));

                return  contact;
            }

        });

        return listpersona;
    }
}
