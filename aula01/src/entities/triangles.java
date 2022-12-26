package entities;

public class triangles {
	double area;
	double x;
	double y;
	double z;
	
	public void calcArea() {
		
		double p = x+y+z;
		this.area= Math.sqrt(p*(p-x)*(p-y)*(p-z));
				
	}
	
}