package entities;

public class Employee {
	public String name;
	public double salary;
	public double tax;
	public double porcent;
		public void netSalary (double porcent) {
			this.porcent = Math.pow(porcent, -1); 
			salary = (salary+(salary*this.porcent))-tax; 
			
		}
		public String toString() {
					
			return String.format("%s, $ %.2f",name,salary);
		}
}
