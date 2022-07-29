
package com.Register.Model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;


@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    @NotEmpty
    @Column(length = 120)
    private String primerNombre;
    
    @NotEmpty
    @Column(length = 20)
    private String primerApellido;
    
    
    @Column(length = 20)
    private String segundoApellido;
    
    
    @Column(length = 20)
    private String otrosNombres;
    
    
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String email;
    
    
    private String numeroDeIdentificacion;
    
    
    private String paisEmpleo;
    
    
   private String tipoIdentificacion; 
    
    

    
 public void setPrimerNombre(String primerNombre) {
        this.primerNombre= primerNombre.toUpperCase();
    }
   
 public void setOtroNombre(String otrosNombres) {
        this.otrosNombres= otrosNombres.toUpperCase();
    }
 
 public void setPrimerApellido(String primerApellido) {
        this.primerApellido= primerApellido.toUpperCase();
    }
 
 public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido= segundoApellido.toUpperCase();
    }
    

 
 public String getEmail(){
      return email = primerNombre + "." + primerApellido + "@cidenet.com.co";
 }
}
