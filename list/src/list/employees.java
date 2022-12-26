package list;

public class employees {
	int id;
	String name;
	double salary;
	public employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
		
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	public void incrSal(double percent) {
		salary += salary*percent;  
	}
}
