
/**
 * Write a description of class Velero here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
  
    private int numMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula, double eslora, int anioFabricacion, Persona propietario, int numeroMastiles)
    {
        super(matricula, eslora, anioFabricacion, propietario);
        numMastiles = numeroMastiles;
    }
    
    @Override
    /**
     * Metodo que devuelve el coeficiente de Bernua de un Velero
     */
    
     public int getCoeficienteBernua()
     {
         
         return numMastiles; 
         
     }
     
       @Override 
     /**
      * Metodo toString
      */
     public String toString()
     {
         String datosBarco = "";
         datosBarco += super.toString();
         datosBarco += "Tiene" + " " + numMastiles + " " +  "mastiles" + "\n";
         
         return datosBarco;
            
        }

   
}
