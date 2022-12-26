package application;

import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String [] args) {
		Scanner input =  new Scanner(System.in);
		Product tv = new Product();
		
		System.out.print("name: "); 
		tv.name = input.nextLine();
		System.out.print("price: ");
		tv.price = input.nextDouble();
		System.out.print("quantity: ");
		tv.quantity = input.nextInt();
		
		System.out.print("product data: "+tv);
		
		for(int loop= 0;loop == 0;loop++){
			System.out.println("choose an operation:\nadd quantity: 1\nsubtract quantity: 2\nclose: 3");
			int operation = input.nextInt();
			switch (operation) {
				case 1: 
					System.out.println("Add: ");
					tv.addQNTY(input.nextInt());
					System.out.print("product data: "+tv);
					loop-=1;
					break;
				case 2: 
					System.out.println("Subtract: ");
					tv.decrementQNTY(input.nextInt());
					System.out.print("product data: "+tv);
					loop-=1;
					break;
				case 3:
					loop = 1;
					break;
				default:
					System.out.println("Invalid option");
					break;		
			}
		}
		
		
		input.close();
	}
}