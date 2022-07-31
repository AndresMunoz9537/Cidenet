/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Register.PersonaDao;
import com.Register.Model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long>{
    
       public Persona findByPrimerNombreAndPrimerApellido(String primerNombre, String primerApellido);

    public Persona findByNumeroDeIdentificacion(String numeroDeIdentificacion);
}
