package list;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Locale;

public class program {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner imput = new Scanner(System.in);
		employees b = new employees(772,"Bob Green",5000.00);
		employees m = new employees(333,"Maria Brown", 4000.00);
		employees a = new employees(536,"Alex Grey",3000.00);
		List<employees> employ = new ArrayList<>();
		employ.add(b);
		employ.add(m);
		employ.add(a);
		
		//program
		System.out.println("How many employees will be registred? "+employ.size());
	
		for(int i=0; i < employ.size();i++) {
			System.out.println(employ.get(i).getId());
			System.out.println(employ.get(i).getName());
			System.out.println(employ.get(i).getSalary());
			System.out.println("-----------------------");
		}
		//---------------------------------------------------------------------------------
		System.out.println("Enter the emplooye ID that will give salary increase: ");
		int idInc=imput.nextInt();
		System.out.println("Enter the percentage: ");
		double percent=imput.nextDouble();
		//---------------------------------------------------------------------------------
		for(int i=0; i < employ.size();i++) {
			if(employ.get(i).id==idInc) {
				employ.get(i).incrSal(percent);
			}else {System.out.println("This ID don't exist: ");}
		}
		
		for(int i=0; i < employ.size();i++) {
			System.out.println(employ.get(i).getId());
			System.out.println(employ.get(i).getName());
			System.out.println(employ.get(i).getSalary());
			System.out.println("-----------------------");
		}
		imput.close();
		
	}
	
	
}
