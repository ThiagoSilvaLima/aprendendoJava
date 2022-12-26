package application;

import java.util.Scanner;

import entities.Conta;
public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Conta c001;

		System.out.println("Enter Name of holder: ");
		String holder = input.nextLine();
		System.out.print("Insert the account number: ");
		int numberAccount = input.nextInt();
		System.out.println("Is there an initial deposit? (y/n)");
		String initSale = input.next(); 
		
		if(initSale.equals("y")) {
			System.out.println("Insert the valor");
			c001 = new Conta(holder,numberAccount,input.nextDouble());
			System.out.println("accout data: "+c001); 
		}
		else {
			c001 = new Conta(holder,numberAccount);
			System.out.println("accout data: "+c001);
		}

		//Calculus
		System.out.println("insira o valor de deposito");
		c001.deposit(input.nextDouble());
		System.out.println("insert the withdraw value ");
		c001.whitdraw(input.nextDouble());
		input.close();
	}
}
