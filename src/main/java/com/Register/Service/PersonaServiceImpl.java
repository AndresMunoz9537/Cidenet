/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Register.Service;


import com.Register.PersonaDao.PersonaDao;
import com.Register.Model.Persona;
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
    public void guardar(Persona persona) {
        Persona em = personaDao.findByEmail(persona.getEmail());
        if(em == null){
        persona.setEmail(persona.getPrimerNombre() + persona.getPrimerApellido());
        personaDao.save(persona);
        }
        else{
            persona.setEmail(persona.getPrimerNombre() + persona.getPrimerApellido() + 1);
            personaDao.save(persona);}
        
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

    

    
    
}
