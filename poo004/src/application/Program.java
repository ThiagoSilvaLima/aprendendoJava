package application;

import entities.Employee;
public class Program {

	public static void main(String[] args) {

	Employee e1 =  new Employee();
	e1.name = "Rodrigo neves";
	e1.salary = 6000.00;
	e1.tax = 1000.00;
	
	System.out.println(e1);
	e1.netSalary(10);
	System.out.println("UPDATE data: "+e1);
	
	}
}
