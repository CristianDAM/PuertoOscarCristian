
/**
 * La clase Alquiler sirve para crear objetos donde almacenar todos los datos
 * correspondientes a los alquileres.
 * 
 * @author Oscar Charro Rivera (oschariv)
 * @version 27-04-2017
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
     * Constructor de la clase Alquiler
     * @param numDias int para contabilizar los dias de alquiler
     * @param barco objeto de la clase Barco a asociar el alquiler
     * @param posicionAmarre int para posicion del amarre a alquilar
     */
    public Alquiler(int numDias, Barco barco, int posicionAmarre)
    {
        diasOcupacion = numDias;
        this.barco = barco;
        this.posicionAmarre = posicionAmarre;
    }

    /**
     * Metodo toString para imprime todo la informacion referente al alquiler
     * @return cadenaADevolver - String para retorno de la informacion del alquiler
     */
    public String toString(){
        String cadenaADevolver = "Numero de Dias de Alquiler: " + diasOcupacion + 
            ".\nPosicion del Amarre: " + posicionAmarre + ".\nBarco Asociado:\n" 
            + barco.toString() + "\n";
        return cadenaADevolver;
    }
    
    /**
     * Metodo getPrecioAlquiler devuelve el precio calculado a partir de una formula.
     * El precio del alquiler a pagar se calcula a partir del 
     * número de días de ocupación multiplicado por un valor en función del barco 
     * (esta valor es el resultante de multiplicar por 10 los metros de eslora). Al 
     * resultado se le suma la cantidad obtenida de multiplicar un valor ﬁjo 
     * (300 euros) por el coeficiente de Bernua del barco.
     * El coeficiente de Bernua se calcula en función del tipo de barco:
     *          El número de mástiles para veleros,
     *          La potencia en CV para embarcaciones deportivas a motor,
     *          La potencia en CV más número de camarotes para embarcaciones 
     *          deportivas a motor de lujo (yates).
     * @return precio - float para el devolver el precio de alquiler
     */
    public float getPrecioAlquiler(){
        float precio = (diasOcupacion * (VALOR_MULTIPLICADOR_ESLORA * 
                       (float)barco.getEslora())) + (VALOR_MULTIPLICADOR_BERNUA * 
                       (float)barco.getCoeficienteBernua());
        return precio;
    }
}
