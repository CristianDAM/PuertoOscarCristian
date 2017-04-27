
/**
 * Write a description of class Barco here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public abstract class Barco
{
  private Persona propietario;
  private String matricula;
  private double eslora;
  private int anioFabricacion;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, double eslora, int anioFabricacion,  Persona propietario)
    {
        this.propietario = propietario;
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }
    
    /**
     * Metodo estracto
     */
    abstract public  int getCoeficienteBernua();
    
    /**
     * Metodo toString 
     */
    public String toString()
    {
        String datosBarco = "";
        datosBarco += "Matricula : " + matricula + "\n";
        datosBarco += "Propietario : " + propietario + "\n";
        datosBarco += "Eslora : " + eslora + "metros" + "\n";
        datosBarco += "Año de fabricacion : " + anioFabricacion + "\n";
    
        return datosBarco;
               
    }
    
    /**
     * Metodo que devuelve la eslora del barco
     */
    public double getEslora()
    {
        
        return eslora;
        
    }  
}
