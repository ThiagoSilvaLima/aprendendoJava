package application;

import java.util.Scanner;

import util.Calculator;
public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		System.out.println("watch is the dollar price?");
		double valueDollar = input.nextDouble();
		System.out.println("How many dollars will be bought ?");
		double dollar = input.nextDouble();

		System.out.printf("dolares a serem comprados: $ %.2f\nValor em real: R$ %.2f",dollar,Calculator.CurrencyConverter(valueDollar, dollar));
		
		input.close();
	}

}
