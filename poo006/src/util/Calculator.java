package util;

public class Calculator {
	public static final double TAX=0.06;

	public static double CurrencyConverter(double valorDolar,double quantidade ) {
		
		return (quantidade+(quantidade*TAX))*valorDolar;
	}

}
