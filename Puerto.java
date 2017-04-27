
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private Alquiler[] amarres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        amarres = new Alquiler[4];
    }

    public double alquilarAmarre(int numDias, Barco barco){
        int primerLibre = this.posicionPrimerAmarreLibre();
        double precioAlquiler = -1;
        Alquiler nuevoAlquiler = new Alquiler(numDias, barco, primerLibre);
        if (primerLibre != -1) {
            amarres[primerLibre] = nuevoAlquiler;
            precioAlquiler = nuevoAlquiler.getPrecioAlquiler();
        }
        return precioAlquiler;
    }

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

    public boolean hayAmarresLibres(){
        Boolean libre = false;
        for (int i = 0; i < amarres.length; i++){
            if (amarres[i].equals(null)){
                libre = true;
            }
        }
        return libre;
    }

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
