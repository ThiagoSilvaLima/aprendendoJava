package application;

import java.util.Scanner;
import entities.Rooms;
	public class Program {
	
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many rooms have rented?");
		int i = input.nextInt();
		Rooms[] rooms = null;
		int b=0;
		
		for(;b<i;b++) {
			System.out.println("Name: ");
			String name1 = input.nextLine();
			String email = input.nextLine();
			int number= input.nextInt();
			rooms[b]= new Rooms(name1,email,number);
		}
		while(b<i) {
			rooms[b].getClass();
		}
		
		System.out.println("altura média: ");
		input.close();
	}
}
