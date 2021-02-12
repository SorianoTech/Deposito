package cuentas;

/**
 * La clase CCuenta contiene los métodos correspontientes para poder operar con
 * los valores establecidos del cliente
 *
 * @version 1.0, 10/02/2021
 * @author Sergio Soriano
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Devuelve el nombre
     * 
     * @return El nombre
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * Asgina el nombre
     * 
     * @param nombre El nombre para asignar
     */
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de cuenta en formato string
     * 
     * @return La cuenta
     */
    protected String getCuenta() {
        return cuenta;
    }

    /**
     * Asigna una cuenta
     * 
     * @param cuenta La cuenta para signar
     */
    protected void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para devolver el saldo
     *
     * @return El saldo
     */
    protected double getSaldo() {
        return saldo;
    }

    /**
     * Método para asginar el saldo
     *
     * @param saldo El saldo para asignar
     */
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para devolver el tipo de interes
     *
     * @return El tipo de interés
     */
    protected double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Metodo para asinar el tipo de interés
     *
     * @param tipoInterés El tipo de interes para asignar
     */
    protected void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Asigna los valores de nombre cuenta y saldo
     *
     * @param nom Nombre
     * @param cue Cuenta
     * @param sal Saldo
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método para devolver el saldo
     *
     * @return El saldo
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Metodo para ingresar una cantidad en la cuenta
     *
     * @param cantidad La cantidad a ingresar
     * @throws Exception Si no hay saldo o si la cantidad a ingresar es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar una cantidad la cuenta
     * 
     * @param cantidad La cantidad que deseamos retirar
     * @throws Exception Si no hay saldo o si la cantidad a ingresar es negativa
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
