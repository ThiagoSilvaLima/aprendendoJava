package treino;
import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("raiz");
		int v1= sc.nextInt();
		System.out.println("potencia");
		int v2 = sc.nextInt();
		System.out.println("idade");
		int idade= sc.nextInt();
		
	System.out.printf("raiz de %d = %.2f%n%d elevado a 5 e igual a= %.1f%n%d ",v1,Math.sqrt(v1),v2,Math.pow(v2, 5),Math.abs(idade));
		sc.close();
	}
}
