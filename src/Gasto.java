public class Gasto extends Dinero {
    /**
     * Clase Gasto
     *
     * "heredarán de Dinero tendrán un único constructor en el que inicializarán los valores recibidos por parámetros.
     * Tendrán una función toString con la que devolver su contenido."
     *
     * @author Brais Oliveira Sanjurjo
     */

    //Constructor
    public Gasto(double gasto, String description) {
        this.dinero = gasto;
        this.description = description;
    }

    //toString
    @Override
    public String toString() {
        return "Gasto: " + description + ", cantidad:" + dinero + "€";
    }
}
