
/**
 * Write a description of class Persona here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class Persona
{
   
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, String dni)
    {
      this.nombre = nombre;
      this.dni = dni;
    }
    
    /**
     * Metodo toString
     */
    public String toString()
    {
        String datosPersona = "";
        datosPersona += "Nombre : " + " " + nombre + "\n";
        datosPersona += "DNI : " + " " + dni + "\n";
        
        return datosPersona;
        
    }
    

  
}
