
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    // instance variables - replace the example below with your own
    private static int VALOR_MULTIPLICADOR_ESLORA = 10;
    private static int VALOR_MULTIPLICADOR_BERNUA = 300;
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int numDias, Barco barco, int posicionAmarre)
    {
        diasOcupacion = numDias;
        this.barco = barco;
        this.posicionAmarre = posicionAmarre;
    }

    public String toString(){
        String cadenaADevolver = "Numero de Dias de Alquiler: " + diasOcupacion + 
            ".\nPosicion del Amarre: " + posicionAmarre + ".\nBarco Asociado:\n" 
            + barco.toString();
        return cadenaADevolver;
    }
    
    public float getPrecioAlquiler(){
        float precio = (diasOcupacion * (VALOR_MULTIPLICADOR_ESLORA * (float)barco.getEslora())) + (VALOR_MULTIPLICADOR_BERNUA * (float)barco.getCoeficienteBernua());
        return precio;
    }
}
