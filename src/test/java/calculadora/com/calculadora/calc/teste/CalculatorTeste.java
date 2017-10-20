package calculadora.com.calculadora.calc.teste;


import org.junit.Assert;
import org.junit.Test;

import calculadora.com.calculadora.calc.Calculator;

public class CalculatorTeste {

	@Test
	public void testSum() {

		Calculator calc = new Calculator();
		double result = calc.sum(1, 2);
		Assert.assertTrue(result == 3);
		System.out.println("Sum:"+result);
	}

	@Test
	public void testSub() {

		Calculator calc = new Calculator();
		double result = calc.sub(2, 1);
		Assert.assertTrue(result == 1);
		System.out.println("Sub:"+result);

	}
	
	@Test
	public void testMult() {

		Calculator calc = new Calculator();
		double result = calc.mult(2, 5);
		Assert.assertTrue(result == 10);
		System.out.println("Mult:"+result);

	}
	
	@Test
	public void testDiv() {

		Calculator calc = new Calculator();
		double result = calc.div(10, 5);
		Assert.assertTrue(result == 2);
		System.out.println("Div:"+result);

	}

}
