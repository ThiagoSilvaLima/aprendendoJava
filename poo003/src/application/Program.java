package application;

import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Rectangle X = new Rectangle();;
		System.out.print("width: ");
		X.width= input.nextDouble();
		System.out.print("height: ");
		X.height= input.nextDouble();
		
		System.out.println(X);
		
		
		input.close();
	}

}
