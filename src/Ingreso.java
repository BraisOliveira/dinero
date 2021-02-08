public class Ingreso extends Dinero {
    /**
     * Clase Ingreso
     * "heredarán de Dinero tendrán un único constructor en el que inicializarán los valores recibidos por parámetros.
     * Tendrán una función toString con la que devolver su contenido"
     *
     * @author Brais Oliveira Sanjurjo
     */


    //constructor
    public Ingreso(double ingreso, String description) {
        this.dinero = ingreso;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Ingreso: " + description + ", cantidad:" + dinero + "€";
    }
}
