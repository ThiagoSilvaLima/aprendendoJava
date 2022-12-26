package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar?");
		int i = imput.nextInt();
		int[] numb = new int [i]; 
		
		int io = 0;
		for (;io<i;io++) {
			System.out.println("Insert a number");
			numb[io]= imput.nextInt();
		}
		System.out.println("Odd numbers: ");
		io = 0;
		while (io<i) {
			if (numb[io]<0) {
				System.out.print(numb[io]);
			}
		io++;
		}
		imput.close();
	}
}
