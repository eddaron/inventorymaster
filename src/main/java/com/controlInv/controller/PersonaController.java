package com.controlInv.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.controlInv.dao.PersonaDAO;
import com.controlInv.model.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonaController {

    @Autowired
    private PersonaDAO personaDAO;

    @RequestMapping(value="/Personalista")
    public ModelAndView listContact(ModelAndView model) throws IOException{
        List<Persona> listPersona = personaDAO.list();
        model.addObject("listPersona", listPersona);
        model.setViewName("PersonaListar");

        return model;
    }

    @RequestMapping(value = "/newPersona", method = RequestMethod.GET)
    public ModelAndView newPersona(ModelAndView model) {
        Persona newPersona = new Persona();
        model.addObject("Persona", newPersona);
        model.setViewName("PersonaFormReg");
        return model;
    }

    @RequestMapping(value = "/savePersona", method = RequestMethod.POST)
    public ModelAndView savePersona(@ModelAttribute Persona persona){
        personaDAO.saveOrUpdate(persona);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/deletePersona", method = RequestMethod.GET)
    public ModelAndView deletePersona(HttpServletRequest request) {
        int personaId = Integer.parseInt(request.getParameter("personaId"));
        personaDAO.delete(personaId);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/editPersona", method = RequestMethod.GET)
    public ModelAndView editPersona(HttpServletRequest request) {
        int personaId = Integer.parseInt(request.getParameter("id"));
        Persona persona = personaDAO.get(personaId);
        ModelAndView model = new ModelAndView("PersonaFormReg");
        model.addObject("Persona", persona);

        return model;
    }

}
