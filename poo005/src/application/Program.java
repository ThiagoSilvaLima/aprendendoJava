package application;

import entities.Student;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		Student renato =  new Student();
		renato.name = "Renato Cariani"; 
		
		System.out.println("First semester grades");
		renato.nota1 = imput.nextDouble();
		System.out.println("Second semester grades");
		renato.nota2 = imput.nextDouble();
		System.out.println("third semester grades");
		renato.nota3 = imput.nextDouble();
		
		renato.finalGrade();
		
		imput.close();
	}

}
