
/**
 * Write a description of class EmbarcacionAMotor here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class EmbarcacionAMotor extends Barco
{

    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionAMotor
     */
    public EmbarcacionAMotor(String matricula, double eslora, int anioFabricacion, Persona propietario, int potencia)
    {
        super(matricula, eslora, anioFabricacion, propietario);
        this.potencia = potencia;
    }

    @Override
    /**
     * Metodo que devulve el coeficiente de Bernua de una EmbarcacionAMotor
     */
    public int getCoeficienteBernua()
    {

        return potencia;

    }
    
    
    @Override
    /**
     * Metodo toString
     */
    public String toString()
    {
        String datosBarco = "";
        datosBarco += super.toString();
        datosBarco += "Potencia : " + " " + potencia + " " + "CV" + "\n";
        
        return datosBarco;
       
    }

   


}
