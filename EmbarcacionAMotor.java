
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
     * @param potencia int para la potencia de las embarcaciones a motor 
     */
    public EmbarcacionAMotor(String matricula, double eslora, int anioFabricacion, Persona propietario, int potencia)
    {
        super(matricula, eslora, anioFabricacion, propietario);
        this.potencia = potencia;
    }

    @Override
    /**
     * Metodo que devulve el coeficiente de Bernua de una EmbarcacionAMotor
     * @return potencia - int sobreescribe el metodo getCoeficienteBernua de la clase padre y devuelve la el coeficiente de bernua que en este caso es la potencia 
     */
    public int getCoeficienteBernua()
    {

        return potencia;

    }
    
    
    @Override
    /**
     * Metodo toString
     * @return datosBarco - Sring para devolver los datos de la embarcacionAMotor junto con los datos de la clase padre Barco porque sobreescribe el metodo
     */
    public String toString()
    {
        String datosBarco = "";
        datosBarco += super.toString();
        datosBarco += "Potencia : " + " " + potencia + " " + "CV" + "\n";
        
        return datosBarco;
       
    }

   


}
