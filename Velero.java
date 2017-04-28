
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
     * @param numeroMastiles para el numero de mastiles de un velero
     */
    public Velero(String matricula, double eslora, int anioFabricacion, Persona propietario, int numeroMastiles)
    {
        super(matricula, eslora, anioFabricacion, propietario);
        numMastiles = numeroMastiles;
    }
    
    @Override
    /**
     * Metodo que devuelve el coeficiente de Bernua de un Velero
     *  @return potencia - int sobreescribe el metodo getCoeficienteBernua de la clase padre y devuelve la el coeficiente de bernua que en este caso es el numero de mastiles 
     */
    
     public int getCoeficienteBernua()
     {
         
         return numMastiles; 
         
     }
     
       @Override 
     /**
      * Metodo toString
      *  @return datosBarco - Sring para devolver los datos del Velero junto con los datos de la clase padre Barco porque sobreescribe el metodo
      */
     public String toString()
     {
         String datosBarco = "";
         datosBarco += super.toString();
         datosBarco += "Tiene" + " " + numMastiles + " " +  "mastiles" + "\n";
         
         return datosBarco;
            
        }

   
}
