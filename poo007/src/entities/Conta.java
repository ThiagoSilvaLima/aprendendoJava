package entities;

public class Conta {

	private String holder;
	private int numberAcc;
	private double sale;
	
	public Conta(String name, int numberAcc, double sale) {
		this.holder = name;
		this.numberAcc = numberAcc;
		this.sale = sale;
	}
	public Conta(String name, int numberAcc) {
		this.holder = name;
		this.numberAcc = numberAcc;
	}
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String name) {
		this.holder = name;
	}
	public int getNumberAcc() {
		return numberAcc;
	}
	public double getSale() {
		return sale;
	}
	//process
	public void deposit(double valor) {
		this.sale +=valor;
		System.out.println("Update accout data: "+toString()); 
	}
	public void whitdraw(double valor) {
		this.sale -=valor + 5;
		
		System.out.println("Update accout data: "+toString()); 
	}
	
	//print on screen
	@Override
	public String toString() {
		return "Conta name= " + holder + ", Account number= " + numberAcc + ", sale= $" + sale;
	}
	
	
}
