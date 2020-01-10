package cuentas;

/*
 * Clase para definir los tipos de operaciones que se puedan realizar siempre teniendo en cuenta que debemos tener un saldo, podemos ir disminuyendo, aumentadon y en el caso que quiera mantener el mismo valor, proceder con la operacion.
 * @uator Juan Morillo
 * Versión 1.0
 * 
 * */

public class Main {

	public static void main(String[] args) {

		operativa_cuenta();

	}
	
	/**
	 * Êl metodo operativa_cuenta() define todas las operaciones con el saldo actualmente disponible.
	 * La cantidad que ingresa el usuario debe ser positiva o la cantidad inferior o negativa al saldo, la operación se realiza satisfactoriamente.
	 * En todos los demas supuesto se realiza una excepcion.
	 * @param La variable cuenta1 es la que se encarga de guardar la referencia al saldo disponible.
	 * @param La variable cantidad almacena el importe con el que se realiza la operacion sobre el saldo que tenga.
	 * */

	public static void operativa_cuenta() {
		float cantidad;
		CCuenta cuenta1;
		double saldoActual;

		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es" + saldoActual);

		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}
}

