package cuentas;

/**
 * Clase que define todas las operaciones que se pueden realizar con el saldo, se puede probar aumentando el valor, disminuyendo.
 * @author Juan Morillo
 * @version 1.0
 * */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    

    public CCuenta()
    {
    }
    
    /**
     * @param nom es el nombre del titular
     * @param cue es la cuenta sobre la que se opera
     * @param sal es el saldo en cada momento
     * @param tipo es el tipo de interés aplicable a la operación
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * @return devuelve el estado actual del salto disponible
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * @param es la cantidad que debe ingresar para realizar la operación
     * @throws Exception que muestra en pantalla para valores que sean incorrectos, como pueden ser valores negativos no admisibles
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    
    /**
       * @param es la cantidad que debe ingresar para realizar la operación
     * @throws Exception que muestra en pantalla para valores que sean incorrectos, como pueden ser valores negativos no admisibles
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
	 * Se ha definido los Getters y Setters asociados a los parámetros
	 */ 

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
    
    
    
}
