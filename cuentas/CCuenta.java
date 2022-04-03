package cuentas;
/**
 * @author Cristhian
 * Contiene los m�todos y atributos a usar por la clase main.
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
     * Se crea un constructor vac�o
     */
    
    public CCuenta()
    {
    	
    }
    /**
     * Se crea un constructor CCuenta y se declaran
     * variables nom, sal y tipo.
     * @param nom / variable para guardar el titular de la cuenta
     * @param cue / variable para guardar el n�mero de cuenta
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
     * M�todo para verificar el estado de la cuenta
     * @return cantidad de saldo en la cuenta
     */
    
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * M�todo para verificar si la cantidad es mayor que 0
     * @param cantidad / cantidad a ingresar
     * @throws Exception / captura la excepci�n en caso de ser menor que 0 y muestra un mensaje
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * M�todo para verificar que la cantidad a retirar es superior a 0
     * @param cantidad / cantidad a ingresar
     * @throws Exception / captura la excepci�n en caso de intentar retirar una cantidad negativa
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
     * M�todo que adquiere el nombre del titular de la cuenta
     * @return devuelve el nombre del titular de la cuenta
     */

	private String getNombre() {
		return nombre;
	}
	
	/**
	 * M�todo setter de nombre
	 * @param nombre
	 */

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * M�todo getter de cuenta
	 * @return
	 */

	private String getCuenta() {
		return cuenta;
	}
	
	/**
	 * M�todo setter de cuenta
	 * @param cuenta
	 */

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * M�todo que adquiere el saldo de la cuenta
	 * @return devuelve el saldo de la cuenta
	 */

	private double getSaldo() {
		return saldo;
	}
	/**
	 * M�todo sseter de saldo
	 * @param saldo
	 */

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * M�todo getter de tipo
	 * @return tipo
	 */

	private double getTipo() {
		return tipo;
	}
	
	/**
	 * M�todo setter de tipo
	 * @param tipo
	 */

	private void setTipo(double tipo) {
		this.tipo = tipo;
	}
}
