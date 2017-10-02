package calculadora;

/**
 * Calculadora class
 *
 */
public class Calculadora {

	/**
	 * Realiza una sumar
	 * 
	 * @param numeros enteros de tipo int
	 * @return resultado de tipo int
	 * 
	 */
	public int sumar(int... numeros) {
		int resultado = 0;
		for (int numero: numeros) {
			resultado = resultado + numero;
		}
		return resultado;
	}

	/**
	 * Realiza una resta
	 * 
	 * @param dos numeros enteros de tipo int
	 * @return resultado de tipo int
	 * 
	 */
	public int restar(int num1, int num2) {
		return num1 - num2;
	}

	/**
	 * Realiza una multiplicacion
	 * 
	 * @param dos numeros enteros de tipo int
	 * @return resultado de tipo int
	 * 
	 */
	public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	/**
	 * Realiza una división
	 * 
	 * @param dos números enteros de tipo int
	 * @return resultado de tipo int
	 * 
	 */
	public int dividir(int dividendo, int divisor) {
		try {
			return dividendo / divisor;
		} catch(Exception e) {
			return 0;
		}
	}
	
}