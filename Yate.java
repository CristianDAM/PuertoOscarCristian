
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
     * @param numeroCamarotes int para el numero de camarotes de un yate
     */
    public Yate( String matricula, double eslora, int anioFabricacion, Persona propietario, int numeroCamarotes, int potencia )
    {
        super(matricula, eslora, anioFabricacion, propietario, potencia);
        numCamarotes = numeroCamarotes;
    }

    @Override
    /**
     * Metodo que devuelve el coeficiente de Bernua de un Yate
     *  @return potencia - int sobreescribe el metodo getCoeficienteBernua de la clase padre y devuelve la el coeficiente de bernua que en este caso es el numero de camarotes de un yate 
     */
    public int getCoeficienteBernua()
    {

        return (numCamarotes + super.getCoeficienteBernua());
    }
    
    @Override
    /**
     * Metodo toString
     * @return datosBarco - Sring para devolver los datos del yate  junto con los datos de la clase padre EmbarcacionAMotor y los de su clase padre Barco porque sobreescribe el metodo de la clase padre que a su vez lo sobreescribe de su clase padre
     */
    public String toString()
    {
        String datosBarco = "";
        datosBarco += super.toString();
        datosBarco += "Tiene" + " " + numCamarotes + " " + "camarotes" + "\n";
        
        return datosBarco;
        
    }
}
