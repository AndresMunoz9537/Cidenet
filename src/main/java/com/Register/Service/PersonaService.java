/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Register.Service;

import java.util.List;
import com.Register.Model.Persona;
import java.util.Optional;

public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public Persona guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
    
    public void editar(Persona persona);
    
}
