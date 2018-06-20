package main;

public class Calculadora {

	public int dividir(int i, int j) {
		if(j==0){
			if(i==0)
				throw new ArithmeticException("Resultado indefinido");
		
					else
						throw new ArithmeticException("No se puede dividir entre cero");
		}
		return i/j;
	}

}
