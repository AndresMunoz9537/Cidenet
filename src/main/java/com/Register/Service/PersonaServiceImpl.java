/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Register.Service;


import com.Register.PersonaDao.PersonaDao;
import com.Register.Model.Persona;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDao personaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public Persona guardar(Persona persona) {
        persona.setEstado("Activo");
        persona.setFechaDeRegistro(LocalDateTime.now());
        persona.setEmail(persona.getPrimerNombre() + "." + persona.getPrimerApellido() + "@cidenet.com.co");
        Persona em = personaDao.findByPrimerNombreAndPrimerApellido(persona.getPrimerNombre(),persona.getPrimerApellido());
        Persona num = personaDao.findByNumeroDeIdentificacion(persona.getNumeroDeIdentificacion());
        if(em != null){
            persona.setEmail(persona.getPrimerNombre() + "." + persona.getPrimerApellido()+"." + 1 + "@cidenet.com.co");
            
          }
        else if(num != null){persona.setNumeroDeIdentificacion(null);}
         
        return personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
       return personaDao.findById(persona.getIdPersona()).orElse(null);
    }

    @Override
    public void editar(Persona persona) {
        Persona em = personaDao.findByPrimerNombreAndPrimerApellido(persona.getPrimerNombre(),persona.getPrimerApellido());
        persona.setEmail(persona.getPrimerNombre() + "." + persona.getPrimerApellido() + "@cidenet.com.co");
         personaDao.save(persona);
    }

    

    
    
}
