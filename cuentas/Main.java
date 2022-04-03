/**
 * @author Cristhian
 * @version:01/04/2022/1
 * @description: Se crea un programa para realizar ingresos y retirada
 * de una cuenta.
 */

package cuentas;

/**
 * Se inicializa la clase main
 *
 */

public class Main {
	
	/**
	 * Se crea el m�todo main
	 * @param args / argumento del m�todo main
	 */

    public static void main(String[] args) {
    	
        CCuenta cuenta1;
        double saldoActual;
        
        /**
         * Se crea el objeto cuenta1
         */
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
        /*
         * Se visualiza el saldo de la cuenta llamando al m�todo estado()
         */
        
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        /*
         * Se llama al m�todo operativa_cuenta para capturar
         * posibles excepciones.
         */
        
        operativa_cuenta(cuenta1);
    }

    /**
     * Se encapsulan las capturas de excepciones
     * recibiendo como par�metro cuenta1
     * @param cuenta1
     */
    
	private static void operativa_cuenta(CCuenta cuenta1) {
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
