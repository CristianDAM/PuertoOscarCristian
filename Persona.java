
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
     * @param nombre String para el nombre de la persona que vamos a crear
     * @param dni String para el dni de la persona que vamos a crear
     */
    public Persona(String nombre, String dni)
    {
      this.nombre = nombre;
      this.dni = dni;
    }
    
    /**
     * Metodo toString
     * @return datosPersona - String devuelve los datos de la persona 
     */
    public String toString()
    {
        String datosPersona = "";
        datosPersona += "Nombre : " + " " + nombre + "\n";
        datosPersona += "DNI : " + " " + dni + "\n";
        
        return datosPersona;
        
    }
    

  
}
