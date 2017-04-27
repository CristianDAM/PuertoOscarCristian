
/**
 * Esta clase Puerto se encargara de gestionar todo lo referente a los alquileres
 * de los amarres.
 * 
 * @author Oscar Charro Rivera (oschariv) 
 * @version 27-04-2017
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private Alquiler[] amarres;

    /**
     * Constructor de la clase Puerto
     */
    public Puerto()
    {
        amarres = new Alquiler[4];
    }
    
    /**
     * El metodo alquilarAmarre nos permite crear un objeto de la clase Alquiler
     * que asociamos a la primera posicion libre en el array amarres.
     * Devuelve -1 como error si no hay amarres libres, sino devuelve el precio de 
     * alquiler.
     * @param numDias int para señalar numero de dias que se va a alquilar el amarre
     * @param barco objeto Barco al que se le va a alquilar el amarre
     * @return precioAlquiler - int que señala el precio de alquiler o error
     */
    public float alquilarAmarre(int numDias, Barco barco){
        float precioAlquiler = -1;
        if (hayAmarresLibres()) {
            int primerLibre = this.posicionPrimerAmarreLibre();
            Alquiler nuevoAlquiler = new Alquiler(numDias, barco, primerLibre);
            amarres[primerLibre] = nuevoAlquiler;
            precioAlquiler = nuevoAlquiler.getPrecioAlquiler();
        }
        return precioAlquiler;
    }

    /**
     * El metodo liquidarAlquilerAmarre nos permite comprobar si el amarre indicado
     * esta alquilado o no.
     * Si esta alquilado obtiene el precio del alquiler para luego devolverlo y
     *  borra el amarre, sino devuelve -1 como error de que ese amarre no esta
     *  alquilado.
     *  @param posicionAmarre int que señala la posicion del amarre
     *  @return precioAlquiler - float que devuelve el precio de alquiler o error
     */
    public float liquidarAlquilerAmarre(int posicionAmarre){
        float precioAlquiler = -1;
        if (posicionAmarre < amarres.length) {
            if (amarres[posicionAmarre] != null) {
                precioAlquiler = amarres[posicionAmarre].getPrecioAlquiler();
                amarres[posicionAmarre] = null;
            }
        }

        return precioAlquiler;
    }
    
    /**
     * El metodo posicionPrimerAmarreLibre nos localiza la primera posicion libre en
     * el array.
     * Si localiza una posicion libre en el array devuelve la posicion del array que 
     * esta vacio y sino devuelver -1 como error de que esta lleno.
     * Se usa un booleano para que si se localiza una posicion libre no se tenga que
     * recorrer más el array.
     * @return libre - int para posicion del primer amarre libre
     */
    public int posicionPrimerAmarreLibre(){
        int libre = -1;
        boolean localizado = false;
        for (int i = 0; i < amarres.length; i++){
            if (amarres[i] == null && !localizado){
                libre = i;
                localizado = true;
            }
        }
        return libre;
    }

    /**
     * El metodo hayAmarresLibres nos localiza si el array tiene posiciones libres.
     * Si localiza una posicion libre en el array devuelve true y sino devuelve false.
     * Se usa un booleano para que si se localiza una posicion libre no se tenga que
     * recorrer más el array.
     * @return libre - booleano que señala si hay huecos libres o no
     */
    public boolean hayAmarresLibres(){
        Boolean libre = false;
        boolean localizado = false;
        for (int i = 0; i < amarres.length; i++){
            if (amarres[i] == null && !localizado){
                libre = true;
                localizado = true;
            }
        }
        return libre;
    }

    /**
     * El metodo verEstadoAmarres nos permite imprimir por la terminal el estado del
     * array.
     * Si una posicion esta vacia se imprime un mensaje indicando que esa poscion esta
     * vacia, y sino se imprimen todos los datos asociados al array en esa posicion.
     */
    public void verEstadoAmarres(){
        for (int i = 0; i < amarres.length; i++){
            if (amarres[i] == null){
                System.out.println("Amarre " + i + " vacio.");
            }
            else{
                System.out.println(amarres[i].toString());
            }
        }
    }

}
