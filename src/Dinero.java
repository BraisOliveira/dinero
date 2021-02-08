/**
 * Clase abstrarcta superclase de Class Gasto y Class Ingreso
 *
 * @author Brais Oliveira Sanjurjo
 */
public abstract class Dinero {
    //Atributos 'protected' porque es superclase
    protected double dinero;
    protected String description;

    /**
     * getter para ser usado en las subclases
     *
     * @return double dinero
     */
    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
