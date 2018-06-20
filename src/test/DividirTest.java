package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Calculadora;

class DividirTest {
	Calculadora c;

	@BeforeEach
	void setUp() throws Exception {
		c = new Calculadora();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test63() {

		int resultado = c.dividir(6,3);
		assertEquals(2, resultado);
	}
	
	@Test
	void testNegativos() {

		int resultado = c.dividir(-6,-3);
		assertEquals(2, resultado);
	}

	@Test
	void testMAX() {

		int resultado = c.dividir(Integer.MAX_VALUE,Integer.MAX_VALUE);
		assertEquals(1, resultado);
	}
	
	@Test
	void testMAXMIN() {

		int resultado = c.dividir(Integer.MAX_VALUE,Integer.MIN_VALUE);
		assertEquals(0, resultado);
	}


	@Test
	void test60() {

		ArithmeticException ae = assertThrows(ArithmeticException.class, ()->{c.dividir(6,0);}); 
		assertEquals("No se puede dividir entre cero", ae.getMessage());
	}
	
	@Test
	void test00() {

		ArithmeticException ae = assertThrows(ArithmeticException.class, ()->{c.dividir(0,0);}); 
		assertEquals("Resultado indefinido", ae.getMessage());
	}
}
