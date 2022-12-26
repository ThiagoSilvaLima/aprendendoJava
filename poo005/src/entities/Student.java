package entities;

public class Student {
	public String name;
	public double points;
	public double nota1;
	public double nota2;
	public double nota3;
		
		public void finalGrade() 
		{
			
			double	finalG = nota1+nota2+nota3;
			
			
			if(finalG >= 60 ) System.out.printf("Final Grade: %.2f\nPass", finalG); 
			else System.out.printf("Final Grade:%.2f\nFalied\nMissing %.2f Points",finalG,60-finalG);
				
		}
}
