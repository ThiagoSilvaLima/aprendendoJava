package entities;

public class Rectangle {
	public double width;
	public double height;
		
		public String toString(){
			return String.format("%f\n%f\n%f",perimetro(),area(),diagonal());
		}
		public double perimetro() {
			double perimetrO = (width*2)+(height*2); 
			return perimetrO;
		}
		public double area() {
			double areA = width*height;
			return areA;
		}
		public double diagonal() {
			double diagonaL = Math.sqrt(width*width + height*height);
			return diagonaL;
		}
			
}
