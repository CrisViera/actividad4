package cuentas;
/**
 * @author Cristhian
 * Contiene los métodos y atributos a usar por la clase main.
 */
public class CCuenta {

	/**
	 * Se crea la clase cCuenta y se declaran las variables
	 * @param nom
     * @param cue
     * @param sal
     * @param tipo
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipo;

    /**
     * Se crea un constructor vacío
     */
    
    public CCuenta()
    {
    	
    }
    /**
     * Se crea un constructor CCuenta y se declaran
     * variables nom, sal y tipo.
     * @param nom / variable para guardar el titular de la cuenta
     * @param cue / variable para guardar el número de cuenta
     * @param sal / variable para guardar el saldo de la cuenta
     * @param tipo / variable par aguardar el tipo de cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * Método para verificar el estado de la cuenta
     * @return cantidad de saldo en la cuenta
     */
    
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Método para verificar si la cantidad es mayor que 0
     * @param cantidad / cantidad a ingresar
     * @throws Exception / captura la excepción en caso de ser menor que 0 y muestra un mensaje
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método para verificar que la cantidad a retirar es superior a 0
     * @param cantidad / cantidad a ingresar
     * @throws Exception / captura la excepción en caso de intentar retirar una cantidad negativa
     * y si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * Método que adquiere el nombre del titular de la cuenta
     * @return devuelve el nombre del titular de la cuenta
     */

	private String getNombre() {
		return nombre;
	}
	
	/**
	 * Método setter de nombre
	 * @param nombre
	 */

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método getter de cuenta
	 * @return
	 */

	private String getCuenta() {
		return cuenta;
	}
	
	/**
	 * Método setter de cuenta
	 * @param cuenta
	 */

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Método que adquiere el saldo de la cuenta
	 * @return devuelve el saldo de la cuenta
	 */

	private double getSaldo() {
		return saldo;
	}
	/**
	 * Método sseter de saldo
	 * @param saldo
	 */

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Método getter de tipo
	 * @return tipo
	 */

	private double getTipo() {
		return tipo;
	}
	
	/**
	 * Método setter de tipo
	 * @param tipo
	 */

	private void setTipo(double tipo) {
		this.tipo = tipo;
	}
}
