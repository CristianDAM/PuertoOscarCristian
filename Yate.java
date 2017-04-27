
/**
 * Write a description of class Yate here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionAMotor
{

    private int numCamarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate( String matricula, double eslora, int anioFabricacion, Persona propietario, int numeroCamarotes, int potencia )
    {
        super(matricula, eslora, anioFabricacion, propietario, potencia);
        numCamarotes = numeroCamarotes;
    }

    @Override
    /**
     * Metodo que devuelve el coeficiente de Bernua de un Yate
     */
    public int getCoeficienteBernua()
    {

        return (numCamarotes + super.getCoeficienteBernua());
    }
    
    @Override
    /**
     * Metodo toString
     */
    public String toString()
    {
        String datosBarco = "";
        datosBarco += super.toString();
        datosBarco += "Tiene" + " " + numCamarotes + " " + "camarotes" + "\n";
        
        return datosBarco;
        
    }
}
