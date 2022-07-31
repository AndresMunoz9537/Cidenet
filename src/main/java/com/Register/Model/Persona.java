
package com.Register.Model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.springframework.format.annotation.DateTimeFormat;


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
    
    @NotEmpty
    @Column(length = 20)
    private String segundoApellido;
    
    @NotEmpty
    @Column(length = 50)
    private String otrosNombres;
    
    
    private String email;
    
    @NotEmpty(message = "El campo esta vacio o El numero de identificacion ya esta asociado a otro usuario")
    @Column (length = 20)
    private String numeroDeIdentificacion;
    
   
    private String paisEmpleo;
    
    @NotEmpty
   private String tipoDeIdentificacion; 
      
  @DateTimeFormat(pattern = "yyyy-MM-dd")
   private LocalDate fechaDeIngreso;
   
    @NotEmpty
   private String area;
   
   private String estado;
   
   private LocalDateTime fechaDeRegistro;
    
    

    
 public void setPrimerNombre(String primerNombre) {
        this.primerNombre= primerNombre.toUpperCase();
    }
   
 public void setOtrosNombres(String otrosNombres) {
        this.otrosNombres= otrosNombres.toUpperCase();
    }
 
 public void setPrimerApellido(String primerApellido) {
        this.primerApellido= primerApellido.toUpperCase();
    }
 
 public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido= segundoApellido.toUpperCase();
    }
    
 
 





 

}


