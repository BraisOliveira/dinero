/**
 * Clase Cuenta
 * Clase donde se gestionaran los ingresos y los gastos de un usuario
 *
 * @author Brais Oliveira Sanjurjo
 * @version 3
 * Corrijo el constructor para adecuarlo al UML, corrijo olvido de asignacion de usuario (this.usuario=ususario)
 */

import java.util.*;

public class Cuenta {
    //Atributos
    private double saldo = 0.00;
    private Usuario usuario;
    private List<Gasto> gastos = new ArrayList<>();
    private List<Ingreso> ingresos = new ArrayList<>();

    //Metodo constructor
    public Cuenta(Usuario usuario) {
        this.usuario = usuario;
    }

    //Getters - setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Métodos que calculan nuevos ingresos y gastos y retornan el saldo
     *
     * @return saldo += cantidad | saldo -= cantidad
     */
    public double addIngresos(String description, double cantidad) {
        Ingreso nIngreso = new Ingreso(cantidad, description);
        ingresos.add(nIngreso);
        return saldo += cantidad;
    }

    public double addGastos(String description, double cantidad) {
        try {
            if (cantidad < getSaldo()) {
                Gasto nGasto = new Gasto(cantidad, description);
                gastos.add(nGasto);
                return saldo -= cantidad;
            } else {
                throw new GastoException();
            }
        } catch (GastoException gastoException) {
        }
        return saldo;
    }

    /**
     * Agrupacion dinamica de ingresos
     */
    public List<Ingreso> getIngresos() {
        return ingresos;
    }

    /**
     * Agrupacion dinamica de gastos
     */
    public List<Gasto> getGastos() {
        return gastos;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", usuario=" + usuario +
                ", gastos=" + gastos +
                ", ingresos=" + ingresos +
                '}';
    }
}