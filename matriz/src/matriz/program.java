package matriz;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		System.out.println("Enter the number of Colums");
		int n= imput.nextInt();
		System.out.println("Enter the number of Lines");
		int m= imput.nextInt();

		int matriz[][] = new int[n][m];
		
		for (int i =0;i<n;i++) {
			for (int b =0;b<m;b++) {
				System.out.printf("[%d][%d]",i,b);
				matriz[i][b]=imput.nextInt();
			}
		}
		
		for (int i =0;i<n;i++) {
			for (int b =0;b<m;b++) {
				System.out.print(matriz[i][b]+"  ");
			}
		System.out.println("");
		}
		
		System.out.println("which number should be checked?");
		int numb = imput.nextInt();
		for (int i =0;i<n;i++) {
			for (int b =0;b<m;b++) {
				if(matriz[i][b]== numb) {
					System.out.println("Position = "+i+","+b);
					if(i>0) {
						int I=i-1;
						System.out.println("Top = "+matriz[I][b]);
					}
					if(b>0) {
						int B=b-1;
						System.out.println("Left = "+matriz[i][B]);
					}
					if(b<(n-1)) {
						int B=b+1;
						System.out.println("Right = "+matriz[i][B]);
					}
					if(i<(m-1)) {
						int I=i+1;
						System.out.println("Down = "+matriz[I][b]);
					}
				}
			}
		}
		imput.close();
	}

}
