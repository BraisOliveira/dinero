/**
 * Clase GastoExcetion
 * Clase para lanzar cuando el gasto es mayor al saldo disponible
 *
 * @author Brais Oliveira Sanjurjo
 * @version 2
 * Para adecuarme al diagrama UML elimino el toString que estaba usando en
 * el catch de Cuenta para mostrar el mensaje y lo hago desde aqui.
 */
public class GastoException extends Exception {

    public GastoException() {
        System.out.println("No se dispone de saldo suficiente en la cuenta");
    }
}