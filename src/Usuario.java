import java.util.regex.Pattern;

/**
 * Clase Usuario
 * Clase encargada de gestionar un unico usuario,
 * Se creara al inicio del programa leyendo datos por teclado
 *
 * @author Brais Oliveira Sanjurjo
 * @version 2
 * Elimino un constructor sin funcionalidad y fuera de los requerimientos
 */
public class Usuario {
    //Atributos
    private String nombre;
    private int edad;
    private String DNI;

    //Constructor
    public Usuario() {
    }

    //GET - SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public boolean setDNI(String DNI) {
        if (!Pattern.matches("^[0-9]{8}-?[A-Za-z]$", DNI)) {
            return false;
        } else {
            this.DNI = DNI;
            return true;
        }
    }

    /**
     * Funcion toString para devolver contenido
     *
     * @return string
     */
    @Override
    public String toString() {
        return
                "Se llama " + nombre + " tiene " + edad +
                        " años y su DNI es " + DNI;
    }
}